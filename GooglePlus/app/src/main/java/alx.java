import android.support.v4.view.ViewPager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class alx
  implements Animation.AnimationListener
{
  alx(alw paramalw) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (paramAnimation == this.a.Z) {
      this.a.c.setAlpha(1.0F);
    }
    while (paramAnimation != this.a.aa) {
      return;
    }
    this.a.c.setAlpha(0.0F);
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    this.a.c.setAlpha(1.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alx
 * JD-Core Version:    0.7.0.1
 */