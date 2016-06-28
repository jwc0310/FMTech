import android.content.Context;
import android.database.Cursor;

public final class jma
  extends hqj
{
  private final int r;
  private final jjm<jgw> s;
  private final jiw t;
  
  public jma(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.r = paramInt1;
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
    this.s = efj.j(paramInt2);
  }
  
  public jma(Context paramContext, int paramInt1, int paramInt2, jjm<jgw> paramjjm)
  {
    super(paramContext);
    jjm localjjm = efj.j(paramInt2);
    this.r = paramInt1;
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
    this.s = new jmb(this, localjjm, paramjjm);
  }
  
  public final Cursor o()
  {
    return new jlz(this.t.a(this.r, this.s));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jma
 * JD-Core Version:    0.7.0.1
 */