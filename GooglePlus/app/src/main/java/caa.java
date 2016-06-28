import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.preference.PreferenceManager;
import com.google.android.apps.plus.fragments.EventLocationFragment;

public final class caa
  implements fvt
{
  public caa(EventLocationFragment paramEventLocationFragment) {}
  
  public final void a(Location paramLocation)
  {
    this.a.z();
    if (this.a.i())
    {
      EventLocationFragment localEventLocationFragment = this.a;
      double d1 = paramLocation.getLatitude();
      double d2 = paramLocation.getLongitude();
      if (localEventLocationFragment.v())
      {
        float[] arrayOfFloat = new float[1];
        Location.distanceBetween(localEventLocationFragment.aa, localEventLocationFragment.ab, d1, d2, arrayOfFloat);
        if (arrayOfFloat[0] < 200.0F) {}
      }
      else
      {
        localEventLocationFragment.aa = d1;
        localEventLocationFragment.ab = d2;
        SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(localEventLocationFragment.f()).edit();
        localEditor.putString("event.current.latitude", Double.toString(localEventLocationFragment.aa));
        localEditor.putString("event.current.longitude", Double.toString(localEventLocationFragment.ab));
        localEditor.apply();
        localEventLocationFragment.w();
        localEventLocationFragment.x();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     caa
 * JD-Core Version:    0.7.0.1
 */