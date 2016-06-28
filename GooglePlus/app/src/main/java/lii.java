import android.content.Context;
import android.database.Cursor;

public final class lii
  extends hqj
{
  private final fv r = new fv(this);
  private final int s;
  private final String[] t;
  private final String u;
  
  public lii(Context paramContext, int paramInt, String paramString, String[] paramArrayOfString)
  {
    super(paramContext);
    this.s = paramInt;
    this.t = paramArrayOfString;
    this.u = paramString;
  }
  
  public final Cursor o()
  {
    kyn localkyn = (kyn)mbb.a(this.l, kyn.class);
    long l = localkyn.c(this.s, this.u);
    lid locallid;
    Cursor localCursor;
    if (System.currentTimeMillis() - l > 1200000L)
    {
      locallid = new lid(this.l, new kcg(this.l, this.s), this.u);
      locallid.i();
      boolean bool1 = locallid.n();
      localCursor = null;
      if (!bool1) {}
    }
    do
    {
      return localCursor;
      boolean bool2 = locallid.x;
      qat localqat = null;
      if (bool2) {
        localqat = locallid.w;
      }
      oms localoms = ((mvo)localqat).a.a;
      if ((this.u != null) && (localoms != null) && (localoms.a != null)) {
        for (omu localomu : localoms.a)
        {
          omr localomr = localomu.a;
          if ((localomr != null) && (localomu.b != null))
          {
            omv localomv = localomu.b;
            if ((localomr.a == 4) && (this.u.equals(localomr.c))) {
              localkyn.a(this.s, this.u, localomv);
            }
          }
        }
      }
      localCursor = localkyn.a(this.s, this.u, this.t);
    } while (localCursor == null);
    localCursor.registerContentObserver(this.r);
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lii
 * JD-Core Version:    0.7.0.1
 */