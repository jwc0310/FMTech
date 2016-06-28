import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class amm
  extends akx
  implements ghb, ghc
{
  private static final int[] Z;
  private static final List<Integer> c;
  private static final int[] d;
  final ald a = new ald(this, 3, Z);
  private gha aa;
  private int as;
  private final PointF at = new PointF();
  final anc b = new amo(this);
  
  static
  {
    int[] arrayOfInt1 = new int[2];
    arrayOfInt1[0] = efj.ir;
    arrayOfInt1[1] = efj.iq;
    d = arrayOfInt1;
    int[] arrayOfInt2 = new int[4];
    arrayOfInt2[0] = efj.eb;
    arrayOfInt2[1] = efj.ea;
    arrayOfInt2[2] = efj.dZ;
    arrayOfInt2[3] = efj.dY;
    Z = arrayOfInt2;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[5];
    arrayOfInteger[0] = Integer.valueOf(17);
    arrayOfInteger[1] = Integer.valueOf(19);
    arrayOfInteger[2] = Integer.valueOf(0);
    arrayOfInteger[3] = Integer.valueOf(2);
    arrayOfInteger[4] = Integer.valueOf(1);
    Collections.addAll(localArrayList, arrayOfInteger);
    c = Collections.unmodifiableList(localArrayList);
  }
  
  private final void Y()
  {
    int i = N().getActiveParameterKey();
    gha localgha = this.aa;
    if (i == 17) {}
    for (boolean bool = true;; bool = false)
    {
      localgha.e = bool;
      localgha.a(true);
      return;
    }
  }
  
  protected final List<Integer> C()
  {
    return c;
  }
  
  public final float V()
  {
    return N().getParameterFloat(18) / 1000000.0F;
  }
  
  public final float W()
  {
    return N().getParameterInteger(17) / 100.0F;
  }
  
  public final boolean X()
  {
    return N().getParameterInteger(3) == 0;
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    this.at.set(paramFloat1, paramFloat2);
    efj.a(this.at, this.as, 1.0F, 1.0F);
    FilterParameter localFilterParameter = N();
    boolean bool = localFilterParameter.a(24, Float.valueOf(65535.0F * this.at.x));
    if ((localFilterParameter.a(25, Float.valueOf(65535.0F * this.at.y))) || (bool)) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        O();
      }
      return;
    }
  }
  
  public final void a(float paramFloat, int paramInt1, int paramInt2)
  {
    if (X()) {
      paramInt1 = paramInt2;
    }
    FilterParameter localFilterParameter = N();
    boolean bool = localFilterParameter.a(18, Float.valueOf(1000000.0F * paramFloat));
    if ((localFilterParameter.a(201, paramInt1)) || (bool)) {}
    for (int i = 1;; i = 0)
    {
      int j;
      if (!localFilterParameter.a(202, paramInt2))
      {
        j = 0;
        if (i == 0) {}
      }
      else
      {
        j = 1;
      }
      if (j != 0) {
        O();
      }
      return;
    }
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new amn(this));
  }
  
  public final void a(PointF paramPointF)
  {
    if (paramPointF == null) {
      return;
    }
    FilterParameter localFilterParameter = N();
    paramPointF.x = localFilterParameter.getParameterInteger(201);
    paramPointF.y = localFilterParameter.getParameterInteger(202);
  }
  
  protected final void a(ParameterOverlayView paramParameterOverlayView)
  {
    super.a(paramParameterOverlayView);
    this.aa = new gha(paramParameterOverlayView);
    gha localgha = this.aa;
    localgha.a = this;
    localgha.b = this;
    this.aa.g = this;
    this.aa.i = false;
    PointF localPointF = new PointF();
    FilterParameter localFilterParameter = N();
    localPointF.set(localFilterParameter.getParameterFloat(24) / 65535.0F, localFilterParameter.getParameterInteger(25) / 65535.0F);
    efj.b(localPointF, this.as, 1.0F, 1.0F);
    this.aa.f(localPointF.x, localPointF.y);
    this.aa.h = ((float)Math.toRadians(efj.e(this.as)));
    paramParameterOverlayView.a(this.aa, 0);
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 3)
    {
      int i = ((Number)paramObject).intValue();
      if ((i >= 0) && (i < d.length))
      {
        int j = d[i];
        return g().getString(j);
      }
      return "*UNKNOWN*";
    }
    return super.b(paramInt, paramObject);
  }
  
  protected final void b(boolean paramBoolean)
  {
    super.b(paramBoolean);
    this.aj.invalidate();
  }
  
  public final void c(int paramInt)
  {
    super.c(paramInt);
    Y();
  }
  
  public final void c(int paramInt, Object paramObject)
  {
    super.c(paramInt, paramObject);
    if (this.al.g(paramInt) == 17) {
      this.aj.invalidate();
    }
  }
  
  public final void m()
  {
    super.m();
    Y();
  }
  
  public final gxq v()
  {
    return new gxq(pjw.x);
  }
  
  public final int w()
  {
    return 14;
  }
  
  protected final List<ghw> y()
  {
    if ((this.aj == null) || (this.aq == null)) {
      return null;
    }
    bp localbp = f();
    if (localbp == null) {
      return null;
    }
    Resources localResources = g();
    Rect localRect1 = efj.a(localbp.getWindow(), localResources);
    if (localRect1.isEmpty()) {
      return null;
    }
    AccelerateDecelerateInterpolator localAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    DecelerateInterpolator localDecelerateInterpolator = new DecelerateInterpolator();
    int i = localResources.getDimensionPixelSize(efj.cb);
    int j = localResources.getDimensionPixelSize(efj.cc);
    int k = j / 2;
    Rect localRect2 = efj.e(this.aj);
    Rect localRect3 = new Rect();
    this.aq.a(localRect3);
    localRect3.offset(localRect2.left, localRect2.top);
    if (localRect1.width() > i) {
      localRect1.inset((localRect1.width() - i) / 2, 0);
    }
    if (localRect1.height() > i) {
      localRect1.inset(0, (localRect1.height() - i) / 2);
    }
    ArrayList localArrayList = new ArrayList();
    long l1 = localResources.getInteger(efj.gf);
    int m = Math.min(localRect1.right, (localRect3.right + localRect1.right) / 2);
    int n = localRect1.height() / 2 - k;
    ghx localghx1 = new ghx(1000, k);
    localghx1.a(l1).a(0.3F * k).a(m, localRect1.bottom);
    ghz localghz1 = localghx1.b(150L);
    localghz1.a = k;
    localghz1.a();
    ghz localghz2 = localghx1.b(m, localRect1.bottom - n, 1100L);
    localghz2.b = localAccelerateDecelerateInterpolator;
    localghz2.a();
    ghz localghz3 = localghx1.b(300L);
    localghz3.a = (0.9F * k);
    localghz3.a();
    localghx1.b(100L).a();
    ghz localghz4 = localghx1.b(50L);
    localghz4.a = (0.92F * k);
    localghz4.a();
    ghz localghz5 = localghx1.a(0.0F, 1.5F * j, 780L);
    localghz5.b = localAccelerateDecelerateInterpolator;
    localghz5.a = k;
    localghz5.a();
    ghz localghz6 = localghx1.b(150L);
    localghz6.a = (0.3F * k);
    localghz6.a();
    localArrayList.add(localghx1.a());
    ghx localghx2 = new ghx(1001, k);
    localghx2.a(l1).a(0.3F * k).a(m, localRect1.top);
    ghz localghz7 = localghx2.b(150L);
    localghz7.a = k;
    localghz7.a();
    ghz localghz8 = localghx2.b(m, n + localRect1.top, 1100L);
    localghz8.b = localAccelerateDecelerateInterpolator;
    localghz8.a();
    ghz localghz9 = localghx2.b(300L);
    localghz9.a = (0.9F * k);
    localghz9.a();
    localghx2.b(100L).a();
    ghz localghz10 = localghx2.b(50L);
    localghz10.a = (0.92F * k);
    localghz10.a();
    ghz localghz11 = localghx2.a(0.0F, -1.5F * j, 780L);
    localghz11.b = localAccelerateDecelerateInterpolator;
    localghz11.a = k;
    localghz11.a();
    ghz localghz12 = localghx2.b(150L);
    localghz12.a = (0.3F * k);
    localghz12.a();
    ghw localghw1 = localghx2.a();
    localArrayList.add(localghw1);
    long l2 = 1300L + localghw1.b();
    int i1 = (localRect1.bottom + localRect1.centerY()) / 2;
    int i2 = localRect1.top;
    ghx localghx3 = new ghx(1000, k);
    localghx3.a(l2).a(0.3F * k).a(localRect1.left, i1);
    ghz localghz13 = localghx3.b(150L);
    localghz13.a = k;
    localghz13.a();
    ghz localghz14 = localghx3.b(localRect1.right, i1, 1200L);
    localghz14.b = localAccelerateDecelerateInterpolator;
    localghz14.a();
    ghz localghz15 = localghx3.b(300L);
    localghz15.a = (0.9F * k);
    localghz15.a();
    localghx3.b(100L).a();
    ghz localghz16 = localghx3.b(50L);
    localghz16.a = (0.92F * k);
    localghz16.a();
    ghz localghz17 = localghx3.a(-1.5F * j, 0.0F, 720L);
    localghz17.b = localDecelerateInterpolator;
    localghz17.a = k;
    localghz17.a();
    ghz localghz18 = localghx3.b(150L);
    localghz18.a = (0.3F * k);
    localghz18.a();
    localArrayList.add(localghx3.a());
    ghx localghx4 = new ghx(1001, k);
    localghx4.a(l2).a(0.3F * k).a(localRect1.right, i2);
    ghz localghz19 = localghx4.b(150L);
    localghz19.a = k;
    localghz19.a();
    ghz localghz20 = localghx4.b(localRect1.left, i2, 1200L);
    localghz20.b = localAccelerateDecelerateInterpolator;
    localghz20.a();
    ghz localghz21 = localghx4.b(300L);
    localghz21.a = (0.9F * k);
    localghz21.a();
    localghx4.b(100L).a();
    ghz localghz22 = localghx4.b(50L);
    localghz22.a = (0.92F * k);
    localghz22.a();
    ghz localghz23 = localghx4.a(1.5F * j, 0.0F, 720L);
    localghz23.b = localDecelerateInterpolator;
    localghz23.a = k;
    localghz23.a();
    ghz localghz24 = localghx4.b(150L);
    localghz24.a = (0.3F * k);
    localghz24.a();
    ghw localghw2 = localghx4.a();
    localArrayList.add(localghw2);
    long l3 = localghw2.b();
    Iterator localIterator = super.y().iterator();
    while (localIterator.hasNext())
    {
      ghw localghw3 = (ghw)localIterator.next();
      localArrayList.add(new ghx(localghw3).a(l3 + localghw3.a()).a());
    }
    return localArrayList;
  }
  
  protected final FilterParameter z()
  {
    FilterParameter localFilterParameter = super.z();
    this.as = M().h.getPostRotation();
    float f = (float)Math.toRadians(efj.e(this.as));
    if (f != 0.0F) {
      localFilterParameter.a(18, Float.valueOf(1000000.0F * -f));
    }
    return localFilterParameter;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amm
 * JD-Core Version:    0.7.0.1
 */