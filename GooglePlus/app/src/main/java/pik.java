import java.util.concurrent.ScheduledExecutorService;

public final class pik
  extends pij
  implements pif
{
  private ScheduledExecutorService a;
  
  public pik(ScheduledExecutorService paramScheduledExecutorService)
  {
    super(paramScheduledExecutorService);
    if (paramScheduledExecutorService == null) {
      throw new NullPointerException();
    }
    this.a = ((ScheduledExecutorService)paramScheduledExecutorService);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pik
 * JD-Core Version:    0.7.0.1
 */