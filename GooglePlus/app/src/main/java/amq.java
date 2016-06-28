import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class amq
  extends akx
  implements ggi, ggj, ggp
{
  private static final List<Integer> b;
  private Bitmap Z;
  ggg a;
  private int aa;
  private int as;
  private FilterParameter at;
  private int au;
  private FilterParameter av;
  private int aw;
  private int ax;
  private final PointF ay = new PointF();
  private ToolButton c;
  private ToolButton d;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[4];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(2);
    arrayOfInteger[2] = Integer.valueOf(1);
    arrayOfInteger[3] = Integer.valueOf(4);
    Collections.addAll(localArrayList, arrayOfInteger);
    b = Collections.unmodifiableList(localArrayList);
  }
  
  private final void a(FilterParameter paramFilterParameter, float paramFloat1, float paramFloat2)
  {
    this.ay.set(paramFloat1, paramFloat2);
    efj.a(this.ay, this.au, 1.0F, 1.0F);
    int i = Math.round(this.ay.x * (-1 + this.aa));
    int j = Math.round(this.ay.y * (-1 + this.as));
    paramFilterParameter.setParameterFloat(501, this.ay.x);
    paramFilterParameter.setParameterFloat(502, this.ay.y);
    paramFilterParameter.setParameterInteger(201, this.Z.getPixel(i, j));
  }
  
  private final void a(Object paramObject, boolean paramBoolean)
  {
    FilterParameter localFilterParameter = (FilterParameter)paramObject;
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localFilterParameter.setParameterInteger(203, i);
      return;
    }
  }
  
  protected final List<Integer> C()
  {
    if (this.at == null) {
      return super.C();
    }
    return b;
  }
  
  protected final FilterParameter N()
  {
    if (this.at == null) {
      return super.N();
    }
    return this.at;
  }
  
  public final int V()
  {
    return super.N().getSubParameters().size();
  }
  
  public final CharSequence W()
  {
    return "";
  }
  
  public final Object a(float paramFloat1, float paramFloat2)
  {
    FilterParameter localFilterParameter = efj.Cv.a(300);
    a(localFilterParameter, paramFloat1, paramFloat2);
    super.N().addSubParameters(localFilterParameter);
    R();
    O();
    return localFilterParameter;
  }
  
  public final void a(int paramInt)
  {
    if (this.al.g(paramInt) != 4) {
      return;
    }
    this.a.a(true);
    a(202, Integer.valueOf(1), true);
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fb;
    int j = efj.fa;
    int k = efj.ix;
    this.d = paramalm.a(i, j, 0, g().getString(k), new amr(this));
    ToolButton localToolButton = this.d;
    if (this.at != null) {}
    for (boolean bool = true;; bool = false)
    {
      localToolButton.setEnabled(bool);
      int m = efj.eZ;
      int n = efj.eY;
      int i1 = efj.iw;
      this.c = paramalm.a(m, n, 0, g().getString(i1), new ams(this));
      return;
    }
  }
  
  protected final void a(ParameterOverlayView paramParameterOverlayView)
  {
    super.a(paramParameterOverlayView);
    aiq localaiq = M();
    FilterChain localFilterChain;
    ggg localggg2;
    boolean bool;
    label90:
    int i;
    int j;
    if (localaiq.h != null)
    {
      localFilterChain = localaiq.h;
      this.au = localFilterChain.getPostRotation();
      this.a = new ggg(paramParameterOverlayView);
      ggg localggg1 = this.a;
      localggg1.b = this;
      localggg1.f = true;
      localggg1.n.invalidate();
      this.a.c = this;
      localggg2 = this.a;
      if (localggg2 == null) {
        break label152;
      }
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
    }
    for (;;)
    {
      if (i >= paramParameterOverlayView.a.size()) {
        break label178;
      }
      ghq localghq = (ghq)paramParameterOverlayView.a.get(i);
      if (localghq.a == localggg2)
      {
        return;
        localFilterChain = aiq.c;
        break;
        label152:
        bool = false;
        break label90;
      }
      if (localghq.b <= 0) {
        j = i + 1;
      }
      i++;
    }
    label178:
    paramParameterOverlayView.a.add(j, new ghq(localggg2, 0));
    if (paramParameterOverlayView.b == null) {
      paramParameterOverlayView.b = new ghe();
    }
    ghe localghe = paramParameterOverlayView.b;
    if (localggg2 == null) {
      throw new IllegalArgumentException("Listener cannot be null");
    }
    if (!localghe.h.contains(localggg2)) {
      localghe.h.add(localggg2);
    }
    paramParameterOverlayView.invalidate();
  }
  
  public final void a(Object paramObject)
  {
    super.N().b((FilterParameter)paramObject);
    this.c.setEnabled(this.a.c());
    R();
  }
  
  public final void a(Object paramObject, float paramFloat1, float paramFloat2)
  {
    a((FilterParameter)paramObject, paramFloat1, paramFloat2);
    O();
  }
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    boolean bool = true;
    if (paramObject1 != null) {
      a(paramObject1, false);
    }
    if (paramObject2 != null) {
      a(paramObject2, bool);
    }
    this.at = ((FilterParameter)paramObject2);
    this.al.a(N(), C());
    ggm localggm = this.aq;
    localggm.g = this.al;
    localggm.l.clear();
    this.c.setEnabled(this.a.c());
    ToolButton localToolButton = this.d;
    if (this.at != null) {}
    for (;;)
    {
      localToolButton.setEnabled(bool);
      R();
      return;
      bool = false;
    }
  }
  
  protected final void a(boolean paramBoolean)
  {
    FilterParameter localFilterParameter1 = super.N();
    FilterParameter localFilterParameter2 = this.at;
    this.aw = super.N().getSubParameters().indexOf(localFilterParameter2);
    this.av = localFilterParameter1.c();
    this.ax = this.a.a;
    if (this.ax == ggl.c) {
      this.a.b();
    }
    Iterator localIterator = localFilterParameter1.getSubParameters().iterator();
    while (localIterator.hasNext()) {
      localFilterParameter1.b((FilterParameter)localIterator.next());
    }
    ggg localggg = this.a;
    localggg.f = true;
    localggg.n.invalidate();
    if (this.ao != null) {
      this.ao.v();
    }
    O();
  }
  
  public final PointF b(Object paramObject)
  {
    FilterParameter localFilterParameter = (FilterParameter)paramObject;
    PointF localPointF = new PointF(localFilterParameter.getParameterFloat(501), localFilterParameter.getParameterFloat(502));
    efj.b(localPointF, this.au, 1.0F, 1.0F);
    return localPointF;
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt != 202) {
      return super.b(paramInt, paramObject);
    }
    return "";
  }
  
  public final void b(int paramInt)
  {
    if (this.al.g(paramInt) != 4) {
      return;
    }
    this.a.a(false);
    a(202, Integer.valueOf(0), true);
  }
  
  protected final void b(boolean paramBoolean)
  {
    super.N().a(this.av);
    if (this.aw >= 0) {}
    for (this.at = ((FilterParameter)super.N().getSubParameters().get(this.aw));; this.at = null)
    {
      this.a.a(this.ax);
      ggg localggg = this.a;
      localggg.f = true;
      localggg.n.invalidate();
      if (this.ao != null) {
        this.ao.v();
      }
      O();
      return;
    }
  }
  
  public final float c(Object paramObject)
  {
    return ((FilterParameter)paramObject).f(4);
  }
  
  public final void c(int paramInt)
  {
    if (this.at == null) {
      return;
    }
    U();
    N().setActiveParameterKey(this.al.g(paramInt));
    R();
  }
  
  public final void c(int paramInt, Object paramObject)
  {
    if (this.at == null) {
      return;
    }
    a(this.al.g(paramInt), paramObject, true);
    this.a.n.invalidate();
  }
  
  public final void d(int paramInt)
  {
    ToolButton localToolButton = this.c;
    if (paramInt == ggl.c) {}
    for (boolean bool = true;; bool = false)
    {
      localToolButton.setSelected(bool);
      return;
    }
  }
  
  public final boolean d(Object paramObject)
  {
    return ((FilterParameter)paramObject).getParameterInteger(203) != 0;
  }
  
  public final Object g(int paramInt)
  {
    return super.N().getSubParameters().get(paramInt);
  }
  
  public final void m()
  {
    super.m();
    this.Z = M().c();
    this.aa = this.Z.getWidth();
    this.as = this.Z.getHeight();
    ggg localggg = this.a;
    localggg.f = true;
    localggg.n.invalidate();
  }
  
  public final void n()
  {
    this.Z = null;
    this.aa = 0;
    this.as = 0;
    if (this.at != null) {
      a(202, Integer.valueOf(0), false);
    }
    super.n();
  }
  
  public final gxq v()
  {
    return new gxq(pjw.v);
  }
  
  public final int w()
  {
    return 3;
  }
  
  protected final List<ghw> y()
  {
    bp localbp = f();
    if ((localbp == null) || (this.aj == null) || (this.c == null)) {}
    while (efj.a(localbp.getWindow(), localbp.getResources()).isEmpty()) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = g().getDimensionPixelSize(efj.cc) / 2;
    Rect localRect1 = efj.e(this.c);
    PointF localPointF1 = new PointF(localRect1.exactCenterX(), localRect1.exactCenterY());
    long l1 = g().getInteger(efj.gf) << 1;
    ghx localghx1 = new ghx(1000, i);
    localghx1.a(l1).a(0.3F * i).a(localPointF1.x, localPointF1.y);
    ghz localghz1 = localghx1.b(100L);
    localghz1.a = i;
    localghz1.a();
    ghz localghz2 = localghx1.b(175L);
    localghz2.a = (0.3F * i);
    localghz2.a();
    ghw localghw1 = localghx1.a();
    localArrayList.add(localghw1);
    long l2 = 1300L + localghw1.b();
    Rect localRect2 = efj.e(this.aj);
    Rect localRect3 = this.aj.a();
    localRect3.offset(localRect2.left, localRect2.top);
    PointF localPointF2 = new PointF(0.5F * (localRect3.exactCenterX() + localRect3.left), 0.5F * (localRect3.exactCenterY() + localRect3.top));
    ghx localghx2 = new ghx(1000, i);
    localghx2.a(l2).a(0.3F * i).a(localPointF2.x, localPointF2.y);
    ghz localghz3 = localghx2.b(100L);
    localghz3.a = i;
    localghz3.a();
    ghz localghz4 = localghx2.b(175L);
    localghz4.a = (0.3F * i);
    localghz4.a();
    ghw localghw2 = localghx2.a();
    localArrayList.add(localghw2);
    long l3 = 300L + localghw2.b();
    Iterator localIterator = super.y().iterator();
    while (localIterator.hasNext())
    {
      ghw localghw3 = (ghw)localIterator.next();
      localArrayList.add(new ghx(localghw3).a(l3 + localghw3.a()).a());
    }
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amq
 * JD-Core Version:    0.7.0.1
 */