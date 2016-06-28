import java.util.Timer;

final class geq
  implements Runnable
{
  geq(gen paramgen) {}
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        localgeu = this.a.a;
        if (localgeu.a == null) {
          break label66;
        }
        ges localges = localgeu.a;
        localges.c.cancel();
        localges.d = null;
        localgeu.a = null;
      }
      catch (Exception localException)
      {
        geu localgeu;
        localException.printStackTrace();
        return;
      }
      localgeu.b.setRenderMode(0);
      this.a.a.a(false);
      return;
      label66:
      if (0 == 0) {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     geq
 * JD-Core Version:    0.7.0.1
 */