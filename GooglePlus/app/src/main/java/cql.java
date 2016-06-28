import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.plus.content.EsProvider;

public final class cql
  extends hqj
{
  private final int r;
  private final boolean s = false;
  private final int t = 0;
  private final int u = 0;
  
  public cql(Context paramContext, int paramInt)
  {
    super(paramContext, EsProvider.a(EsProvider.d(paramContext), paramInt), bri.a, "(type!=97 AND type!=111 AND type!=18 AND type!=99)", null, "display_index ASC");
    this.r = paramInt;
  }
  
  public cql(Context paramContext, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final Cursor o()
  {
    Cursor localCursor = super.o();
    Bundle localBundle = new Bundle();
    Context localContext = this.l;
    int i = this.r;
    localBundle.putByteArray("next_read_high_fetch_param", brg.b(localContext, i, 2, 4));
    localBundle.putByteArray("next_read_low_fetch_param", brg.b(localContext, i, 2, 2));
    localBundle.putByteArray("next_unread_high_fetch_param", brg.b(localContext, i, 1, 4));
    localBundle.putByteArray("next_unread_low_fetch_param", brg.b(localContext, i, 1, 2));
    localBundle.putByteArray("read_low_summary", brg.c(localContext, i, true));
    localBundle.putByteArray("unread_low_summary", brg.c(localContext, i, false));
    dal localdal = null;
    if (localCursor != null) {
      if (!this.s) {
        break label147;
      }
    }
    label147:
    for (localdal = new dal(localCursor, this.t, this.u);; localdal = new dal(localCursor))
    {
      localdal.setExtras(localBundle);
      return localdal;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cql
 * JD-Core Version:    0.7.0.1
 */