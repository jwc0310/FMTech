import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class iwp
  extends ContentObserver
{
  public iwp(iwj paramiwj, Handler paramHandler)
  {
    super(null);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    onChange(paramBoolean, null);
  }
  
  public final void onChange(boolean paramBoolean, Uri paramUri)
  {
    iwq localiwq = new iwq(this);
    efj.m().post(localiwq);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iwp
 * JD-Core Version:    0.7.0.1
 */