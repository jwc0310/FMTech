import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

final class jxe
  implements ValueAnimator.AnimatorUpdateListener
{
  jxe(jxb paramjxb, GradientDrawable paramGradientDrawable) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    this.a.setColor(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxe
 * JD-Core Version:    0.7.0.1
 */