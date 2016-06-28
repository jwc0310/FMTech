import android.content.Context;
import android.graphics.RectF;

public final class boh
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final RectF d;
  private final int l;
  private final boolean m;
  
  public boh(int paramInt1, String paramString1, String paramString2, RectF paramRectF, int paramInt2, boolean paramBoolean)
  {
    super("SetScrapbookPhotoTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramRectF;
    this.l = paramInt2;
    this.m = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    blx localblx = new blx(paramContext, new kch().a(paramContext, this.a).a(), this.b, this.c, this.d, this.l, this.m);
    localblx.i();
    if (localblx.n()) {
      return new hae(localblx.o, localblx.q, paramContext.getString(aau.uV));
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(aau.te);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     boh
 * JD-Core Version:    0.7.0.1
 */