import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.FutureTask;

final class gh
  extends Handler
{
  public gh()
  {
    super(Looper.getMainLooper());
  }
  
  public final void handleMessage(Message paramMessage)
  {
    gg localgg = (gg)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      gc localgc = localgg.a;
      Object localObject = localgg.b[0];
      if (localgc.d.isCancelled()) {
        localgc.b(localObject);
      }
      for (;;)
      {
        localgc.e = gi.c;
        return;
        localgc.a(localObject);
      }
    }
    gc.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gh
 * JD-Core Version:    0.7.0.1
 */