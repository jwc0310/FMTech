import android.content.Intent;
import com.google.android.apps.plus.permissions.NoPermissionsActivity;
import com.google.android.apps.plus.service.DreamSettingsActivity;

public final class dks
  implements jpe
{
  public dks(DreamSettingsActivity paramDreamSettingsActivity) {}
  
  public final void a(jpg paramjpg)
  {
    if (paramjpg.a())
    {
      this.a.f();
      return;
    }
    DreamSettingsActivity localDreamSettingsActivity = this.a;
    Intent localIntent = new Intent(localDreamSettingsActivity, NoPermissionsActivity.class);
    localDreamSettingsActivity.i.a(aaw.iD, localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dks
 * JD-Core Version:    0.7.0.1
 */