import android.content.Context;

public final class jzu
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final boolean d;
  
  public jzu(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super("blockProfileTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    jzt localjzt = new jzt(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d);
    localjzt.a.i();
    localjzt.a.c("blockProfileOp");
    if (localjzt.a.n()) {
      return new hae(localjzt.a.o, localjzt.a.q, null);
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    if (this.d) {}
    for (int i = efj.Ue;; i = efj.Ug) {
      return paramContext.getString(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzu
 * JD-Core Version:    0.7.0.1
 */