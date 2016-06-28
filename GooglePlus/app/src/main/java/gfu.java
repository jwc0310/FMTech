import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;

public final class gfu
{
  private final Drawable a;
  private final Rect b = new Rect();
  private final Paint c;
  private final int d;
  private final float e;
  private final Rect f = new Rect();
  private final Rect g = new Rect();
  
  public gfu(Resources paramResources)
  {
    this.a = paramResources.getDrawable(efj.Cy);
    this.a.getPadding(this.b);
    this.c = new Paint();
    this.c.setColor(-1);
    this.c.setTextSize(paramResources.getDimensionPixelSize(aau.xo));
    this.c.setTextAlign(Paint.Align.CENTER);
    DisplayMetrics localDisplayMetrics = paramResources.getDisplayMetrics();
    this.d = ((int)TypedValue.applyDimension(1, 4.0F, localDisplayMetrics));
    this.e = TypedValue.applyDimension(1, 32.0F, localDisplayMetrics);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfu
 * JD-Core Version:    0.7.0.1
 */