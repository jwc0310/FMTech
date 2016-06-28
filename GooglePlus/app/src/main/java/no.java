import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

class no
  extends nn
{
  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public final void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public final boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return paramView.performAccessibilityAction(paramInt, paramBundle);
  }
  
  public void c(View paramView, int paramInt)
  {
    if (paramInt == 4) {
      paramInt = 2;
    }
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public final boolean k(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public final void l(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public final int m(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public final ViewParent n(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public final int o(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public final int p(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public void q(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public final boolean r(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public final boolean s(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     no
 * JD-Core Version:    0.7.0.1
 */