import android.support.design.widget.Snackbar;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public final class ac
  implements Animation.AnimationListener
{
  public ac(Snackbar paramSnackbar) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (Snackbar.b(this.a) != null) {
      Snackbar.b(this.a);
    }
    dbi.a().b(Snackbar.a(this.a));
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ac
 * JD-Core Version:    0.7.0.1
 */