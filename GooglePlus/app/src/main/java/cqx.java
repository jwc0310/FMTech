import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;

final class cqx
  implements AbsListView.OnScrollListener
{
  cqx(cqv paramcqv) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    lvz locallvz = this.a.Z;
    if (paramAbsListView.getChildCount() == 0) {}
    for (;;)
    {
      if (locallvz.a != null) {
        locallvz.a.setEnabled(bool);
      }
      return;
      if (paramAbsListView.getFirstVisiblePosition() == 0)
      {
        int i = paramAbsListView.getPaddingTop();
        if (paramAbsListView.getChildAt(0).getTop() >= i) {}
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqx
 * JD-Core Version:    0.7.0.1
 */