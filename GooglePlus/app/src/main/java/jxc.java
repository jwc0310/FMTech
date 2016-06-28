import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class jxc
  implements ValueAnimator.AnimatorUpdateListener
{
  jxc(jxb paramjxb, View paramView) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.setScaleX(((Float)paramValueAnimator.getAnimatedValue()).floatValue());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxc
 * JD-Core Version:    0.7.0.1
 */