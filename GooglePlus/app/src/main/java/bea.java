import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;

@TargetApi(14)
final class bea
  implements dyk
{
  RectF a;
  RectF b;
  RectF c;
  RectF d = new RectF();
  final Matrix e = new Matrix();
  float f;
  float g;
  private final int[] i = new int[2];
  private boolean j;
  
  public bea(bdp parambdp, RectF paramRectF)
  {
    this.a = paramRectF;
  }
  
  public final void a(Canvas paramCanvas)
  {
    paramCanvas.concat(this.e);
    paramCanvas.clipRect(this.d);
  }
  
  public final void a(View paramView, Drawable paramDrawable, RectF paramRectF)
  {
    boolean bool = true;
    if (this.j)
    {
      bool = false;
      if (bool)
      {
        bdp localbdp = this.h;
        Runnable localRunnable = localbdp.ak;
        efj.m().removeCallbacks(localRunnable);
        localbdp.ah = ObjectAnimator.ofFloat(localbdp.ae, new bdt(localbdp, Float.class, "animationPosition"), new float[] { 0.0F, 1.0F });
        localbdp.ah.addUpdateListener(new bdu(localbdp, paramView));
        localbdp.ah.addListener(new bdv(localbdp));
        localbdp.ah.setDuration(250L);
        localbdp.ah.start();
      }
      return;
    }
    this.j = bool;
    paramView.getLocationOnScreen(this.i);
    this.a.offset(0.0F, -this.i[bool]);
    if (paramDrawable.getIntrinsicWidth() > paramDrawable.getIntrinsicHeight())
    {
      float f2 = (this.a.height() / paramDrawable.getIntrinsicHeight() * paramDrawable.getIntrinsicWidth() - this.a.width()) / 2.0F;
      RectF localRectF3 = this.a;
      localRectF3.left -= f2;
      RectF localRectF4 = this.a;
      localRectF4.right = (f2 + localRectF4.right);
      this.f = (f2 / this.a.width());
    }
    for (;;)
    {
      this.b = new RectF(paramRectF);
      this.c = new RectF(this.a);
      break;
      float f1 = (this.a.width() / paramDrawable.getIntrinsicWidth() * paramDrawable.getIntrinsicHeight() - this.a.height()) / 2.0F;
      RectF localRectF1 = this.a;
      localRectF1.top -= f1;
      RectF localRectF2 = this.a;
      localRectF2.bottom = (f1 + localRectF2.bottom);
      this.g = (f1 / this.a.height());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bea
 * JD-Core Version:    0.7.0.1
 */