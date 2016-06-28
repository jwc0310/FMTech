import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public class ggu
  extends ghp
{
  private PointF a = new PointF(0.5F, 0.5F);
  public ggv b;
  public final PointF c = new PointF();
  final gga d;
  public boolean e;
  public boolean f;
  private float g;
  private boolean h;
  private final RectF i = new RectF();
  private final Rect j = new Rect();
  private final Rect k = new Rect();
  
  public ggu(ParameterOverlayView paramParameterOverlayView, int paramInt)
  {
    super(paramParameterOverlayView);
    Context localContext = this.n.getContext();
    this.d = new gga(localContext, paramInt);
    this.g = ghv.a(localContext).b;
    this.g *= this.g;
  }
  
  private final void a(RectF paramRectF)
  {
    this.c.x = (paramRectF.left + paramRectF.width() * this.a.x);
    this.c.y = (paramRectF.top + paramRectF.height() * this.a.y);
  }
  
  private boolean b()
  {
    if (this.e) {}
    while (this.f) {
      return true;
    }
    return false;
  }
  
  private final boolean g(float paramFloat1, float paramFloat2)
  {
    float f1 = this.c.x;
    float f2 = this.c.y;
    return (f1 - paramFloat1) * (f1 - paramFloat1) + (f2 - paramFloat2) * (f2 - paramFloat2) < this.g;
  }
  
  public final void a(Canvas paramCanvas)
  {
    RectF localRectF = this.n.b();
    if (localRectF.isEmpty()) {
      return;
    }
    a(localRectF);
    if (b()) {
      a(paramCanvas, localRectF);
    }
    this.d.a(paramCanvas, this.c.x, this.c.y, true, null, 0.0F);
  }
  
  protected void a(Canvas paramCanvas, RectF paramRectF) {}
  
  public final void a(boolean paramBoolean)
  {
    if ((!paramBoolean) && (!b()))
    {
      this.d.a(this.c.x, this.c.y, this.i);
      this.i.roundOut(this.j);
      this.n.invalidate(this.j);
      return;
    }
    if (!a(this.n.b(), this.i))
    {
      this.n.invalidate();
      return;
    }
    this.i.roundOut(this.j);
    this.d.a(this.c.x, this.c.y, this.i);
    this.i.roundOut(this.k);
    this.j.union(this.k);
    this.n.invalidate(this.j);
  }
  
  public final boolean a(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt != 1) {
      return false;
    }
    g(paramFloat1, paramFloat2);
    return false;
  }
  
  protected boolean a(RectF paramRectF1, RectF paramRectF2)
  {
    return false;
  }
  
  public final boolean d()
  {
    if (!this.h) {
      return false;
    }
    this.h = false;
    this.f = false;
    a(true);
    return true;
  }
  
  public final boolean d(float paramFloat1, float paramFloat2)
  {
    this.h = g(paramFloat1, paramFloat2);
    if (this.h)
    {
      this.f = true;
      a(true);
    }
    return this.h;
  }
  
  public final boolean e(float paramFloat1, float paramFloat2)
  {
    if (!this.h) {
      return false;
    }
    RectF localRectF = this.n.b();
    if (localRectF.isEmpty()) {}
    for (;;)
    {
      return true;
      float f1 = (paramFloat1 - localRectF.left) / localRectF.width();
      float f2 = (paramFloat2 - localRectF.top) / localRectF.height();
      f(efj.a(f1, 0.0F, 1.0F), efj.a(f2, 0.0F, 1.0F));
    }
  }
  
  public final boolean f(float paramFloat1, float paramFloat2)
  {
    if ((Math.abs(paramFloat1 - this.a.x) < 1.0E-004F) && (Math.abs(paramFloat2 - this.a.y) < 1.0E-004F)) {
      return false;
    }
    this.a.x = paramFloat1;
    this.a.y = paramFloat2;
    a(false);
    a(this.n.b());
    a(false);
    if (this.b != null) {
      this.b.a(this.a.x, this.a.y);
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggu
 * JD-Core Version:    0.7.0.1
 */