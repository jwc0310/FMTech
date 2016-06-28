import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;

public final class drg
  extends mca
  implements cpk, gzi, kds
{
  private final guf Z = new drh(this);
  drb a;
  private final gug aa;
  private kdp ab;
  private final gzj ac;
  private kez ad;
  private cw<drb> ae;
  boolean b;
  int c;
  ket d;
  
  public drg()
  {
    gug localgug = new gug(this.bp, (byte)0);
    this.bo.a(gug.class, localgug);
    this.aa = localgug.a(aaw.iA, this.Z);
    this.ab = new kdp(this, this.bp);
    gzj localgzj = new gzj(this, this.bp);
    localgzj.a.add(this);
    this.ac = localgzj;
    this.ae = new dri(this, this, this.ab, this.bp);
  }
  
  public final void I()
  {
    Intent localIntent = efj.a(f(), this.c, aau.qq, this.a.a);
    this.aa.a(aaw.iA, localIntent);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.c = paramActivity.getIntent().getIntExtra("account_id", -1);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("sharing_settings"))) {
      this.a = ((drb)paramBundle.getParcelable("sharing_settings"));
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("UpdateSourceBackgroundTask".equals(paramString)) {
      if (paramhae.b == 200) {
        break label86;
      }
    }
    label86:
    for (int i = 1;; i = 0)
    {
      if ((i == 0) && (this.d != null))
      {
        ket localket = this.d;
        int j = efj.a(this.a.a);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a.b;
        localket.a_(g().getString(j, arrayOfObject));
      }
      return;
    }
  }
  
  public final void b(String paramString1, int paramInt, String paramString2)
  {
    gnb localgnb = new gnb(new jgs(paramString1, paramInt, paramString2, 1));
    if (!efj.a(this.bn, localgnb, this.a.a))
    {
      this.a.a = localgnb;
      v();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((hyi)this.bo.a(hyi.class)).b(bwb.e, this.c);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.a != null) {
      paramBundle.putParcelable("sharing_settings", this.a);
    }
  }
  
  final void v()
  {
    if (this.a.a != null) {
      if (!this.a.a.c()) {
        break label71;
      }
    }
    label71:
    for (omk localomk = new omk();; localomk = efj.a(this.a.a, null))
    {
      drq localdrq = new drq(this.bn, this.c, qat.a(localomk));
      gzj localgzj = this.ac;
      localgzj.d.a(localdrq, false);
      localgzj.b(localdrq);
      return;
    }
  }
  
  public final void x()
  {
    k().a(1, null, this.ae);
  }
  
  public final void y()
  {
    k().b(1, null, this.ae);
  }
  
  public final void z()
  {
    this.ad = new kez(this.bn);
    if ((this.b) && (this.a.a != null))
    {
      kez localkez1 = this.ad;
      int i = aau.tA;
      PreferenceCategory localPreferenceCategory = localkez1.b(localkez1.a.getString(i));
      kez localkez2 = this.ad;
      int j = aau.tz;
      String str1 = g().getString(j);
      int k = efj.a(this.a.a);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.b;
      this.d = localkez2.a(str1, g().getString(k, arrayOfObject));
      this.d.p = new drj(this);
      localPreferenceCategory.b(this.d);
      Uri localUri = efj.a(this.bn, "plusone_posts", "https://support.google.com/plus/?hl=%locale%");
      kez localkez3 = this.ad;
      int m = aau.bE;
      String str2 = g().getString(m);
      Intent localIntent = new Intent("android.intent.action.VIEW", localUri);
      kef localkef = new kef(localkez3.a);
      localkef.b(null);
      localkef.a_(str2);
      localkef.a = localIntent;
      localkef.c(false);
      localPreferenceCategory.b(localkef);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drg
 * JD-Core Version:    0.7.0.1
 */