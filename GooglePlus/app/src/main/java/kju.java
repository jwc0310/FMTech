import android.content.Intent;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.impl.LocationSelectorFragment;

public final class kju
  implements jpe
{
  public kju(LocationSelectorFragment paramLocationSelectorFragment) {}
  
  public final void a(jpg paramjpg)
  {
    if (this.a.i())
    {
      if (!paramjpg.a()) {
        break label60;
      }
      LocationSelectorFragment localLocationSelectorFragment = this.a;
      Intent localIntent = ((fwu)localLocationSelectorFragment.bo.a(fwu.class)).a(localLocationSelectorFragment.f());
      if (localIntent != null) {
        localLocationSelectorFragment.c.a(aau.BF, localIntent);
      }
    }
    return;
    label60:
    Toast.makeText(this.a.bn, et.m, 1).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kju
 * JD-Core Version:    0.7.0.1
 */