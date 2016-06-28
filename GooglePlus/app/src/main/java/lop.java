import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.util.ArrayList;

final class lop
  implements Animation.AnimationListener
{
  lop(lol paramlol, AlphaAnimation paramAlphaAnimation, ArrayList paramArrayList) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setAnimationListener(null);
    if (this.c.a != null) {
      this.c.a(this.b);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lop
 * JD-Core Version:    0.7.0.1
 */