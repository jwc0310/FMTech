import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.plus.views.ReadNotificationListView;

final class cqz
  implements Animation.AnimationListener
{
  cqz(cqv paramcqv, Runnable paramRunnable) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.b.b.setSelection(0);
    efj.m().post(this.a);
    this.b.ab.b();
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    this.b.b.setVisibility(0);
    this.b.ad = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqz
 * JD-Core Version:    0.7.0.1
 */