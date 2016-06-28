import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.google.android.apps.photos.viewer.components.comments.DetailsListView;
import com.google.android.libraries.social.stream.legacy.views.OneUpCommentViewGroup;

public final class bap
  implements AbsListView.OnScrollListener
{
  public bap(DetailsListView paramDetailsListView) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt != 0) {
      for (int i = -1 + paramAbsListView.getChildCount(); i >= 0; i--)
      {
        View localView = paramAbsListView.getChildAt(i);
        if ((localView instanceof OneUpCommentViewGroup)) {
          localView.setPressed(false);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bap
 * JD-Core Version:    0.7.0.1
 */