import android.database.DataSetObserver;
import android.widget.PopupWindow;

final class afm
  extends DataSetObserver
{
  afm(afe paramafe) {}
  
  public final void onChanged()
  {
    if (this.a.e.isShowing()) {
      this.a.b();
    }
  }
  
  public final void onInvalidated()
  {
    this.a.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afm
 * JD-Core Version:    0.7.0.1
 */