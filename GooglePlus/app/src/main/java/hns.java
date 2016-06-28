import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

final class hns
  extends AnimatorListenerAdapter
{
  hns(hnr paramhnr, ViewGroup paramViewGroup) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    this.a.setVisibility(8);
    this.b.removeView(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hns
 * JD-Core Version:    0.7.0.1
 */