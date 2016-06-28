import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import com.google.android.apps.plus.views.EventThemeView;

final class ccp
  implements AbsListView.RecyclerListener
{
  ccp(cco paramcco) {}
  
  public final void onMovedToScrapHeap(View paramView)
  {
    ((EventThemeView)paramView.findViewById(aaw.el)).D_();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ccp
 * JD-Core Version:    0.7.0.1
 */