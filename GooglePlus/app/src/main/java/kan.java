import android.content.Context;
import android.database.Cursor;

public final class kan
  extends hqj
{
  private final int r;
  private final String s;
  
  public kan(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((jyx)mbb.a(paramContext, jyx.class)).c());
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    return ((jzc)mbb.a(this.l, jzc.class)).a(this.r, this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kan
 * JD-Core Version:    0.7.0.1
 */