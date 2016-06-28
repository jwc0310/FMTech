import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

final class frc
  implements fqm
{
  public final fql a(Bundle paramBundle)
  {
    CastDevice localCastDevice = CastDevice.a(paramBundle);
    if (localCastDevice != null) {
      return new frd(localCastDevice);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     frc
 * JD-Core Version:    0.7.0.1
 */