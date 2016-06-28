import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.notifications.debug.GunsStatisticsActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class jau
  extends mca
  implements keo
{
  private final ken a = new ken(this, this.bp);
  private git b;
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((git)this.bo.a(git.class));
  }
  
  public final void v()
  {
    kez localkez = new kez(this.bn);
    Intent localIntent = new Intent(this.bn, GunsStatisticsActivity.class);
    localIntent.putExtra("account_id", this.b.c());
    int i = aau.Au;
    PreferenceCategory localPreferenceCategory = localkez.a(g().getString(i));
    this.a.a.b(localPreferenceCategory);
    int j = aau.Au;
    String str = g().getString(j);
    int k = aau.At;
    ket localket = localkez.a(str, g().getString(k), localIntent);
    localket.d("debug.guns.statistics");
    localPreferenceCategory.b(localket);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jau
 * JD-Core Version:    0.7.0.1
 */