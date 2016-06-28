import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public final class fxq
  implements fxz
{
  private fiy a;
  
  public fxq(fiy paramfiy)
  {
    this.a = paramfiy;
  }
  
  public final void a()
  {
    fiy localfiy = this.a;
    try
    {
      localfiy.a.a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    fiu localfiu = efj.a(paramBitmap);
    fiy localfiy = this.a;
    try
    {
      localfiy.a.a(localfiu.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a(fxw paramfxw)
  {
    fiy localfiy = this.a;
    LatLng localLatLng = new LatLng(paramfxw.a, paramfxw.b);
    try
    {
      localfiy.a.a(localLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof fxq)) {
      return false;
    }
    fxq localfxq = (fxq)paramObject;
    return this.a.equals(localfxq.a);
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxq
 * JD-Core Version:    0.7.0.1
 */