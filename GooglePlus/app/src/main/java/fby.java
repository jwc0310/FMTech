import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;

public class fby
{
  public Location a(efd paramefd)
  {
    fdd localfdd = fce.a(paramefd);
    try
    {
      Location localLocation = localfdd.b.a();
      return localLocation;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public efk<Status> a(efd paramefd, LocationRequest paramLocationRequest, fcb paramfcb, Looper paramLooper)
  {
    return paramefd.b(new fcn(this, paramefd, paramLocationRequest, paramfcb, paramLooper));
  }
  
  public efk<Status> a(efd paramefd, LocationRequest paramLocationRequest, fcc paramfcc)
  {
    return paramefd.b(new fcl(this, paramefd, paramLocationRequest, paramfcc));
  }
  
  public efk<Status> a(efd paramefd, fcb paramfcb)
  {
    return paramefd.b(new fcm(this, paramefd, paramfcb));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fby
 * JD-Core Version:    0.7.0.1
 */