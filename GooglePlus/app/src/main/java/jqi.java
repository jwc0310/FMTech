import android.os.Handler;

final class jqi
  implements Runnable
{
  jqi(jqh paramjqh) {}
  
  public final void run()
  {
    if ((this.a.g == null) || (!this.a.b())) {
      return;
    }
    jqh localjqh = this.a;
    if ((localjqh.g == null) || (localjqh.c == null)) {}
    for (;;)
    {
      Runnable localRunnable = this.a.b;
      efj.m().postDelayed(localRunnable, 33L);
      return;
      double d1 = localjqh.c.a.d() / 1000.0D;
      double d2 = localjqh.c.a.e() / 1000.0D;
      if (d2 != 0.0D) {
        localjqh.g.a(localjqh.d, d1, d2);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jqi
 * JD-Core Version:    0.7.0.1
 */