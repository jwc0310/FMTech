import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

final class dwm
  extends ViewGroup
{
  boolean a;
  int b;
  int c;
  private Paint d;
  
  public dwm(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.d = new Paint();
    this.d.setColor(localResources.getColor(efj.ju));
    this.d.setStrokeWidth(localResources.getDimension(efj.lK));
    setWillNotDraw(false);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.a) {
      paramCanvas.drawLine(this.b, this.c, this.b, getMeasuredHeight() - dwl.h, this.d);
    }
    super.onDraw(paramCanvas);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwm
 * JD-Core Version:    0.7.0.1
 */