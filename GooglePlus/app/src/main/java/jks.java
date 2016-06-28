import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

final class jks
  implements lrl
{
  private final Context a;
  private final giz b;
  private final iuv c;
  
  jks(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((iuv)mbb.a(paramContext, iuv.class));
  }
  
  public final lrm a()
  {
    lrg locallrg = new lrg();
    locallrg.a = "circle_settings";
    locallrg.c = Integer.valueOf(127);
    locallrg.d = Integer.valueOf(128);
    return locallrg.a(TimeUnit.HOURS.toMillis(4L)).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    gjb localgjb = this.b.a(paramInt);
    if (((localgjb.c("is_managed_account")) && (!this.c.b())) || (!this.c.a())) {}
    kcx localkcx;
    for (;;)
    {
      return;
      boolean bool = localgjb.c("is_google_plus");
      if ((!localgjb.c("add_circle_notice_shown")) || (!localgjb.c("one_click_add_circle_notice_shown"))) {}
      for (int i = 1; (bool) && (i != 0); i = 0)
      {
        String str1 = localgjb.b("account_name");
        String str2 = localgjb.b("effective_gaia_id");
        jkr localjkr = new jkr();
        kch localkch = new kch();
        localkch.a = str1;
        localkch.b = str2;
        localkch.e = true;
        kcg localkcg = localkch.a();
        localkcx = new kcx(this.a, localkcg);
        localjkr.a(localgjb, localkcx);
        localkcx.i();
        if (localkcx.n()) {
          break label229;
        }
        localjkr.a(this.b.b(paramInt), localkcx);
        return;
      }
    }
    label229:
    int j = localkcx.o;
    Log.e("CircleSettingsSynclet", 35 + "Sync failed with error: " + j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jks
 * JD-Core Version:    0.7.0.1
 */