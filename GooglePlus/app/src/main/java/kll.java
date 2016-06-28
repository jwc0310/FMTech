import android.view.MenuItem;

final class kll
  implements afw
{
  kll(klg paramklg) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aau.Br)
    {
      paramMenuItem.setChecked(this.a.F.b());
      return true;
    }
    if (paramMenuItem.getItemId() == aau.Bq)
    {
      paramMenuItem.setChecked(this.a.F.a());
      return true;
    }
    if (paramMenuItem.getItemId() == aau.By)
    {
      paramMenuItem.setChecked(this.a.F.c());
      return true;
    }
    if (paramMenuItem.getItemId() == aau.AQ)
    {
      String str = this.a.d.f().b("account_name");
      this.a.Q.a(this.a.f, str, "android_default", null);
    }
    for (;;)
    {
      return false;
      if (paramMenuItem.getItemId() == aau.AP)
      {
        hzv localhzv = this.a.R;
        hzr.a(this.a.f, localhzv.a, localhzv.b);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kll
 * JD-Core Version:    0.7.0.1
 */