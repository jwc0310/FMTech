import android.content.ContentResolver;
import android.content.Context;

final class cvj
  extends hqc<jds>
{
  private final int d;
  private final fv e;
  
  cvj(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.d = paramInt;
    this.e = new fv(this);
  }
  
  protected final boolean f()
  {
    this.l.getContentResolver().registerContentObserver(jda.a, false, this.e);
    return true;
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().unregisterContentObserver(this.e);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvj
 * JD-Core Version:    0.7.0.1
 */