import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class fep
  implements GoogleMap.OnMapClickListener, GoogleMap.OnMarkerClickListener, fxc
{
  public fel a;
  public fxe b;
  public fxd c;
  public fxf d;
  
  public fep(fel paramfel)
  {
    this.a = paramfel;
  }
  
  public fxg a()
  {
    return new fxg(this.a.d());
  }
  
  public fxv a(fxw paramfxw, double paramDouble, int paramInt1, int paramInt2, int paramInt3)
  {
    CircleOptions localCircleOptions = new CircleOptions();
    localCircleOptions.b = new LatLng(paramfxw.a, paramfxw.b);
    localCircleOptions.c = paramDouble;
    localCircleOptions.d = paramInt1;
    localCircleOptions.e = paramInt2;
    localCircleOptions.f = paramInt3;
    return new fxv(this.a.a(localCircleOptions));
  }
  
  public fxz a(String paramString, fxw paramfxw, Bitmap paramBitmap, float paramFloat1, float paramFloat2)
  {
    fel localfel = this.a;
    MarkerOptions localMarkerOptions = new MarkerOptions();
    localMarkerOptions.c = paramString;
    localMarkerOptions.b = new LatLng(paramfxw.a, paramfxw.b);
    localMarkerOptions.e = efj.a(paramBitmap);
    localMarkerOptions.f = paramFloat1;
    localMarkerOptions.g = paramFloat2;
    return new fxq(localfel.a(localMarkerOptions));
  }
  
  public void a(int paramInt)
  {
    fel localfel = this.a;
    try
    {
      localfel.a.a(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public void a(CameraPosition paramCameraPosition)
  {
    if (this.c != null) {
      this.c.a(new fxu(paramCameraPosition));
    }
  }
  
  public void a(LatLng paramLatLng)
  {
    if (this.b != null)
    {
      fxe localfxe = this.b;
      new fxw(paramLatLng.b, paramLatLng.c);
      localfxe.a();
    }
  }
  
  public void a(fxd paramfxd)
  {
    this.c = paramfxd;
    fel localfel = this.a;
    if (this == null) {}
    try
    {
      localfel.a.a(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
    localfel.a.a(new fen(localfel, this));
  }
  
  public void a(fxe paramfxe)
  {
    this.b = paramfxe;
    fel localfel = this.a;
    if (this == null) {}
    try
    {
      localfel.a.a(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
    localfel.a.a(new feo(localfel, this));
  }
  
  public void a(fxf paramfxf)
  {
    this.d = paramfxf;
    fel localfel = this.a;
    if (this == null) {}
    try
    {
      localfel.a.a(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
    localfel.a.a(new fem(localfel, this));
  }
  
  public void a(fxw paramfxw)
  {
    this.a.a(efj.a(new LatLng(paramfxw.a, paramfxw.b)));
  }
  
  public void a(fxw paramfxw, int paramInt)
  {
    fel localfel = this.a;
    fek localfek = efj.a(new LatLng(paramfxw.a, paramfxw.b), 14.0F);
    try
    {
      localfel.a.a(localfek.a);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    fel localfel = this.a;
    try
    {
      localfel.a.c(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new bm(localRemoteException);
    }
  }
  
  public boolean a(fiy paramfiy)
  {
    if (this.d != null) {
      return this.d.a(new fxq(paramfiy));
    }
    return false;
  }
  
  public fxj b()
  {
    return new fxj(this.a.c());
  }
  
  public void b(fxw paramfxw, int paramInt)
  {
    this.a.a(efj.a(new LatLng(paramfxw.a, paramfxw.b), paramInt));
  }
  
  public fxu c()
  {
    return new fxu(this.a.a());
  }
  
  public int d()
  {
    return this.a.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fep
 * JD-Core Version:    0.7.0.1
 */