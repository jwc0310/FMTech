import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class afd
  extends agp
{
  private LinearInterpolator g = new LinearInterpolator();
  private DecelerateInterpolator h = new DecelerateInterpolator();
  private PointF i;
  private final float j;
  private int k = 0;
  private int l = 0;
  
  public afd(Context paramContext)
  {
    this.j = (25.0F / paramContext.getResources().getDisplayMetrics().densityDpi);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int m;
    switch (paramInt5)
    {
    default: 
      throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    case -1: 
      m = paramInt3 - paramInt1;
    }
    do
    {
      do
      {
        return m;
        return paramInt4 - paramInt2;
        m = paramInt3 - paramInt1;
      } while (m > 0);
      m = paramInt4 - paramInt2;
    } while (m < 0);
    return 0;
  }
  
  public abstract PointF a(int paramInt);
  
  protected final void a()
  {
    this.l = 0;
    this.k = 0;
    this.i = null;
  }
  
  protected final void a(int paramInt1, int paramInt2, agq paramagq)
  {
    if (this.b.h.l() == 0)
    {
      b();
      return;
    }
    int m = this.k;
    int n = m - paramInt1;
    if (m * n <= 0) {
      n = 0;
    }
    this.k = n;
    int i1 = this.l;
    int i2 = i1 - paramInt2;
    int i3 = i1 * i2;
    int i4 = 0;
    if (i3 <= 0) {}
    PointF localPointF;
    for (;;)
    {
      this.l = i4;
      if ((this.k != 0) || (this.l != 0)) {
        break;
      }
      localPointF = a(this.a);
      if ((localPointF != null) && ((localPointF.x != 0.0F) || (localPointF.y != 0.0F))) {
        break label157;
      }
      Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
      paramagq.d = this.a;
      b();
      return;
      i4 = i2;
    }
    label157:
    double d = Math.sqrt(localPointF.x * localPointF.x + localPointF.y * localPointF.y);
    localPointF.x = ((float)(localPointF.x / d));
    localPointF.y = ((float)(localPointF.y / d));
    this.i = localPointF;
    this.k = ((int)(10000.0F * localPointF.x));
    this.l = ((int)(10000.0F * localPointF.y));
    int i5 = (int)Math.ceil(Math.abs(10000) * this.j);
    paramagq.a((int)(1.2F * this.k), (int)(1.2F * this.l), (int)(1.2F * i5), this.g);
  }
  
  protected final void a(View paramView, agq paramagq)
  {
    int m = 1;
    int n;
    agh localagh1;
    int i1;
    label41:
    label62:
    agh localagh2;
    int i2;
    if ((this.i == null) || (this.i.x == 0.0F))
    {
      n = 0;
      localagh1 = this.c;
      if (localagh1.e()) {
        break label170;
      }
      i1 = 0;
      if ((this.i != null) && (this.i.y != 0.0F)) {
        break label253;
      }
      m = 0;
      localagh2 = this.c;
      boolean bool = localagh2.f();
      i2 = 0;
      if (bool) {
        break label270;
      }
    }
    for (;;)
    {
      int i3 = (int)Math.ceil((int)Math.ceil(Math.abs((int)Math.sqrt(i1 * i1 + i2 * i2)) * this.j) / 0.3356D);
      if (i3 > 0) {
        paramagq.a(-i1, -i2, i3, this.h);
      }
      return;
      if (this.i.x > 0.0F)
      {
        n = m;
        break;
      }
      n = -1;
      break;
      label170:
      agi localagi1 = (agi)paramView.getLayoutParams();
      i1 = a(paramView.getLeft() - ((agi)paramView.getLayoutParams()).d.left - localagi1.leftMargin, paramView.getRight() + ((agi)paramView.getLayoutParams()).d.right + localagi1.rightMargin, localagh1.o(), localagh1.m() - localagh1.q(), n);
      break label41;
      label253:
      if (this.i.y > 0.0F) {
        break label62;
      }
      m = -1;
      break label62;
      label270:
      agi localagi2 = (agi)paramView.getLayoutParams();
      i2 = a(paramView.getTop() - ((agi)paramView.getLayoutParams()).d.top - localagi2.topMargin, paramView.getBottom() + ((agi)paramView.getLayoutParams()).d.bottom + localagi2.bottomMargin, localagh2.p(), localagh2.n() - localagh2.r(), m);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afd
 * JD-Core Version:    0.7.0.1
 */