import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.View.MeasureSpec;

final class jxf
  implements ValueAnimator.AnimatorUpdateListener
{
  jxf(jxb paramjxb, View paramView, int paramInt, boolean paramBoolean) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = View.MeasureSpec.makeMeasureSpec(((Integer)paramValueAnimator.getAnimatedValue()).intValue(), 1073741824);
    this.a.measure(i, this.b);
    int j = this.a.getTop();
    int k = j + this.a.getMeasuredHeight();
    int n;
    int m;
    if (this.c)
    {
      n = this.a.getRight();
      m = n - this.a.getMeasuredWidth();
    }
    for (;;)
    {
      this.a.layout(m, j, n, k);
      return;
      m = this.a.getLeft();
      n = m + this.a.getMeasuredWidth();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxf
 * JD-Core Version:    0.7.0.1
 */