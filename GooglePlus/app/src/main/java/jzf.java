import android.content.Context;

public final class jzf
  extends gzf
{
  private final int a;
  private final String b;
  private final quq c;
  private final String d;
  private final String l;
  private qut m;
  private String n;
  
  public jzf(int paramInt, String paramString1, quq paramquq, String paramString2, String paramString3, qut paramqut, String paramString4)
  {
    super("editProfileTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramquq;
    this.d = null;
    this.l = null;
    this.m = paramqut;
    this.n = paramString4;
  }
  
  protected final hae a(Context paramContext)
  {
    jze localjze = new jze(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d, this.l, this.m, this.n);
    localjze.a.i();
    localjze.a.c("editProfileOp");
    if (localjze.a.n()) {
      return new hae(localjze.a.o, localjze.a.q, null);
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.TU);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzf
 * JD-Core Version:    0.7.0.1
 */