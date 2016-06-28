import android.content.Context;

public final class kzb
  extends gzf
{
  private final int a;
  private final String b;
  private final int c;
  
  public kzb(int paramInt1, String paramString, int paramInt2)
  {
    super("ReportSquareTask");
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    kyz localkyz = new kyz(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c);
    localkyz.i();
    int i = localkyz.o;
    Exception localException = localkyz.q;
    if (localkyz.n()) {}
    for (String str = paramContext.getString(efj.Wz);; str = paramContext.getString(efj.WA)) {
      return new hae(i, localException, str);
    }
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.WB);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzb
 * JD-Core Version:    0.7.0.1
 */