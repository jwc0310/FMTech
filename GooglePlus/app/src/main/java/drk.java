import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class drk
  extends mca
  implements keo
{
  private ken a = new ken(this, this.bp);
  private kez b;
  
  public final void v()
  {
    this.b = new kez(this.bn);
    Bundle localBundle = this.m;
    if (localBundle != null) {}
    for (String str = localBundle.getString("SimpleCategoryProvider.category_title");; str = null)
    {
      if (!TextUtils.isEmpty(str))
      {
        ken localken = this.a;
        PreferenceCategory localPreferenceCategory = this.b.b(str);
        localken.a.b(localPreferenceCategory);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drk
 * JD-Core Version:    0.7.0.1
 */