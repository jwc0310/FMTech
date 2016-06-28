import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

final class apr
  implements Runnable
{
  apr(app paramapp, List paramList, apt paramapt) {}
  
  public final void run()
  {
    List localList;
    try
    {
      apo localapo = apo.a(this.c.b);
      localList = apk.a(this.c.a, this.c.b, this.b, apn.a);
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext()) {
        localapo.a((apm)localIterator.next());
      }
      while (this.a == null) {}
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("AllPhotosDataFetcher", 6)) {
        Log.e("AllPhotosDataFetcher", "Exception fetching media refs", localException);
      }
      return;
    }
    aps localaps = new aps(this, localList);
    efj.m().post(localaps);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     apr
 * JD-Core Version:    0.7.0.1
 */