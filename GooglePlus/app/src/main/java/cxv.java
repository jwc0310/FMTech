import android.content.ContentResolver;
import android.content.Context;

public final class cxv
  extends hqe<apm>
{
  private final int d;
  private final Long e;
  private final fv f = new fv(this);
  
  public cxv(Context paramContext, int paramInt, long paramLong)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = Long.valueOf(paramLong);
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().registerContentObserver(jqx.a(this.d), false, this.f);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.f);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxv
 * JD-Core Version:    0.7.0.1
 */