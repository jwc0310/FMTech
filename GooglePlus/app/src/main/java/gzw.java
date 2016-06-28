import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class gzw
  implements Runnable
{
  gzw(gzs paramgzs, gzf paramgzf, hae paramhae) {}
  
  public final void run()
  {
    gzy localgzy = this.c.c;
    gzf localgzf = this.a;
    hae localhae = this.b;
    pdz localpdz = localhae.h;
    Object localObject = new gzz(localgzy, localgzf, localhae);
    if (localpdz == null) {}
    Handler localHandler;
    for (;;)
    {
      ((Runnable)localObject).run();
      if (!this.c.c.a())
      {
        localHandler = this.c.c.e;
        localHandler.removeMessages(510);
        if (this.a != this.c.d) {
          break;
        }
        this.c.a.stopService(this.c.b);
      }
      return;
      localObject = pdt.a(localpdz.a, (Runnable)localObject);
    }
    Message localMessage = Message.obtain(localHandler, pdt.a(this.c.e));
    localMessage.what = 510;
    localHandler.sendMessageDelayed(localMessage, 5000L);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzw
 * JD-Core Version:    0.7.0.1
 */