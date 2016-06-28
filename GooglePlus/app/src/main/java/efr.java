import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class efr<R extends efn>
  extends Handler
{
  public efr()
  {
    this(Looper.getMainLooper());
  }
  
  public efr(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void a(efo<R> paramefo, R paramR)
  {
    sendMessage(obtainMessage(1, new Pair(paramefo, paramR)));
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
      return;
    case 1: 
      Pair localPair = (Pair)paramMessage.obj;
      efo localefo = (efo)localPair.first;
      efn localefn = (efn)localPair.second;
      try
      {
        localefo.a(localefn);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        efq.b(localefn);
        throw localRuntimeException;
      }
    }
    ((efq)paramMessage.obj).b(Status.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     efr
 * JD-Core Version:    0.7.0.1
 */