import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import com.google.android.libraries.social.spaces.SpaceHeaderView;

public final class kxl
  implements Animator.AnimatorListener
{
  public kxl(SpaceHeaderView paramSpaceHeaderView) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {}
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator)
  {
    if (this.a.f != null) {
      this.a.f.setVisibility(0);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kxl
 * JD-Core Version:    0.7.0.1
 */