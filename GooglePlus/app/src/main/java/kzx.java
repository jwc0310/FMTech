import android.content.Context;

public final class kzx
  extends gzf
{
  private final Context a;
  private final kcg b;
  private final int c;
  private final String d;
  private final kyn l;
  
  public kzx(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, "DeleteSquareTask");
    this.d = paramString;
    this.c = paramInt;
    this.a = paramContext;
    this.b = new kcg(paramContext, this.c);
    this.l = ((kyn)mbb.a(paramContext, kyn.class));
  }
  
  protected final hae a()
  {
    kbu localkbu = (kbu)mbb.a(this.a, kbu.class);
    kzw localkzw = new kzw(g(), this.b, this.d);
    localkbu.a(localkzw);
    if (localkzw.n()) {
      return new hae(localkzw.o, localkzw.q, g().getString(eu.b));
    }
    this.l.d(this.c, this.d);
    return new hae(localkzw.o, localkzw.q, null);
  }
  
  public final String b()
  {
    return g().getString(eu.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzx
 * JD-Core Version:    0.7.0.1
 */