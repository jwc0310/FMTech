import android.content.Context;
import android.database.Cursor;

public final class kai
  extends hqj
{
  private final int r;
  private final String s;
  
  public kai(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((jyx)mbb.a(paramContext, jyx.class)).a());
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    return ((jyy)mbb.a(this.l, jyy.class)).a(this.r, this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kai
 * JD-Core Version:    0.7.0.1
 */