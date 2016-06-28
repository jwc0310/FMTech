import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;

public final class fxp
  implements fxy
{
  public final fxx a(List<fxw> paramList)
  {
    fix localfix = LatLngBounds.a();
    Iterator localIterator = paramList.iterator();
    label221:
    while (localIterator.hasNext())
    {
      fxw localfxw = (fxw)localIterator.next();
      LatLng localLatLng = new LatLng(localfxw.a, localfxw.b);
      localfix.a = Math.min(localfix.a, localLatLng.b);
      localfix.b = Math.max(localfix.b, localLatLng.b);
      double d = localLatLng.c;
      if (Double.isNaN(localfix.c))
      {
        localfix.c = d;
        label105:
        localfix.d = d;
      }
      else
      {
        int i;
        if (localfix.c <= localfix.d) {
          if ((localfix.c <= d) && (d <= localfix.d)) {
            i = 1;
          }
        }
        for (;;)
        {
          if (i != 0) {
            break label221;
          }
          if (LatLngBounds.a(localfix.c, d) >= LatLngBounds.b(localfix.d, d)) {
            break label105;
          }
          localfix.c = d;
          break;
          i = 0;
          continue;
          if ((localfix.c <= d) || (d <= localfix.d)) {
            i = 1;
          } else {
            i = 0;
          }
        }
      }
    }
    if (!Double.isNaN(localfix.c)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(bool, "no included points");
      return new fxx(new LatLngBounds(new LatLng(localfix.a, localfix.c), new LatLng(localfix.b, localfix.d)));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxp
 * JD-Core Version:    0.7.0.1
 */