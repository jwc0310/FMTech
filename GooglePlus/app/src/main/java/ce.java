import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class ce
  implements Animation.AnimationListener
{
  private boolean a = false;
  private View b;
  
  public ce(View paramView, Animation paramAnimation)
  {
    if ((paramView == null) || (paramAnimation == null)) {
      return;
    }
    this.b = paramView;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a)
    {
      View localView = this.b;
      nj.a.a(localView, 0, null);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    this.a = bz.a(this.b, paramAnimation);
    if (this.a)
    {
      View localView = this.b;
      nj.a.a(localView, 2, null);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ce
 * JD-Core Version:    0.7.0.1
 */