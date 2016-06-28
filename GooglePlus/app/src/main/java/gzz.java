import android.util.Log;
import android.util.SparseArray;
import java.util.List;

final class gzz
  implements Runnable
{
  gzz(gzy paramgzy, gzf paramgzf, hae paramhae) {}
  
  public final void run()
  {
    gzy localgzy = this.c;
    gzf localgzf = this.a;
    hae localhae = this.b;
    localgzy.c.remove(localgzf);
    localgzf.a_(localhae);
    int i = localgzf.h;
    String str1 = localgzf.f;
    if (i == 0) {
      if (Log.isLoggable("BackgroundTask", 2))
      {
        String str8 = String.valueOf(localhae);
        new StringBuilder(36 + String.valueOf(str1).length() + String.valueOf(str8).length()).append("No manager, dropping task result: ").append(str1).append(", ").append(str8);
      }
    }
    gzp localgzp;
    do
    {
      do
      {
        do
        {
          return;
          gzj localgzj = (gzj)localgzy.b.get(i);
          if (localgzj != null)
          {
            if (localgzf.i)
            {
              if (Log.isLoggable("BackgroundTask", 3))
              {
                String str7 = String.valueOf(localhae);
                new StringBuilder(50 + String.valueOf(str1).length() + String.valueOf(str7).length()).append("Task is canceled, dropping result from manager: ").append(str1).append(", ").append(str7);
              }
              localgzj.c.a(str1);
              return;
            }
            if (Log.isLoggable("BackgroundTask", 3))
            {
              String str6 = String.valueOf(localhae);
              new StringBuilder(34 + String.valueOf(str1).length() + String.valueOf(str6).length()).append("Deliver background task result: ").append(str1).append(", ").append(str6);
            }
            localgzj.a(str1, localhae);
            return;
          }
          if (!localgzf.i) {
            break;
          }
        } while (!Log.isLoggable("BackgroundTask", 3));
        String str5 = String.valueOf(localhae);
        new StringBuilder(42 + String.valueOf(str1).length() + String.valueOf(str5).length()).append("Task is canceled, dropping task result: ").append(str1).append(", ").append(str5);
        return;
        if (localhae.f != haf.a) {
          break;
        }
      } while (!Log.isLoggable("BackgroundTask", 3));
      String str4 = String.valueOf(localhae);
      new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str4).length()).append("Dropping task result: ").append(str1).append(", ").append(str4);
      return;
      if (Log.isLoggable("BackgroundTask", 3))
      {
        String str3 = String.valueOf(localhae);
        new StringBuilder(32 + String.valueOf(str1).length() + String.valueOf(str3).length()).append("Store background task result: ").append(str1).append(", ").append(str3);
      }
      localhae.b();
      localgzp = localgzy.f;
      if (gzp.a(localhae) <= 128000) {
        break;
      }
    } while (!Log.isLoggable("BackgroundTask", 5));
    String str2 = String.valueOf(localhae);
    new StringBuilder(34 + String.valueOf(str2).length() + String.valueOf(str1).length()).append("Result too large to store: ").append(str2).append(", tag: ").append(str1);
    return;
    synchronized (localgzp.a)
    {
      localgzp.a();
      localgzp.a(new gzq(i, str1, localhae));
      localgzp.b();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzz
 * JD-Core Version:    0.7.0.1
 */