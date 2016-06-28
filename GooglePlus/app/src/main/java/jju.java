import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class jju
  extends gzf
{
  private final fyy a;
  private final fyn b;
  private final Context c;
  private final int d;
  private final String l;
  
  public jju(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, "RemoveCircleTask");
    fym localfym = (fym)mbb.a(paramContext, fym.class);
    this.b = ((fyn)mbb.a(paramContext, fyn.class));
    this.a = localfym.a();
    this.c = paramContext;
    this.d = paramInt;
    this.l = paramString;
  }
  
  protected final hae a()
  {
    gjb localgjb = ((giz)mbb.a(this.c, giz.class)).a(this.d);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    frs localfrs = this.a.a(10L, TimeUnit.SECONDS);
    fsh localfsh;
    int i;
    if (localfrs.a())
    {
      localfsh = this.b.a(this.a, str1, str2, this.l).a();
      if (localfsh.aN_().a())
      {
        i = 200;
        jid.a(this.c, str1, 10, localfsh);
      }
    }
    for (;;)
    {
      this.a.d();
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.d);
        arrayOfObject[1] = this.l;
        arrayOfObject[2] = Integer.valueOf(i);
        jid.a("RemoveCircleTask", String.format("accountId: %s. circleId: %s. statusCode: %s", arrayOfObject));
      }
      return new hae(i, null, null);
      i = localfsh.aN_().b();
      break;
      i = localfrs.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jju
 * JD-Core Version:    0.7.0.1
 */