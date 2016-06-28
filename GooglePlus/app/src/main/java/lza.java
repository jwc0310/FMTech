import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;

public final class lza
{
  public final int a;
  public final int b;
  public final ExpandingScrollView c;
  public final lyo d;
  public final lyo e;
  public int f = lzb.a;
  public float g;
  public float h;
  public float i;
  public float j;
  public float k = -1.0F;
  public boolean l;
  
  public lza(ExpandingScrollView paramExpandingScrollView, lze paramlze1, lze paramlze2)
  {
    this.c = paramExpandingScrollView;
    this.d = new lyo(paramlze1);
    this.e = new lyo(paramlze2);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramExpandingScrollView.getContext());
    this.a = localViewConfiguration.getScaledTouchSlop();
    this.b = localViewConfiguration.getScaledPagingTouchSlop();
  }
  
  public static boolean a(View paramView, int paramInt1, int paramInt2)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int n = paramView.getScrollX();
      int i1 = paramView.getScrollY();
      for (int i2 = -1 + localViewGroup.getChildCount(); i2 >= 0; i2--)
      {
        View localView = localViewGroup.getChildAt(i2);
        if ((paramInt1 + n >= localView.getLeft()) && (paramInt1 + n < localView.getRight()) && (paramInt2 + i1 >= localView.getTop()) && (paramInt2 + i1 < localView.getBottom()) && (a(localView, paramInt1 + n - localView.getLeft(), paramInt2 + i1 - localView.getTop()))) {
          return true;
        }
      }
    }
    if (Build.VERSION.SDK_INT < 14)
    {
      int m;
      if ((paramView instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)paramView;
        if ((localAbsListView.getChildCount() == 0) || ((localAbsListView.getFirstVisiblePosition() == 0) && (localAbsListView.getChildAt(0).getTop() == localAbsListView.getListPaddingTop()) && (localAbsListView.getScrollY() == 0)))
        {
          m = 1;
          if (m != 0) {
            break label212;
          }
        }
      }
      for (boolean bool = true;; bool = false)
      {
        return bool;
        m = 0;
        break;
        label212:
        return false;
      }
    }
    return nj.a.b(paramView, -1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lza
 * JD-Core Version:    0.7.0.1
 */