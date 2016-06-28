import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class ghs
  implements Animator.AnimatorListener
{
  ghs(ghr paramghr, float paramFloat) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    onAnimationEnd(paramAnimator);
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.b.e = this.a;
    this.b.f = false;
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.b.f = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghs
 * JD-Core Version:    0.7.0.1
 */