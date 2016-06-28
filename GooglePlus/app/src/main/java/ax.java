import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

final class ax
  implements av
{
  private TimeInterpolator a;
  
  public final void a(View paramView)
  {
    if (this.a == null) {
      this.a = new ValueAnimator().getInterpolator();
    }
    paramView.animate().setInterpolator(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ax
 * JD-Core Version:    0.7.0.1
 */