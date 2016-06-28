import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.plus.phone.sharebox.PlusShareboxActivity;
import java.util.List;

final class dgv
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  
  public final void a()
  {
    Intent localIntent = this.a.getIntent();
    ikt localikt = this.c;
    ilf localilf = new ilf();
    localilf.u.add(ine.class);
    localilf.c = localIntent.getIntExtra("account_id", -1);
    localilf.h = true;
    iln localiln = new iln();
    localiln.a = this.a.getString(aau.du);
    Bundle localBundle = localiln.a();
    localilf.s = ilm.class;
    localilf.t = localBundle;
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
      new kqf(83).b(this.a);
      ibw localibw = this.b;
      Intent localIntent = new Intent(this.a.getIntent());
      localIntent.setComponent(new ComponentName(this.a, PlusShareboxActivity.class));
      localIntent.putExtra("account_id", paramInt2);
      localIntent.putExtra("from_url_gateway", true);
      localibw.a(localIntent);
      return;
    }
    this.b.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgv
 * JD-Core Version:    0.7.0.1
 */