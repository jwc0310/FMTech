import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.plus.views.UnreadNotificationListView;

final class crb
  implements Animation.AnimationListener
{
  crb(cqv paramcqv) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.a.setSelection(-1 + this.a.a.getCount());
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crb
 * JD-Core Version:    0.7.0.1
 */