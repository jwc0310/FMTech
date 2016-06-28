import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

final class fdc
  extends fee
{
  private Handler a;
  
  fdc(fcc paramfcc, Looper paramLooper)
  {
    boolean bool;
    if (paramLooper == null)
    {
      if (Looper.myLooper() != null)
      {
        bool = true;
        efj.a(bool, "Can't create handler inside thread that has not called Looper.prepare()");
      }
    }
    else {
      if (paramLooper != null) {
        break label49;
      }
    }
    label49:
    for (fdb localfdb = new fdb(paramfcc);; localfdb = new fdb(paramfcc, paramLooper))
    {
      this.a = localfdb;
      return;
      bool = false;
      break;
    }
  }
  
  public final void a(Location paramLocation)
  {
    if (this.a == null)
    {
      Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = paramLocation;
    this.a.sendMessage(localMessage);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdc
 * JD-Core Version:    0.7.0.1
 */