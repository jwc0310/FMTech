import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class kgh
  extends mca
  implements keo
{
  private kez Z;
  Uri a;
  Uri b;
  kgl c;
  private ken d = new ken(this, this.bp);
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = ((Uri)paramBundle.getParcelable("privacy_uri"));
      this.a = ((Uri)paramBundle.getParcelable("terms_uri"));
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((kgl)this.bo.b(kgl.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("privacy_uri", this.b);
    paramBundle.putParcelable("terms_uri", this.a);
  }
  
  public final void v()
  {
    this.Z = new kez(this.bn);
    Uri localUri1 = this.a;
    Uri localUri2 = this.b;
    int i = efj.Ut;
    String str1 = g().getString(i);
    String str2 = "?";
    try
    {
      str2 = this.bn.getPackageManager().getPackageInfo(this.bn.getPackageName(), 0).versionName;
      label66:
      ken localken1 = this.d;
      ket localket1 = this.Z.a(str1, str2);
      localken1.a.b(localket1);
      int j = efj.Uv;
      String str3 = g().getString(j);
      int k = efj.Uu;
      String str4 = g().getString(k);
      Intent localIntent1 = new Intent(this.bn, LicenseMenuActivity.class);
      ken localken2 = this.d;
      ket localket2 = this.Z.a(str3, str4, localIntent1);
      localken2.a.b(localket2);
      localket2.d("about_license_pref_key");
      localket2.p = new kgi(this);
      if (localUri2 != null)
      {
        int n = efj.Ur;
        String str6 = g().getString(n);
        Intent localIntent3 = new Intent("android.intent.action.VIEW", localUri2);
        localIntent3.addFlags(524288);
        ken localken4 = this.d;
        ket localket4 = this.Z.a(str6, "", localIntent3);
        localken4.a.b(localket4);
        localket4.d("about_privacy_pref_key");
        localket4.p = new kgj(this);
      }
      if (localUri1 != null)
      {
        int m = efj.Us;
        String str5 = g().getString(m);
        Intent localIntent2 = new Intent("android.intent.action.VIEW", localUri1);
        localIntent2.addFlags(524288);
        ken localken3 = this.d;
        ket localket3 = this.Z.a(str5, "", localIntent2);
        localken3.a.b(localket3);
        localket3.d("about_terms_pref_key");
        localket3.p = new kgk(this);
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label66;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kgh
 * JD-Core Version:    0.7.0.1
 */