import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public final class fel
{
  public final ffd a;
  private fez b;
  
  protected fel(ffd paramffd)
  {
    this.a = ((ffd)efj.a(paramffd));
  }
  
  public final CameraPosition a()
  {
    try
    {
      CameraPosition localCameraPosition = this.a.a();
      return localCameraPosition;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final fiw a(CircleOptions paramCircleOptions)
  {
    try
    {
      fiw localfiw = new fiw(this.a.a(paramCircleOptions));
      return localfiw;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final fiy a(MarkerOptions paramMarkerOptions)
  {
    try
    {
      fjq localfjq = this.a.a(paramMarkerOptions);
      if (localfjq != null)
      {
        fiy localfiy = new fiy(localfjq);
        return localfiy;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final void a(fek paramfek)
  {
    try
    {
      this.a.b(paramfek.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final int b()
  {
    try
    {
      int i = this.a.f();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final fez c()
  {
    try
    {
      if (this.b == null) {
        this.b = new fez(this.a.k());
      }
      fez localfez = this.b;
      return localfez;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public final fet d()
  {
    try
    {
      fet localfet = new fet(this.a.l());
      return localfet;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fel
 * JD-Core Version:    0.7.0.1
 */