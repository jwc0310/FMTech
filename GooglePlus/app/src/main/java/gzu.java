import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class gzu
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(1);
  
  public final Thread newThread(Runnable paramRunnable)
  {
    int i = this.a.getAndIncrement();
    Thread localThread = new Thread(paramRunnable, 27 + "BackgroundTask #" + i);
    localThread.setPriority(1);
    return localThread;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzu
 * JD-Core Version:    0.7.0.1
 */