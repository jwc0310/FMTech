import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

public final class jzs
  extends hqe<jyz>
{
  private final int d;
  private final String e;
  private final boolean f;
  private final int h;
  private final fv r = new fv(this);
  private jyz s;
  
  public jzs(Context paramContext, int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    super(paramContext);
    this.d = paramInt1;
    this.e = paramString;
    this.f = paramBoolean;
    this.h = 4;
  }
  
  private static void a(jyz paramjyz)
  {
    if (paramjyz != null)
    {
      if ((paramjyz.a != null) && (!paramjyz.a.isClosed()))
      {
        paramjyz.a.close();
        paramjyz.a = null;
      }
      if ((paramjyz.b != null) && (!paramjyz.b.isClosed()))
      {
        paramjyz.b.close();
        paramjyz.b = null;
      }
    }
  }
  
  protected final void i()
  {
    super.i();
    h();
    a(this.s);
    this.s = null;
  }
  
  protected final boolean o()
  {
    Context localContext = this.l;
    super.o();
    localContext.getContentResolver().registerContentObserver(((jyv)mbb.a(localContext, jyv.class)).a(), false, this.r);
    return true;
  }
  
  protected final boolean p()
  {
    super.p();
    this.l.getContentResolver().unregisterContentObserver(this.r);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzs
 * JD-Core Version:    0.7.0.1
 */