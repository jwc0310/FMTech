import android.view.View;
import android.view.animation.Animation;

final class cd
  extends ce
{
  cd(bz parambz, View paramView, Animation paramAnimation, bk parambk)
  {
    super(paramView, paramAnimation);
  }
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    if (this.a.g != null)
    {
      this.a.g = null;
      this.b.a(this.a, this.a.h, 0, 0, false);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cd
 * JD-Core Version:    0.7.0.1
 */