import android.util.Log;
import java.util.List;
import java.util.Map;

public class fxf
{
  public fxf(cta paramcta) {}
  
  public boolean a(fxz paramfxz)
  {
    ijx localijx = (ijx)this.a.ad.d.get(paramfxz);
    if (Log.isLoggable("FriendLocations", 4))
    {
      String str2 = String.valueOf(localijx);
      new StringBuilder(15 + String.valueOf(str2).length()).append("onMarkerClick: ").append(str2);
    }
    cta.a(this.a, gxz.ce);
    if (localijx.c.size() == 1)
    {
      String str1 = ((nve)localijx.c.get(0)).a;
      cta.a(this.a, str1, -1);
      return true;
    }
    cta.a(this.a, localijx);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fxf
 * JD-Core Version:    0.7.0.1
 */