import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import android.widget.Scroller;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;

public final class lxn
  extends DataSetObserver
{
  public lxn(RecyclingViewGroup paramRecyclingViewGroup) {}
  
  public final void onChanged()
  {
    this.a.f = this.a.a.getCount();
    this.a.i = true;
    this.a.d.a.abortAnimation();
    this.a.requestLayout();
  }
  
  public final void onInvalidated() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxn
 * JD-Core Version:    0.7.0.1
 */