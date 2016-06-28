import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilmFilterParameter;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class alw
  extends ake
  implements gfd, gfe
{
  Animation Z;
  gen a;
  Animation aa;
  final List<ane> ah = new ArrayList();
  private LinearLayout ai;
  private FrameLayout aj;
  private gfb ak;
  private boolean al;
  private int am = -1;
  private int an;
  private int ao;
  private nc ap;
  private Animation.AnimationListener aq = new alx(this);
  private ParameterOverlayView ar;
  private ggs as;
  private amc at;
  HorizontalScrollView b;
  ViewPager c;
  boolean d;
  
  static String a(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt + 1);
    return String.format("%02d", arrayOfObject);
  }
  
  private final void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    if (paramBitmap2 == null) {
      return;
    }
    gfb localgfb = new gfb((byte)0);
    localgfb.a(paramBitmap1, paramBitmap2);
    this.a.a(localgfb);
    this.ak = localgfb;
    this.an = paramBitmap2.getWidth();
    this.ao = paramBitmap2.getHeight();
    this.ah.clear();
    this.ai.removeAllViews();
    Resources localResources = g();
    int i = localResources.getDimensionPixelSize(efj.ci);
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(localResources, BitmapHelper.createCenterCropBitmap(paramBitmap2, i, i, 0, 0, 0));
    int j = localResources.getDimensionPixelSize(efj.cj);
    C();
    boolean bool = ghv.b(this.bn);
    bp localbp = f();
    int k = 0;
    if (k < FilmFilterParameter.a.size())
    {
      ane localane = new ane(localbp, localBitmapDrawable, a(k));
      localane.setTag(Integer.valueOf(k));
      localane.setId(k + 1000);
      localane.setOnClickListener(new amb(this));
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i, i);
      localLayoutParams.leftMargin = (j / 2);
      localLayoutParams.rightMargin = (j / 2);
      if (bool) {
        this.ai.addView(localane, 0, localLayoutParams);
      }
      for (;;)
      {
        this.ah.add(localane);
        k++;
        break;
        this.ai.addView(localane, localLayoutParams);
      }
    }
    this.ap.d();
    int m = N().getParameterInteger(3);
    b(FilmFilterParameter.a.indexOf(Integer.valueOf(m)));
  }
  
  protected final void A()
  {
    super.A();
  }
  
  protected final gfb B()
  {
    return this.ak;
  }
  
  final void C()
  {
    int i = this.aj.getWidth();
    int j = this.aj.getHeight();
    if ((i == 0) || (j == 0)) {
      return;
    }
    int k = M().h.getPostRotation();
    int m;
    int n;
    Point localPoint;
    if ((k == 0) || (k == 2))
    {
      m = this.an;
      n = this.ao;
      localPoint = new Point();
      if ((i <= 0) || (j <= 0) || (m <= 0) || (n <= 0)) {
        localPoint.set(0, 0);
      }
    }
    for (;;)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(localPoint.x, localPoint.y);
      localLayoutParams.gravity = 17;
      this.a.setLayoutParams(localLayoutParams);
      O();
      return;
      if ((m <= i) && (n <= j))
      {
        localPoint.set(m, n);
      }
      else if (m / n >= i / j)
      {
        localPoint.x = Math.min(m, i);
        localPoint.y = (n * localPoint.x / m);
      }
      else
      {
        localPoint.y = Math.min(n, j);
        localPoint.x = (m * localPoint.y / n);
        continue;
        int i1 = this.ao;
        int i2 = this.an;
        localPoint = new Point();
        if ((i <= 0) || (j <= 0) || (i1 <= 0) || (i2 <= 0))
        {
          localPoint.set(0, 0);
        }
        else if ((i1 <= i) && (i2 <= j))
        {
          localPoint.set(i1, i2);
        }
        else if (i1 / i2 >= i / j)
        {
          localPoint.x = Math.min(i1, i);
          localPoint.y = (i2 * localPoint.x / i1);
        }
        else
        {
          localPoint.y = Math.min(i2, j);
          localPoint.x = (i1 * localPoint.y / i2);
        }
      }
    }
  }
  
  protected final gfg I()
  {
    return this.a;
  }
  
  protected final gfc K()
  {
    return this.a;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.bn).inflate(efj.go, paramViewGroup, false);
    if (localView == null) {
      throw new IllegalStateException("Failed to inflate the presets fragment");
    }
    this.aj = ((FrameLayout)localView.findViewById(efj.fN));
    this.b = ((HorizontalScrollView)localView.findViewById(efj.fX));
    this.ai = ((LinearLayout)this.b.findViewById(efj.fW));
    this.aj.addOnLayoutChangeListener(new aly(this));
    if (Build.VERSION.SDK_INT >= 17) {
      this.b.setLayoutDirection(0);
    }
    if (ghv.b(this.bn)) {
      this.b.addOnLayoutChangeListener(new alz(this));
    }
    this.c = ((ViewPager)localView.findViewById(efj.fF));
    this.ap = new amd(this);
    this.c.a(this.ap);
    bp localbp = f();
    this.Z = AnimationUtils.loadAnimation(localbp, efj.bO);
    this.Z.setAnimationListener(this.aq);
    this.aa = AnimationUtils.loadAnimation(localbp, efj.bN);
    this.aa.setAnimationListener(this.aq);
    this.c.o = new ama(this);
    this.ar = ((ParameterOverlayView)localView.findViewById(efj.fS));
    return localView;
  }
  
  public final void a(List<Bitmap> paramList)
  {
    if (!i()) {}
    for (;;)
    {
      return;
      if (paramList.size() != this.ah.size()) {
        throw new IllegalArgumentException("Wrong number of images for Preset Previews.");
      }
      Resources localResources = g();
      int i = localResources.getDimensionPixelSize(efj.ci);
      for (int j = 0; j < this.ah.size(); j++)
      {
        Bitmap localBitmap = (Bitmap)paramList.get(j);
        BitmapDrawable localBitmapDrawable = new BitmapDrawable(localResources, Bitmap.createBitmap(localBitmap, (localBitmap.getWidth() - i) / 2, (localBitmap.getHeight() - i) / 2, i, i, null, false));
        ((ane)this.ah.get(j)).a(localBitmapDrawable);
      }
    }
  }
  
  final void b(int paramInt)
  {
    if ((this.a == null) || (this.am == paramInt)) {
      return;
    }
    Iterator localIterator = this.ah.iterator();
    while (localIterator.hasNext())
    {
      ane localane = (ane)localIterator.next();
      if (((Integer)localane.getTag()).intValue() == paramInt)
      {
        localane.a = true;
        localane.invalidate();
        int i = this.b.getScrollX();
        int j = i + this.b.getWidth();
        if (localane.getLeft() < i)
        {
          int m = Math.min(localane.getLeft(), i - localane.getWidth());
          this.b.smoothScrollTo(m, this.b.getScrollY());
        }
        else if (localane.getRight() > j)
        {
          int k = Math.max(localane.getRight() - this.b.getWidth(), i + localane.getWidth());
          this.b.smoothScrollTo(k, this.b.getScrollY());
        }
      }
      else
      {
        localane.a = false;
        localane.invalidate();
      }
    }
    this.al = false;
    this.a.e = N();
    a(3, Integer.valueOf(((Integer)FilmFilterParameter.a.get(paramInt)).intValue()), false);
    efj.Cv.a((FilmFilterParameter)N(), 6);
    this.am = paramInt;
    this.c.a(paramInt, false);
    O();
  }
  
  protected final void g(boolean paramBoolean)
  {
    NativeCore.a.setCompare(paramBoolean);
    O();
  }
  
  public final void l_()
  {
    if (!i())
    {
      if (this.a != null)
      {
        this.a.c.add(this);
        this.a.requestRender();
      }
      return;
    }
    int i = g().getDimensionPixelSize(efj.ci);
    Bitmap localBitmap = this.ak.c();
    float f = localBitmap.getWidth() / localBitmap.getHeight();
    int k;
    if (f > 1.0F) {
      k = Math.round(f * i);
    }
    for (;;)
    {
      if (this.a != null) {
        this.a.a(this.ak, k, i, N(), 3, this);
      }
      if (this.as == null) {
        break;
      }
      this.as.a(true);
      return;
      int j = Math.round(i / f);
      k = i;
      i = j;
    }
  }
  
  public final void m()
  {
    super.m();
    this.a = new gen(f());
    this.a.setBackgroundColor(g().getColor(efj.bQ));
    this.a.c.add(this);
    this.aj.addView(this.a);
    this.ar.a(this.a);
    ParameterOverlayView localParameterOverlayView1 = this.ar;
    localParameterOverlayView1.a.clear();
    localParameterOverlayView1.invalidate();
    ParameterOverlayView localParameterOverlayView2 = this.ar;
    this.as = new ggs(localParameterOverlayView2);
    this.as.a(g().getColor(efj.bQ));
    ggs localggs1 = this.as;
    boolean bool;
    int i;
    int j;
    label152:
    ghq localghq;
    label192:
    aiq localaiq2;
    FilterChain localFilterChain;
    if (localggs1 != null)
    {
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
      if (i >= localParameterOverlayView2.a.size()) {
        break label322;
      }
      localghq = (ghq)localParameterOverlayView2.a.get(i);
      if (localghq.a != localggs1) {
        break label302;
      }
      aiq localaiq1 = M();
      a(localaiq1.c(), localaiq1.b());
      if (this.as != null)
      {
        localaiq2 = M();
        localFilterChain = localaiq2.h;
        if (localFilterChain == null) {
          break label418;
        }
      }
    }
    label418:
    for (float f = efj.e(localFilterChain.getPostRotation());; f = 0.0F)
    {
      ggs localggs2 = this.as;
      localggs2.a = f;
      localggs2.n.invalidate();
      this.as.a(localaiq2.c());
      this.a.e = N();
      C();
      return;
      bool = false;
      break;
      label302:
      if (localghq.b <= 0) {
        j = i + 1;
      }
      i++;
      break label152;
      label322:
      localParameterOverlayView2.a.add(j, new ghq(localggs1, 0));
      if (localParameterOverlayView2.b == null) {
        localParameterOverlayView2.b = new ghe();
      }
      ghe localghe = localParameterOverlayView2.b;
      if (localggs1 == null) {
        throw new IllegalArgumentException("Listener cannot be null");
      }
      if (!localghe.h.contains(localggs1)) {
        localghe.h.add(localggs1);
      }
      localParameterOverlayView2.invalidate();
      break label192;
    }
  }
  
  public final void n()
  {
    super.n();
    this.a.c();
    gen localgen = this.a;
    localgen.c.remove(this);
    localgen.d.remove(this);
    this.aj.removeView(this.a);
    this.a = null;
  }
  
  public final gxq v()
  {
    return new gxq(pjw.r);
  }
  
  public final int w()
  {
    return 200;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alw
 * JD-Core Version:    0.7.0.1
 */