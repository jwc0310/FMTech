import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

final class jyi
  implements lrl
{
  private final Context a;
  private final giz b;
  private final iuv c;
  
  jyi(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((iuv)mbb.a(paramContext, iuv.class));
  }
  
  public final lrm a()
  {
    lrg locallrg = new lrg();
    locallrg.a = "profile_mobile_settings";
    locallrg.c = Integer.valueOf(123);
    locallrg.d = Integer.valueOf(124);
    return locallrg.a(TimeUnit.HOURS.toMillis(4L)).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    gjb localgjb = this.b.a(paramInt);
    if (((localgjb.c("is_managed_account")) && (!this.c.b())) || (!this.c.a())) {}
    while (!localgjb.c("is_google_plus")) {
      return;
    }
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    jyh localjyh = new jyh();
    kch localkch = new kch();
    localkch.a = str1;
    localkch.b = str2;
    localkch.e = true;
    kcg localkcg = localkch.a();
    kcx localkcx = new kcx(this.a, localkcg);
    localjyh.a(localgjb, localkcx);
    localkcx.i();
    if (!localkcx.n())
    {
      localjyh.a(this.b.b(paramInt), localkcx);
      return;
    }
    int i = localkcx.o;
    Log.e("ProfileMobileSettingsSynclet", 35 + "Sync failed with error: " + i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jyi
 * JD-Core Version:    0.7.0.1
 */