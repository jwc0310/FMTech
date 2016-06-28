import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.plus.views.StreamOneUpViewGroup;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;

final class cgw
  implements Animator.AnimatorListener
{
  cgw(cgr paramcgr) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (this.a.aY) {
      this.a.aZ.e.animate().alpha(1.0F).setDuration(150L).start();
    }
    this.a.aZ.a.setVisibility(0);
    this.a.aZ.a.setAlpha(0.0F);
    this.a.aZ.a.animate().alpha(1.0F).setDuration(300L).start();
    this.a.ac.j = true;
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a.aZ.a.setVisibility(8);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cgw
 * JD-Core Version:    0.7.0.1
 */