import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

final class hmz
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  
  hmz(hmy paramhmy) {}
  
  public final void a()
  {
    ikt localikt = this.c;
    ilf localilf = new ilf();
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
    hmy localhmy = this.d;
    ibw localibw = this.b;
    Intent localIntent1 = this.a.getIntent();
    Intent localIntent2 = ((iwu)mbb.a(this.a, iwu.class)).b(this.a, paramInt2);
    Bundle localBundle = localIntent1.getExtras();
    if (localBundle != null) {
      localIntent2.putExtras(localBundle);
    }
    hmy.a(localhmy, paramInt2, localibw, localIntent2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmz
 * JD-Core Version:    0.7.0.1
 */