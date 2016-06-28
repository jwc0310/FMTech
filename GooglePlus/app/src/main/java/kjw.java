import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.sharekit.impl.LocationSelectorFragment;
import java.util.Arrays;
import java.util.List;

public final class kjw
  implements View.OnClickListener
{
  public kjw(LocationSelectorFragment paramLocationSelectorFragment, Resources paramResources) {}
  
  public final void onClick(View paramView)
  {
    if (this.b.b) {
      return;
    }
    this.b.b = true;
    for (int i = 0; i < this.b.d.size(); i++) {
      ((kjx)this.b.d.get(i)).a();
    }
    if (!efj.s(this.b.f()))
    {
      lut locallut = lut.b(null, this.a.getString(et.n), this.a.getString(et.M), this.a.getString(et.D));
      locallut.n = this.b;
      locallut.p = 0;
      locallut.a(this.b.x, "dialog-loc-settings");
      return;
    }
    LocationSelectorFragment localLocationSelectorFragment = this.b;
    localLocationSelectorFragment.Z.a(localLocationSelectorFragment.aa, aau.BG, Arrays.asList(new String[] { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" }));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjw
 * JD-Core Version:    0.7.0.1
 */