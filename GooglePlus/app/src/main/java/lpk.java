import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;

public final class lpk
  extends ViewGroup
  implements lpj, lxj
{
  static final gqu a = gqs.b().b(1).a(1);
  public final jr b;
  final gqn c;
  public final lxx d;
  public final hfd e;
  public lpi f;
  public final int g;
  public final int h;
  public hfa i;
  public String j;
  
  public lpk(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.b = jr.a();
    this.c = ((gqn)mbb.a(localContext, gqn.class));
    this.e = new hfd(localContext);
    hfd localhfd = this.e;
    int k = aw.ew;
    localhfd.a.setTextAppearance(localhfd.getContext(), k);
    this.e.setPadding(0, 0, 0, 0);
    this.e.a.setMovementMethod(lxy.a());
    addView(this.e);
    Resources localResources = getResources();
    this.g = localResources.getDimensionPixelOffset(ehr.el);
    this.h = localResources.getDimensionPixelOffset(ehr.eg);
    this.d = new lpl(this);
  }
  
  public static gxt a(het paramhet)
  {
    if ((paramhet != null) && (paramhet.a() != 0)) {
      return new gxt(paramhet.a());
    }
    return pkh.t;
  }
  
  public final void D_()
  {
    this.e.D_();
    if (this.f != null) {
      this.f.D_();
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (this.f != null) {
      this.f.c(paramBoolean);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k = getMeasuredWidth();
    int m;
    if (this.e.getVisibility() == 0)
    {
      m = 1;
      if (m == 0) {
        break label91;
      }
      this.e.layout(0, 0, k, 0 + this.e.getMeasuredHeight());
    }
    label91:
    for (int n = 0 + this.e.getMeasuredHeight();; n = 0)
    {
      if (this.f != null) {
        this.f.layout(0, n, k, n + this.f.getMeasuredHeight());
      }
      return;
      m = 0;
      break;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    efj.e(this.i, "StreamLayoutInfo cannot be null.");
    if (this.f != null) {}
    for (int k = this.i.a(this.f.K);; k = 0)
    {
      int m = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
      int n = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (this.e.getVisibility() == 0) {}
      for (int i1 = 1;; i1 = 0)
      {
        int i2 = 0;
        if (i1 != 0)
        {
          this.e.measure(m, n);
          i2 = 0 + this.e.getMeasuredHeight();
        }
        if (this.f != null)
        {
          this.f.measure(m, n);
          i2 += this.f.getMeasuredHeight();
        }
        setMeasuredDimension(k, i2);
        return;
      }
    }
  }
  
  public final void u()
  {
    if (this.f != null) {
      this.f.u();
    }
  }
  
  public final void w()
  {
    if (this.f != null) {
      this.f.w();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lpk
 * JD-Core Version:    0.7.0.1
 */