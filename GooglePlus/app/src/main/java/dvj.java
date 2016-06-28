import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dvj
  extends Drawable
{
  private final Paint a = new Paint(6);
  private final iey b;
  private final Rect c;
  private final Rect d;
  
  public dvj(iey paramiey)
  {
    this.b = paramiey;
    this.c = new Rect();
    this.c.set(0, 0, paramiey.b, paramiey.c);
    this.d = new Rect();
    this.d.set(0, 0, paramiey.b, paramiey.c);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    paramCanvas.drawBitmap(this.b.a, this.c, this.d, this.a);
  }
  
  public final int getIntrinsicHeight()
  {
    return this.b.c;
  }
  
  public final int getIntrinsicWidth()
  {
    return this.b.b;
  }
  
  public final int getOpacity()
  {
    Bitmap localBitmap = this.b.a;
    if ((localBitmap == null) || (localBitmap.hasAlpha()) || (this.a.getAlpha() < 255)) {
      return -3;
    }
    return -1;
  }
  
  public final void setAlpha(int paramInt)
  {
    if (paramInt != this.a.getAlpha())
    {
      this.a.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvj
 * JD-Core Version:    0.7.0.1
 */