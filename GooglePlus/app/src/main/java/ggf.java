import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;

public final class ggf
  extends ggu
{
  public float a = 0.5F;
  private float g = 1.0F;
  private final ggd h;
  private int i;
  private final float j;
  private int k = -1;
  private boolean l;
  
  public ggf(ParameterOverlayView paramParameterOverlayView)
  {
    this(paramParameterOverlayView, 0);
  }
  
  private ggf(ParameterOverlayView paramParameterOverlayView, int paramInt)
  {
    super(paramParameterOverlayView, 0);
    this.h = new ggd(paramParameterOverlayView.getResources());
    this.j = Math.max(this.d.a, this.d.a);
    TypedArray localTypedArray = this.n.getContext().obtainStyledAttributes(0, gft.j);
    this.i = localTypedArray.getInt(gft.k, 0);
    localTypedArray.recycle();
  }
  
  private static float a(RectF paramRectF, float paramFloat)
  {
    return paramFloat * (float)Math.hypot(0.6F * paramRectF.width(), 0.6F * paramRectF.height());
  }
  
  protected final void a(Canvas paramCanvas, RectF paramRectF)
  {
    float f1 = a(paramRectF, this.a);
    if (f1 < this.j) {
      return;
    }
    if (this.g == 1.0F)
    {
      this.h.a(paramCanvas, this.c.x, this.c.y, f1, this.i);
      return;
    }
    float f2 = this.g * this.a * (float)Math.hypot(0.6F * paramRectF.width(), 0.6F * paramRectF.height());
    ggd localggd = this.h;
    float f3 = this.c.x - f1;
    float f4 = this.c.y - f1;
    float f5 = f1 + this.c.x;
    float f6 = f1 + this.c.y;
    localggd.c.set(f3, f4, f5, f6);
    paramCanvas.drawRoundRect(localggd.c, f2, f2, localggd.a);
  }
  
  public final boolean a()
  {
    if (!this.l) {
      return false;
    }
    this.l = false;
    this.f = false;
    this.n.invalidate();
    return true;
  }
  
  public final boolean a(float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  protected final boolean a(RectF paramRectF1, RectF paramRectF2)
  {
    float f1 = a(paramRectF1, this.a);
    if (f1 < this.j)
    {
      paramRectF2.setEmpty();
      return true;
    }
    ggd localggd = this.h;
    float f2 = this.c.x;
    float f3 = this.c.y;
    int m;
    if (this.i != 1)
    {
      m = 1;
      label59:
      if (paramRectF2 == null) {
        break label131;
      }
      paramRectF2.set(f2 - f1, f3 - f1, f2 + f1, f1 + f3);
      if (m == 0) {
        break label133;
      }
    }
    label131:
    label133:
    for (float f4 = Math.max(localggd.a.getStrokeWidth(), localggd.b.getStrokeWidth());; f4 = localggd.a.getStrokeWidth())
    {
      float f5 = f4 / 2.0F;
      paramRectF2.inset(-f5, -f5);
      return true;
      m = 0;
      break label59;
      break;
    }
  }
  
  public final boolean b(float paramFloat1, float paramFloat2)
  {
    if (!this.l) {
      return false;
    }
    this.n.invalidate();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggf
 * JD-Core Version:    0.7.0.1
 */