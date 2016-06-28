import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

final class ldt
  implements giv, ica
{
  private final String a;
  private final String b;
  private Activity c;
  private ibw d;
  private ikt e;
  
  ldt(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void a()
  {
    ikt localikt = this.e;
    ilf localilf = new ilf();
    localilf.h = true;
    iln localiln = new iln();
    localiln.a = this.c.getString(efj.Xv);
    Bundle localBundle = localiln.a();
    localilf.s = ilm.class;
    localilf.t = localBundle;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.c = paramActivity;
    this.d = paramibw;
    this.e = ((ikt)paramikt.a(this));
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      ibw localibw = this.d;
      Intent localIntent1 = this.c.getIntent();
      Intent localIntent2 = ((kyp)mbb.a(this.c, kyp.class)).a(paramInt2, this.a, this.b);
      Bundle localBundle = localIntent1.getExtras();
      if (localBundle != null)
      {
        localBundle.remove("account_id");
        localIntent2.putExtras(localBundle);
      }
      localibw.a(localIntent2);
      return;
    }
    this.d.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ldt
 * JD-Core Version:    0.7.0.1
 */