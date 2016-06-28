import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class jjt
  extends gzf
{
  private final Context a;
  private final fyy b;
  private final fyn c;
  private final int d;
  private final String l;
  private final String m;
  private final boolean n;
  
  public jjt(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, "AddCircleTask");
    fym localfym = (fym)mbb.a(paramContext, fym.class);
    this.c = ((fyn)mbb.a(paramContext, fyn.class));
    this.b = localfym.a();
    this.a = paramContext;
    this.d = paramInt;
    this.l = paramString1;
    this.m = null;
    this.n = paramBoolean;
  }
  
  protected final hae a()
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(this.d);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    frs localfrs = this.b.a(10L, TimeUnit.SECONDS);
    flj localflj;
    fsh localfsh;
    int i;
    if (localfrs.a())
    {
      localflj = (flj)this.c.a(this.b, str1, str2, this.l, this.m).a();
      if (localflj.aN_().a())
      {
        String str3 = localflj.a();
        localfsh = this.c.a(this.b, str1, str2, str3, this.l, Boolean.valueOf(this.n), this.m).a();
        if (localfsh.aN_().a())
        {
          i = 200;
          jid.a(this.a, str1, 11, localfsh);
        }
      }
    }
    for (;;)
    {
      this.b.d();
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(this.d);
        arrayOfObject[1] = Boolean.valueOf(this.n);
        arrayOfObject[2] = Integer.valueOf(i);
        jid.a("AddCircleTask", String.format("accountId: %s. enableForSharing: %s. statusCode: %s", arrayOfObject));
      }
      hae localhae = new hae(i, null, null);
      localhae.a().putString("circle_name", this.l);
      return localhae;
      i = localfsh.aN_().b();
      break;
      int j = localflj.aN_().b();
      jid.a(this.a, str1, 9, localflj);
      i = j;
      continue;
      i = localfrs.b();
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getResources().getString(efj.Sg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjt
 * JD-Core Version:    0.7.0.1
 */