import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class amx
  extends View
{
  private static final PointF a = new PointF(0.0F, 1.0F);
  private static final ColorFilter b = new LightingColorFilter(11184810, 0);
  private final Drawable c;
  private final String d;
  private final Paint e;
  private final int f;
  
  public amx(Context paramContext, Drawable paramDrawable, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    if (paramDrawable == null) {
      throw new IllegalArgumentException("Cover drawable cannot be null");
    }
    Resources localResources = getResources();
    if (localResources == null) {
      throw new IllegalStateException("Could not get resources");
    }
    this.e = new Paint();
    this.e.setAntiAlias(true);
    this.e.setTextSize(localResources.getDimension(efj.ck));
    Typeface localTypeface = Typeface.create("sans-serif-condensed", 0);
    this.e.setTypeface(localTypeface);
    if (!paramBoolean) {
      this.e.setShadowLayer(3.0F, a.x, a.y, localResources.getColor(efj.bT));
    }
    for (int i = -1;; i = localResources.getColor(efj.bS))
    {
      this.e.setColor(i);
      this.e.setTextAlign(Paint.Align.CENTER);
      this.f = getResources().getDimensionPixelSize(efj.bW);
      this.c = paramDrawable;
      this.d = paramString;
      this.c.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      setEnabled(true);
      setClickable(true);
      setLongClickable(false);
      return;
    }
  }
  
  public final CharSequence getContentDescription()
  {
    return this.d;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.c.draw(paramCanvas);
    paramCanvas.drawText(this.d, getWidth() / 2, getHeight() - this.f, this.e);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
  }
  
  public final void refreshDrawableState()
  {
    Drawable localDrawable = this.c;
    if (isPressed()) {}
    for (ColorFilter localColorFilter = b;; localColorFilter = null)
    {
      localDrawable.setColorFilter(localColorFilter);
      invalidate();
      super.refreshDrawableState();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amx
 * JD-Core Version:    0.7.0.1
 */