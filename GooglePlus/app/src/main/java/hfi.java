import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;

public final class hfi
  implements ValueAnimator.AnimatorUpdateListener
{
  public hfi(hfh paramhfh, GradientDrawable paramGradientDrawable) {}
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    this.a.setColor(i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfi
 * JD-Core Version:    0.7.0.1
 */