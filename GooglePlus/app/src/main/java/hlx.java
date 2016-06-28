import android.content.Context;
import android.database.Cursor;

public final class hlx
  extends hqj
{
  private final int r;
  private final String s;
  
  public hlx(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext, ((hho)mbb.a(paramContext, hho.class)).a(paramString));
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    return ((hhh)mbb.a(this.l, hhh.class)).a(this.r, this.s);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hlx
 * JD-Core Version:    0.7.0.1
 */