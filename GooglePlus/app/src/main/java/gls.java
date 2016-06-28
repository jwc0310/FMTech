import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;

public final class gls
  extends AnimatorListenerAdapter
{
  gls(AccountSwitcherView paramAccountSwitcherView, Runnable paramRunnable) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.b.a(true);
    if (this.a != null) {
      this.a.run();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gls
 * JD-Core Version:    0.7.0.1
 */