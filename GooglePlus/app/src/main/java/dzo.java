import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;

public final class dzo
  extends ViewGroup
  implements lxj
{
  final loj a;
  llv b;
  boolean c;
  String d;
  String e;
  TextView f;
  Bitmap g;
  String h;
  TextView i;
  
  public dzo(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.a = loj.a(localContext);
    setWillNotDraw(false);
    this.f = new TextView(localContext);
    addView(this.f);
    this.i = new TextView(localContext);
    addView(this.i);
  }
  
  public final void D_()
  {
    this.f.setText(null);
    this.f.setContentDescription("");
    this.e = null;
    this.i.setText(null);
    this.i.setContentDescription("");
    this.h = null;
    this.b = null;
    this.c = false;
    this.d = null;
    this.g = null;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = 2 * this.a.m + this.f.getMeasuredHeight();
    paramCanvas.drawBitmap(this.g, this.a.m, j, null);
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = this.a.m;
    this.f.layout(j, j, j + this.f.getMeasuredWidth(), j + this.f.getMeasuredHeight());
    int k = j + (this.g.getWidth() + this.a.n);
    int m = j + (j + this.f.getMeasuredHeight());
    this.i.layout(k, m, k + this.i.getMeasuredWidth(), m + this.i.getMeasuredHeight());
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = j - 2 * this.a.m;
    int m = this.a.m;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.f.measure(View.MeasureSpec.makeMeasureSpec(k, 1073741824), n);
    int i1 = m + (this.f.getMeasuredHeight() + this.a.m);
    int i2 = k - this.g.getWidth() - this.a.n;
    this.i.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), n);
    setMeasuredDimension(j, i1 + (this.a.m + Math.max(this.g.getHeight(), this.i.getMeasuredHeight())));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzo
 * JD-Core Version:    0.7.0.1
 */