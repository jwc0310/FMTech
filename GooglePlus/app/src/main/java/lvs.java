import android.view.View;

final class lvs
  implements Runnable
{
  lvs(lvp paramlvp, boolean paramBoolean, View paramView) {}
  
  public final void run()
  {
    if (this.a) {
      if (this.c.f != null) {
        this.c.f.b_(this.b);
      }
    }
    for (;;)
    {
      lvp.a(this.c, this.b);
      return;
      this.c.d = false;
      this.c.e = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvs
 * JD-Core Version:    0.7.0.1
 */