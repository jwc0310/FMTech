import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;

final class hjn
  implements gzi
{
  hjn(hjl paramhjl) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ((paramhae == null) || (!"DeleteCollexion".equals(paramString))) {
      return;
    }
    if (hae.a(paramhae))
    {
      bp localbp = this.a.a;
      int i = az.d;
      efj.a(localbp, localbp.getResources().getText(i), 1).show();
      return;
    }
    hjl localhjl = this.a;
    bz localbz = localhjl.b.x;
    if (localbz.e() > 0)
    {
      localbz.c();
      return;
    }
    localhjl.a.onBackPressed();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hjn
 * JD-Core Version:    0.7.0.1
 */