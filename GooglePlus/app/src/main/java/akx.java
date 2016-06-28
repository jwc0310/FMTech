import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.photoeditor.views.ItemSelectorView;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class akx
  extends ake
  implements aln, ggp
{
  private View a;
  public FrameLayout ah;
  public View ai;
  public ParameterOverlayView aj;
  public TextView ak;
  public ggq al;
  public int am;
  public int an;
  public alm ao;
  public ggs ap;
  public ggm aq;
  public gfb ar;
  private FilterParameter b;
  private final Runnable c = new aky(this);
  
  private final void V()
  {
    Bitmap localBitmap = M().b();
    if (this.ap != null)
    {
      float f = efj.e(M().h.getPostRotation());
      ggs localggs = this.ap;
      localggs.a = f;
      localggs.n.invalidate();
      this.ap.a(localBitmap);
    }
  }
  
  private final String W()
  {
    if (X())
    {
      FilterParameter localFilterParameter = N();
      int i = localFilterParameter.getParameterInteger(localFilterParameter.getActiveParameterKey());
      if (i != 0) {}
      for (String str = "%+d";; str = "%d")
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(i);
        return String.format(str, arrayOfObject);
      }
    }
    return "";
  }
  
  private boolean X()
  {
    List localList = C();
    return (localList != null) && (!localList.isEmpty()) && (N().getActiveParameterKey() != 1000);
  }
  
  protected static Rect a(int paramInt, Bitmap paramBitmap)
  {
    float f = Math.min(Math.max(paramInt / paramBitmap.getWidth(), paramInt / paramBitmap.getHeight()), 1.0F);
    return new Rect(0, 0, Math.round(f * paramBitmap.getWidth()), Math.round(f * paramBitmap.getHeight()));
  }
  
  private void a(String paramString1, String paramString2)
  {
    alm localalm;
    if (this.ao != null)
    {
      localalm = this.ao;
      if ((localalm.a != null) && (localalm.b != null)) {
        break label27;
      }
    }
    label27:
    do
    {
      return;
      if (paramString1 != null) {
        localalm.a.setText(paramString1);
      }
    } while (paramString2 == null);
    localalm.b.setText(paramString2);
  }
  
  protected void A()
  {
    j(true);
    super.A();
  }
  
  protected gfb B()
  {
    aiq localaiq = M();
    if (localaiq == null) {
      return null;
    }
    if (this.ar == null) {
      this.ar = new gfb((byte)0);
    }
    this.ar.a(localaiq.c(), localaiq.b());
    return this.ar;
  }
  
  protected List<Integer> C()
  {
    return Collections.emptyList();
  }
  
  protected View F()
  {
    return new gen(f());
  }
  
  protected void G()
  {
    I().a(super.N());
  }
  
  protected void H()
  {
    ((gen)this.ai).c();
  }
  
  protected gfg I()
  {
    return (gen)this.ai;
  }
  
  protected gfh J()
  {
    return (gen)this.ai;
  }
  
  protected gfc K()
  {
    return (gen)this.ai;
  }
  
  protected void L()
  {
    aiq localaiq = M();
    if (localaiq == null) {
      return;
    }
    Resources localResources = g();
    int i = localResources.getDimensionPixelOffset(efj.bZ);
    int j = localResources.getDimensionPixelOffset(efj.ca);
    int k = localResources.getDimensionPixelOffset(efj.bX);
    int m = this.ah.getWidth() - (i << 1);
    int n = this.ah.getHeight() - j - k;
    if ((n == 1023) && (Build.MODEL.equals("Nexus 6"))) {
      n = 1022;
    }
    FilterChain localFilterChain = localaiq.h;
    int i1;
    int i2;
    int i3;
    Point localPoint;
    if (localFilterChain != null)
    {
      i1 = localFilterChain.getPostRotation();
      if ((i1 != 0) && (i1 != 2)) {
        break label374;
      }
      i2 = this.am;
      i3 = this.an;
      localPoint = new Point();
      if ((m > 0) && (n > 0) && (i2 > 0) && (i3 > 0)) {
        break label268;
      }
      localPoint.set(0, 0);
    }
    for (;;)
    {
      int i4 = (m - localPoint.x) / 2;
      int i5 = (n - localPoint.y) / 2;
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(localPoint.x, localPoint.y);
      localLayoutParams.leftMargin = (i + i4);
      localLayoutParams.topMargin = (j + i5);
      localLayoutParams.rightMargin = (i + i4);
      localLayoutParams.bottomMargin = (i5 + k);
      this.ai.setLayoutParams(localLayoutParams);
      return;
      i1 = 0;
      break;
      label268:
      if ((i2 <= m) && (i3 <= n))
      {
        localPoint.set(i2, i3);
      }
      else if (i2 / i3 >= m / n)
      {
        localPoint.x = Math.min(i2, m);
        localPoint.y = (i3 * localPoint.x / i2);
      }
      else
      {
        localPoint.y = Math.min(i3, n);
        localPoint.x = (i2 * localPoint.y / i3);
        continue;
        label374:
        int i6 = this.an;
        int i7 = this.am;
        localPoint = new Point();
        if ((m <= 0) || (n <= 0) || (i6 <= 0) || (i7 <= 0))
        {
          localPoint.set(0, 0);
        }
        else if ((i6 <= m) && (i7 <= n))
        {
          localPoint.set(i6, i7);
        }
        else if (i6 / i7 >= m / n)
        {
          localPoint.x = Math.min(i6, m);
          localPoint.y = (i7 * localPoint.x / i6);
        }
        else
        {
          localPoint.y = Math.min(i7, n);
          localPoint.x = (i6 * localPoint.y / i7);
        }
      }
    }
  }
  
  public final void Q()
  {
    alm localalm = this.ao;
    localalm.d = 0;
    localalm.Z[0].setVisibility(4);
    localalm.Z[1].setVisibility(4);
    localalm.Z[2].setVisibility(4);
    a(this.ao);
    R();
  }
  
  protected final void R()
  {
    if (X())
    {
      a(e(N().getActiveParameterKey()), W());
      return;
    }
    a("", "");
  }
  
  protected final void S()
  {
    if (this.ao == null) {}
    ItemSelectorView localItemSelectorView;
    do
    {
      return;
      localItemSelectorView = this.ao.c;
    } while (localItemSelectorView == null);
    localItemSelectorView.setVisibility(0);
  }
  
  final void T()
  {
    Bitmap localBitmap = M().b();
    if (localBitmap == null)
    {
      ((alu)f()).a(new alb(this), 100);
      return;
    }
    if (this.ap != null) {
      this.ap.a(false);
    }
    this.ai.setVisibility(4);
    this.am = localBitmap.getWidth();
    this.an = localBitmap.getHeight();
    e_();
    L();
    ((alu)f()).a(new alc(this), 10);
  }
  
  protected final void U()
  {
    if ((this.ao != null) && (this.ao.c != null)) {
      this.ao.c.setVisibility(4);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = LayoutInflater.from(this.bn).inflate(efj.gl, paramViewGroup, false);
    if (this.a == null) {
      throw new IllegalStateException("Failed to inflate the filter fragment");
    }
    this.a.setClickable(true);
    this.ah = ((FrameLayout)this.a.findViewById(efj.fZ));
    this.aj = ((ParameterOverlayView)this.a.findViewById(efj.fS));
    this.ak = ((TextView)this.a.findViewById(efj.fV));
    this.ah.addOnLayoutChangeListener(new akz(this));
    bz localbz = this.x;
    if (localbz == null) {
      throw new IllegalStateException("Failed to get fragment manager");
    }
    cl localcl = localbz.a();
    this.ao = new alm();
    localcl.b(efj.fG, this.ao, "ParameterPanelFragment");
    localcl.b();
    this.ao.aa = this;
    return this.a;
  }
  
  public void a(int paramInt)
  {
    if ((this.ao != null) && (this.ao.c != null)) {
      this.ao.c.setVisibility(4);
    }
  }
  
  protected final void a(ale paramale, boolean paramBoolean)
  {
    if (this.ao == null) {}
    for (;;)
    {
      return;
      ItemSelectorView localItemSelectorView = this.ao.c;
      if ((localItemSelectorView != null) && (localItemSelectorView.b != null))
      {
        amy localamy = localItemSelectorView.b;
        if ((localamy.e == null) || (paramale == null)) {}
        for (int i = 0; i != 0; i = 1)
        {
          return;
          Iterator localIterator = localamy.e.iterator();
          while (localIterator.hasNext())
          {
            ToolButton localToolButton = (ToolButton)localIterator.next();
            Integer localInteger = (Integer)localToolButton.getTag();
            if (!paramBoolean)
            {
              localamy.getContext();
              amy.a(localToolButton, paramale.a(localInteger));
              localToolButton.a(paramale.b(localInteger));
            }
            localToolButton.setSelected(paramale.c(localInteger));
          }
        }
      }
    }
  }
  
  protected void a(alm paramalm) {}
  
  protected final void a(anb paramanb, anc paramanc)
  {
    bp localbp = f();
    if ((localbp == null) || (this.ao == null)) {}
    LayoutInflater localLayoutInflater;
    ItemSelectorView localItemSelectorView1;
    do
    {
      return;
      localLayoutInflater = localbp.getLayoutInflater();
      localItemSelectorView1 = this.ao.c;
    } while (localItemSelectorView1 == null);
    localItemSelectorView1.c = new and(this, localLayoutInflater);
    if (localItemSelectorView1.b == null)
    {
      localItemSelectorView1.b = new amy(localItemSelectorView1, localItemSelectorView1.getContext());
      localItemSelectorView1.a.addView(localItemSelectorView1.b);
    }
    amy localamy = localItemSelectorView1.b;
    localamy.b.removeAllViews();
    Object localObject1;
    if (paramanb == null)
    {
      localObject1 = null;
      localamy.e = localObject1;
      if (paramanb == null) {
        break label655;
      }
      localamy.c.setVisibility(0);
      ToolButton localToolButton1 = localamy.f;
      int m = paramanb.b();
      if (m != 0)
      {
        Bitmap localBitmap = BitmapFactory.decodeResource(localToolButton1.getResources(), m);
        if (localBitmap != null)
        {
          Resources localResources = localToolButton1.getResources();
          StateListDrawable localStateListDrawable = new StateListDrawable();
          BitmapDrawable localBitmapDrawable1 = new BitmapDrawable(localResources, localBitmap);
          BitmapDrawable localBitmapDrawable2 = localToolButton1.a(localBitmapDrawable1, -8421505);
          localStateListDrawable.addState(new int[] { 16842913 }, localBitmapDrawable2);
          localStateListDrawable.addState(new int[] { 16842919 }, localBitmapDrawable2);
          localStateListDrawable.addState(new int[] { -16842910 }, localBitmapDrawable1);
          localStateListDrawable.addState(StateSet.WILD_CARD, localBitmapDrawable1);
          localToolButton1.a.setImageDrawable(localStateListDrawable);
        }
      }
      ToolButton localToolButton2 = localamy.f;
      localamy.getContext();
      localToolButton2.a(null);
      localamy.f.setVisibility(0);
    }
    for (;;)
    {
      localItemSelectorView1.b.d = paramanc;
      localItemSelectorView1.a.requestLayout();
      localItemSelectorView1.c = null;
      return;
      Context localContext = localamy.getContext();
      int i = paramanb.a();
      ArrayList localArrayList = new ArrayList(i);
      int j = 1000;
      int k = 0;
      if (k < i)
      {
        Integer localInteger = paramanb.a(k);
        ItemSelectorView localItemSelectorView2;
        ToolButton localToolButton3;
        label413:
        int n;
        Object localObject2;
        LinearLayout.LayoutParams localLayoutParams1;
        if (localInteger != null)
        {
          localItemSelectorView2 = localamy.h;
          if (localItemSelectorView2.c != null)
          {
            localToolButton3 = localItemSelectorView2.c.a();
            n = j + 1;
            localToolButton3.setId(j);
            amy.a(localToolButton3, paramanb.a(localInteger));
            localToolButton3.a(paramanb.b(localInteger));
            localToolButton3.setTag(localInteger);
            localToolButton3.setSelected(paramanb.c(localInteger));
            localToolButton3.setOnClickListener(localamy.g);
            localArrayList.add(localToolButton3);
            LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            localLayoutParams2.gravity = 16;
            localToolButton3.setPadding(localamy.a / 2, localamy.a, localamy.a / 2, localamy.a);
            localObject2 = localToolButton3;
            localLayoutParams1 = localLayoutParams2;
          }
        }
        for (;;)
        {
          localamy.b.addView((View)localObject2, localLayoutParams1);
          k++;
          j = n;
          break;
          localToolButton3 = new ToolButton(localContext);
          int i1 = localItemSelectorView2.d;
          localToolButton3.b.setTextAppearance(localToolButton3.getContext(), i1);
          break label413;
          localLayoutParams1 = new LinearLayout.LayoutParams(2, -2);
          localObject2 = new View(localamy.getContext());
          ((View)localObject2).setBackgroundColor(-14277082);
          n = j;
        }
      }
      localObject1 = localArrayList;
      break;
      label655:
      localamy.c.setVisibility(8);
      localamy.f.setVisibility(8);
    }
  }
  
  protected final void a(FilterParameter paramFilterParameter, Bitmap paramBitmap)
  {
    j(false);
    super.a(paramFilterParameter, paramBitmap);
  }
  
  protected void a(ParameterOverlayView paramParameterOverlayView)
  {
    this.al = new alf(this);
    this.al.a(N(), C());
    this.aq = new ggm(paramParameterOverlayView);
    ggm localggm1 = this.aq;
    localggm1.g = this.al;
    localggm1.l.clear();
    this.aq.h = this;
    ggm localggm2 = this.aq;
    boolean bool;
    int i;
    int j;
    label93:
    ghq localghq;
    if (localggm2 != null)
    {
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
      if (i >= paramParameterOverlayView.a.size()) {
        break label198;
      }
      localghq = (ghq)paramParameterOverlayView.a.get(i);
      if (localghq.a != localggm2) {
        break label178;
      }
    }
    for (;;)
    {
      this.ap = new ggs(paramParameterOverlayView);
      this.ap.a(g().getColor(efj.bQ));
      paramParameterOverlayView.a(this.ap, 0);
      return;
      bool = false;
      break;
      label178:
      if (localghq.b <= 0) {
        j = i + 1;
      }
      i++;
      break label93;
      label198:
      paramParameterOverlayView.a.add(j, new ghq(localggm2, 0));
      if (paramParameterOverlayView.b == null) {
        paramParameterOverlayView.b = new ghe();
      }
      ghe localghe = paramParameterOverlayView.b;
      if (localggm2 == null) {
        throw new IllegalArgumentException("Listener cannot be null");
      }
      if (!localghe.h.contains(localggm2)) {
        localghe.h.add(localggm2);
      }
      paramParameterOverlayView.invalidate();
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    FilterParameter localFilterParameter = N();
    this.b = localFilterParameter.c();
    List localList = C();
    if ((localList != null) && (!localList.isEmpty()))
    {
      localFilterParameter.setActiveParameterKey(((Integer)localList.get(0)).intValue());
      if (this.ao != null) {
        this.ao.v();
      }
    }
  }
  
  public boolean a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    if (!super.a(paramInt, paramObject, paramBoolean)) {
      return false;
    }
    FilterParameter localFilterParameter1 = N();
    String str3;
    String str1;
    if ((X()) && (paramInt == localFilterParameter1.getActiveParameterKey()))
    {
      a(null, W());
      if (X())
      {
        FilterParameter localFilterParameter2 = N();
        int i = localFilterParameter2.getActiveParameterKey();
        String str2 = e(i);
        int j = localFilterParameter2.getParameterInteger(i);
        if (j != 0)
        {
          str3 = "%s %+d";
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = str2;
          arrayOfObject[1] = Integer.valueOf(j);
          str1 = String.format(str3, arrayOfObject);
        }
      }
    }
    for (;;)
    {
      if ((str1 != null) && (!str1.isEmpty()))
      {
        this.ak.setText(str1);
        alu localalu = (alu)f();
        localalu.a(this.c);
        this.ak.setVisibility(0);
        localalu.a(this.c, 333);
      }
      return true;
      str3 = "%s %d";
      break;
      str1 = "";
      continue;
      str1 = a(paramInt, paramObject);
    }
  }
  
  public void b(int paramInt) {}
  
  protected void b(boolean paramBoolean)
  {
    N().a(this.b);
    if (this.ao != null) {
      this.ao.v();
    }
    O();
  }
  
  public void c(int paramInt)
  {
    if ((this.ao != null) && (this.ao.c != null)) {
      this.ao.c.setVisibility(4);
    }
    N().setActiveParameterKey(this.al.g(paramInt));
    R();
  }
  
  public void c(int paramInt, Object paramObject)
  {
    a(this.al.g(paramInt), paramObject, true);
  }
  
  public final void d_()
  {
    super.d_();
    this.ao.aa = null;
    this.ao = null;
  }
  
  protected void e_()
  {
    V();
    gen localgen = (gen)this.ai;
    ala localala = new ala(this);
    localgen.c.add(localala);
    localgen.a(B());
  }
  
  protected final void g(boolean paramBoolean)
  {
    NativeCore.a.setCompare(paramBoolean);
    O();
  }
  
  protected final void j(boolean paramBoolean)
  {
    View localView = this.a.findViewById(efj.ga);
    if (paramBoolean) {}
    for (int i = 0;; i = 4)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void m()
  {
    super.m();
    this.ai = F();
    this.ai.setVisibility(4);
    this.ah.addView(this.ai, new FrameLayout.LayoutParams(-1, -1));
    L();
    G();
    if (this.aj != null)
    {
      this.aj.a(this.ai);
      ParameterOverlayView localParameterOverlayView = this.aj;
      localParameterOverlayView.a.clear();
      localParameterOverlayView.invalidate();
      a(this.aj);
    }
    j(true);
    efj.a(f());
    R();
    T();
  }
  
  public void n()
  {
    super.n();
    V();
    H();
    this.ah.removeView(this.ai);
    this.ai = null;
  }
  
  protected boolean x()
  {
    return true;
  }
  
  protected List<ghw> y()
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
    long l1 = localResources.getInteger(efj.gf);
    int m = Math.min(localRect1.right, (localRect3.right + localRect1.right) / 2);
    ghx localghx1 = new ghx(1000, k);
    localghx1.a(l1).a(0.3F * k).a(m, localRect1.bottom);
    ghz localghz1 = localghx1.b(150L);
    localghz1.a = k;
    localghz1.a();
    ghz localghz2 = localghx1.b(m, localRect1.top, 1100L);
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
    ghw localghw = localghx1.a();
    long l2 = 1300L + localghw.b();
    int n = (localRect1.bottom + localRect1.centerY()) / 2;
    ghx localghx2 = new ghx(1000, k);
    localghx2.a(l2).a(0.3F * k).a(localRect1.left, n);
    ghz localghz7 = localghx2.b(150L);
    localghz7.a = k;
    localghz7.a();
    ghz localghz8 = localghx2.b(localRect1.right, n, 1200L);
    localghz8.b = localAccelerateDecelerateInterpolator;
    localghz8.a();
    ghz localghz9 = localghx2.b(300L);
    localghz9.a = (0.9F * k);
    localghz9.a();
    localghx2.b(100L).a();
    ghz localghz10 = localghx2.b(50L);
    localghz10.a = (0.92F * k);
    localghz10.a();
    ghz localghz11 = localghx2.a(-1.5F * j, 0.0F, 720L);
    localghz11.b = localDecelerateInterpolator;
    localghz11.a = k;
    localghz11.a();
    ghz localghz12 = localghx2.b(150L);
    localghz12.a = (0.3F * k);
    localghz12.a();
    return Arrays.asList(new ghw[] { localghw, localghx2.a() });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akx
 * JD-Core Version:    0.7.0.1
 */