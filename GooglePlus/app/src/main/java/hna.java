import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.List;

final class hna
  implements giv, ica
{
  private final String a;
  private Activity b;
  private ibw c;
  private ikt d;
  
  hna(hmy paramhmy, String paramString)
  {
    this.a = paramString;
  }
  
  public final void a()
  {
    ikt localikt = this.d;
    ilf localilf = new ilf();
    localilf.h = true;
    localilf.s = ilm.class;
    localilf.t = null;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.b = paramActivity;
    this.c = paramibw;
    paramikt.g.add(this);
    this.d = ((ikt)paramikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    hmy localhmy = this.e;
    ibw localibw = this.c;
    Intent localIntent1 = this.b.getIntent();
    Intent localIntent2 = ((hpo)mbb.a(this.b, hpo.class)).a(paramInt2, this.a, null);
    Bundle localBundle = localIntent1.getExtras();
    if (localBundle != null)
    {
      localBundle.remove("account_id");
      localIntent2.putExtras(localBundle);
    }
    hmy.a(localhmy, paramInt2, localibw, localIntent2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hna
 * JD-Core Version:    0.7.0.1
 */