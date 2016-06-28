import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class kbh
  implements ThreadFactory
{
  private final AtomicInteger a = new AtomicInteger(0);
  
  kbh(kbf paramkbf) {}
  
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = Executors.defaultThreadFactory().newThread(paramRunnable);
    int i = this.a.incrementAndGet();
    localThread.setName(36 + "Resource Decoder Thread #" + i);
    return localThread;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbh
 * JD-Core Version:    0.7.0.1
 */