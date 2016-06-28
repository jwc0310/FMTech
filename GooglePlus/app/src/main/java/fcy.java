import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.HashMap;
import java.util.Map;

public final class fcy
{
  final fdh<fcs> a;
  boolean b = false;
  Map<fcc, fdc> c = new HashMap();
  Map<fcb, fcz> d = new HashMap();
  private final Context e;
  
  public fcy(Context paramContext, fdh<fcs> paramfdh)
  {
    this.e = paramContext;
    this.a = paramfdh;
  }
  
  public final Location a()
  {
    this.a.b();
    try
    {
      Location localLocation = ((fcs)this.a.a()).b(this.e.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }
  
  final fcz a(fcb paramfcb, Looper paramLooper)
  {
    synchronized (this.c)
    {
      fcz localfcz = (fcz)this.d.get(paramfcb);
      if (localfcz == null) {
        localfcz = new fcz(paramfcb, paramLooper);
      }
      this.d.put(paramfcb, localfcz);
      return localfcz;
    }
  }
  
  final fdc a(fcc paramfcc, Looper paramLooper)
  {
    synchronized (this.c)
    {
      fdc localfdc = (fdc)this.c.get(paramfcc);
      if (localfdc == null) {
        localfdc = new fdc(paramfcc, paramLooper);
      }
      this.c.put(paramfcc, localfdc);
      return localfdc;
    }
  }
  
  public final void a(fcb paramfcb)
  {
    this.a.b();
    efj.b(paramfcb, "Invalid null callback");
    synchronized (this.d)
    {
      fcz localfcz = (fcz)this.d.remove(paramfcb);
      if (localfcz != null)
      {
        localfcz.a = null;
        ((fcs)this.a.a()).a(LocationRequestUpdateData.a(localfcz));
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcy
 * JD-Core Version:    0.7.0.1
 */