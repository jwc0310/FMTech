import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.plus.views.BarGraphListView;

public final class dvc
  implements AbsListView.RecyclerListener
{
  public dvc(BarGraphListView paramBarGraphListView) {}
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof dvd)) {
      ((dvd)paramView).D_();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvc
 * JD-Core Version:    0.7.0.1
 */