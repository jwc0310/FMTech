import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class jxd
  implements ValueAnimator.AnimatorUpdateListener
{
  jxd(jxb paramjxb, View paramView) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.setScaleY(((Float)paramValueAnimator.getAnimatedValue()).floatValue());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxd
 * JD-Core Version:    0.7.0.1
 */