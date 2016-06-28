import android.content.Context;
import android.os.Bundle;

public final class bod
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  private final String l;
  private final boolean m;
  private final boolean n;
  
  public bod(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramContext, "RemoveReportBanTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.l = paramString4;
    this.m = paramBoolean1;
    this.n = paramBoolean2;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    Context localContext = this.e;
    int i = this.a;
    kcg localkcg = new kcg(localContext, i);
    kcp localkcp = kdg.a(localContext, localkcg);
    lfo locallfo = new lfo(localContext, new kcg(localContext, i), this.c, 7);
    locallfo.a = this.b;
    localkcp.a(locallfo);
    lhx locallhx;
    if (this.n)
    {
      localkcp.a(new bli(localContext, i, this.d, this.l, 1));
      locallhx = null;
    }
    for (;;)
    {
      localkcp.i();
      if (!locallfo.n()) {
        ((kyn)mbb.a(localContext, kyn.class)).a(i, this.c, this.b, 7);
      }
      if ((locallhx != null) && (!locallhx.n()))
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        lmp.a(this.e, this.a, this.d);
      }
      int j = localkcp.o;
      Exception localException = localkcp.q;
      String str;
      label233:
      hae localhae;
      Bundle localBundle;
      if (localkcp.n())
      {
        efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
        str = this.e.getString(aau.tU);
        localhae = new hae(j, localException, str);
        localBundle = localhae.a();
        if ((!this.m) && (!this.n)) {
          break label328;
        }
      }
      label328:
      for (boolean bool = true;; bool = false)
      {
        localBundle.putBoolean("remove_post", bool);
        return localhae;
        if (!this.m) {
          break label334;
        }
        locallhx = new lhx(localContext, localkcg, this.c, this.d, 2);
        localkcp.a(locallhx);
        break;
        str = null;
        break label233;
      }
      label334:
      locallhx = null;
    }
  }
  
  public final String b()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    return this.e.getString(aau.po);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bod
 * JD-Core Version:    0.7.0.1
 */