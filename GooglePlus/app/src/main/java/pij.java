import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class pij
  extends phc
{
  private final ExecutorService a;
  
  public pij(ExecutorService paramExecutorService)
  {
    if (paramExecutorService == null) {
      throw new NullPointerException();
    }
    this.a = ((ExecutorService)paramExecutorService);
  }
  
  public final boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.a.awaitTermination(paramLong, paramTimeUnit);
  }
  
  public final void execute(Runnable paramRunnable)
  {
    this.a.execute(paramRunnable);
  }
  
  public final boolean isShutdown()
  {
    return this.a.isShutdown();
  }
  
  public final boolean isTerminated()
  {
    return this.a.isTerminated();
  }
  
  public final void shutdown()
  {
    this.a.shutdown();
  }
  
  public final List<Runnable> shutdownNow()
  {
    return this.a.shutdownNow();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pij
 * JD-Core Version:    0.7.0.1
 */