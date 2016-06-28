import android.content.Context;
import android.util.Log;

public final class dnc
  implements lrl
{
  final Context a;
  private final giz b;
  private final lrm c;
  private final iuv d;
  
  public dnc(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.d = ((iuv)mbb.a(paramContext, iuv.class));
    this.c = new dnd(this);
  }
  
  public final lrm a()
  {
    return this.c;
  }
  
  public final void a(kck paramkck, int paramInt, lrh paramlrh)
  {
    if (this.d.a()) {
      return;
    }
    gjb localgjb1 = this.b.a(paramInt);
    if (localgjb1.c("is_google_plus"))
    {
      Context localContext = this.a;
      gjb localgjb2 = ((giz)mbb.a(localContext, giz.class)).a(paramInt);
      if (!localgjb2.a("settings_synced", true))
      {
        long l = localgjb2.a("warm_welcome_ts", 0L);
        if (l != 0L)
        {
          bll localbll = new bll(localContext, paramInt, Long.valueOf(l));
          localbll.i();
          if (localbll.n())
          {
            int i = localbll.o;
            Log.e("EsAccountsData", 38 + "Could not upload settings: " + i, localbll.q);
          }
        }
      }
    }
    String str = localgjb1.b("account_name");
    ((ilb)mbb.a(this.a, ilb.class)).a(str, ilb.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnc
 * JD-Core Version:    0.7.0.1
 */