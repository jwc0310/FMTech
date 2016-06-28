import android.content.Context;
import android.database.Cursor;

public final class kal
  extends hqj
{
  private final int r;
  private final String s;
  
  public kal(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((jyx)mbb.a(paramContext, jyx.class)).b());
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    return ((jzb)mbb.a(this.l, jzb.class)).a(this.r, this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kal
 * JD-Core Version:    0.7.0.1
 */