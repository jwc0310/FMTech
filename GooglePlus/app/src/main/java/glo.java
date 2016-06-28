import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class glo
  implements Runnable
{
  glo(AccountSwitcherView paramAccountSwitcherView, gla paramgla, AvatarView paramAvatarView, Runnable paramRunnable, ipf paramipf) {}
  
  public final void run()
  {
    AccountSwitcherView localAccountSwitcherView = this.e;
    gla localgla = this.a;
    AvatarView localAvatarView = this.b;
    Runnable localRunnable = this.c;
    ipf localipf = this.d;
    localAccountSwitcherView.a.animate().alpha(0.0F).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(new glp(localAccountSwitcherView, localipf, localgla)).start();
    localAccountSwitcherView.c.animate().alpha(0.0F).setDuration(150L).setInterpolator(new DecelerateInterpolator()).setListener(new glq(localAccountSwitcherView, localgla)).start();
    localAccountSwitcherView.a(false);
    localAccountSwitcherView.b.animate().alpha(0.0F).setDuration(150L).setInterpolator(new DecelerateInterpolator()).setListener(new glr(localAccountSwitcherView, localAvatarView)).start();
    localAvatarView.setPivotX(0.0F);
    localAvatarView.setPivotY(0.0F);
    localAvatarView.animate().x(localAccountSwitcherView.b.getLeft()).y(localAccountSwitcherView.b.getTop()).scaleX(localAccountSwitcherView.b.getWidth() / localAvatarView.getWidth()).scaleY(localAccountSwitcherView.b.getHeight() / localAvatarView.getHeight()).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(new gls(localAccountSwitcherView, localRunnable)).start();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glo
 * JD-Core Version:    0.7.0.1
 */