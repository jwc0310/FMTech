import android.content.Context;
import android.database.Cursor;

public final class lfd
  extends hqj
{
  public boolean r;
  public String s;
  public int t;
  private final fv u = new fv(this);
  private final int v;
  private final String w;
  private final int x;
  private final String[] y;
  
  public lfd(Context paramContext, int paramInt1, String paramString, int paramInt2, String[] paramArrayOfString)
  {
    super(paramContext);
    this.v = paramInt1;
    this.w = paramString;
    this.x = paramInt2;
    this.y = paramArrayOfString;
  }
  
  public final Cursor o()
  {
    Context localContext = this.l;
    kyn localkyn = (kyn)mbb.a(localContext, kyn.class);
    this.s = null;
    long l = localkyn.b(this.v, this.w);
    boolean bool;
    int i;
    label98:
    Cursor localCursor1;
    if (System.currentTimeMillis() - l > 3600000L)
    {
      bool = true;
      this.r = bool;
      if (l > 0L) {
        break label121;
      }
      if (gzj.a(new lez(localContext, this.v, this.w, 0, null, 500)).b == 200) {
        break label115;
      }
      i = 1;
      localCursor1 = null;
      if (i == 0) {
        break label121;
      }
    }
    label115:
    label121:
    Cursor localCursor2;
    do
    {
      return localCursor1;
      bool = false;
      break;
      i = 0;
      break label98;
      localCursor1 = localkyn.a(this.v, this.w, this.x, this.y, null);
      if (localCursor1 != null) {
        localCursor1.registerContentObserver(this.u);
      }
      localCursor2 = localkyn.b(this.v, this.w, this.x);
    } while ((localCursor2 == null) || (!localCursor2.moveToFirst()));
    this.s = localCursor2.getString(0);
    this.t = localCursor2.getInt(1);
    return localCursor1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfd
 * JD-Core Version:    0.7.0.1
 */