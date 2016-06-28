import android.os.Bundle;
import android.view.View;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class kfz
  implements kfs, mea, mec, mfa, mfd
{
  public cl a;
  public kga b;
  private final kes c;
  private PreferenceScreen d;
  
  kfz(bk parambk, mek parammek)
  {
    this.c = ((kes)parambk);
    parammek.a(this);
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
      this.a = this.c.h().a();
      this.b.a();
      this.a.b();
      this.a = null;
    }
  }
  
  public final void b()
  {
    this.d = this.c.d.a(this.c.f());
    this.c.a(this.d);
  }
  
  public final void b(Bundle paramBundle) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfz
 * JD-Core Version:    0.7.0.1
 */