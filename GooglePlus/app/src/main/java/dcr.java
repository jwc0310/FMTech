import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

final class dcr
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  
  public final void a()
  {
    ikt localikt = this.c;
    ilf localilf = new ilf();
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
    if (paramInt2 == -1)
    {
      this.b.a(1);
      return;
    }
    int i = this.a.getIntent().getIntExtra("version", 0);
    if (i == 0)
    {
      this.b.a(2);
      return;
    }
    if (i > 1)
    {
      this.b.a(3);
      return;
    }
    String str = this.a.getCallingActivity().getPackageName();
    if (str == null)
    {
      this.b.a(2);
      return;
    }
    if (this.a.getPackageManager().checkSignatures(this.a.getPackageName(), str) != 0)
    {
      this.b.a(4);
      return;
    }
    Intent localIntent = efj.e(this.a, paramInt2);
    this.b.a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcr
 * JD-Core Version:    0.7.0.1
 */