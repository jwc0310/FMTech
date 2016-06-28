import android.content.Context;
import android.text.TextUtils;

public final class hlm
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  
  public hlm(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    super("moveposttoclx");
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  protected final hae a(Context paramContext)
  {
    hkl localhkl = new hkl(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d);
    localhkl.i();
    if (localhkl.n()) {
      return new hae(localhkl.o, localhkl.q, null);
    }
    hhe localhhe = (hhe)mbb.b(paramContext, hhe.class);
    if (localhhe != null) {
      localhhe.a(this.a, this.b).i();
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    if ((TextUtils.isEmpty(this.d)) && (!TextUtils.isEmpty(this.c))) {
      return paramContext.getString(efj.Iq);
    }
    return paramContext.getString(efj.Ip);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlm
 * JD-Core Version:    0.7.0.1
 */