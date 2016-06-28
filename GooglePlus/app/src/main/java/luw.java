import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class luw
  implements Animator.AnimatorListener
{
  private boolean a;
  
  luw(luv paramluv) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.a = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if ((!this.a) && (!this.b.Z)) {
      paramAnimator.start();
    }
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     luw
 * JD-Core Version:    0.7.0.1
 */