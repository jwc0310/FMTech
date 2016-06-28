import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class jsi
{
  private static final ClientConnectionManager a;
  private static final HttpParams b;
  
  static
  {
    BasicHttpParams localBasicHttpParams1 = new BasicHttpParams();
    ConnManagerParams.setTimeout(localBasicHttpParams1, 20000L);
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
    a = new jsj(localBasicHttpParams1, localSchemeRegistry);
    BasicHttpParams localBasicHttpParams2 = new BasicHttpParams();
    HttpConnectionParams.setStaleCheckingEnabled(localBasicHttpParams2, false);
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams2, 20000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams2, 20000);
    HttpClientParams.setRedirecting(localBasicHttpParams2, true);
    HttpProtocolParams.setUserAgent(localBasicHttpParams2, "PicasaSync/1.0");
    b = localBasicHttpParams2;
  }
  
  public static InputStream a(String paramString)
  {
    HttpResponse localHttpResponse = new DefaultHttpClient(a, b).execute(new HttpGet(paramString));
    HttpEntity localHttpEntity = localHttpResponse.getEntity();
    try
    {
      int i = localHttpResponse.getStatusLine().getStatusCode();
      if (i != 200) {
        throw new IOException(24 + "http status: " + i);
      }
    }
    finally
    {
      if (localHttpEntity == null) {}
    }
    try
    {
      localHttpEntity.consumeContent();
      label94:
      throw localObject;
      InputStream localInputStream = localHttpEntity.getContent();
      if ((localInputStream == null) && (localHttpEntity != null)) {}
      try
      {
        localHttpEntity.consumeContent();
        return localInputStream;
      }
      catch (Throwable localThrowable2)
      {
        return localInputStream;
      }
    }
    catch (Throwable localThrowable1)
    {
      break label94;
    }
  }
  
  public static void a(InputStream paramInputStream)
  {
    if ((paramInputStream instanceof ConnectionReleaseTrigger)) {}
    try
    {
      ((ConnectionReleaseTrigger)paramInputStream).abortConnection();
      return;
    }
    catch (Throwable localThrowable) {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsi
 * JD-Core Version:    0.7.0.1
 */