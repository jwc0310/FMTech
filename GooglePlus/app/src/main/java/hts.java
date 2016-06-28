import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public class hts
  extends mca
  implements keo
{
  public Intent Z;
  public final ken a = new ken(this, this.bp);
  public boolean aa;
  htu ab;
  private LabelPreference ac;
  public kez b;
  public Intent c;
  public Intent d;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      if (paramBundle.getParcelable("state_account_status_intent") != null) {
        this.c = ((Intent)paramBundle.getParcelable("state_account_status_intent"));
      }
      if (paramBundle.getParcelable("state_browse_experiments_intent") != null) {
        this.d = ((Intent)paramBundle.getParcelable("state_browse_experiments_intent"));
      }
      if (paramBundle.getParcelable("state_tracing_pref_intent") != null) {
        this.Z = ((Intent)paramBundle.getParcelable("state_tracing_pref_intent"));
      }
      this.aa = paramBundle.getBoolean("state_show_override_experiments_pref");
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ab = ((htu)this.bo.b(htu.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("state_account_status_intent", this.c);
    paramBundle.putParcelable("state_browse_experiments_intent", this.d);
    paramBundle.putParcelable("state_tracing_pref_intent", this.Z);
    paramBundle.putBoolean("state_show_override_experiments_pref", this.aa);
  }
  
  public final void m()
  {
    super.m();
    if (this.ac != null)
    {
      mbf localmbf = this.bn;
      if (!localmbf.getSharedPreferences(String.valueOf(localmbf.getPackageName()).concat("_preferences"), 0).getBoolean("debug.plus.frontend.tracing", false)) {
        break label56;
      }
    }
    label56:
    for (String str = "ON";; str = "OFF")
    {
      this.ac.a(str);
      return;
    }
  }
  
  public void v()
  {
    this.b = new kez(this.bn);
    kez localkez1 = this.b;
    int i = efj.Kx;
    PreferenceCategory localPreferenceCategory = localkez1.a(g().getString(i));
    localPreferenceCategory.c(false);
    this.a.a.b(localPreferenceCategory);
    ket localket3;
    label198:
    ket localket2;
    label272:
    kea localkea;
    if (this.Z != null)
    {
      kez localkez6 = this.b;
      int i5 = efj.KO;
      this.ac = localkez6.b(g().getString(i5), null);
      this.ac.t = this.Z;
      this.ac.d("tracing_preferences");
      if (localPreferenceCategory != null) {
        localPreferenceCategory.b(this.ac);
      }
    }
    else
    {
      if (this.c != null)
      {
        kez localkez5 = this.b;
        int i3 = efj.Kw;
        String str4 = g().getString(i3);
        int i4 = efj.Kv;
        localket3 = localkez5.a(str4, g().getString(i4), this.c);
        localket3.d("account_status_key");
        if (localPreferenceCategory == null) {
          break label460;
        }
        localPreferenceCategory.b(localket3);
      }
      if (this.d != null)
      {
        kez localkez4 = this.b;
        int i1 = efj.Kz;
        String str3 = g().getString(i1);
        int i2 = efj.Ky;
        localket2 = localkez4.a(str3, g().getString(i2), this.d);
        localket2.d("experiments_key");
        if (localPreferenceCategory == null) {
          break label476;
        }
        localPreferenceCategory.b(localket2);
      }
      if (this.aa)
      {
        kez localkez3 = this.b;
        int m = efj.Ku;
        String str2 = g().getString(m);
        int n = efj.Kt;
        localkea = localkez3.f(str2, g().getString(n));
        localkea.d("experiment_override_key");
        localkea.k = ehr.ci;
        if (localPreferenceCategory == null) {
          break label492;
        }
        localPreferenceCategory.b(localkea);
      }
    }
    ket localket1;
    for (;;)
    {
      if (this.ab != null)
      {
        kez localkez2 = this.b;
        int j = efj.KB;
        String str1 = g().getString(j);
        int k = efj.KA;
        localket1 = localkez2.a(str1, g().getString(k));
        localket1.d("debug.plus.force_sync");
        localket1.p = new htt(this);
        if (localPreferenceCategory == null) {
          break label508;
        }
        localPreferenceCategory.b(localket1);
      }
      return;
      ken localken = this.a;
      LabelPreference localLabelPreference = this.ac;
      localken.a.b(localLabelPreference);
      break;
      label460:
      this.a.a.b(localket3);
      break label198;
      label476:
      this.a.a.b(localket2);
      break label272;
      label492:
      this.a.a.b(localkea);
    }
    label508:
    this.a.a.b(localket1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hts
 * JD-Core Version:    0.7.0.1
 */