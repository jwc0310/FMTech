import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

public class ns
{
  WeakHashMap<View, ov> a = null;
  
  public float A(View paramView)
  {
    return 0.0F;
  }
  
  public float B(View paramView)
  {
    return 0.0F;
  }
  
  public boolean C(View paramView)
  {
    if ((paramView instanceof mx)) {
      return ((mx)paramView).isNestedScrollingEnabled();
    }
    return false;
  }
  
  public void D(View paramView)
  {
    if ((paramView instanceof mx)) {
      ((mx)paramView).stopNestedScroll();
    }
  }
  
  public float E(View paramView)
  {
    return B(paramView) + A(paramView);
  }
  
  public int a(int paramInt1, int paramInt2)
  {
    return paramInt1 | paramInt2;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return View.resolveSize(paramInt1, paramInt2);
  }
  
  public int a(View paramView)
  {
    return 2;
  }
  
  long a()
  {
    return 10L;
  }
  
  public pj a(View paramView, pj parampj)
  {
    return parampj;
  }
  
  public void a(View paramView, float paramFloat) {}
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void a(View paramView, int paramInt, Paint paramPaint) {}
  
  public void a(View paramView, ColorStateList paramColorStateList)
  {
    if ((paramView instanceof ne)) {
      ((ne)paramView).setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void a(View paramView, PorterDuff.Mode paramMode)
  {
    if ((paramView instanceof ne)) {
      ((ne)paramView).setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postDelayed(paramRunnable, a());
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postDelayed(paramRunnable, paramLong + a());
  }
  
  public void a(View paramView, ld paramld) {}
  
  public void a(View paramView, nb paramnb) {}
  
  public void a(View paramView, pr parampr) {}
  
  public void a(View paramView, boolean paramBoolean) {}
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean) {}
  
  public boolean a(View paramView, int paramInt)
  {
    if ((paramView instanceof nd))
    {
      nd localnd = (nd)paramView;
      int i = localnd.computeHorizontalScrollOffset();
      int j = localnd.computeHorizontalScrollRange() - localnd.computeHorizontalScrollExtent();
      int k;
      if (j != 0) {
        if (paramInt < 0) {
          if (i > 0) {
            k = 1;
          }
        }
      }
      while (k != 0)
      {
        return true;
        k = 0;
        continue;
        if (i < j - 1) {
          k = 1;
        } else {
          k = 0;
        }
      }
    }
    return false;
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  public float b(View paramView)
  {
    return 1.0F;
  }
  
  public void b(View paramView, float paramFloat) {}
  
  public void b(View paramView, boolean paramBoolean) {}
  
  public boolean b(View paramView, int paramInt)
  {
    if ((paramView instanceof nd))
    {
      nd localnd = (nd)paramView;
      int i = localnd.computeVerticalScrollOffset();
      int j = localnd.computeVerticalScrollRange() - localnd.computeVerticalScrollExtent();
      int k;
      if (j != 0) {
        if (paramInt < 0) {
          if (i > 0) {
            k = 1;
          }
        }
      }
      while (k != 0)
      {
        return true;
        k = 0;
        continue;
        if (i < j - 1) {
          k = 1;
        } else {
          k = 0;
        }
      }
    }
    return false;
  }
  
  public int c(View paramView)
  {
    return 0;
  }
  
  public void c(View paramView, float paramFloat) {}
  
  public void c(View paramView, int paramInt) {}
  
  public void c(View paramView, boolean paramBoolean) {}
  
  public int d(View paramView)
  {
    return 0;
  }
  
  public void d(View paramView, float paramFloat) {}
  
  public float e(View paramView)
  {
    return 0.0F;
  }
  
  public void e(View paramView, float paramFloat) {}
  
  public float f(View paramView)
  {
    return 0.0F;
  }
  
  public void f(View paramView, float paramFloat) {}
  
  public float g(View paramView)
  {
    return 0.0F;
  }
  
  public void h(View paramView) {}
  
  public boolean i(View paramView)
  {
    return false;
  }
  
  public ov j(View paramView)
  {
    return new ov(paramView);
  }
  
  public boolean k(View paramView)
  {
    return false;
  }
  
  public void l(View paramView)
  {
    paramView.invalidate();
  }
  
  public int m(View paramView)
  {
    return 0;
  }
  
  public ViewParent n(View paramView)
  {
    return paramView.getParent();
  }
  
  public int o(View paramView)
  {
    return efj.b(paramView);
  }
  
  public int p(View paramView)
  {
    return efj.c(paramView);
  }
  
  public void q(View paramView) {}
  
  public boolean r(View paramView)
  {
    return false;
  }
  
  public boolean s(View paramView)
  {
    return true;
  }
  
  public int t(View paramView)
  {
    return 0;
  }
  
  public int u(View paramView)
  {
    return paramView.getPaddingLeft();
  }
  
  public int v(View paramView)
  {
    return paramView.getPaddingRight();
  }
  
  public int w(View paramView)
  {
    return 0;
  }
  
  public boolean x(View paramView)
  {
    return false;
  }
  
  public boolean y(View paramView)
  {
    return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
  }
  
  public boolean z(View paramView)
  {
    return paramView.getWindowToken() != null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ns
 * JD-Core Version:    0.7.0.1
 */