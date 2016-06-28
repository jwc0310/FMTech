import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public final class joo
  extends View
{
  private ShapeDrawable a = new ShapeDrawable(new OvalShape());
  private Drawable b;
  private Rect c = new Rect();
  private Rect d = new Rect();
  
  public joo(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getResources();
    this.a.getPaint().setColor(localResources.getColor(ehr.dg));
    this.b = localResources.getDrawable(aaw.pZ);
  }
  
  public final void a(int paramInt, Drawable paramDrawable)
  {
    this.a.getPaint().setColor(paramInt);
    this.b = paramDrawable;
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.a.setBounds(this.c);
    this.a.draw(paramCanvas);
    this.b.setBounds(this.d);
    this.b.draw(paramCanvas);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    this.c.set(0, 0, i, j);
    int k = this.b.getIntrinsicWidth();
    int m = this.b.getIntrinsicHeight();
    int n = (i - k) / 2;
    int i1 = (j - m) / 2;
    this.d.set(n, i1, k + n, m + i1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     joo
 * JD-Core Version:    0.7.0.1
 */