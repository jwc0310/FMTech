import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class lvr
  extends AnimatorListenerAdapter
{
  lvr(lvp paramlvp, boolean paramBoolean, View paramView) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (this.a) {
      if (this.c.f != null) {
        this.c.f.b_(this.b);
      }
    }
    for (;;)
    {
      lvp.a(this.c, this.b);
      return;
      if (this.b != null)
      {
        this.b.setAlpha(1.0F);
        this.b.setTranslationX(0.0F);
      }
      this.c.d = false;
      this.c.e = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvr
 * JD-Core Version:    0.7.0.1
 */