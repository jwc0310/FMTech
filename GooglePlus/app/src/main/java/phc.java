import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

public abstract class phc
  extends AbstractExecutorService
  implements pie
{
  public final pic<?> a(Runnable paramRunnable)
  {
    return (pic)super.submit(paramRunnable);
  }
  
  public <T> pic<T> a(Callable<T> paramCallable)
  {
    return (pic)super.submit(paramCallable);
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Runnable paramRunnable, T paramT)
  {
    return new piq(Executors.callable(paramRunnable, paramT));
  }
  
  protected final <T> RunnableFuture<T> newTaskFor(Callable<T> paramCallable)
  {
    return new piq(paramCallable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     phc
 * JD-Core Version:    0.7.0.1
 */