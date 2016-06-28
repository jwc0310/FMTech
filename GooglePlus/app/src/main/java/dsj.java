import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;
import java.util.ArrayList;

public final class dsj
  extends mca
  implements gzi, kds
{
  private kdp Z;
  final gzj a;
  private kez aa;
  private cw<obl> ab;
  int b;
  CheckBoxPreference c;
  obl d;
  
  public dsj()
  {
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.a = localgzj;
    this.Z = new kdp(this, this.bp);
    this.ab = new dsk(this, this, this.Z, this.bp);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.b = paramActivity.getIntent().getIntExtra("account_id", -1);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("SetProfileSettingsTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label135;
      }
    }
    label135:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        obl localobl = this.d;
        boolean bool1 = this.d.a.booleanValue();
        boolean bool2 = false;
        if (!bool1) {
          bool2 = true;
        }
        localobl.a = Boolean.valueOf(bool2);
        if (this.c != null) {
          this.c.a(this.d.a.booleanValue());
        }
      }
      kdp localkdp = this.Z;
      if (localkdp.e != null)
      {
        kdr localkdr = localkdp.e;
        if (localkdr.a != null)
        {
          localkdr.a.b(true);
          localkdr.a = null;
        }
      }
      return;
    }
  }
  
  public final void x()
  {
    k().a(1, null, this.ab);
  }
  
  public final void y()
  {
    k().b(1, null, this.ab);
  }
  
  public final void z()
  {
    this.aa = new kez(this.bn);
    Uri localUri = efj.a(this.bn, "profile_views", "https://support.google.com/plus/?hl=%locale%");
    kez localkez = this.aa;
    int i = aau.rm;
    String str = g().getString(i);
    int j = aau.rl;
    ked localked = localkez.c(str, g().getString(j), new Intent("android.intent.action.VIEW", localUri));
    localked.d("show_view_counts_preference");
    localked.o = new dsl(this);
    this.c = localked;
    kdp localkdp = this.Z;
    CheckBoxPreference localCheckBoxPreference = this.c;
    localkdp.a(localCheckBoxPreference);
    localkdp.d.b(localCheckBoxPreference);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsj
 * JD-Core Version:    0.7.0.1
 */