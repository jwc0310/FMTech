import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class pid<V>
  extends FutureTask<V>
  implements pic<V>
{
  private final pho a = new pho();
  
  public pid(Callable<V> paramCallable)
  {
    super(paramCallable);
  }
  
  public final void a(Runnable paramRunnable, Executor paramExecutor)
  {
    pho localpho = this.a;
    aau.b(paramRunnable, "Runnable was null.");
    aau.b(paramExecutor, "Executor was null.");
    try
    {
      if (!localpho.b)
      {
        localpho.a = new php(paramRunnable, paramExecutor, localpho.a);
        return;
      }
      pho.a(paramRunnable, paramExecutor);
      return;
    }
    finally {}
  }
  
  protected final void done()
  {
    Object localObject1 = null;
    synchronized (this.a)
    {
      if (???.b) {
        return;
      }
      ???.b = true;
      Object localObject3 = ???.a;
      ???.a = null;
      if (localObject3 != null)
      {
        php localphp = ((php)localObject3).c;
        ((php)localObject3).c = ((php)localObject1);
        localObject1 = localObject3;
        localObject3 = localphp;
      }
    }
    while (localObject1 != null)
    {
      pho.a(((php)localObject1).a, ((php)localObject1).b);
      localObject1 = ((php)localObject1).c;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pid
 * JD-Core Version:    0.7.0.1
 */