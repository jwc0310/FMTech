import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseConnControl;
import org.apache.http.protocol.ResponseContent;

public final class maj
{
  private static final InetAddress h;
  public ServerSocket a;
  public ExecutorService b;
  HttpParams c;
  HttpService d;
  public Executor e;
  public Future<Void> f;
  public Future<Void> g;
  private final Uri i;
  private final mao j;
  
  static
  {
    try
    {
      InetAddress localInetAddress2 = InetAddress.getByAddress("localhost", new byte[] { 127, 0, 0, 1 });
      localInetAddress1 = localInetAddress2;
    }
    catch (UnknownHostException localUnknownHostException)
    {
      for (;;)
      {
        Log.e("VideoServer", "Cannot find localhost", localUnknownHostException);
        InetAddress localInetAddress1 = null;
      }
    }
    h = localInetAddress1;
  }
  
  private maj(Uri paramUri, mao parammao, Executor paramExecutor)
  {
    this.j = parammao;
    this.i = paramUri;
    this.e = paramExecutor;
  }
  
  @Deprecated
  public static maj a(Context paramContext, String paramString, Uri paramUri)
  {
    return new maj(paramUri, new mao(paramContext, paramString), null);
  }
  
  public final Uri a()
  {
    this.a = new ServerSocket();
    this.a.bind(new InetSocketAddress(h, 0));
    long l = System.currentTimeMillis();
    double d1 = Math.random();
    String str1 = 45 + "/" + l + d1;
    String str2 = MimeTypeMap.getFileExtensionFromUrl(this.i.toString());
    if (!TextUtils.isEmpty(str2))
    {
      String str5 = String.valueOf(str1);
      str1 = 1 + String.valueOf(str5).length() + String.valueOf(str2).length() + str5 + "." + str2;
    }
    this.c = new BasicHttpParams().setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
    BasicHttpProcessor localBasicHttpProcessor = new BasicHttpProcessor();
    localBasicHttpProcessor.addInterceptor(new ResponseContent());
    localBasicHttpProcessor.addInterceptor(new ResponseConnControl());
    HttpRequestHandlerRegistry localHttpRequestHandlerRegistry = new HttpRequestHandlerRegistry();
    String str3;
    FutureTask localFutureTask;
    if (this.i != null)
    {
      str3 = this.i.toString();
      localHttpRequestHandlerRegistry.register(str1, new man(str1, str3, this.j));
      this.d = new HttpService(localBasicHttpProcessor, new DefaultConnectionReuseStrategy(), new DefaultHttpResponseFactory());
      this.d.setHandlerResolver(localHttpRequestHandlerRegistry);
      this.d.setParams(this.c);
      localFutureTask = new FutureTask(new mak(this));
      if (this.e != null) {
        break label426;
      }
      this.b = Executors.newSingleThreadExecutor();
      this.b.execute(localFutureTask);
    }
    for (;;)
    {
      String str4 = String.valueOf(h.getHostAddress());
      int k = this.a.getLocalPort();
      return Uri.parse(19 + String.valueOf(str4).length() + String.valueOf(str1).length() + "http://" + str4 + ":" + k + str1);
      str3 = null;
      break;
      label426:
      if (this.f != null) {
        this.f.cancel(true);
      }
      this.f = localFutureTask;
      this.e.execute(localFutureTask);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     maj
 * JD-Core Version:    0.7.0.1
 */