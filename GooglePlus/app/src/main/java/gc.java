import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class gc<Params, Progress, Result>
{
  private static final ThreadFactory a = new gd();
  public static final Executor b;
  private static final BlockingQueue<Runnable> g = new LinkedBlockingQueue(10);
  private static gh h;
  private static volatile Executor i;
  final gj<Params, Result> c = new gj(this);
  final FutureTask<Result> d = new ge(this, this.c);
  volatile int e = gi.a;
  final AtomicBoolean f = new AtomicBoolean();
  
  static
  {
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, g, a);
    b = localThreadPoolExecutor;
    i = localThreadPoolExecutor;
  }
  
  protected static void a(Progress... paramVarArgs) {}
  
  private static Handler b()
  {
    try
    {
      if (h == null) {
        h = new gh();
      }
      gh localgh = h;
      return localgh;
    }
    finally {}
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  protected void a(Result paramResult) {}
  
  protected void b(Result paramResult) {}
  
  final Result c(Result paramResult)
  {
    b().obtainMessage(1, new gg(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gc
 * JD-Core Version:    0.7.0.1
 */