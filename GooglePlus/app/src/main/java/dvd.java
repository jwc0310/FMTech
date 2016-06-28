import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.apps.plus.views.BarGraphListView;
import java.util.HashSet;

public final class dvd
  extends View
  implements lxj
{
  dvg a;
  private StaticLayout b;
  private StaticLayout c;
  private final Rect d = new Rect();
  private long e;
  private Runnable f = new dve(this);
  
  public dvd(BarGraphListView paramBarGraphListView, Context paramContext)
  {
    super(paramContext);
  }
  
  public final void D_()
  {
    this.a = null;
    this.b = null;
    this.c = null;
    this.d.setEmpty();
    this.e = 0L;
    removeCallbacks(this.f);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null) {}
    do
    {
      return;
      if (!this.g.i.contains(this.a))
      {
        this.g.i.add(this.a);
        this.e = (1000L + System.currentTimeMillis());
        removeCallbacks(this.f);
        postDelayed(this.f, 16L);
      }
      int i = getPaddingLeft();
      int j = getPaddingTop();
      if (this.b != null)
      {
        paramCanvas.translate(i, j);
        this.b.draw(paramCanvas);
        paramCanvas.translate(-i, -j);
        j += this.b.getHeight() + BarGraphListView.f;
      }
      if (this.c != null)
      {
        paramCanvas.translate(i, j);
        this.c.draw(paramCanvas);
        paramCanvas.translate(-i, -j);
        this.c.getHeight();
      }
    } while (this.d.isEmpty());
    long l1;
    if (this.e != 0L)
    {
      l1 = this.e - System.currentTimeMillis();
      if (l1 >= 0L) {
        break label372;
      }
    }
    label372:
    for (long l2 = 0L;; l2 = l1)
    {
      float f1 = 1.0F - (float)l2 / 1000.0F;
      int k = this.d.left + (int)(f1 * this.d.width());
      paramCanvas.drawRect(this.d.left, this.d.top, k, this.d.bottom, BarGraphListView.d);
      paramCanvas.drawRect(this.d.left, this.d.top, k, this.d.bottom, BarGraphListView.c);
      if (l2 == 0L)
      {
        this.e = 0L;
        return;
      }
      removeCallbacks(this.f);
      postDelayed(this.f, 16L);
      return;
      paramCanvas.drawRect(this.d, BarGraphListView.d);
      paramCanvas.drawRect(this.d, BarGraphListView.c);
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k;
    int n;
    if (i == 1073741824)
    {
      k = j;
      int m = View.MeasureSpec.getMode(paramInt2);
      n = View.MeasureSpec.getSize(paramInt2);
      if (m != 1073741824) {
        break label78;
      }
    }
    label78:
    int i1;
    for (;;)
    {
      setMeasuredDimension(k, n);
      return;
      if ((i == -2147483648) && (j < 480))
      {
        k = j;
        break;
      }
      k = 480;
      break;
      i1 = getPaddingTop() + getPaddingBottom();
      if (this.a != null) {
        break label103;
      }
      n = i1;
    }
    label103:
    int i2 = getPaddingLeft();
    int i3 = k - (i2 + getPaddingRight());
    Resources localResources = getResources();
    this.b = new StaticLayout(this.a.b, BarGraphListView.a, i3, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
    int i4 = i1 + (this.b.getHeight() + BarGraphListView.f);
    int i5;
    label187:
    int i7;
    if (this.g.j == 0L)
    {
      i5 = 0;
      int i6 = aau.ll;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Long.valueOf(this.a.a);
      arrayOfObject[1] = this.g.l;
      arrayOfObject[2] = Integer.valueOf(i5);
      this.c = new StaticLayout(localResources.getString(i6, arrayOfObject), BarGraphListView.b, i3, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
      i7 = i4 + (this.c.getHeight() + BarGraphListView.f);
      if (this.g.k != 0L) {
        break label364;
      }
    }
    label364:
    for (float f1 = 1.0F;; f1 = (float)this.a.a / (float)this.g.k)
    {
      this.d.set(i2, i7, i2 + (int)(f1 * i3), i7 + BarGraphListView.e);
      n = i7 + (BarGraphListView.e + BarGraphListView.g);
      break;
      i5 = Math.round(100.0F * (float)this.a.a / (float)this.g.j);
      break label187;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dvd
 * JD-Core Version:    0.7.0.1
 */