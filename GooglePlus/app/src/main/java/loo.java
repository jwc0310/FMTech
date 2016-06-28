import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

final class loo
  implements Animator.AnimatorListener
{
  loo(lol paramlol, ViewPropertyAnimator paramViewPropertyAnimator, ArrayList paramArrayList) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.a.setListener(null);
    if (this.c.a != null) {
      this.c.a(this.b);
    }
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.setListener(null);
    if (this.c.a != null) {
      this.c.a(this.b);
    }
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loo
 * JD-Core Version:    0.7.0.1
 */