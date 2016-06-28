import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class hnt
  extends AnimatorListenerAdapter
{
  hnt(hnr paramhnr, View paramView) {}
  
  public final void onAnimationCancel(Animator paramAnimator)
  {
    super.onAnimationCancel(paramAnimator);
    this.a.setAlpha(1.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnt
 * JD-Core Version:    0.7.0.1
 */