import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.google.android.apps.plus.views.ReadNotificationListView;
import com.google.android.apps.plus.views.UnreadNotificationListView;

final class cra
  implements Animation.AnimationListener
{
  cra(cqv paramcqv) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.b.setVisibility(8);
    this.a.ad = false;
    this.a.a.setVisibility(0);
    this.a.b.a();
    cqm localcqm = this.a.c;
    localcqm.e = false;
    localcqm.e();
    this.a.d.A();
    this.a.ab.b();
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cra
 * JD-Core Version:    0.7.0.1
 */