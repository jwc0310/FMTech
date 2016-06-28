import android.content.Context;
import android.database.Cursor;

public final class kzt
  extends hqj
{
  private final Context r;
  private final int s;
  private final String t;
  
  public kzt(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((kyx)mbb.a(paramContext, kyx.class)).c());
    this.r = paramContext;
    this.s = paramInt;
    this.t = paramString;
  }
  
  public final Cursor o()
  {
    ((jyw)mbb.a(this.l, jyw.class)).a(this.s, this.t, false);
    return ((kyn)mbb.a(this.r, kyn.class)).j(this.s, this.t);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzt
 * JD-Core Version:    0.7.0.1
 */