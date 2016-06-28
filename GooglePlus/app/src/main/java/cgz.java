import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class cgz
  implements Animator.AnimatorListener
{
  cgz(cgr paramcgr) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    if (!paramAnimator.isRunning()) {
      this.a.x();
    }
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {}
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a.x();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgz
 * JD-Core Version:    0.7.0.1
 */