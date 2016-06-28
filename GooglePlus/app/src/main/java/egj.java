import android.os.Message;
import java.util.concurrent.locks.Lock;

abstract class egj
  implements Runnable
{
  private egj(efw paramefw) {}
  
  protected abstract void a();
  
  public void run()
  {
    this.a.b.lock();
    try
    {
      boolean bool = Thread.interrupted();
      if (bool) {
        return;
      }
      a();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      egl localegl = this.a.a;
      Message localMessage = localegl.j.obtainMessage(4, localRuntimeException);
      localegl.j.sendMessage(localMessage);
      return;
    }
    finally
    {
      this.a.b.unlock();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egj
 * JD-Core Version:    0.7.0.1
 */