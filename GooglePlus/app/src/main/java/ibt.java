import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

final class ibt
  implements giv, ica
{
  private ibw a;
  private final Uri b;
  private final String c;
  private ikt d;
  
  ibt(Uri paramUri, String paramString)
  {
    this.b = paramUri;
    this.c = paramString;
  }
  
  public final void a()
  {
    ikt localikt = this.d;
    ilf localilf = new ilf();
    localilf.r = new ibu(this.c);
    localilf.b = null;
    localikt.a(localilf);
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramibw;
    paramikt.g.add(this);
    this.d = ((ikt)paramikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    ibw localibw = this.a;
    Intent localIntent = new Intent("android.intent.action.VIEW", this.b);
    if (paramInt2 != -1) {
      localIntent.putExtra("account_id", paramInt2);
    }
    localibw.a(localIntent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibt
 * JD-Core Version:    0.7.0.1
 */