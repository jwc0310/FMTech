import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class kfo
  implements kfs, mea, mec, mfa, mfd
{
  public cl a;
  private final kdn b;
  private kfp c;
  private PreferenceScreen d;
  
  private kfo(kdn paramkdn, kfp paramkfp, mek parammek)
  {
    this.b = paramkdn;
    if (paramkfp == null) {
      throw new NullPointerException();
    }
    this.c = ((kfp)paramkfp);
    parammek.a(this);
  }
  
  public <T extends kdn,  extends kfp> kfo(T paramT, mek parammek)
  {
    this(paramT, (kfp)paramT, parammek);
  }
  
  public final PreferenceScreen a()
  {
    if (this.d == null) {
      throw new IllegalStateException("PreferenceScreen cannot be accessed before OnCreateView");
    }
    return this.d;
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      this.a = this.b.h().a();
      this.c.v();
      this.a.b();
      this.a = null;
    }
  }
  
  public final void b()
  {
    PreferenceScreen localPreferenceScreen = this.b.d.a(this.b.a);
    this.b.a(localPreferenceScreen);
    this.d = localPreferenceScreen;
  }
  
  public final void b(Bundle paramBundle) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfo
 * JD-Core Version:    0.7.0.1
 */