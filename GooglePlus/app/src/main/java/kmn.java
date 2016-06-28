import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

final class kmn
  implements lrl
{
  private final Context a;
  private final giz b;
  private final iuv c;
  
  kmn(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((iuv)mbb.a(paramContext, iuv.class));
  }
  
  public final lrm a()
  {
    lrg locallrg = new lrg();
    locallrg.a = "sharekit_settings";
    locallrg.c = Integer.valueOf(125);
    locallrg.d = Integer.valueOf(126);
    return locallrg.a(TimeUnit.HOURS.toMillis(4L)).a();
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    gjb localgjb = this.b.a(paramInt);
    int i;
    if (localgjb.b("effective_gaia_id") != null)
    {
      i = 1;
      if (((i == 0) || (this.c.b())) && (this.c.a())) {
        break label63;
      }
    }
    label63:
    kiy localkiy;
    do
    {
      do
      {
        return;
        i = 0;
        break;
      } while (!localgjb.c("is_google_plus"));
      if (!efj.z(this.a, paramInt)) {
        break label194;
      }
      localkiy = new kiy(this.a, new kcg(this.a, paramInt));
      localkiy.a();
      if (!localkiy.a.n())
      {
        efj.b(this.a, paramInt, localkiy.b().b);
        return;
      }
    } while (!Log.isLoggable("SharekitSettingsSynclet", 6));
    int j = localkiy.a.o;
    Log.e("SharekitSettingsSynclet", 35 + "Sync failed with error: " + j);
    return;
    label194:
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    kmm localkmm = new kmm();
    kch localkch = new kch();
    localkch.a = str1;
    localkch.b = str2;
    localkch.e = true;
    kcg localkcg = localkch.a();
    kcx localkcx = new kcx(this.a, localkcg);
    localkmm.a(localgjb, localkcx);
    localkcx.i();
    if (!localkcx.n())
    {
      localkmm.a(this.b.b(paramInt), localkcx);
      return;
    }
    int k = localkcx.o;
    Log.e("SharekitSettingsSynclet", 35 + "Sync failed with error: " + k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmn
 * JD-Core Version:    0.7.0.1
 */