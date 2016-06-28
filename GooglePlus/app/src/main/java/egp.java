import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.locks.Lock;

final class egp
  extends Handler
{
  egp(egl paramegl, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      new StringBuilder("Unknown message id: ").append(paramMessage.what);
      return;
    case 1: 
      egl localegl2 = this.a;
      localegl2.a.lock();
      try
      {
        if (localegl2.h()) {
          localegl2.b();
        }
        return;
      }
      finally
      {
        localegl2.a.unlock();
      }
    case 2: 
      egl.a(this.a);
      return;
    case 3: 
      egq localegq = (egq)paramMessage.obj;
      egl localegl1 = this.a;
      localegl1.a.lock();
      try
      {
        egu localegu1 = localegl1.s;
        egu localegu2 = localegq.a;
        if (localegu1 != localegu2) {
          return;
        }
        localegq.a();
        return;
      }
      finally
      {
        localegl1.a.unlock();
      }
    }
    throw ((RuntimeException)paramMessage.obj);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     egp
 * JD-Core Version:    0.7.0.1
 */