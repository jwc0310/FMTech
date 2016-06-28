import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract interface pic<V>
  extends Future<V>
{
  public abstract void a(Runnable paramRunnable, Executor paramExecutor);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pic
 * JD-Core Version:    0.7.0.1
 */