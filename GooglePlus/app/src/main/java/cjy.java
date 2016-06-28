import android.database.DataSetObserver;
import android.widget.BaseAdapter;

final class cjy
  extends DataSetObserver
{
  cjy(cjx paramcjx) {}
  
  public final void onChanged()
  {
    if (!this.a.ad) {
      this.a.A();
    }
    if (this.a.ae != null) {
      ((BaseAdapter)this.a.ae).notifyDataSetChanged();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjy
 * JD-Core Version:    0.7.0.1
 */