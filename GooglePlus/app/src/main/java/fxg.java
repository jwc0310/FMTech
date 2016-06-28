import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public class fxg
{
  public fet a;
  
  public fxg(fet paramfet)
  {
    this.a = paramfet;
  }
  
  public Point a(fxw paramfxw)
  {
    return this.a.a(new LatLng(paramfxw.a, paramfxw.b));
  }
  
  public fxw a(Point paramPoint)
  {
    LatLng localLatLng = this.a.a(paramPoint);
    return new fxw(localLatLng.b, localLatLng.c);
  }
  
  public fyc a()
  {
    VisibleRegion localVisibleRegion = this.a.a();
    return new fyc(new fxw(localVisibleRegion.b.b, localVisibleRegion.b.c), new fxw(localVisibleRegion.c.b, localVisibleRegion.c.c), new fxw(localVisibleRegion.d.b, localVisibleRegion.d.c), new fxw(localVisibleRegion.e.b, localVisibleRegion.e.c), new fxx(localVisibleRegion.f));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxg
 * JD-Core Version:    0.7.0.1
 */