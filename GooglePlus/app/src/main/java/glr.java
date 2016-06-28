import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

public final class glr
  extends AnimatorListenerAdapter
{
  glr(AccountSwitcherView paramAccountSwitcherView, AvatarView paramAvatarView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.b.b.setX(this.a.getLeft());
    this.b.b.setY(this.a.getTop());
    this.b.b.setPivotX(0.0F);
    this.b.b.setPivotY(0.0F);
    this.b.b.setScaleX(this.a.getWidth() / this.b.b.getWidth());
    this.b.b.setScaleY(this.a.getHeight() / this.b.b.getHeight());
    this.b.b.animate().alpha(1.0F).setDuration(150L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glr
 * JD-Core Version:    0.7.0.1
 */