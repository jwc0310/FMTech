import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;

final class cdn
  implements AbsListView.RecyclerListener
{
  private final void a(ViewGroup paramViewGroup, int paramInt)
  {
    for (int i = -1 + paramViewGroup.getChildCount(); i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      localView.setOnClickListener(null);
      localView.setVisibility(paramInt);
      localView.setClickable(false);
      if ((localView.getId() == aaw.gQ) && ((localView instanceof ViewGroup))) {
        a((ViewGroup)localView, 4);
      }
    }
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof ViewGroup)) {
      a((ViewGroup)paramView, 8);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdn
 * JD-Core Version:    0.7.0.1
 */