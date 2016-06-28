import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;

public final class glq
  extends AnimatorListenerAdapter
{
  glq(AccountSwitcherView paramAccountSwitcherView, gla paramgla) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.b.a(this.a.c, this.a.d);
    this.b.c.animate().alpha(1.0F).setDuration(150L).setInterpolator(new DecelerateInterpolator()).setListener(null).start();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glq
 * JD-Core Version:    0.7.0.1
 */