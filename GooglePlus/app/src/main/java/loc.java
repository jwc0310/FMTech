import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;

public final class loc
  extends View
  implements lxj
{
  public int a;
  public int b;
  public int c;
  public boolean d;
  private loj e;
  private String f;
  private Bitmap g;
  private int h;
  private StaticLayout i;
  
  public loc(Context paramContext)
  {
    super(paramContext);
    if (this.e == null) {
      this.e = loj.a(getContext());
    }
  }
  
  public loc(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (this.e == null) {
      this.e = loj.a(getContext());
    }
  }
  
  public final void D_()
  {
    this.f = null;
    this.g = null;
    this.i = null;
  }
  
  public final void a(int paramInt, String paramString, Bitmap paramBitmap)
  {
    this.f = paramString;
    this.g = paramBitmap;
    this.h = paramInt;
    this.a = aau.Dk;
    this.d = false;
    this.c = this.e.ah;
    this.b = this.e.m;
    efj.i(this);
  }
  
  @ViewDebug.ExportedProperty(category="accessibility")
  public final CharSequence getContentDescription()
  {
    return this.f;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = getWidth();
    int k = getHeight();
    int i1;
    int i2;
    label116:
    int m;
    if (new hfa(getContext(), loh.a).b())
    {
      this.e.ag.getPaint().setColor(this.h);
      this.e.ag.setBounds(0, 0, j, k);
      this.e.ag.draw(paramCanvas);
      if (this.g != null)
      {
        if (!this.d) {
          break label262;
        }
        i1 = this.e.m;
        i2 = k - this.b - this.g.getHeight();
        paramCanvas.drawBitmap(this.g, i1, i2, null);
      }
      if (this.i != null)
      {
        if (!this.d) {
          break label297;
        }
        m = this.e.m + this.g.getWidth() + this.b;
      }
    }
    for (int n = k - this.i.getHeight() - this.e.m;; n = (k - this.i.getHeight()) / 2)
    {
      paramCanvas.translate(m, n);
      this.i.draw(paramCanvas);
      paramCanvas.translate(-m, -n);
      return;
      this.e.af.getPaint().setColor(this.h);
      this.e.af.setBounds(0, 0, j, k);
      this.e.af.draw(paramCanvas);
      break;
      label262:
      i1 = j - this.e.m - this.g.getWidth();
      i2 = (k - this.g.getHeight()) / 2;
      break label116;
      label297:
      m = this.e.m;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = j - 2 * this.e.m;
    if (this.g != null) {
      k = k - this.e.m - this.g.getWidth();
    }
    this.i = new StaticLayout(this.f, efj.B(getContext(), this.a), k, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    Bitmap localBitmap = this.g;
    int m = 0;
    if (localBitmap != null) {
      m = this.g.getHeight();
    }
    setMeasuredDimension(j, Math.max(m, Math.max(this.c, this.i.getHeight() + 2 * this.e.m)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     loc
 * JD-Core Version:    0.7.0.1
 */