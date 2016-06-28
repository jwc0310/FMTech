import android.content.ContentResolver;
import android.content.Context;

public final class hmb
  extends hqe<nfn>
{
  private final hhh d;
  private final int e;
  private final fv f = new fv(this);
  
  public hmb(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.d = ((hhh)mbb.a(paramContext, hhh.class));
    this.e = paramInt;
  }
  
  protected final boolean o()
  {
    super.o();
    this.l.getContentResolver().registerContentObserver(((hho)mbb.a(this.l, hho.class)).f(), false, this.f);
    return true;
  }
  
  protected final boolean p()
  {
    super.p();
    this.l.getContentResolver().unregisterContentObserver(this.f);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmb
 * JD-Core Version:    0.7.0.1
 */