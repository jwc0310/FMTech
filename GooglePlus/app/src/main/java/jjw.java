import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class jjw
  extends gzf
{
  private final fyy a;
  private final fym b;
  private final fyl c;
  private final Context d;
  private int l;
  private boolean m;
  private String[] n;
  
  public jjw(Context paramContext, int paramInt, boolean paramBoolean, String[] paramArrayOfString)
  {
    super(paramContext, "SetContactsSyncSettingsTask");
    this.b = ((fym)mbb.a(paramContext, fym.class));
    this.c = ((fyl)mbb.a(paramContext, fyl.class));
    this.a = this.b.a();
    this.d = paramContext;
    this.l = paramInt;
    this.m = paramBoolean;
    this.n = paramArrayOfString;
  }
  
  protected final hae a()
  {
    String str = ((giz)mbb.a(this.d, giz.class)).a(this.l).b("account_name");
    frs localfrs = this.a.a(10L, TimeUnit.SECONDS);
    fys localfys;
    int j;
    int k;
    int i1;
    if (localfrs.a())
    {
      fyr localfyr = new fyr();
      localfys = (fys)this.b.a(this.a, localfyr).a();
      if (localfys.aN_().a())
      {
        boolean bool = this.m;
        fzl localfzl = localfys.a();
        j = 0;
        k = 1;
        if ((localfzl != null) && (j < localfzl.b()))
        {
          fzo localfzo = (fzo)localfzl.a(j);
          if (!str.equals(localfzo.a())) {
            break label408;
          }
          if (bool != localfzo.b()) {
            i1 = 1;
          }
        }
      }
    }
    for (;;)
    {
      j++;
      k = i1;
      break;
      i1 = 0;
      continue;
      fsh localfsh;
      int i;
      if (k != 0)
      {
        localfsh = this.c.a(this.a, str, this.m, this.n).a();
        if (localfsh.aN_().a())
        {
          i = 200;
          jid.a(this.d, str, 18, localfsh);
        }
      }
      for (;;)
      {
        label256:
        localfys.a().a();
        for (;;)
        {
          this.a.d();
          if (jid.a())
          {
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(this.l);
            arrayOfObject[1] = Boolean.valueOf(this.m);
            arrayOfObject[2] = Integer.valueOf(i);
            jid.a("SetContactsSyncSettingsTask", String.format("accountId: %s. isSyncEnabled: %s. statusCode: %s", arrayOfObject));
          }
          return new hae(i, null, null);
          i = localfsh.aN_().b();
          break;
          i = localfys.aN_().b();
          jid.a(this.d, str, 1, localfys);
          break label256;
          i = localfrs.b();
        }
        i = 200;
      }
      label408:
      i1 = k;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjw
 * JD-Core Version:    0.7.0.1
 */