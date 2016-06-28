import android.content.Context;

public final class hlp
  extends gzf
{
  private final int a;
  private final String b;
  private final int c;
  
  public hlp(int paramInt1, String paramString, int paramInt2)
  {
    super("ReportCollexionAbuseTask");
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    hko localhko = new hko(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c);
    localhko.i();
    return new hae(localhko.o, localhko.q, null);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.It);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlp
 * JD-Core Version:    0.7.0.1
 */