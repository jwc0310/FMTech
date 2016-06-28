import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;

public class lvn
  extends lvg
{
  public final View h;
  private final long i;
  private final int j;
  private final int[] k;
  private ObjectAnimator l;
  private final Animator.AnimatorListener m;
  
  public lvn(View paramView, boolean paramBoolean)
  {
    this(paramView, paramBoolean, 200L);
  }
  
  public lvn(View paramView, boolean paramBoolean, long paramLong) {}
  
  public void a(boolean paramBoolean)
  {
    if (this.h.getVisibility() == 0) {}
    for (boolean bool = true; paramBoolean == bool; bool = false) {
      return;
    }
    this.h.setClickable(paramBoolean);
    View localView = this.h;
    int n = 0;
    if (paramBoolean) {}
    for (;;)
    {
      localView.setVisibility(n);
      if (!paramBoolean) {
        break;
      }
      this.h.requestLayout();
      return;
      n = 8;
    }
  }
  
  protected final float b(boolean paramBoolean)
  {
    d();
    if (paramBoolean) {}
    for (float f = 0.0F;; f = e())
    {
      this.l = ObjectAnimator.ofFloat(this.h, "translationY", new float[] { f });
      this.l.setDuration(this.i);
      this.l.addListener(this.m);
      this.l.start();
      return f;
    }
  }
  
  protected final void d()
  {
    if (this.l != null)
    {
      this.l.cancel();
      this.l = null;
    }
  }
  
  final float e()
  {
    this.h.getLocationOnScreen(this.k);
    int n = this.k[1];
    if (this.b) {
      return -(n + this.h.getHeight() + this.h.getPaddingTop());
    }
    return this.j - n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvn
 * JD-Core Version:    0.7.0.1
 */