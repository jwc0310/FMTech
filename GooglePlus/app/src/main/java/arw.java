import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ListView;

final class arw
  extends AnimatorListenerAdapter
{
  arw(arv paramarv, View paramView, boolean paramBoolean) {}
  
  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.setAlpha(1.0F);
    this.a.setTranslationX(0.0F);
    if (this.b)
    {
      arv.a(this.c, this.c.d, this.a);
      return;
    }
    this.c.b = false;
    this.c.a = false;
    this.c.d.setEnabled(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     arw
 * JD-Core Version:    0.7.0.1
 */