import android.content.Context;

public final class hkv
  extends gzf
{
  private final int a;
  private final String b;
  
  public hkv(int paramInt, String paramString)
  {
    super("AppealCollexionAbuseTask");
    this.a = paramInt;
    this.b = paramString;
  }
  
  protected final hae a(Context paramContext)
  {
    hjv localhjv = new hjv(paramContext, new kch().a(paramContext, this.a).a(), this.b);
    localhjv.i();
    return new hae(localhjv.o, localhjv.q, null);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(efj.Iu);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hkv
 * JD-Core Version:    0.7.0.1
 */