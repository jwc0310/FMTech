import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.TextPaint;

public final class bfq
  extends Drawable
{
  public String a;
  public TextPaint b;
  public int c;
  public int d;
  public NinePatchDrawable e;
  
  public final void draw(Canvas paramCanvas)
  {
    Rect localRect1 = getBounds();
    Rect localRect2 = new Rect();
    this.b.getTextBounds(this.a, 0, this.a.length(), localRect2);
    if (this.e != null)
    {
      int i = localRect2.width() + 2 * this.c;
      int j = localRect2.height() + 2 * this.d;
      this.e.setBounds(localRect1.right - i, 0, localRect1.right, j);
      this.e.draw(paramCanvas);
    }
    paramCanvas.drawText(this.a, localRect1.right - localRect2.width() - this.c, localRect2.height() + this.d, this.b);
  }
  
  public final int getOpacity()
  {
    return 0;
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfq
 * JD-Core Version:    0.7.0.1
 */