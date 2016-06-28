import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class iqb
  extends mca
  implements keo
{
  private static final mcq a = new mcq("debug.plus.dogfood");
  private ken b = new ken(this, this.bp);
  
  public iqb()
  {
    new gxl(pkc.e).a(this.bo);
  }
  
  public final void v()
  {
    iqe localiqe = (iqe)this.bo.a(iqe.class);
    kez localkez = new kez(this.bn);
    Uri localUri = ((ieb)mbb.a(this.bn, ieb.class)).a("conservebandwidth");
    int i = efj.Pj;
    String str = g().getString(i);
    int j = efj.Pi;
    ked localked = localkez.c(str, g().getString(j), new Intent("android.intent.action.VIEW", localUri));
    localked.d("com.google.android.libraries.social.media.settings.MediaSettings.low_bandwidth_key");
    localked.a(localiqe.a.getBoolean("com.google.android.libraries.social.media.settings.MediaSettings.low_bandwidth_key", false));
    localked.o = new iqc(this);
    this.b.a.b(localked);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqb
 * JD-Core Version:    0.7.0.1
 */