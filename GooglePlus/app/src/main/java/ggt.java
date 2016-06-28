import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;

@TargetApi(11)
final class ggt
  implements Animator.AnimatorListener
{
  ggt(ggs paramggs) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    onAnimationEnd(paramAnimator);
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.a(null);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggt
 * JD-Core Version:    0.7.0.1
 */