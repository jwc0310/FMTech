import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;

public final class bxo
  extends hqj
{
  private final fv r;
  private final int s;
  private final String[] t;
  private final ArrayList<String> u;
  
  public bxo(Context paramContext, int paramInt, String[] paramArrayOfString, ArrayList<String> paramArrayList)
  {
    super(paramContext);
    this.d = EsProvider.f(paramContext);
    this.r = new fv(this);
    this.s = paramInt;
    this.t = paramArrayOfString;
    this.u = paramArrayList;
  }
  
  public final Cursor o()
  {
    int i = this.s;
    Cursor localCursor = brn.a(this.l, i, this.t, this.u);
    if (localCursor != null) {
      localCursor.registerContentObserver(this.r);
    }
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxo
 * JD-Core Version:    0.7.0.1
 */