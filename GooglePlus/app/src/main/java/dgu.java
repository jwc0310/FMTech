import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import java.util.List;

final class dgu
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
      ibw localibw = this.b;
      Intent localIntent1 = this.a.getIntent();
      Intent localIntent2 = new Intent(localIntent1);
      localIntent2.setPackage(this.a.getPackageName());
      localIntent2.putExtra("account_id", paramInt2);
      localIntent2.setAction("android.intent.action.VIEW");
      String str = localIntent1.getStringExtra("com.google.android.apps.plus.CONTENT_URL");
      localIntent2.setDataAndType(Uri.parse("http://plus.google.com/share").buildUpon().appendQueryParameter("url", str).build(), "text/plain");
      localIntent2.putExtra("from_url_gateway", true);
      localibw.a(localIntent2);
      return;
    }
    this.b.a(0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgu
 * JD-Core Version:    0.7.0.1
 */