import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;

public final class kbl
  extends HandlerThread
  implements Handler.Callback
{
  public Handler a;
  
  public kbl()
  {
    super("ImageLoader");
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    kaz localkaz = (kaz)paramMessage.obj;
    if ((localkaz.q == 2) || (localkaz.q == 4) || (localkaz.q == 6)) {
      localkaz.c();
    }
    return true;
  }
  
  public final void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
  
  public final void start()
  {
    try
    {
      super.start();
      this.a = new Handler(getLooper(), this);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbl
 * JD-Core Version:    0.7.0.1
 */