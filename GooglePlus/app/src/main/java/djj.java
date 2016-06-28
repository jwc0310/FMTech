import android.content.Context;

final class djj
  extends gzf
{
  private final int a;
  private final String b;
  private final int c;
  
  djj(int paramInt1, String paramString, int paramInt2)
  {
    super("reportProfileAbuseTask");
    this.a = paramInt1;
    this.b = paramString;
    this.c = paramInt2;
  }
  
  protected final hae a(Context paramContext)
  {
    dji localdji = new dji(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c);
    localdji.i();
    if (localdji.n()) {
      return new hae(localdji.o, localdji.q, null);
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(aw.S);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djj
 * JD-Core Version:    0.7.0.1
 */