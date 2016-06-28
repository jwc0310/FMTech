import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class htl
  extends mca
  implements keo
{
  private final ken a = new ken(this, this.bp);
  private kez b;
  
  public final void v()
  {
    this.b = new kez(this.bn);
    kez localkez1 = this.b;
    int i = efj.Ko;
    PreferenceCategory localPreferenceCategory = localkez1.a(g().getString(i));
    this.a.a.b(localPreferenceCategory);
    int j = this.m.getInt("account_id", -1);
    if (j != -1) {}
    for (int k = 1; k == 0; k = 0) {
      throw new IllegalArgumentException();
    }
    htd localhtd = new htd(this.bn);
    localhtd.a.putExtra("account_id", j);
    Intent localIntent = localhtd.a;
    kez localkez2 = this.b;
    int m = efj.Ko;
    String str = g().getString(m);
    int n = efj.Kn;
    localPreferenceCategory.b(localkez2.a(str, g().getString(n), localIntent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     htl
 * JD-Core Version:    0.7.0.1
 */