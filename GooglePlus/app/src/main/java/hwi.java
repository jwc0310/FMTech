import android.app.Activity;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;

public final class hwi
  implements mdz, mes, meu, mfa, mfd
{
  bp a;
  final hwm b;
  SharedPreferences.OnSharedPreferenceChangeListener c;
  
  public hwi(mek parammek, hwm paramhwm)
  {
    this.b = paramhwm;
    parammek.a(this);
  }
  
  public final void a(Activity paramActivity)
  {
    this.a = ((bp)paramActivity);
  }
  
  public final void a(Bundle paramBundle)
  {
    hwk localhwk = (hwk)this.a.b.a.d.a("editor_dialog_tag");
    if ((localhwk != null) && (paramBundle != null) && (paramBundle.getBoolean("download_triggered_by_user_was_running", false)))
    {
      localhwk.Z = this.b;
      this.c = hvu.a(this.a, new hwj(this));
    }
  }
  
  public final void b()
  {
    if (!hvu.b(this.a))
    {
      hwk localhwk = new hwk();
      localhwk.Z = this.b;
      localhwk.a(this.a.b.a.d, "editor_dialog_tag");
      if (this.c == null) {
        this.c = hvu.a(this.a, new hwj(this));
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    if (this.c != null) {}
    for (boolean bool = true;; bool = false)
    {
      paramBundle.putBoolean("download_triggered_by_user_was_running", bool);
      return;
    }
  }
  
  public final void m_()
  {
    if (this.c != null) {
      hvu.a(this.a, this.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwi
 * JD-Core Version:    0.7.0.1
 */