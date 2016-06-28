import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

final class eid
  extends Handler
{
  public eid(eib parameib, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  private static boolean a(Message paramMessage)
  {
    return (paramMessage.what == 2) || (paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.a.l.get() != paramMessage.arg1)
    {
      if (a(paramMessage)) {
        ((eie)paramMessage.obj).b();
      }
      return;
    }
    if (((paramMessage.what == 1) || (paramMessage.what == 5) || (paramMessage.what == 6)) && (!this.a.j()))
    {
      ((eie)paramMessage.obj).b();
      return;
    }
    if (paramMessage.what == 3)
    {
      ConnectionResult localConnectionResult = new ConnectionResult(paramMessage.arg2, null);
      eib.a(this.a).a(localConnectionResult);
      this.a.a(localConnectionResult);
      return;
    }
    if (paramMessage.what == 4)
    {
      eib.a(this.a, 4, null);
      if (eib.b(this.a) != null) {
        eib.b(this.a).a(paramMessage.arg2);
      }
      eib.i();
      eib.a(this.a, 4, 1, null);
      return;
    }
    if ((paramMessage.what == 2) && (!this.a.g()))
    {
      ((eie)paramMessage.obj).b();
      return;
    }
    if (a(paramMessage))
    {
      Object localObject2;
      synchronized ((eie)paramMessage.obj)
      {
        localObject2 = ???.a;
        if (???.b) {
          new StringBuilder("Callback proxy ").append(???).append(" being reused. This is not safe.");
        }
        if (localObject2 == null) {}
      }
      try
      {
        ???.a(localObject2);
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
      }
      try
      {
        ???.b = true;
        ???.b();
        return;
      }
      finally {}
      localObject1 = finally;
      throw localObject1;
    }
    Log.wtf("GmsClient", "Don't know how to handle this message.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eid
 * JD-Core Version:    0.7.0.1
 */