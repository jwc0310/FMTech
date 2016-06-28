import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class jjy
  extends gzf
{
  private final Context a;
  private final fyy b;
  private final fyn c;
  private final int d;
  private final String l;
  private final List<String> m;
  private final List<String> n;
  
  public jjy(Context paramContext, int paramInt, String paramString, List<String> paramList1, List<String> paramList2)
  {
    super(paramContext, "UpdatePersonCirclesTask");
    fym localfym = (fym)mbb.a(paramContext, fym.class);
    this.c = ((fyn)mbb.a(paramContext, fyn.class));
    this.b = localfym.a();
    this.a = paramContext;
    this.d = paramInt;
    this.l = paramString;
    this.m = paramList1;
    this.n = paramList2;
  }
  
  private static String a(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramList != null)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++) {
        localStringBuilder.append(String.format("%s, ", new Object[] { (String)paramList.get(j) }));
      }
    }
    return localStringBuilder.toString();
  }
  
  protected final hae a()
  {
    gjb localgjb = ((giz)mbb.a(this.a, giz.class)).a(this.d);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("effective_gaia_id");
    frs localfrs = this.b.a(10L, TimeUnit.SECONDS);
    aip localaip;
    int i;
    if (localfrs.a())
    {
      localaip = (aip)this.c.a(this.b, str1, str2, this.l, this.m, this.n).a();
      if (localaip.aN_().a())
      {
        i = 200;
        jid.a(this.a, str1, 12, localaip);
      }
    }
    for (;;)
    {
      this.b.d();
      if (jid.a())
      {
        Object[] arrayOfObject = new Object[4];
        arrayOfObject[0] = Integer.valueOf(this.d);
        arrayOfObject[1] = a(this.m);
        arrayOfObject[2] = a(this.n);
        arrayOfObject[3] = Integer.valueOf(i);
        jid.a("UpdatePersonCirclesTask", String.format("accountId: %s. circleIdsToAdd: %s. circleIdsToRemove: %s. statusCode: %s", arrayOfObject));
      }
      return new hae(i, null, null);
      i = localaip.aN_().b();
      break;
      i = localfrs.b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jjy
 * JD-Core Version:    0.7.0.1
 */