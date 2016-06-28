import android.database.ContentObserver;
import android.os.Handler;

final class cbu
  extends ContentObserver
{
  cbu(cbs paramcbs, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    if (this.a.s) {
      this.a.k().b(0, null, this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbu
 * JD-Core Version:    0.7.0.1
 */