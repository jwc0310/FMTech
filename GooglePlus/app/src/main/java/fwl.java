import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.maps.model.LatLng;
import java.util.Iterator;
import java.util.List;

public final class fwl
  implements fwt
{
  private fdi a;
  
  private final void f()
  {
    if (this.a == null) {
      throw new IllegalStateException("Must call populate before accessing member variables.");
    }
  }
  
  public final String a()
  {
    f();
    return this.a.a();
  }
  
  public final void a(Context paramContext, Intent paramIntent)
  {
    efj.b(paramContext, "context must not be null");
    PlaceImpl localPlaceImpl = (PlaceImpl)efj.a(paramIntent, "selected_place", PlaceImpl.CREATOR);
    localPlaceImpl.v = fdl.a(paramContext);
    this.a = localPlaceImpl;
  }
  
  public final String b()
  {
    f();
    CharSequence localCharSequence = this.a.c();
    if (localCharSequence == null) {
      return null;
    }
    return localCharSequence.toString();
  }
  
  public final String c()
  {
    f();
    CharSequence localCharSequence = this.a.d();
    if (localCharSequence == null) {
      return null;
    }
    return localCharSequence.toString();
  }
  
  public final fxw d()
  {
    f();
    LatLng localLatLng = this.a.e();
    return new fxw(localLatLng.b, localLatLng.c);
  }
  
  public final boolean e()
  {
    f();
    Iterator localIterator = this.a.b().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if ((i == 1001) || (i == 1002) || (i == 1003) || (i == 1009) || (i == 1022) || (i == 1023) || (i == 1024) || (i == 1025) || (i == 1026) || (i == 1027) || (i == 1004) || (i == 1011) || (i == 1018) || (i == 1021) || (i == 1015) || (i == 1007) || (i == 0) || (i == 1016) || (i == 1018) || (i == 1029) || (i == 1005)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fwl
 * JD-Core Version:    0.7.0.1
 */