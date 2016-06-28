import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class pig
  implements Executor
{
  volatile boolean a = true;
  
  public pig(Executor paramExecutor, pgp parampgp) {}
  
  public final void execute(Runnable paramRunnable)
  {
    try
    {
      this.b.execute(new pih(this, paramRunnable));
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      while (!this.a) {}
      this.c.a(localRejectedExecutionException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pig
 * JD-Core Version:    0.7.0.1
 */