import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.TypedValue;

public final class ggd
{
  private static final float[] d = { 20.0F, 12.0F };
  public final Paint a;
  public final Paint b;
  public final RectF c = new RectF();
  private final Paint e;
  private final Paint f;
  private final RectF g = new RectF();
  
  public ggd(Resources paramResources)
  {
    float f1 = TypedValue.applyDimension(1, 1.0F, paramResources.getDisplayMetrics());
    this.a = new Paint();
    this.a.setAntiAlias(true);
    this.a.setStyle(Paint.Style.STROKE);
    this.a.setColor(-1);
    this.a.setStrokeWidth(f1);
    float f2 = TypedValue.applyDimension(1, 1.5F, paramResources.getDisplayMetrics());
    this.b = new Paint(this.a);
    this.b.setColor(-16777216);
    this.b.setStrokeWidth(f2);
    this.f = new Paint(this.b);
    this.f.setPathEffect(new DashPathEffect(d, 2.0F));
    this.e = new Paint(this.a);
    this.e.setPathEffect(new DashPathEffect(d, 2.0F));
    new Paint(this.a);
    new Paint(this.b);
  }
  
  private final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, Paint paramPaint1, Paint paramPaint2)
  {
    if (paramPaint1 == null) {
      return;
    }
    this.g.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    if (paramPaint2 != null) {
      paramCanvas.drawOval(this.g, paramPaint2);
    }
    paramCanvas.drawOval(this.g, paramPaint1);
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    int i = 1;
    if (paramInt != i) {}
    for (;;)
    {
      if (i != 0) {
        paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.b);
      }
      paramCanvas.drawLine(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.a);
      return;
      i = 0;
    }
  }
  
  public final void a(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    int i = 1;
    if (paramInt != i) {}
    for (;;)
    {
      if (i != 0) {
        paramCanvas.drawCircle(paramFloat1, paramFloat2, paramFloat3, this.b);
      }
      paramCanvas.drawCircle(paramFloat1, paramFloat2, paramFloat3, this.a);
      return;
      i = 0;
    }
  }
  
  public final void b(Canvas paramCanvas, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt)
  {
    if (paramInt != 1)
    {
      a(paramCanvas, paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.a, this.b);
      return;
    }
    a(paramCanvas, paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.a, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ggd
 * JD-Core Version:    0.7.0.1
 */