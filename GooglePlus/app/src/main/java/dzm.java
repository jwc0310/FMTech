import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

final class dzm
  extends lov
{
  public dzm(dzl paramdzl, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void a(Canvas paramCanvas)
  {
    Rect localRect = this.d;
    if (g()) {}
    for (Paint localPaint = this.b.q;; localPaint = this.b.r)
    {
      paramCanvas.drawRect(localRect, localPaint);
      return;
    }
  }
  
  protected final String d()
  {
    if (this.a.a) {
      return this.a.b.c;
    }
    return this.a.b.a;
  }
  
  protected final String e()
  {
    return this.a.b.b;
  }
  
  protected final String f()
  {
    if (this.a.a) {
      return null;
    }
    return this.a.b.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzm
 * JD-Core Version:    0.7.0.1
 */