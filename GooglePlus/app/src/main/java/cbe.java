import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.concurrent.Future;

final class cbe
  implements AbsListView.RecyclerListener
{
  private final void a(ViewGroup paramViewGroup)
  {
    int i = -1 + paramViewGroup.getChildCount();
    if (i >= 0)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof MediaView)) {
        ((MediaView)localView).D_();
      }
      for (;;)
      {
        Future localFuture = (Future)localView.getTag(aaw.lf);
        if (localFuture != null) {
          localFuture.cancel(false);
        }
        i--;
        break;
        if ((localView instanceof ViewGroup)) {
          a((ViewGroup)localView);
        }
      }
    }
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof ViewGroup)) {
      a((ViewGroup)paramView);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbe
 * JD-Core Version:    0.7.0.1
 */