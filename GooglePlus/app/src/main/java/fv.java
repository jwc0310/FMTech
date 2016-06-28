import android.database.ContentObserver;
import android.os.Handler;

public final class fv
  extends ContentObserver
{
  public fv(fu paramfu)
  {
    super(new Handler());
  }
  
  public final boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public final void onChange(boolean paramBoolean)
  {
    this.a.n();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fv
 * JD-Core Version:    0.7.0.1
 */