import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View.MeasureSpec;
import android.widget.TextView;

public final class lpb
  extends lpi
{
  private TextView a;
  private TextView b;
  
  public lpb(Context paramContext)
  {
    super(paramContext);
    int i = this.H.m;
    this.a = new TextView(paramContext, null, 0);
    this.a.setText(getResources().getString(do.aN));
    this.a.setPadding(i, i, i, 0);
    this.a.setTextAppearance(paramContext, aw.er);
    this.b = new TextView(paramContext, null, 0);
    this.b.setText(getResources().getString(do.aM));
    this.b.setPadding(i, 0, i, i);
    this.b.setTextAppearance(paramContext, aw.el);
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = View.MeasureSpec.makeMeasureSpec(paramInt1 - 2 * this.H.m, 1073741824);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    addView(this.a);
    this.a.measure(i, j);
    int k = paramInt2 + this.a.getMeasuredHeight();
    addView(this.b);
    this.b.measure(i, j);
    return k + this.b.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return this.J;
  }
  
  protected final void a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.I;
    this.a.layout(0, 0, i, 0 + this.a.getMeasuredHeight());
    int j = 0 + this.a.getMeasuredHeight();
    this.b.layout(0, j, i, j + this.b.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpb
 * JD-Core Version:    0.7.0.1
 */