import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ibm
{
  ibq a = new ibq(2);
  ibq b = new ibq(2);
  public final Executor c = new ThreadPoolExecutor(4, 8, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ibk("thread-pool", 10));
  
  static
  {
    new ibp();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibm
 * JD-Core Version:    0.7.0.1
 */