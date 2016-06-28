import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class ane
  extends View
{
  private static final PointF b = new PointF(1.0F, 1.0F);
  public boolean a;
  private Drawable c;
  private Drawable d;
  private final String e;
  private final Paint f;
  private final Paint g;
  private final int h;
  
  public ane(Context paramContext, Drawable paramDrawable, String paramString)
  {
    super(paramContext);
    Resources localResources = getResources();
    if (localResources == null) {
      throw new IllegalStateException("Could not get resources");
    }
    this.g = new Paint();
    this.g.setColor(localResources.getColor(efj.bR));
    this.g.setStyle(Paint.Style.STROKE);
    this.g.setStrokeWidth(4.0F);
    this.f = new Paint();
    this.f.setAntiAlias(true);
    this.f.setTextSize(localResources.getDimension(efj.ch));
    this.f.setColor(-1);
    this.f.setShadowLayer(2.0F, b.x, b.y, 1493172224);
    this.f.setTextAlign(Paint.Align.CENTER);
    this.h = localResources.getDimensionPixelSize(efj.bW);
    this.e = paramString;
    a(paramDrawable);
    this.d = localResources.getDrawable(efj.fp);
    setClickable(true);
    setEnabled(true);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.c = paramDrawable;
    this.c.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
    invalidate();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.c.draw(paramCanvas);
    this.d.setBounds(0, getHeight() / 2, getWidth(), getHeight());
    this.d.draw(paramCanvas);
    paramCanvas.drawText(this.e, getWidth() / 2, getHeight() - this.h, this.f);
    if (this.a) {
      paramCanvas.drawRect(2.0F, 2.0F, -2 + getWidth(), -2 + getHeight(), this.g);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ane
 * JD-Core Version:    0.7.0.1
 */