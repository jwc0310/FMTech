import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;

final class iqh
  extends View
{
  private static int a;
  private static int b;
  private static Paint c;
  private Paint d;
  private int e;
  private Rect f = new Rect();
  private String g;
  
  iqh(Context paramContext)
  {
    super(paramContext);
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    if (a == 0)
    {
      int i = Math.round(5.0F * localDisplayMetrics.density);
      a = i;
      b = i;
      Paint localPaint = new Paint();
      c = localPaint;
      localPaint.setColor(-16777216);
    }
    this.d = new Paint(1);
    this.d.setColor(-1);
    this.d.setTextSize(10.0F * localDisplayMetrics.scaledDensity);
    this.e = this.d.getFontMetricsInt().descent;
  }
  
  public final void a(String paramString)
  {
    if (this.g == paramString) {
      return;
    }
    this.g = paramString;
    requestLayout();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.g != null)
    {
      paramCanvas.drawRect(this.f, c);
      paramCanvas.drawText(this.g, a, this.f.bottom - b, this.d);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.g == null)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    this.d.getTextBounds(this.g, 0, this.g.length(), this.f);
    int i = this.f.right - this.f.left;
    int j = this.f.bottom - this.f.top;
    this.f.left = 0;
    this.f.right = (i + (a << 1));
    this.f.top = 0;
    this.f.bottom = (j + (b << 1) - this.e);
    setMeasuredDimension(this.f.right, this.f.bottom);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqh
 * JD-Core Version:    0.7.0.1
 */