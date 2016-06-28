import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.apps.plus.content.EsProvider;

public final class coa
  extends hqe<bru>
{
  private final int d;
  private final String e;
  private final boolean f;
  private bru h;
  private final fv r = new fv(this);
  
  public coa(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = paramString;
    this.f = paramBoolean;
  }
  
  protected final void g()
  {
    o();
    if (this.h == null) {
      a();
    }
  }
  
  protected final void i()
  {
    super.i();
    this.h = null;
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().registerContentObserver(Uri.withAppendedPath(EsProvider.g(this.l), this.e), false, this.r);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.r);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     coa
 * JD-Core Version:    0.7.0.1
 */