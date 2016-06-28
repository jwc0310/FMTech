import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class dnr
  extends mca
  implements keo, luu
{
  lut a;
  private final ken b = new ken(this, this.bp);
  private kez c;
  private git d;
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle, String paramString)
  {
    ((giz)this.bo.a(giz.class)).b(this.d.c()).b("logged_out", true).d();
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/downgrade/"));
    localIntent.addFlags(524288);
    a(localIntent);
    f().finish();
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    if (this.a != null) {
      this.a.d.cancel();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.d = ((git)this.bo.a(git.class));
  }
  
  public final void c(Bundle paramBundle, String paramString)
  {
    if (this.a != null) {
      this.a.d.cancel();
    }
  }
  
  public final void v()
  {
    this.c = new kez(this.bn);
    kez localkez = this.c;
    int i = aau.pB;
    String str = g().getString(i);
    int j = aau.pz;
    ket localket = localkez.a(str, g().getString(j));
    localket.p = new dns(this);
    this.b.a.b(localket);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnr
 * JD-Core Version:    0.7.0.1
 */