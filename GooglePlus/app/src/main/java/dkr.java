import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class dkr
  implements lrl
{
  private static final mfl a = new mfl("debug.plus.contacts_interval", String.valueOf(TimeUnit.HOURS.toMillis(1L)));
  private static final mfl b = new mfl("debug.plus.contacts_ignore", String.valueOf(TimeUnit.HOURS.toMillis(24L)));
  private final Context c;
  private final giz d;
  
  public dkr(Context paramContext)
  {
    this.c = paramContext;
    this.d = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public final lrm a()
  {
    lrg locallrg1 = new lrg();
    locallrg1.a = "contacts";
    locallrg1.b = Integer.valueOf(9);
    locallrg1.c = Integer.valueOf(25);
    locallrg1.d = Integer.valueOf(26);
    lrg locallrg2 = locallrg1.a(Long.valueOf(a.a).longValue());
    lsd locallsd = new lsd(this.c);
    locallsd.b = Long.valueOf(b.a).longValue();
    lrg locallrg3 = locallrg2.a(locallsd.a());
    locallrg3.f = true;
    return locallrg3.a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    if (this.d.a(paramInt).c("is_google_plus")) {
      brn.a(this.c, paramInt, paramkck, false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkr
 * JD-Core Version:    0.7.0.1
 */