import android.content.Context;
import android.database.Cursor;

public final class hmt
  extends hqj
{
  private final int r;
  private final String s;
  
  public hmt(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((hho)mbb.a(paramContext, hho.class)).e(paramString));
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    ((jyw)mbb.a(this.l, jyw.class)).a(this.r, this.s, false);
    return ((hhh)mbb.a(this.l, hhh.class)).l(this.r, this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmt
 * JD-Core Version:    0.7.0.1
 */