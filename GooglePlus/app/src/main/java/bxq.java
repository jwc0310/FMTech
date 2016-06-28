import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.plus.content.EsProvider;

public final class bxq
  extends hqj
{
  private final fv r = new fv(this);
  private final int s;
  private final String[] t;
  private final int u;
  
  public bxq(Context paramContext, int paramInt1, int paramInt2, String[] paramArrayOfString)
  {
    super(paramContext);
    this.d = EsProvider.e(paramContext);
    this.s = paramInt1;
    this.t = paramArrayOfString;
    this.u = paramInt2;
  }
  
  public final Cursor o()
  {
    int i = this.s;
    Cursor localCursor = brn.a(this.l, i, this.u, this.t);
    if (localCursor != null) {
      localCursor.registerContentObserver(this.r);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxq
 * JD-Core Version:    0.7.0.1
 */