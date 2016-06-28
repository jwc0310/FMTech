import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

public final class dzp
  extends View
  implements lxj
{
  public static loj a;
  public String b;
  String c;
  String d;
  private StaticLayout e;
  private StaticLayout f;
  
  public dzp(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dzp(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dzp(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    if (a == null) {
      a = loj.a(paramContext);
    }
  }
  
  private static int b()
  {
    return a.m + a.k + Math.max(a.I.getWidth(), a.ap.getWidth());
  }
  
  public final void D_()
  {
    this.e = null;
    this.f = null;
    this.b = null;
    this.d = null;
    this.c = null;
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    int i = getLeft() + a.z;
    int j = i + Math.abs(a.I.getWidth() - a.ap.getWidth()) / 2;
    if (a.I.getWidth() > a.ap.getWidth()) {}
    for (;;)
    {
      super.onDraw(paramCanvas);
      int m = b();
      int n = a.m;
      paramCanvas.drawBitmap(a.I, i, n, null);
      if (this.e != null)
      {
        paramCanvas.translate(m, n);
        this.e.draw(paramCanvas);
        paramCanvas.translate(-m, -n);
      }
      int i1 = n + this.e.getHeight() + a.m;
      paramCanvas.drawBitmap(a.ap, j, i1, null);
      if (this.f != null)
      {
        paramCanvas.translate(m, i1);
        this.f.draw(paramCanvas);
        paramCanvas.translate(-m, -i1);
      }
      return;
      int k = i;
      i = j;
      j = k;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    Context localContext = getContext();
    int j = a.m;
    int k = a.m;
    this.e = new StaticLayout(this.c, efj.B(localContext, efj.yH), i - b() - k, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    int m = j + Math.max(a.ap.getHeight(), this.e.getHeight()) + a.m;
    this.f = new StaticLayout(this.d, efj.B(localContext, efj.ys), i - b() - k, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    setMeasuredDimension(i, m + a.m);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzp
 * JD-Core Version:    0.7.0.1
 */