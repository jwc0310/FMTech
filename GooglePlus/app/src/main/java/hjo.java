import android.os.Bundle;
import android.widget.Toast;

final class hjo
  implements gzi
{
  hjo(hjl paramhjl) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (!"ReadCollectorSettingsTask".equals(paramString)) || (!paramhae.a().getBoolean("trigger_follow_state_update", false))) {
      return;
    }
    if (paramhae.b != 200) {}
    for (int i = 1; i != 0; i = 0)
    {
      Toast.makeText(this.a.a, this.a.a.getString(az.e), 0).show();
      return;
    }
    if (!this.a.d.b(this.a.c.c()))
    {
      hjl localhjl = this.a;
      hjs.a(aau.zr, localhjl.a.getString(az.h), efj.y(localhjl.a.getString(az.f)).toString(), localhjl.a.getString(az.j), localhjl.a.getString(az.a)).a(localhjl.b.h(), "collexion_privacy_alert_dialog");
      return;
    }
    this.a.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjo
 * JD-Core Version:    0.7.0.1
 */