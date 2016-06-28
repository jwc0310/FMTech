import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public final class gha
  extends ggu
{
  public ghb a;
  public ghc g;
  public float h;
  public boolean i = true;
  private boolean j;
  private float k;
  private float l;
  private final PointF p = new PointF();
  private final ggd q;
  private final int r;
  private boolean s = true;
  private final PointF t = new PointF();
  private final PointF u = new PointF();
  
  public gha(ParameterOverlayView paramParameterOverlayView)
  {
    this(paramParameterOverlayView, 0);
  }
  
  private gha(ParameterOverlayView paramParameterOverlayView, int paramInt)
  {
    super(paramParameterOverlayView, 0);
    this.q = new ggd(paramParameterOverlayView.getResources());
    TypedArray localTypedArray = this.n.getContext().obtainStyledAttributes(0, gft.j);
    this.r = localTypedArray.getInt(gft.k, 0);
    localTypedArray.recycle();
  }
  
  protected final void a(Canvas paramCanvas, RectF paramRectF)
  {
    paramCanvas.save(1);
    paramCanvas.translate(this.c.x, this.c.y);
    float f1 = paramRectF.width();
    float f2 = paramRectF.height();
    this.g.a(this.u);
    PointF localPointF1 = this.u;
    localPointF1.x /= 100.0F;
    PointF localPointF2 = this.u;
    localPointF2.y /= 100.0F;
    paramCanvas.rotate((float)Math.toDegrees(this.g.V() + this.h), this.t.x, this.t.y);
    float f3 = this.g.W();
    if (this.g.X())
    {
      float f15 = this.u.x;
      float f16 = Math.max(f1, f2);
      float f17 = f16 / 2.0F;
      float f18 = f15 * f17;
      this.q.a(paramCanvas, -f16, -f18, f16 * 2.0F, -f18, this.r);
      this.q.a(paramCanvas, -f16, f18, f16 * 2.0F, f18, this.r);
      float f19 = f17 * (f15 + f3 / 2.0F);
      this.q.a(paramCanvas, -f16, -f19, f16 * 2.0F, -f19, this.r);
      this.q.a(paramCanvas, -f16, f19, f16 * 2.0F, f19, this.r);
      paramCanvas.restore();
      return;
    }
    float f4 = this.u.x;
    float f5 = this.u.y;
    float f6 = 0.5F * Math.max(f1, f2);
    float f7 = f4 * f6;
    float f8 = f5 * f6;
    this.q.b(paramCanvas, -f7, -f8, f7, f8, this.r);
    float f9 = (float)Math.hypot(f4, f5);
    float f10 = f4 / f9;
    float f11 = f5 / f9;
    if (f10 >= f11) {}
    for (float f12 = f10;; f12 = f11)
    {
      float f13 = f6 * (f4 + f12 * (f10 * f3));
      float f14 = f6 * (f5 + f12 * (f3 * f11));
      this.q.b(paramCanvas, -f13, -f14, f13, f14, this.r);
      break;
    }
  }
  
  public final boolean a()
  {
    this.j = false;
    this.f = false;
    a(true);
    return true;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    if ((!this.s) || (this.g == null)) {
      return false;
    }
    float f = (float)Math.toRadians(paramFloat2) + this.h;
    this.j = true;
    this.k = (f - this.g.V());
    this.k %= 3.141593F;
    this.l = paramFloat1;
    this.g.a(this.p);
    this.f = true;
    a(true);
    return true;
  }
  
  public final boolean b(float paramFloat1, float paramFloat2)
  {
    if (!this.j) {
      return false;
    }
    float f1 = ((float)Math.toRadians(paramFloat2) + this.h - this.k) % 3.141593F;
    if (f1 < 0.0F) {
      f1 += 3.141593F;
    }
    float f2 = paramFloat1 / this.l;
    float f3;
    float f4;
    float f5;
    if (f2 != 1.0F)
    {
      f3 = (float)Math.sin(Math.abs(this.k));
      f4 = 1.0F - f3;
      if ((!this.g.X()) || (!this.i)) {
        break label233;
      }
      f5 = f4;
    }
    for (;;)
    {
      int m;
      if (f2 > 1.0F) {
        m = (int)(this.p.x + 65.0F * (1.0F + f3 * (f2 - 1.0F)) - 65.0F);
      }
      for (int n = (int)(this.p.y + 65.0F * (1.0F + f5 * (f2 - 1.0F)) - 65.0F);; n = (int)(65.0F + (this.p.y - 65.0F / (1.0F - f5 * (1.0F - f2)))))
      {
        this.a.a(f1, m, n);
        a(false);
        return true;
        m = (int)(65.0F + (this.p.x - 65.0F / (1.0F - f3 * (1.0F - f2))));
      }
      label233:
      f5 = f3;
      f3 = f4;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gha
 * JD-Core Version:    0.7.0.1
 */