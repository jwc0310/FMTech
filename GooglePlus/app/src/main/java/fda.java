import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class fda
  extends Handler
{
  fda(fcz paramfcz, Looper paramLooper, fcb paramfcb)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      this.a.a((LocationResult)paramMessage.obj);
      return;
    }
    this.a.a((LocationAvailability)paramMessage.obj);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fda
 * JD-Core Version:    0.7.0.1
 */