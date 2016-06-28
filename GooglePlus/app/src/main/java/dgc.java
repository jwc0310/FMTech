import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

final class dgc
  implements Animator.AnimatorListener
{
  dgc(dfz paramdfz, View paramView) {}
  
  private final void a()
  {
    this.a.setTranslationY(0.0F);
    this.a.setRotationX(0.0F);
    if ((this.a instanceof lpj)) {
      ((lpj)this.a).w();
    }
  }
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    a();
  }
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    a();
    this.a.invalidate();
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgc
 * JD-Core Version:    0.7.0.1
 */