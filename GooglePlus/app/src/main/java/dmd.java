import java.util.concurrent.ThreadFactory;

final class dmd
  implements ThreadFactory
{
  public final Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new Thread(paramRunnable);
    localThread.setPriority(1);
    return localThread;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmd
 * JD-Core Version:    0.7.0.1
 */