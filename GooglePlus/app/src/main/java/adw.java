import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class adw
  implements agy
{
  adw(adv paramadv) {}
  
  public final void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint)
  {
    float f1 = 2.0F * paramFloat;
    float f2 = paramRectF.width() - f1 - 1.0F;
    float f3 = paramRectF.height() - f1 - 1.0F;
    if (paramFloat >= 1.0F)
    {
      paramFloat += 0.5F;
      this.a.a.set(-paramFloat, -paramFloat, paramFloat, paramFloat);
      int i = paramCanvas.save();
      paramCanvas.translate(paramFloat + paramRectF.left, paramFloat + paramRectF.top);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f3, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.translate(f2, 0.0F);
      paramCanvas.rotate(90.0F);
      paramCanvas.drawArc(this.a.a, 180.0F, 90.0F, true, paramPaint);
      paramCanvas.restoreToCount(i);
      paramCanvas.drawRect(paramFloat + paramRectF.left - 1.0F, paramRectF.top, 1.0F + (paramRectF.right - paramFloat), paramFloat + paramRectF.top, paramPaint);
      paramCanvas.drawRect(paramFloat + paramRectF.left - 1.0F, 1.0F + (paramRectF.bottom - paramFloat), 1.0F + (paramRectF.right - paramFloat), paramRectF.bottom, paramPaint);
    }
    paramCanvas.drawRect(paramRectF.left, paramRectF.top + Math.max(0.0F, paramFloat - 1.0F), paramRectF.right, 1.0F + (paramRectF.bottom - paramFloat), paramPaint);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adw
 * JD-Core Version:    0.7.0.1
 */