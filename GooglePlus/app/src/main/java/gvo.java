import android.content.Context;
import android.util.Log;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.HttpUrlRequest;

public final class gvo
  extends kbw
{
  private static final mfl b = new mfl("debug.plus.safe.url", "https://googleads.g.doubleclick.net/pagead/drt/m");
  public HttpCookie a;
  
  public gvo(Context paramContext, kcg paramkcg)
  {
    super(paramContext, paramkcg, "POST", new kda(paramContext, paramkcg.a), b.a, null);
  }
  
  public final void a_(HttpUrlRequest paramHttpUrlRequest)
  {
    String str = paramHttpUrlRequest.b("Set-Cookie");
    try
    {
      Iterator localIterator = HttpCookie.parse(str).iterator();
      while (localIterator.hasNext())
      {
        HttpCookie localHttpCookie = (HttpCookie)localIterator.next();
        if (localHttpCookie.getName().startsWith("_drt_")) {
          this.a = localHttpCookie;
        }
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      Log.e("HttpOperation", "Failed to parse cookies", localIllegalArgumentException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvo
 * JD-Core Version:    0.7.0.1
 */