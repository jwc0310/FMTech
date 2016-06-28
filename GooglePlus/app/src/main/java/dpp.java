import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.plus.settings.SettingsActivity;

public final class dpp
  extends kdn
  implements kfp
{
  private final kfo aa = new kfo(this, this.c);
  private git ab;
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b.a(kfs.class, this.aa);
    this.ab = ((git)this.b.a(git.class));
  }
  
  public final void v()
  {
    Intent localIntent = new Intent(this.a, SettingsActivity.class);
    localIntent.putExtra("account_id", this.ab.c());
    kfo localkfo1 = this.aa;
    ior localior = new ior();
    localior.a = localIntent;
    bk localbk = localior.a();
    localkfo1.a.a(localbk, null);
    if ((!hbj.b(this.a)) && (!duj.a(this.a)))
    {
      kfo localkfo6 = this.aa;
      dpr localdpr2 = new dpr(1);
      localkfo6.a.a(localdpr2, null);
    }
    for (;;)
    {
      kfo localkfo3 = this.aa;
      iqb localiqb = new iqb();
      localkfo3.a.a(localiqb, null);
      kfo localkfo4 = this.aa;
      jnp localjnp = new jnp();
      localkfo4.a.a(localjnp, null);
      kfo localkfo5 = this.aa;
      dpr localdpr1 = new dpr(4);
      localkfo5.a.a(localdpr1, null);
      return;
      kfo localkfo2 = this.aa;
      drl localdrl = new drl();
      int i = aau.iD;
      localdrl.a = g().getString(i);
      Bundle localBundle = new Bundle();
      localBundle.putString("SimpleCategoryProvider.category_title", localdrl.a);
      drk localdrk = new drk();
      localdrk.f(localBundle);
      localkfo2.a.a(localdrk, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dpp
 * JD-Core Version:    0.7.0.1
 */