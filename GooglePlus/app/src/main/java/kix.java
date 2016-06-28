import android.content.Context;
import android.database.Cursor;

public final class kix
  extends hqj
{
  private final int r;
  private final String s;
  private final lln t;
  private final fv u = new fv(this);
  
  public kix(Context paramContext, int paramInt, String[] paramArrayOfString, String paramString)
  {
    super(paramContext);
    this.e = paramArrayOfString;
    this.r = paramInt;
    this.s = paramString;
    this.t = ((lln)mbb.a(paramContext, lln.class));
  }
  
  public final Cursor o()
  {
    Cursor localCursor = this.t.a(this.r, this.e, this.s);
    if (localCursor != null) {
      localCursor.registerContentObserver(this.u);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kix
 * JD-Core Version:    0.7.0.1
 */