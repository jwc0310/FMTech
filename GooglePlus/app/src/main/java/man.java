import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;

final class man
  implements HttpRequestHandler
{
  private static final Pattern a = Pattern.compile("bytes=(\\d*)-(\\d*)");
  private final String b;
  private final mao c;
  private final String d;
  
  public man(String paramString1, String paramString2, mao parammao)
  {
    this.b = paramString1;
    this.c = parammao;
    this.d = paramString2;
  }
  
  public final void handle(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    try
    {
      String str1 = paramHttpRequest.getRequestLine().getMethod().toUpperCase(Locale.US);
      if (!str1.equals("GET")) {
        throw new MethodNotSupportedException(String.valueOf(str1).concat(" method is not supported."));
      }
    }
    catch (Exception localException)
    {
      throw new HttpException("Internal error while handling a local file request", localException);
    }
    if (!paramHttpRequest.getRequestLine().getUri().equals(this.b))
    {
      paramHttpResponse.setStatusCode(404);
      return;
    }
    Header localHeader1 = paramHttpRequest.getLastHeader("Range");
    long l1 = 0L;
    long l2 = 2147483647L;
    int i = 0;
    if (localHeader1 != null)
    {
      Matcher localMatcher = a.matcher(localHeader1.getValue());
      boolean bool1 = localMatcher.matches();
      i = 0;
      if (bool1)
      {
        i = 1;
        String str4 = localMatcher.group(1);
        if (!TextUtils.isEmpty(str4)) {
          l1 = Long.parseLong(str4);
        }
        String str5 = localMatcher.group(2);
        if (!TextUtils.isEmpty(str5)) {
          l2 = Long.parseLong(str5);
        }
        new StringBuilder(58).append("Range requested: ").append(l1).append(":").append(l2);
        if ((l1 < 0L) || (l1 > l2))
        {
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Long.valueOf(l1);
          arrayOfObject2[1] = Long.valueOf(l2);
          Log.e("VideoServer", String.format("Invalid range %d-%d requested", arrayOfObject2));
          paramHttpResponse.setStatusCode(416);
          return;
        }
      }
    }
    int j = i;
    maq localmaq = new maq(this.d, l1, l2);
    Header[] arrayOfHeader = paramHttpRequest.getAllHeaders();
    int k = arrayOfHeader.length;
    int m = 0;
    String str2;
    String str3;
    if (m < k)
    {
      Header localHeader2 = arrayOfHeader[m];
      if ("Range".equals(localHeader2.getName())) {
        break label550;
      }
      str2 = localHeader2.getName();
      str3 = localHeader2.getValue();
      if ("Range".equals(str2)) {
        break label556;
      }
    }
    label550:
    label556:
    for (boolean bool2 = true;; bool2 = false)
    {
      efj.c(bool2, "must not add a Range header");
      localmaq.a.put(str2, str3);
      break label550;
      if (j != 0)
      {
        paramHttpResponse.setStatusCode(206);
        Locale localLocale = Locale.US;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Long.valueOf(l1);
        arrayOfObject1[1] = Long.valueOf(l2);
        paramHttpResponse.setHeader("Content-Range", String.format(localLocale, "bytes %d-%d/*", arrayOfObject1));
      }
      for (;;)
      {
        paramHttpResponse.setHeader("Content-Type", "video/mp4");
        try
        {
          InputStream localInputStream = this.c.a(new map(localmaq));
          paramHttpResponse.setEntity(new mam(localInputStream));
          return;
        }
        catch (IOException localIOException)
        {
          Log.e("VideoServer", localIOException.toString());
          paramHttpResponse.setStatusCode(404);
          return;
        }
        paramHttpResponse.setStatusCode(200);
      }
      m++;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     man
 * JD-Core Version:    0.7.0.1
 */