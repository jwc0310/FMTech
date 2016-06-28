import android.app.Application;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

final class gda
{
  final Application a;
  final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
  final AtomicBoolean c = new AtomicBoolean(false);
  private final gdi<rhc, gcy> d;
  
  gda(gdi<rhc, gcy> paramgdi, Application paramApplication)
  {
    this.d = paramgdi;
    this.a = paramApplication;
  }
  
  public final void a(int paramInt)
  {
    if (this.d.a())
    {
      gcy localgcy = new gcy(paramInt);
      this.d.a(localgcy);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gda
 * JD-Core Version:    0.7.0.1
 */