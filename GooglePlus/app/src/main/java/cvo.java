import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.plus.notifications.ui.GunsMenuView;

public final class cvo
  extends AnimatorListenerAdapter
{
  public cvo(GunsMenuView paramGunsMenuView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvo
 * JD-Core Version:    0.7.0.1
 */