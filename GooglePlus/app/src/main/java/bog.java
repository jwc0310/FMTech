import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public final class bog
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final RectF d;
  private final int l;
  private final boolean m;
  
  public bog(int paramInt1, String paramString1, String paramString2, RectF paramRectF, int paramInt2, boolean paramBoolean)
  {
    super("SetScrapbookPhotoForTileIdTask");
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramRectF;
    this.l = paramInt2;
    this.m = paramBoolean;
  }
  
  protected final hae a(Context paramContext)
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(this.c);
    List localList = jrf.a(paramContext, this.a, localArrayList);
    if (!localList.isEmpty())
    {
      long l1 = ((ipn)localList.get(0)).a;
      blx localblx = new blx(paramContext, new kch().a(paramContext, this.a).a(), this.b, String.valueOf(l1), this.d, this.l, this.m);
      localblx.i();
      if (localblx.n()) {
        return new hae(localblx.o, localblx.q, paramContext.getString(aau.uV));
      }
    }
    else
    {
      return new hae(false);
    }
    return new hae(true);
  }
  
  public final String b(Context paramContext)
  {
    return paramContext.getString(aau.te);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bog
 * JD-Core Version:    0.7.0.1
 */