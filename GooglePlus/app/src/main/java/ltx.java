import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;
import com.google.android.libraries.social.timingbreakdown.ui.TimingBreakdownActivity;

public final class ltx
  extends mca
  implements keo
{
  private final ken a = new ken(this, this.bp);
  private kez b;
  private int c;
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.c = paramActivity.getIntent().getIntExtra("account_id", -1);
  }
  
  public final void v()
  {
    this.b = new kez(this.bn);
    Intent localIntent = new Intent(this.bn, TimingBreakdownActivity.class);
    localIntent.putExtra("account_id", this.c);
    kez localkez1 = this.b;
    int i = efj.Zl;
    PreferenceCategory localPreferenceCategory = localkez1.a(g().getString(i));
    this.a.a.b(localPreferenceCategory);
    kez localkez2 = this.b;
    int j = efj.Zn;
    String str = g().getString(j);
    int k = efj.Zm;
    ket localket = localkez2.a(str, g().getString(k), localIntent);
    localket.d("debug.plus.timing_breakdown");
    localPreferenceCategory.b(localket);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltx
 * JD-Core Version:    0.7.0.1
 */