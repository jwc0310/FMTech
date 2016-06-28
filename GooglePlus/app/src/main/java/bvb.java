import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;

public final class bvb
  extends hqj
{
  private final String r;
  private final int s;
  private final lln t;
  private final fv u = new fv(this);
  
  public bvb(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.s = paramInt;
    this.r = paramString;
    this.t = ((lln)mbb.a(paramContext, lln.class));
  }
  
  public final Cursor o()
  {
    hqr localhqr = new hqr(lna.a);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(0);
    arrayOfObject[1] = Integer.valueOf(2);
    localhqr.a(arrayOfObject);
    Cursor localCursor1 = this.t.a(this.s, lnc.c, this.r);
    if (localCursor1 != null) {
      localCursor1.registerContentObserver(this.u);
    }
    if ((localCursor1 == null) || (localCursor1.getCount() == 0)) {
      return localCursor1;
    }
    Cursor localCursor2 = this.t.b(this.s, lnd.a, this.r);
    if (localCursor2 != null) {
      localCursor2.registerContentObserver(this.u);
    }
    return new MergeCursor(new Cursor[] { localhqr, localCursor1, localCursor2 });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvb
 * JD-Core Version:    0.7.0.1
 */