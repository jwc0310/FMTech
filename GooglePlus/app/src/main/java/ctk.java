import android.location.Location;
import android.util.Log;

final class ctk
  implements fvt
{
  ctk(cta paramcta) {}
  
  public final void a(Location paramLocation)
  {
    fxw localfxw = new fxw(paramLocation.getLatitude(), paramLocation.getLongitude());
    if (Log.isLoggable("FriendLocations", 3))
    {
      String str = String.valueOf(localfxw);
      new StringBuilder(19 + String.valueOf(str).length()).append("onLocationChanged: ").append(str);
    }
    if (!localfxw.equals(this.a.d))
    {
      this.a.d = localfxw;
      if (this.a.y()) {
        cta.a(this.a);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctk
 * JD-Core Version:    0.7.0.1
 */