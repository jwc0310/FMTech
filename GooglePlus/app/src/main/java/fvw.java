import android.location.Location;
import com.google.android.gms.location.LocationResult;
import java.util.List;

public class fvw
{
  public fvw(fwh paramfwh, LocationResult paramLocationResult) {}
  
  public Location a()
  {
    LocationResult localLocationResult = this.a;
    int i = localLocationResult.c.size();
    if (i == 0) {
      return null;
    }
    return (Location)localLocationResult.c.get(i - 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fvw
 * JD-Core Version:    0.7.0.1
 */