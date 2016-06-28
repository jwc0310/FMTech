import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class idy
  implements gpq, mbo, mfb, mfc, mfd
{
  public String a;
  private final Activity b;
  private idw c;
  private git d;
  private gpl e;
  private idx f;
  private hzv g;
  
  idy(Activity paramActivity, mek parammek, hzv paramhzv, git paramgit, gpl paramgpl, idx paramidx)
  {
    this.b = paramActivity;
    this.g = paramhzv;
    this.d = paramgit;
    this.e = paramgpl;
    this.f = paramidx;
    parammek.a(this);
  }
  
  public idy(Activity paramActivity, mek parammek, String paramString)
  {
    this.b = paramActivity;
    this.a = paramString;
    this.g = new hzv();
    parammek.a(this);
  }
  
  private final String c()
  {
    idw localidw = this.c;
    String str = null;
    if (localidw != null)
    {
      boolean bool = this.d.d();
      str = null;
      if (bool) {
        str = this.c.a(this.d.c());
      }
    }
    return str;
  }
  
  public final void a()
  {
    this.e.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((git)parammbb.a(git.class));
    this.f = ((idx)parammbb.a(idx.class));
    this.e = ((gpl)parammbb.a(gpl.class));
    this.c = ((idw)parammbb.b(idw.class));
  }
  
  public final void a(gpr paramgpr)
  {
    paramgpr.b(efj.MG);
    paramgpr.b(efj.MF);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == efj.MG)
    {
      if (this.d.d()) {}
      for (String str = this.d.f().b("account_name");; str = null)
      {
        this.f.a(this.b, str, this.a, c());
        return true;
      }
    }
    if (i == efj.MF)
    {
      this.g.b = c();
      hzv localhzv = this.g;
      hzr.a(this.b, localhzv.a, localhzv.b);
    }
    return false;
  }
  
  public final void aK_()
  {
    this.e.b(this);
  }
  
  public final void b(tp paramtp) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     idy
 * JD-Core Version:    0.7.0.1
 */