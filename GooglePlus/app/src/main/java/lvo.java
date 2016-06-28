import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

final class lvo
  implements Animator.AnimatorListener
{
  lvo(lvn paramlvn) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    switch (this.a.c)
    {
    default: 
      return;
    case 1: 
    case 2: 
      this.a.c = 2;
      this.a.d = 0.0F;
      return;
    }
    this.a.c = 0;
    this.a.d = this.a.e();
    this.a.a(false);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvo
 * JD-Core Version:    0.7.0.1
 */