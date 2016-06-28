import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class cwa
  implements ValueAnimator.AnimatorUpdateListener
{
  cwa(cvz paramcvz, View paramView) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    Integer localInteger = (Integer)paramValueAnimator.getAnimatedValue();
    this.a.getLayoutParams().height = localInteger.intValue();
    this.a.requestLayout();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwa
 * JD-Core Version:    0.7.0.1
 */