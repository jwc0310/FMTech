import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class cgy
  implements Animator.AnimatorListener
{
  cgy(cgr paramcgr) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.z();
    this.a.aX.a = true;
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a.aX.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgy
 * JD-Core Version:    0.7.0.1
 */