import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class jjx
  extends gzf
{
  private Context a;
  private final fyy b;
  private final fyn c;
  private final int d;
  private final String l;
  private final String m;
  private final String n;
  private final boolean o;
  
  public jjx(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    super(paramContext, "UpdateCircleTask");
    this.a = paramContext;
    fym localfym = (fym)mbb.a(paramContext, fym.class);
    this.c = ((fyn)mbb.a(paramContext, fyn.class));
    this.b = localfym.a();
    this.d = paramInt;
    this.l = paramString1;
    this.m = paramString2;
    this.n = null;
    this.o = paramBoolean;
  }
  
  protected final hae a()
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(this.d);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    frs localfrs = this.b.a(10L, TimeUnit.SECONDS);
    fsh localfsh;
    int i;
    if (localfrs.a())
    {
      localfsh = this.c.a(this.b, str1, str2, this.l, this.m, Boolean.valueOf(this.o), this.n).a();
      if (localfsh.aN_().a())
      {
        i = 200;
        jid.a(this.a, str1, 11, localfsh);
      }
    }
    for (;;)
    {
      this.b.d();
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = Integer.valueOf(this.d);
        arrayOfObject[1] = this.l;
        arrayOfObject[2] = Boolean.valueOf(this.o);
        arrayOfObject[3] = Integer.valueOf(i);
        jid.a("UpdateCircleTask", String.format("accountId: %s. circleId: %s. newEnabledForSharing: %s. statusCode: %s", arrayOfObject));
      }
      return new hae(i, null, null);
      i = localfsh.aN_().b();
      break;
      i = localfrs.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjx
 * JD-Core Version:    0.7.0.1
 */