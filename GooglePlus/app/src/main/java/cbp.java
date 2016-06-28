import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.libraries.social.media.ui.MediaView;

public final class cbp
  implements AbsListView.RecyclerListener
{
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
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
        if (paramBoolean)
        {
          localView.setTag(aaw.kW, null);
          localView.setTag(aaw.kY, null);
          localView.setTag(aaw.kX, null);
          localView.setTag(aaw.ln, null);
          localView.setTag(aaw.lo, null);
          localView.setTag(aaw.lh, null);
          if (localView.isClickable()) {
            localView.setOnClickListener(null);
          }
          if (localView.isLongClickable()) {
            localView.setOnLongClickListener(null);
          }
        }
        i--;
        break;
        if ((localView instanceof ViewGroup)) {
          a((ViewGroup)localView, false);
        }
      }
    }
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof ViewGroup)) {
      a((ViewGroup)paramView, true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cbp
 * JD-Core Version:    0.7.0.1
 */