import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dny
  extends mca
  implements keo
{
  private ken Z = new ken(this, this.bp);
  git a;
  private CheckBoxPreference aa;
  private doa ab;
  private dnz ac;
  jov b;
  jpd c;
  CheckBoxPreference d;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ab = new doa(this);
    this.ac = new dnz(this);
    this.b.a(aaw.iV, this.ab);
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.b = ((jov)this.bo.a(jov.class));
    this.c = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void v()
  {
    boolean bool1 = true;
    int i = this.a.c();
    kez localkez = new kez(this.bn);
    boolean bool2;
    label121:
    Intent localIntent;
    if (dkh.c(this.bn))
    {
      int m = aau.et;
      String str2 = g().getString(m);
      int n = aau.eu;
      this.d = localkez.c(str2, g().getString(n));
      if (this.c.a(this.bn, "android.permission.READ_CONTACTS") == 0)
      {
        bool2 = bool1;
        boolean bool3 = bgp.g(this.bn, i);
        CheckBoxPreference localCheckBoxPreference2 = this.d;
        if ((!bool2) || (!bool3)) {
          break label315;
        }
        localCheckBoxPreference2.a(bool1);
        this.d.w = false;
        this.d.o = this.ab;
        ken localken2 = this.Z;
        CheckBoxPreference localCheckBoxPreference3 = this.d;
        localken2.a.b(localCheckBoxPreference3);
      }
    }
    else
    {
      localIntent = new Intent("android.intent.action.VIEW", efj.a(this.bn, "plus_sync_address", "https://support.google.com/plus/?hl=%locale%"));
      localIntent.addFlags(524288);
      if (!dtz.b(this.bn)) {
        break label320;
      }
    }
    label315:
    label320:
    for (int j = aau.eq;; j = aau.es)
    {
      String str1 = g().getString(j);
      int k = aau.er;
      this.aa = localkez.c(g().getString(k), str1, localIntent);
      this.aa.a(bgp.h(this.bn, i));
      this.aa.w = false;
      this.aa.o = this.ac;
      ken localken1 = this.Z;
      CheckBoxPreference localCheckBoxPreference1 = this.aa;
      localken1.a.b(localCheckBoxPreference1);
      return;
      bool2 = false;
      break;
      bool1 = false;
      break label121;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dny
 * JD-Core Version:    0.7.0.1
 */