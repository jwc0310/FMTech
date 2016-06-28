import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class jxk
  extends AnimatorListenerAdapter
{
  jxk(jxg paramjxg) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.w = false;
    if (this.a.I)
    {
      this.a.l();
      return;
    }
    this.a.m();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jxk
 * JD-Core Version:    0.7.0.1
 */