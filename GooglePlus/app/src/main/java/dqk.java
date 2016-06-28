import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;

public final class dqk
  extends mca
  implements gzi, kds
{
  private dqn Z = new dqn(this);
  ojj a;
  private kdp aa;
  private kez ab;
  private cw<ojj> ac;
  CheckBoxPreference b;
  final gzj c;
  git d;
  
  public dqk()
  {
    gzj localgzj = new gzj(this, this.bp);
    this.bo.a(gzj.class, localgzj);
    localgzj.a.add(this);
    this.c = localgzj;
    this.aa = new kdp(this, this.bp);
    this.ac = new dql(this, this, this.aa, this.bp);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("SetPhotosSettingsTask".equals(paramString))
    {
      kdp localkdp = this.aa;
      if (localkdp.e != null)
      {
        kdr localkdr = localkdp.e;
        if (localkdr.a != null)
        {
          localkdr.a.b(true);
          localkdr.a = null;
        }
      }
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((git)this.bo.a(git.class));
  }
  
  public final void x()
  {
    k().a(0, null, this.ac);
  }
  
  public final void y()
  {
    k().b(0, null, this.ac);
  }
  
  public final void z()
  {
    this.ab = new kez(this.bn);
    Uri localUri = efj.a(this.bn, "android_photos_location", "https://support.google.com/plus/?hl=%locale%");
    kez localkez1 = this.ab;
    int i = aau.nN;
    String str = g().getString(i);
    int j = aau.nM;
    this.b = localkez1.c(str, g().getString(j), new Intent("android.intent.action.VIEW", localUri));
    this.b.d("photo_location");
    this.b.a(Boolean.valueOf(g().getBoolean(efj.jb)));
    this.b.p = this.Z;
    kdp localkdp = this.aa;
    CheckBoxPreference localCheckBoxPreference = this.b;
    localkdp.a(localCheckBoxPreference);
    localkdp.d.b(localCheckBoxPreference);
    kez localkez2 = this.ab;
    int k = aau.nK;
    ket localket = localkez2.a(g().getString(k), null);
    localket.d("about_photo_location");
    localket.p = new dqm(this);
    this.aa.d.b(localket);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dqk
 * JD-Core Version:    0.7.0.1
 */