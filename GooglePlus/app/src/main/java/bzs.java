import android.database.DataSetObserver;
import android.widget.ListView;

final class bzs
  extends DataSetObserver
{
  bzs(bzr parambzr) {}
  
  public final void onChanged()
  {
    if (this.a.a != null) {
      this.a.a.invalidate();
    }
    this.a.e(this.a.N);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzs
 * JD-Core Version:    0.7.0.1
 */