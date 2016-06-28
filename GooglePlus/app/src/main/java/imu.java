import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class imu
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = Executors.defaultThreadFactory().newThread(paramRunnable);
    localThread.setName("Login Manager Threadpool");
    return localThread;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     imu
 * JD-Core Version:    0.7.0.1
 */