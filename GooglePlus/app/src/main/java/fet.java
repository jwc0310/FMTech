import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public final class fet
{
  private final ffp a;
  
  fet(ffp paramffp)
  {
    this.a = paramffp;
  }
  
  public final Point a(LatLng paramLatLng)
  {
    try
    {
      Point localPoint = (Point)evc.a(this.a.a(paramLatLng));
      return localPoint;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final LatLng a(Point paramPoint)
  {
    try
    {
      LatLng localLatLng = this.a.a(new evc(paramPoint));
      return localLatLng;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final VisibleRegion a()
  {
    try
    {
      VisibleRegion localVisibleRegion = this.a.a();
      return localVisibleRegion;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fet
 * JD-Core Version:    0.7.0.1
 */