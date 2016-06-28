import android.content.Context;

public final class lgr
  extends gzf
{
  private final kcg a;
  private final oea b;
  private final int c;
  
  public lgr(Context paramContext, int paramInt, String paramString, oea paramoea)
  {
    super(paramContext, paramString);
    this.a = new kcg(paramContext, paramInt);
    this.c = paramInt;
    this.b = paramoea;
  }
  
  protected final hae a()
  {
    lgq locallgq = new lgq(g(), this.a, this.b);
    locallgq.i();
    if (locallgq.n()) {
      return new hae(locallgq.o, locallgq.q, g().getString(efj.Yg));
    }
    ((kyk)mbb.a(g(), kyk.class)).a(this.c, this.b);
    return new hae(true);
  }
  
  public final String b()
  {
    return g().getString(efj.Yh);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lgr
 * JD-Core Version:    0.7.0.1
 */