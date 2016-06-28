import android.content.Context;
import android.net.Uri;
import android.util.Log;

public final class jrl
{
  private final fyd a;
  private final Uri b;
  private long c = 3000L;
  
  public jrl(Context paramContext, Uri paramUri)
  {
    this.a = ((fyd)mbb.a(paramContext, fyd.class));
    this.b = paramUri;
  }
  
  public final boolean a()
  {
    jrm localjrm = new jrm();
    this.a.a(this.b, localjrm);
    long l1 = System.currentTimeMillis() + this.c;
    for (;;)
    {
      long l2;
      if (!localjrm.a)
      {
        l2 = l1 - System.currentTimeMillis();
        if (l2 > 0L) {
          break label104;
        }
        if (Log.isLoggable("BlockingPanoDetector", 5))
        {
          String str = String.valueOf(this.b);
          new StringBuilder(56 + String.valueOf(str).length()).append("pano wait time expired, assume image is not a pano; uri=").append(str);
        }
      }
      return localjrm.b;
      try
      {
        label104:
        Thread.sleep(Math.min(5L, l2));
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrl
 * JD-Core Version:    0.7.0.1
 */