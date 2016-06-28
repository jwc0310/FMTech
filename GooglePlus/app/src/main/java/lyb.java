import android.database.DataSetObserver;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.widget.ListAdapter;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;

public final class lyb
  extends DataSetObserver
{
  public lyb(ColumnGridView paramColumnGridView) {}
  
  public final void onChanged()
  {
    int i = 0;
    this.a.n = true;
    int j = this.a.o;
    this.a.o = this.a.l.getCount();
    if (this.a.o < j) {
      for (int n = -1 + this.a.q.size(); n >= 0; n--)
      {
        int i1 = this.a.q.keyAt(n);
        if ((i1 >= this.a.o) && (this.a.q.valueAt(n))) {
          this.a.e(i1);
        }
      }
    }
    lyh locallyh = this.a.e;
    if (locallyh.d != null) {
      locallyh.d.clear();
    }
    if (this.a.o == 0) {
      this.a.c();
    }
    label314:
    for (;;)
    {
      this.a.requestLayout();
      return;
      if ((!this.a.m) || (this.a.o < j))
      {
        this.a.d.c();
        ColumnGridView localColumnGridView = this.a;
        for (int k = 0; k < localColumnGridView.getChildCount(); k++) {
          localColumnGridView.e.a(localColumnGridView.getChildAt(k), localColumnGridView.getChildCount());
        }
        if (localColumnGridView.f) {
          localColumnGridView.removeAllViewsInLayout();
        }
        for (;;)
        {
          if (this.a.g == null) {
            break label314;
          }
          int m = this.a.b;
          while (i < m)
          {
            this.a.h[i] = this.a.g[i];
            i++;
          }
          break;
          localColumnGridView.removeAllViews();
        }
      }
    }
  }
  
  public final void onInvalidated() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lyb
 * JD-Core Version:    0.7.0.1
 */