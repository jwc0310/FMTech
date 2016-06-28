import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class goq
  extends BaseAdapter
{
  private Context a;
  
  public goq(gop paramgop, Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final int getCount()
  {
    return 1;
  }
  
  public final Object getItem(int paramInt)
  {
    return new Object();
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView != null) {
      return paramView;
    }
    FrameLayout localFrameLayout = new FrameLayout(this.a);
    localFrameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, gop.b));
    View localView = new View(this.a);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, gop.b);
    localLayoutParams.setMargins(gop.a, 0, gop.a, 0);
    localView.setLayoutParams(localLayoutParams);
    localView.setBackgroundColor(gop.c);
    localFrameLayout.addView(localView);
    return localFrameLayout;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     goq
 * JD-Core Version:    0.7.0.1
 */