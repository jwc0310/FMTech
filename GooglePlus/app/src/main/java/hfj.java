import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageButton;

public final class hfj
  implements Animator.AnimatorListener
{
  public hfj(hfh paramhfh, int paramInt) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    ((GradientDrawable)this.b.c.getBackground()).setColor(this.a);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hfj
 * JD-Core Version:    0.7.0.1
 */