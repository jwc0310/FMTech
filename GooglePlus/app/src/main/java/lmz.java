import android.content.Context;
import android.database.Cursor;

public final class lmz
  extends hqj
{
  private final int r;
  private final String s;
  private final boolean t;
  private final String u;
  private final lln v;
  private final fv w = new fv(this);
  
  public lmz(Context paramContext, int paramInt, String[] paramArrayOfString, String paramString1, boolean paramBoolean, String paramString2)
  {
    super(paramContext);
    this.e = paramArrayOfString;
    this.r = paramInt;
    this.s = paramString1;
    this.t = paramBoolean;
    this.u = paramString2;
    this.v = ((lln)mbb.a(paramContext, lln.class));
  }
  
  public final Cursor o()
  {
    Cursor localCursor = this.v.a(this.r, this.e, this.s, this.t, false, this.u);
    if (localCursor != null) {
      localCursor.registerContentObserver(this.w);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmz
 * JD-Core Version:    0.7.0.1
 */