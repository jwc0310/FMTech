import android.database.ContentObserver;
import android.os.Handler;

final class hcm
  extends ContentObserver
{
  hcm(hcl paramhcl, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    this.a.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcm
 * JD-Core Version:    0.7.0.1
 */