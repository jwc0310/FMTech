import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jnp
  extends mca
  implements keo
{
  private ken a = new ken(this, this.bp);
  
  public jnp()
  {
    new gxl(pkc.e).a(this.bo);
  }
  
  public final void v()
  {
    jno localjno = (jno)this.bo.a(jno.class);
    kez localkez = new kez(this.bn);
    int i = efj.SI;
    String str = g().getString(i);
    int j = efj.SH;
    CheckBoxPreference localCheckBoxPreference = localkez.c(str, g().getString(j));
    localCheckBoxPreference.d("com.google.android.libraries.social.people.providers.navigation.circlessettings.display_circles_key");
    localCheckBoxPreference.a(localjno.a.getBoolean("com.google.android.libraries.social.people.providers.navigation.circlessettings.display_circles_key", false));
    localCheckBoxPreference.o = new jnq(this);
    this.a.a.b(localCheckBoxPreference);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnp
 * JD-Core Version:    0.7.0.1
 */