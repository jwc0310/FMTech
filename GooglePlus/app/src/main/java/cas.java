import android.view.View;
import android.widget.AbsListView.RecyclerListener;

final class cas
  implements AbsListView.RecyclerListener
{
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof AbsListView.RecyclerListener)) {
      ((AbsListView.RecyclerListener)paramView).onMovedToScrapHeap(paramView);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cas
 * JD-Core Version:    0.7.0.1
 */