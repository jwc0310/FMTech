import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class dmk
  implements lrl
{
  private final Context a;
  private final giz b;
  private final hyi c;
  
  public dmk(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((hyi)mbb.a(paramContext, hyi.class));
  }
  
  public final lrm a()
  {
    lrg locallrg1 = new lrg();
    locallrg1.a = "experiments";
    locallrg1.b = Integer.valueOf(11);
    locallrg1.c = Integer.valueOf(35);
    locallrg1.d = Integer.valueOf(36);
    lrg locallrg2 = locallrg1.a(TimeUnit.HOURS.toMillis(4L));
    lry locallry = new lry(this.a);
    locallry.b = TimeUnit.DAYS.toMillis(1L);
    return locallrg2.a(new lrq(new lrx(locallry))).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    String str = this.b.a(paramInt).b("account_name");
    if (paramkck.b()) {
      return;
    }
    try
    {
      paramkck.b("Sync experiments");
      this.c.a(str);
      return;
    }
    finally
    {
      paramkck.d();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmk
 * JD-Core Version:    0.7.0.1
 */