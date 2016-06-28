import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class htv
  extends mca
  implements keo
{
  public Intent Z;
  LabelPreference a;
  public Intent aa;
  private ken ab = new ken(this, this.bp);
  private kez ac;
  public boolean b;
  public boolean c;
  public Intent d;
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("state_network_netlogs_pref");
      this.c = paramBundle.getBoolean("state_network_defaults_pref");
      if (paramBundle.getParcelable("state_network_requests_intent") != null) {
        this.d = ((Intent)paramBundle.getParcelable("state_network_requests_intent"));
      }
      if (paramBundle.getParcelable("state_network_stats_intent") != null) {
        this.Z = ((Intent)paramBundle.getParcelable("state_network_stats_intent"));
      }
      if (paramBundle.getParcelable("state_media_upload_stats_intent") != null) {
        this.aa = ((Intent)paramBundle.getParcelable("state_media_upload_stats_intent"));
      }
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("state_network_netlogs_pref", this.b);
    paramBundle.putBoolean("state_network_defaults_pref", this.c);
    paramBundle.putParcelable("state_network_requests_intent", this.d);
    paramBundle.putParcelable("state_network_stats_intent", this.Z);
    paramBundle.putParcelable("state_media_upload_stats_intent", this.aa);
  }
  
  public final void m()
  {
    super.m();
    LabelPreference localLabelPreference;
    if (this.a != null)
    {
      mbf localmbf = this.bn;
      boolean bool = localmbf.getSharedPreferences(String.valueOf(localmbf.getPackageName()).concat("_preferences"), 0).getBoolean("net_netlogs_key", false);
      localLabelPreference = this.a;
      if (!bool) {
        break label62;
      }
    }
    label62:
    for (String str = "ON";; str = "OFF")
    {
      localLabelPreference.a(str);
      return;
    }
  }
  
  public final void v()
  {
    this.ac = new kez(this.bn);
    kez localkez1 = this.ac;
    int i = efj.KG;
    PreferenceCategory localPreferenceCategory = localkez1.a(g().getString(i));
    this.ab.a.b(localPreferenceCategory);
    ket localket3;
    label232:
    ket localket2;
    if (this.b)
    {
      kez localkez5 = this.ac;
      int i3 = efj.KD;
      String str4 = g().getString(i3);
      int i4 = efj.KC;
      this.a = localkez5.b(str4, g().getString(i4));
      this.a.d("net_netlogs_key");
      this.a.a(Boolean.valueOf(false));
      this.a.p = new htw(this);
      if (localPreferenceCategory != null) {
        localPreferenceCategory.b(this.a);
      }
    }
    else if (this.c)
    {
      if (this.d != null)
      {
        kez localkez4 = this.ac;
        int i1 = efj.KI;
        String str3 = g().getString(i1);
        int i2 = efj.KH;
        localket3 = localkez4.a(str3, g().getString(i2), this.d);
        localket3.d("net_transactions_key");
        if (localPreferenceCategory == null) {
          break label407;
        }
        localPreferenceCategory.b(localket3);
      }
      if (this.Z != null)
      {
        kez localkez3 = this.ac;
        int m = efj.KF;
        String str2 = g().getString(m);
        int n = efj.KE;
        localket2 = localkez3.a(str2, g().getString(n), this.Z);
        localket2.d("net_stats_key");
        if (localPreferenceCategory == null) {
          break label423;
        }
        localPreferenceCategory.b(localket2);
      }
    }
    ket localket1;
    for (;;)
    {
      if (this.aa != null)
      {
        kez localkez2 = this.ac;
        int j = efj.KL;
        String str1 = g().getString(j);
        int k = efj.KK;
        localket1 = localkez2.a(str1, g().getString(k), this.aa);
        localket1.d("media_uploads_stats_key");
        if (localPreferenceCategory == null) {
          break label439;
        }
        localPreferenceCategory.b(localket1);
      }
      return;
      ken localken = this.ab;
      LabelPreference localLabelPreference = this.a;
      localken.a.b(localLabelPreference);
      break;
      label407:
      this.ab.a.b(localket3);
      break label232;
      label423:
      this.ab.a.b(localket2);
    }
    label439:
    this.ab.a.b(localket1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htv
 * JD-Core Version:    0.7.0.1
 */