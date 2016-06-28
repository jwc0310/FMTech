import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class fcz
  extends feb
{
  Handler a;
  
  fcz(fcb paramfcb, Looper paramLooper)
  {
    if (paramLooper == null)
    {
      paramLooper = Looper.myLooper();
      if (paramLooper == null) {
        break label39;
      }
    }
    label39:
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "Can't create handler inside thread that has not called Looper.prepare()");
      this.a = new fda(this, paramLooper, paramfcb);
      return;
    }
  }
  
  private final void a(int paramInt, Object paramObject)
  {
    if (this.a == null)
    {
      Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
      return;
    }
    Message localMessage = Message.obtain();
    localMessage.what = paramInt;
    localMessage.obj = paramObject;
    this.a.sendMessage(localMessage);
  }
  
  public final void a(LocationAvailability paramLocationAvailability)
  {
    a(1, paramLocationAvailability);
  }
  
  public final void a(LocationResult paramLocationResult)
  {
    a(0, paramLocationResult);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcz
 * JD-Core Version:    0.7.0.1
 */