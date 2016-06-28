import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class ken
  implements mbo, mfb, mfd
{
  public PreferenceScreen a;
  private keo b;
  private final rgq<PreferenceScreen> c;
  private kfs d = null;
  private boolean e = false;
  
  public ken(keo paramkeo, mek parammek)
  {
    this.b = paramkeo;
    this.c = null;
    parammek.a(this);
  }
  
  public final void a()
  {
    if (this.d != null) {}
    for (PreferenceScreen localPreferenceScreen = this.d.a();; localPreferenceScreen = (PreferenceScreen)null.a())
    {
      this.a = localPreferenceScreen;
      if (!this.e) {
        this.b.v();
      }
      this.e = true;
      return;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((kfs)parammbb.a(kfs.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ken
 * JD-Core Version:    0.7.0.1
 */