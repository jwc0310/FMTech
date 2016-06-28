import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.google.android.libraries.social.ui.views.slidingtab.SlidingTabLayout;

public final class lzk
  implements ok
{
  private int a;
  
  public lzk(SlidingTabLayout paramSlidingTabLayout) {}
  
  public final void a(int paramInt)
  {
    if (this.a == 0)
    {
      lzm locallzm = this.b.b;
      locallzm.a = paramInt;
      locallzm.b = 0.0F;
      locallzm.invalidate();
      this.b.a(paramInt, 0);
    }
    nc localnc = this.b.a.c;
    Context localContext = this.b.getContext();
    int i = this.b.b.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = this.b.b.getChildAt(j);
      boolean bool;
      if (paramInt == j)
      {
        bool = true;
        label106:
        localView.setSelected(bool);
        if (!bool) {
          break label184;
        }
      }
      label184:
      for (int k = aaw.qH;; k = aaw.qI)
      {
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = localnc.b(j);
        arrayOfObject[1] = Integer.valueOf(j + 1);
        arrayOfObject[2] = Integer.valueOf(i);
        localView.setContentDescription(localContext.getString(k, arrayOfObject));
        j++;
        break;
        bool = false;
        break label106;
      }
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = this.b.b.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {
      return;
    }
    lzm locallzm = this.b.b;
    locallzm.a = paramInt1;
    locallzm.b = paramFloat;
    locallzm.invalidate();
    View localView = this.b.b.getChildAt(paramInt1);
    if (localView != null) {}
    for (int j = (int)(paramFloat * localView.getWidth());; j = 0)
    {
      this.b.a(paramInt1, j);
      return;
    }
  }
  
  public final void b(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzk
 * JD-Core Version:    0.7.0.1
 */