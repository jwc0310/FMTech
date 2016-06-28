import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.plus.settings.GplusDeveloperSettingsActivity;
import com.google.android.apps.plus.settings.StreamSettingsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dpr
  extends mca
  implements keo
{
  int a;
  private kez b;
  private int c;
  
  public dpr()
  {
    new ken(this, this.bp);
  }
  
  public dpr(int paramInt)
  {
    new ken(this, this.bp);
    this.c = paramInt;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.c = paramBundle.getInt("state_pref_type");
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class)).c();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("state_pref_type", this.c);
  }
  
  public final void v()
  {
    this.b = new kez(this.bn);
    switch (this.c)
    {
    case 2: 
    default: 
      throw new IllegalStateException("Must specify a valid Preference type");
    case 1: 
      kez localkez4 = this.b;
      int n = aau.iD;
      PreferenceCategory localPreferenceCategory2 = localkez4.b(g().getString(n));
      int i1 = aau.nu;
      String str2 = g().getString(i1);
      kez localkez5 = this.b;
      int i2 = aau.nL;
      ket localket2 = localkez5.a(g().getString(i2), str2);
      localket2.d("instant_upload_settings_key");
      localket2.p = new dps(this);
      localPreferenceCategory2.b(localket2);
    }
    mbb localmbb;
    int i;
    do
    {
      return;
      Intent localIntent2 = new Intent(this.bn, GplusDeveloperSettingsActivity.class);
      localIntent2.setAction("android.intent.action.VIEW");
      localIntent2.putExtra("account_id", this.a);
      kez localkez3 = this.b;
      int m = aau.pw;
      String str1 = g().getString(m);
      localkez3.a().b(localkez3.a(str1, null, localIntent2));
      return;
      localmbb = mbb.b(this.bn);
      i = bgp.a(this.bn);
    } while ((i == -1) || (localmbb.b(lwr.class) == null) || (!((hyi)localmbb.a(hyi.class)).b(max.a, i)));
    kez localkez1 = this.b;
    int j = aau.uD;
    PreferenceCategory localPreferenceCategory1 = localkez1.b(g().getString(j));
    localPreferenceCategory1.d("stream_category_preference");
    Intent localIntent1 = new Intent(this.bn, StreamSettingsActivity.class);
    localIntent1.putExtra("account_id", i);
    kez localkez2 = this.b;
    int k = aau.pE;
    ket localket1 = localkez2.a(g().getString(k), null, localIntent1);
    localket1.d("stream_video_preference");
    localPreferenceCategory1.b(localket1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpr
 * JD-Core Version:    0.7.0.1
 */