import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class dkg
  implements lrl
{
  private static final mfl a = new mfl("debug.plus.analytics_log_intrvl", String.valueOf(TimeUnit.HOURS.toMillis(4L)));
  private static final mfl b = new mfl("debug.plus.analytics_log_ignore", String.valueOf(TimeUnit.HOURS.toMillis(24L)));
  private final Context c;
  private final gxx d;
  
  public dkg(Context paramContext)
  {
    this.c = paramContext;
    this.d = ((gxx)mbb.a(paramContext, gxx.class));
  }
  
  public final lrm a()
  {
    lrg locallrg1 = new lrg();
    locallrg1.a = "analytics_log";
    locallrg1.b = Integer.valueOf(6);
    locallrg1.c = Integer.valueOf(19);
    locallrg1.d = Integer.valueOf(20);
    lrg locallrg2 = locallrg1.a(Long.valueOf(a.a).longValue());
    lsd locallsd = new lsd(this.c);
    locallsd.b = Long.valueOf(b.a).longValue();
    lrg locallrg3 = locallrg2.a(locallsd.a());
    locallrg3.f = true;
    return locallrg3.a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    kbw localkbw = this.d.a(paramInt);
    if ((paramlrh != null) && (localkbw != null)) {
      paramlrh.a(localkbw);
    }
    paramkck.d();
    gxy.a(this.c, paramInt, System.currentTimeMillis());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkg
 * JD-Core Version:    0.7.0.1
 */