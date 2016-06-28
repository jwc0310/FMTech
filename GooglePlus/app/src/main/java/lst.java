import android.view.View;

final class lst
  extends Thread
{
  lst(lsr paramlsr) {}
  
  private final lss a()
  {
    synchronized (this.a.g)
    {
      lss locallss = this.a.j.a();
      if (locallss != null) {
        return locallss;
      }
      this.a.g.wait();
    }
  }
  
  public final void run()
  {
    lss locallss;
    lsr locallsr;
    label50:
    boolean bool;
    for (;;)
    {
      try
      {
        if (!isInterrupted())
        {
          locallss = a();
          locallsr = this.a;
          synchronized (locallsr.g)
          {
            if (locallss.o == 2) {
              break label50;
            }
          }
        }
        return;
      }
      catch (InterruptedException localInterruptedException) {}
      locallss.o = 4;
      bool = locallss.k();
      synchronized (locallsr.g)
      {
        if (locallss.o == 32)
        {
          locallss.o = 64;
          if (locallss.n != null)
          {
            lsr.a.a(locallss.n);
            locallss.n = null;
          }
          locallsr.h.a(locallss);
        }
      }
    }
    if (bool) {}
    for (int i = 8;; i = 16)
    {
      locallss.o = i;
      if (!bool) {
        break;
      }
      locallsr.i.a(locallss);
      locallsr.u.postInvalidate();
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lst
 * JD-Core Version:    0.7.0.1
 */