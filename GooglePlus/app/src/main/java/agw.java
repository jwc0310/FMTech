import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class agw
  extends Drawable
{
  float a;
  final Paint b;
  float c;
  boolean d = false;
  boolean e = true;
  private final RectF f;
  private final Rect g;
  
  public agw(int paramInt, float paramFloat)
  {
    this.a = paramFloat;
    this.b = new Paint(5);
    this.b.setColor(paramInt);
    this.f = new RectF();
    this.g = new Rect();
  }
  
  final void a(Rect paramRect)
  {
    if (paramRect == null) {
      paramRect = getBounds();
    }
    this.f.set(paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
    this.g.set(paramRect);
    if (this.d)
    {
      float f1 = agx.a(this.c, this.a, this.e);
      float f2 = agx.b(this.c, this.a, this.e);
      this.g.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.f.set(this.g);
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    paramCanvas.drawRoundRect(this.f, this.a, this.a, this.b);
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.g, this.a);
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    a(paramRect);
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     agw
 * JD-Core Version:    0.7.0.1
 */