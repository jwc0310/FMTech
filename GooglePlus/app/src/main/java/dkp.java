import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class dkp
  implements lrl
{
  private static final mfl a = new mfl("debug.plus.contactstats_intrval", String.valueOf(TimeUnit.HOURS.toMillis(24L)));
  private static final mfl b = new mfl("debug.plus.contactstats_ignore", String.valueOf(TimeUnit.HOURS.toMillis(48L)));
  private final Context c;
  private final giz d;
  
  public dkp(Context paramContext)
  {
    this.c = paramContext;
    this.d = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final lrm a()
  {
    lrg locallrg1 = new lrg();
    locallrg1.a = "contact_stats";
    locallrg1.b = Integer.valueOf(10);
    locallrg1.c = Integer.valueOf(27);
    locallrg1.d = Integer.valueOf(28);
    lrg locallrg2 = locallrg1.a(Long.valueOf(a.a).longValue());
    lsd locallsd = new lsd(this.c);
    locallsd.b = Long.valueOf(b.a).longValue();
    return locallrg2.a(locallsd.a()).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    if ((this.d.a(paramInt).c("is_google_plus")) && (bgp.h(this.c, paramInt)))
    {
      long l = bgp.c(this.c, paramInt);
      if ((l < 0L) || (System.currentTimeMillis() - l > Long.valueOf(a.a).longValue())) {
        dkq.a(this.c, paramInt, paramkck);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkp
 * JD-Core Version:    0.7.0.1
 */