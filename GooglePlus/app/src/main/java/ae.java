import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class ae
  implements Animation.AnimationListener
{
  ae(Snackbar paramSnackbar, int paramInt) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    Snackbar.a(this.b, this.a);
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ae
 * JD-Core Version:    0.7.0.1
 */