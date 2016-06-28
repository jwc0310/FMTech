import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class kuj
  implements mgd, mge
{
  private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();
  
  public final String a()
  {
    return kuj.class.getCanonicalName();
  }
  
  public final boolean a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    new kqg(5).b(localContext);
    this.a.schedule(new kuk(this, localContext), 10L, TimeUnit.SECONDS);
    return true;
  }
  
  public final boolean b(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    new kqg(6).b(localContext);
    this.a.schedule(new kul(this, localContext), 10L, TimeUnit.SECONDS);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kuj
 * JD-Core Version:    0.7.0.1
 */