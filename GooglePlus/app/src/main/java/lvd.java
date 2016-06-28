import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public final class lvd
  extends ImageSpan
{
  private final int a;
  private Drawable b;
  
  public lvd(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.a = paramContext.getResources().getDimensionPixelOffset(efj.ZS);
  }
  
  public lvd(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1);
    this.a = paramContext.getResources().getDimensionPixelOffset(paramInt2);
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    if (this.b == null) {
      this.b = getDrawable();
    }
    Drawable localDrawable = this.b;
    paramCanvas.save();
    Paint.FontMetricsInt localFontMetricsInt = paramPaint.getFontMetricsInt();
    int i = localDrawable.getBounds().bottom;
    int j = Math.max(0, Math.abs(localFontMetricsInt.ascent) - i);
    paramCanvas.translate(paramFloat, paramInt5 - localFontMetricsInt.descent + localFontMetricsInt.ascent + j / 2 + this.a);
    localDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lvd
 * JD-Core Version:    0.7.0.1
 */