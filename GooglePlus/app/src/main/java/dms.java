import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.TimeUnit;

public final class dms
  implements lrl
{
  static final mfl a = new mfl("debug.plus.photo_sync_ignore", String.valueOf(TimeUnit.HOURS.toMillis(48L)));
  final Context b;
  private final giz c;
  private final lrm d;
  
  public dms(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.d = new dmt(this);
  }
  
  public final lrm a()
  {
    return this.d;
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    Context localContext;
    jru localjru;
    ojj localojj;
    if (this.c.a(paramInt).c("is_google_plus"))
    {
      localContext = this.b;
      ojl localojl = new ojl();
      localojl.g = Boolean.valueOf(true);
      localojl.k = Boolean.valueOf(true);
      bsp.a(localojl);
      String str = ((giz)mbb.a(localContext, giz.class)).a(paramInt).b("gaia_id");
      localjru = new jru(localContext, new kcg(localContext, paramInt, true, null), str, localojl);
      localjru.i();
      if (!localjru.n())
      {
        localojj = localjru.a;
        hbj.a(localContext, localojj.i.longValue());
      }
    }
    else
    {
      synchronized (bsp.a)
      {
        bsp.a.put(paramInt, localojj);
        if (localojj.h != null)
        {
          boolean bool = localojj.h.booleanValue();
          ((giz)mbb.a(localContext, giz.class)).b(paramInt).b("auto_awesome", bool).d();
          ((ivl)mbb.a(localContext, ivl.class)).c();
        }
        return;
      }
    }
    localjru.c("EsAccountsData");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dms
 * JD-Core Version:    0.7.0.1
 */