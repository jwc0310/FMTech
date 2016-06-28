import android.app.Activity;
import android.content.Intent;
import java.util.List;

final class ddz
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  private int d;
  private String e;
  private String f;
  
  public ddz(int paramInt, String paramString1, String paramString2)
  {
    this.d = paramInt;
    this.e = paramString1;
    this.f = paramString2;
  }
  
  public final void a()
  {
    Intent localIntent = this.a.getIntent();
    ikt localikt = this.c;
    ilf localilf = new ilf();
    localilf.c = localIntent.getIntExtra("account_id", -1);
    localilf.h = true;
    localilf.s = ilm.class;
    localilf.t = null;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.b = paramibw;
    paramikt.g.add(this);
    this.c = ((ikt)paramikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      ibw localibw = this.b;
      if (this.d == 1) {}
      for (Intent localIntent = efj.c(this.a, paramInt2, this.f, this.e, false).putExtra("disable_up_button", true);; localIntent = efj.d(this.a, paramInt2, this.f, this.e, false).putExtra("disable_up_button", true))
      {
        localibw.a(localIntent);
        return;
      }
    }
    this.b.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ddz
 * JD-Core Version:    0.7.0.1
 */