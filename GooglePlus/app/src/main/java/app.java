import android.content.Context;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class app
{
  final Context a;
  final int b;
  public final ThreadPoolExecutor c;
  
  public app(Context paramContext, int paramInt)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramInt;
    this.c = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
  }
  
  public final Future a(List<Long> paramList, apt<List<apm>> paramapt)
  {
    try
    {
      Future localFuture = this.c.submit(new apr(this, paramList, paramapt));
      return localFuture;
    }
    catch (RejectedExecutionException localRejectedExecutionException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     app
 * JD-Core Version:    0.7.0.1
 */