import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class cdg
  implements Animation.AnimationListener
{
  cdg(cda paramcda, Activity paramActivity) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.b.ab.setVisibility(8);
    if (this.b.ac != null)
    {
      this.b.a(this.b.ac);
      this.a.overridePendingTransition(0, 0);
      this.a.setResult(-1);
    }
    this.a.finish();
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cdg
 * JD-Core Version:    0.7.0.1
 */