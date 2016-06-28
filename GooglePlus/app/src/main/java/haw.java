import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class haw
  extends Handler
{
  haw(hau paramhau, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    long l;
    hca localhca;
    do
    {
      haz localhaz;
      do
      {
        try
        {
          switch (paramMessage.what)
          {
          default: 
            int i = paramMessage.what;
            throw new AssertionError(28 + "unknown message: " + i);
          }
        }
        catch (gjd localgjd)
        {
          if (Log.isLoggable("iu.SyncManager", 6)) {
            Log.e("iu.SyncManager", "Account removed during sync", localgjd);
          }
          return;
        }
        hau.a(this.a);
        return;
        hau.b(this.a);
        return;
        hau localhau = this.a;
        l = ((Long)paramMessage.obj).longValue();
        localhaz = localhau.f;
      } while (localhaz == null);
      localhca = localhaz.c();
    } while (localhca == null);
    localhca.a(l);
    return;
    hau.a(this.a, ((Integer)paramMessage.obj).intValue());
    return;
    hau.b(this.a, ((Integer)paramMessage.obj).intValue());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     haw
 * JD-Core Version:    0.7.0.1
 */