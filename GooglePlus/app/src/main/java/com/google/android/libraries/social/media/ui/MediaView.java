package com.google.android.libraries.social.media.ui;

import aau;
import aaw;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;
import aq;
import at;
import efj;
import iag;
import ick;
import ife;
import ifh;
import ifj;
import ioy;
import ioz;
import ipb;
import ipf;
import iph;
import ipm;
import iqj;
import iqk;
import iql;
import iqm;
import iqn;
import iqo;
import iqp;
import iqq;
import iqr;
import iqs;
import kaz;
import kbb;
import lwo;
import lxj;
import lxz;
import mbb;
import mfx;
import mfz;
import rgr;

public class MediaView
  extends View
  implements at, ifh, kbb, lxj, lxz
{
  private static iqq U;
  private static final iag<Paint> V = new iqj();
  private static Interpolator a;
  private static int b;
  private static int c;
  private static final RectF d = new RectF();
  private static iqm e;
  private static iqm f;
  private static iqq g;
  private static iqq h;
  public static ipb i;
  public static iqm j;
  public static iqs k;
  public Matrix A;
  public boolean B;
  public Bitmap C;
  public Drawable D;
  public int E = -1;
  public iqp F;
  public boolean G;
  public boolean H = true;
  public ProgressBar I;
  public boolean J;
  public int K;
  public int L;
  public int M;
  public float N;
  public boolean O = false;
  public boolean P = false;
  public int Q = iqr.a;
  public int R = -1;
  public boolean S = true;
  public boolean T = true;
  private iql W;
  private boolean aA = false;
  private boolean aB = false;
  private int aC = -1;
  private int aD = -1;
  private iqn aE;
  private boolean aa;
  private boolean ab;
  private long ac;
  private ioy ad;
  private boolean ae;
  private boolean af;
  private final Rect ag = new Rect();
  private final Rect ah = new Rect();
  private final RectF ai = new RectF();
  private final RectF aj = new RectF();
  private final Matrix ak = new Matrix();
  private final Matrix al = new Matrix();
  private Drawable am;
  private Bitmap an;
  private int ao;
  private int ap;
  private Drawable aq;
  private int ar;
  private int as;
  private String at;
  private int au;
  private int av;
  private int aw;
  private int ax;
  private int ay;
  private int az;
  public iph l;
  public boolean m;
  public boolean n;
  public boolean o = true;
  public Drawable p;
  public Drawable q;
  public Drawable r;
  public int s = -1;
  public ipf t;
  public int u;
  public boolean v;
  public int w = 1;
  public Matrix x;
  public Matrix y;
  public Matrix z;
  
  public MediaView(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public MediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private static String a(String paramString1, String paramString2)
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      efj.a(localStringBuilder, new CharSequence[] { paramString1, paramString2 });
      return mfx.b(localStringBuilder);
    }
  }
  
  @TargetApi(16)
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Resources localResources = paramContext.getResources();
    if (i == null)
    {
      i = (ipb)mbb.a(paramContext, ipb.class);
      b = localResources.getDimensionPixelSize(efj.PC);
      c = localResources.getDimensionPixelSize(efj.PB);
      e = new iqm(localResources, aaw.oU);
      f = new iqm(localResources, aaw.oV);
      j = new iqm(localResources, aaw.oS);
      k = new iqs(localResources);
      g = new iqq(localResources.getColor(aau.Al));
      h = new iqq(1728053247);
      U = new iqq(localResources.getColor(aau.Ak));
    }
    this.C = ((Bitmap)j.b());
    this.am = localResources.getDrawable(aaw.oT);
    this.am.setCallback(this);
    this.N = 0.4F;
    String str1;
    String str2;
    if (paramAttributeSet != null)
    {
      str1 = paramAttributeSet.getAttributeValue(null, "size");
      if (str1 != null)
      {
        if (!"custom".equals(str1)) {
          break label313;
        }
        this.s = 0;
      }
      str2 = paramAttributeSet.getAttributeValue(null, "scale");
      if (str2 != null) {
        if (!"zoom".equals(str2)) {
          break label439;
        }
      }
    }
    for (this.w = 1;; this.w = 0)
    {
      lwo.g(this);
      ioz localioz = (ioz)mbb.b(paramContext, ioz.class);
      if ((localioz == null) || (!localioz.a())) {
        break label508;
      }
      iqo localiqo = (iqo)mbb.b(paramContext, iqo.class);
      if (localiqo != null) {
        this.aE = localiqo.a(paramContext);
      }
      return;
      label313:
      if ("thumbnail".equals(str1))
      {
        this.s = 2;
        break;
      }
      if ("large".equals(str1))
      {
        this.s = 3;
        break;
      }
      if ("full".equals(str1))
      {
        this.s = 1;
        break;
      }
      if ("original".equals(str1))
      {
        this.s = 4;
        break;
      }
      String str5 = String.valueOf(str1);
      if (str5.length() != 0) {}
      for (String str6 = "Invalid size category: ".concat(str5);; str6 = new String("Invalid size category: ")) {
        throw new IllegalArgumentException(str6);
      }
      label439:
      if (!"fit".equals(str2)) {
        break label458;
      }
    }
    label458:
    String str3 = String.valueOf(str2);
    if (str3.length() != 0) {}
    for (String str4 = "Invalid scale mode: ".concat(str3);; str4 = new String("Invalid scale mode: ")) {
      throw new IllegalArgumentException(str4);
    }
    label508:
    this.aE = null;
  }
  
  private final void a(Canvas paramCanvas, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {}
    do
    {
      return;
      if ((this.ag.isEmpty()) || (this.B)) {
        c(paramInt1, paramInt2);
      }
      if (this.x != null)
      {
        paramCanvas.drawBitmap(paramBitmap, this.x, (Paint)V.b());
        return;
      }
      if (this.z != null) {
        paramCanvas.concat(this.z);
      }
      paramCanvas.drawBitmap(paramBitmap, this.ag, this.ah, (Paint)V.b());
    } while (this.z == null);
    paramCanvas.concat(this.A);
  }
  
  private final void a(Canvas paramCanvas, Drawable paramDrawable)
  {
    if (!c(paramDrawable))
    {
      if (this.ab)
      {
        paramCanvas.drawBitmap(this.C, this.ay, this.az, null);
        return;
      }
      b(paramCanvas, this.r);
      return;
    }
    int i1 = paramDrawable.getIntrinsicWidth();
    int i2 = paramDrawable.getIntrinsicHeight();
    if ((this.ag.isEmpty()) || (this.B))
    {
      c(i1, i2);
      this.B = false;
    }
    paramDrawable.setBounds(0, 0, i1, i2);
    if (this.x != null)
    {
      paramCanvas.concat(this.x);
      paramDrawable.draw(paramCanvas);
      paramCanvas.concat(this.y);
      return;
    }
    paramCanvas.concat(this.ak);
    if (this.z != null) {
      paramCanvas.concat(this.z);
    }
    paramDrawable.draw(paramCanvas);
    if (this.z != null) {
      paramCanvas.concat(this.A);
    }
    paramCanvas.concat(this.al);
  }
  
  private final void b(Canvas paramCanvas, Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      paramDrawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
      paramDrawable.draw(paramCanvas);
    }
  }
  
  private final void c(int paramInt1, int paramInt2)
  {
    int i1 = getPaddingTop();
    int i2 = getPaddingRight();
    int i3 = getPaddingBottom();
    int i4 = getPaddingLeft();
    int i5 = getWidth() - i4 - i2;
    int i6 = getHeight() - i1 - i3;
    float f1 = paramInt1 / paramInt2;
    float f2 = i5 / i6;
    switch (this.w)
    {
    }
    for (;;)
    {
      this.aj.set(this.ag);
      this.ai.set(this.ah);
      this.ak.setRectToRect(this.aj, this.ai, Matrix.ScaleToFit.FILL);
      if (!this.ak.invert(this.al)) {
        this.al.reset();
      }
      return;
      this.ag.set(0, 0, paramInt1, paramInt2);
      if (f1 > f2)
      {
        int i11 = (i6 - (int)(i5 / f1)) / 2;
        this.ah.set(i4, i1 + i11, i5 + i4, i1 + i6 - i11);
      }
      else
      {
        int i10 = (i5 - (int)(f1 * i6)) / 2;
        this.ah.set(i4 + i10, i1, i5 + i4 - i10, i6 + i1);
        continue;
        if (f1 > f2)
        {
          int i9 = (paramInt1 - (int)(f2 * paramInt2)) / 2;
          this.ag.set(i9, 0, paramInt1 - i9, paramInt2);
        }
        for (;;)
        {
          this.ah.set(i4, i1, i5 + i4, i6 + i1);
          break;
          int i7 = (int)(paramInt1 / f2);
          int i8 = Math.max((int)(paramInt2 * this.N) - i7 / 2, 0);
          this.ag.set(0, i8, paramInt1, i7 + i8);
        }
        this.ag.set(0, 0, paramInt1, paramInt2);
        this.ah.set(0, 0, i5, i6);
      }
    }
  }
  
  private static boolean c(Drawable paramDrawable)
  {
    if (paramDrawable == null) {}
    while (((paramDrawable instanceof ick)) && (!((ick)paramDrawable).a())) {
      return false;
    }
    return true;
  }
  
  private final void d()
  {
    if ((!this.aB) || (this.O)) {}
    for (;;)
    {
      return;
      if ((0x4 & this.u) != 0) {}
      for (int i1 = 1; (i1 != 0) && ((p()) || (t())); i1 = 0)
      {
        if (this.W == null) {
          this.W = new iql(this);
        }
        this.W.a = this.aa;
        this.W.b();
        return;
      }
    }
  }
  
  private boolean t()
  {
    return (this.t != null) && (ipm.b.equals(this.t.e));
  }
  
  public void D_()
  {
    j();
    a(null);
    this.aa = false;
    setContentDescription(null);
    this.at = null;
    if (this.aE != null) {
      this.aE.a();
    }
  }
  
  public final Bitmap a(int paramInt1, int paramInt2)
  {
    return i.a.b(paramInt1, paramInt2);
  }
  
  public final iph a(int paramInt1, int paramInt2, kbb paramkbb)
  {
    if (this.s == 0)
    {
      int i1;
      if ((this.ar != 0) || (this.as != 0)) {
        i1 = this.ar;
      }
      for (int i2 = this.as;; i2 = getHeight())
      {
        iph localiph;
        if (i1 == 0)
        {
          localiph = null;
          if (i2 == 0) {}
        }
        else
        {
          localiph = i.a(this.t, 0, i1, i2, paramInt2, null, this.ad, paramInt1, paramkbb);
        }
        return localiph;
        i1 = getWidth();
      }
    }
    return i.a(this.t, this.s, getWidth(), getHeight(), -1, null, this.ad, paramInt1, paramkbb);
  }
  
  public final void a(int paramInt)
  {
    this.R = 1;
    if ((this.R >= 0) && ((this.D instanceof ick))) {
      ((ick)this.D).L = this.R;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      e(0x4 | this.u);
      return;
    }
    e(0xFFFFFFFB & this.u);
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    if (q()) {
      post(new iqk(this, paramLong1, paramLong2));
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    i.a.a(paramBitmap);
  }
  
  public void a(Canvas paramCanvas)
  {
    if (c(this.D)) {
      a(paramCanvas, this.D);
    }
    do
    {
      return;
      if (o())
      {
        Bitmap localBitmap = this.l.j();
        int i1 = ife.b(this.l.p);
        iph localiph = this.l;
        a(paramCanvas, localBitmap, i1, localiph.k());
        return;
      }
      if (this.an != null)
      {
        a(paramCanvas, this.an, this.ao, this.ap);
        return;
      }
    } while (this.q == null);
    a(paramCanvas, this.q);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.am = paramDrawable;
    if (this.am != null) {
      this.am.setCallback(this);
    }
  }
  
  public void a(ipf paramipf)
  {
    a(paramipf, null, true);
  }
  
  public final void a(ipf paramipf, ioy paramioy, boolean paramBoolean)
  {
    if ((this.t != null) && (this.t.equals(paramipf)))
    {
      ioy localioy = this.ad;
      boolean bool;
      if ((localioy == null) && (paramioy == null)) {
        bool = true;
      }
      while (bool)
      {
        return;
        if (((localioy == null) && (paramioy != null)) || ((localioy != null) && (paramioy == null))) {
          bool = false;
        } else {
          bool = localioy.a(paramioy);
        }
      }
    }
    this.ae = paramBoolean;
    this.ad = paramioy;
    j();
    this.t = paramipf;
    if (this.t != null) {
      this.m = false;
    }
    b();
    invalidate();
  }
  
  public final void a(kaz paramkaz)
  {
    switch (paramkaz.q)
    {
    }
    for (;;)
    {
      if ((this.F != null) && (this.aB)) {
        this.F.a(this);
      }
      invalidate();
      return;
      if ((this.I != null) && (q()))
      {
        ((ife)paramkaz).e = this;
        this.I.setIndeterminate(true);
        this.aA = true;
        continue;
        this.ag.setEmpty();
        if ((this.ac != 0L) && (System.currentTimeMillis() - this.ac > 100L) && (this.n)) {
          if (Build.VERSION.SDK_INT < 14) {
            break label241;
          }
        }
        label241:
        for (int i1 = 1;; i1 = 0)
        {
          if (i1 != 0)
          {
            if (a == null) {
              a = new DecelerateInterpolator();
            }
            setAlpha(0.01F);
            animate().alpha(1.0F).setDuration(500L).setInterpolator(a);
          }
          this.ac = 0L;
          this.aB = true;
          this.aA = false;
          d();
          b(paramkaz);
          if (p()) {
            break;
          }
          h();
          break;
        }
        this.aA = false;
        this.aB = true;
      }
    }
  }
  
  public final void ap_()
  {
    j();
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (!this.af)) {
      i();
    }
  }
  
  public final void b(int paramInt)
  {
    if (paramInt != this.w)
    {
      this.w = paramInt;
      this.ag.setEmpty();
      invalidate();
    }
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    if ((this.ar != paramInt1) || (this.as != paramInt2))
    {
      j();
      this.ar = paramInt1;
      this.as = paramInt2;
      b();
    }
  }
  
  public final void b(Drawable paramDrawable)
  {
    if (this.aq != paramDrawable)
    {
      this.aq = paramDrawable;
      invalidate();
    }
  }
  
  public void b(kaz paramkaz) {}
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean != this.ab)
    {
      this.ab = paramBoolean;
      invalidate();
    }
  }
  
  public final void c(int paramInt)
  {
    if (paramInt == 0) {}
    for (Drawable localDrawable = null;; localDrawable = getResources().getDrawable(paramInt))
    {
      this.p = localDrawable;
      return;
    }
  }
  
  public final void c(boolean paramBoolean)
  {
    if (TextUtils.isEmpty(this.at)) {
      this.at = ((String)getContentDescription());
    }
    this.aa = paramBoolean;
    if (!this.aa)
    {
      setContentDescription(a(this.at, getResources().getString(efj.PD)));
      d();
      return;
    }
    setContentDescription(a(this.at, getResources().getString(efj.PE)));
  }
  
  public final void d(int paramInt)
  {
    if (paramInt == 0) {}
    for (Drawable localDrawable = null;; localDrawable = getResources().getDrawable(paramInt))
    {
      this.q = localDrawable;
      return;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.am != null)
    {
      if ((!isPressed()) && (!isFocused())) {
        break label52;
      }
      this.am.setBounds(0, 0, getWidth(), getHeight());
      this.am.draw(paramCanvas);
    }
    label52:
    while (!isSelected()) {
      return;
    }
    this.am.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    this.am.draw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    if (this.am != null)
    {
      this.am.setState(getDrawableState());
      invalidate();
    }
    super.drawableStateChanged();
  }
  
  public final void e(int paramInt)
  {
    int i1 = 1;
    int i2;
    if ((0x4 & this.u) != 0)
    {
      i2 = i1;
      if ((paramInt & 0x4) == 0) {
        break label43;
      }
      label19:
      this.u = paramInt;
      if (i2 != i1)
      {
        if (i1 == 0) {
          break label48;
        }
        d();
      }
    }
    label43:
    label48:
    while ((this.O) || (this.W == null))
    {
      return;
      i2 = 0;
      break;
      i1 = 0;
      break label19;
    }
    this.W.ap_();
  }
  
  public boolean e()
  {
    return !this.H;
  }
  
  public final void f()
  {
    if ((this.I == null) && (this.Q != iqr.a)) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        this.I = new ProgressBar(new ContextThemeWrapper(getContext(), efj.PF), null, 0);
        requestLayout();
      }
      return;
    }
  }
  
  public final void g()
  {
    if ((this.D instanceof ick))
    {
      ick localick = (ick)this.D;
      if ((localick.k) && (localick.L > 0))
      {
        localick.b();
        localick.k = false;
        localick.M = 0;
        localick.run();
      }
    }
  }
  
  public final void h()
  {
    if (!TextUtils.isEmpty(this.at)) {
      setContentDescription(this.at);
    }
  }
  
  public void i()
  {
    if (this.s == -1)
    {
      String str1 = String.valueOf(lwo.b(this));
      if (str1.length() != 0) {}
      for (String str2 = "Size category is not set: ".concat(str1);; str2 = new String("Size category is not set: ")) {
        throw new IllegalStateException(str2);
      }
    }
    if ((this.s == 5) && (getWidth() == 0) && (getHeight() == 0)) {}
    do
    {
      return;
      this.ac = System.currentTimeMillis();
      this.ag.setEmpty();
      if (this.t == null) {
        break;
      }
      int i1 = 0xFFFFFFFB & (0x200 | this.u);
      if (this.T) {
        i1 |= 0x40;
      }
      f();
      this.l = a(i1, this.E, this);
    } while (this.aE == null);
    this.aE.a(this.l);
    return;
    this.an = null;
    k();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.D)
    {
      invalidate();
      return;
    }
    super.invalidateDrawable(paramDrawable);
  }
  
  public void j()
  {
    if ((!this.ae) && (o()))
    {
      this.an = this.l.j();
      this.ao = ife.b(this.l.p);
      iph localiph = this.l;
      this.ap = localiph.k();
    }
    if (this.l != null)
    {
      this.l.b(this);
      this.l = null;
    }
    if (this.W != null) {
      this.W.ap_();
    }
    k();
    this.ag.setEmpty();
    this.aB = false;
    this.O = false;
  }
  
  @TargetApi(11)
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    if (this.D != null) {
      this.D.jumpToCurrentState();
    }
  }
  
  public final void k()
  {
    if (this.D == null) {
      return;
    }
    this.D.setCallback(null);
    if ((this.D instanceof lxj)) {
      ((lxj)this.D).D_();
    }
    while (!(this.D instanceof aq))
    {
      this.D = null;
      return;
    }
    aq localaq = (aq)this.D;
    if (localaq.d == null) {
      throw new IllegalStateException("BitmapProvider must be non-null");
    }
    for (;;)
    {
      synchronized (localaq.c)
      {
        localaq.a();
        Bitmap localBitmap1 = localaq.f;
        localaq.f = null;
        if (localaq.h != 2)
        {
          localBitmap2 = localaq.g;
          localaq.g = null;
          localaq.e = true;
          localaq.d.a(localBitmap1);
          if (localBitmap2 == null) {
            break;
          }
          localaq.d.a(localBitmap2);
        }
      }
      Bitmap localBitmap2 = null;
    }
  }
  
  public final void l()
  {
    if (this.v)
    {
      this.af = true;
      j();
    }
  }
  
  public final void m()
  {
    if (this.v)
    {
      this.af = false;
      b();
    }
  }
  
  public final boolean n()
  {
    return (this.l != null) && (this.l.q == 1);
  }
  
  public final boolean o()
  {
    return (n()) && (this.l.j() != null);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.af = false;
    b();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    j();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.G)
    {
      d.set(0.0F, 0.0F, getWidth(), getHeight());
      paramCanvas.saveLayerAlpha(d, 105, 31);
    }
    if ((c(this.D)) || (o()) || (this.an != null) || (this.m))
    {
      a(paramCanvas);
      if ((this.o) && (!this.m))
      {
        if (t()) {
          paramCanvas.drawBitmap((Bitmap)k.b(), this.L, this.M, null);
        }
      }
      else
      {
        if (this.G) {
          paramCanvas.restore();
        }
        if (this.aq != null)
        {
          this.aq.setBounds(0, 0, getWidth(), getHeight());
          this.aq.setFilterBitmap(true);
          this.aq.draw(paramCanvas);
        }
        if ((this.J) && (this.K != 0))
        {
          Paint localPaint = (Paint)U.b();
          localPaint.setAlpha(this.K);
          paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), localPaint);
        }
        if (e()) {
          paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), (Paint)h.b());
        }
        if ((this.aE != null) && (this.l != null)) {
          this.aE.a(paramCanvas, getWidth(), getHeight());
        }
        if ((this.I != null) && (q()))
        {
          if (!p()) {
            break label763;
          }
          if (!this.P) {}
        }
      }
    }
    label512:
    label514:
    for (;;)
    {
      paramCanvas.save();
      paramCanvas.translate(0.0F, getHeight() - this.I.getHeight());
      this.I.draw(paramCanvas);
      paramCanvas.restore();
      label455:
      label461:
      label763:
      do
      {
        return;
        int i1;
        if ((this.t != null) && (ipm.c.equals(this.t.e))) {
          i1 = 1;
        }
        for (;;)
        {
          if (i1 == 0) {
            break label461;
          }
          paramCanvas.drawBitmap((Bitmap)e.b(), this.aw, this.ax, null);
          break;
          if (this.l != null)
          {
            int i3 = this.l.s;
            if ((i3 == 4) || (i3 == 3)) {}
            for (int i4 = 1;; i4 = 0)
            {
              if (i4 == 0) {
                break label455;
              }
              i1 = 1;
              break;
            }
          }
          i1 = 0;
        }
        if (!p()) {
          break;
        }
        if ((0x4 & this.u) != 0) {}
        for (int i2 = 1;; i2 = 0)
        {
          if (i2 == 0) {
            break label512;
          }
          if (this.l.q != 5) {
            break label514;
          }
          b(paramCanvas, this.r);
          break;
        }
        break;
        if (this.O) {
          break;
        }
        if (!this.P) {
          paramCanvas.drawBitmap((Bitmap)k.b(), this.L, this.M, null);
        }
        Bitmap localBitmap = (Bitmap)f.b();
        paramCanvas.drawRect(this.au, this.av, this.au + localBitmap.getWidth(), this.av + localBitmap.getHeight(), (Paint)g.b());
        paramCanvas.drawBitmap(localBitmap, this.au, this.av, null);
        break;
        if (this.ab)
        {
          paramCanvas.drawBitmap(this.C, this.ay, this.az, null);
          break;
        }
        if (this.l != null) {
          switch (this.l.q)
          {
          case 1: 
          default: 
            break;
          case 0: 
          case 2: 
            b(paramCanvas, this.p);
            break;
          case 3: 
            b(paramCanvas, this.q);
            break;
          case 4: 
          case 5: 
          case 6: 
            b(paramCanvas, this.r);
            break;
          }
        }
        b(paramCanvas, this.p);
        break;
      } while (!this.aA);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    this.L = ((i1 - ((Bitmap)k.b()).getWidth()) / 2);
    this.M = ((i2 - ((Bitmap)k.b()).getHeight()) / 2);
    this.au = c;
    this.av = (i2 - ((Bitmap)f.b()).getHeight() - c);
    this.aw = ((i1 - ((Bitmap)e.b()).getWidth()) / 2);
    this.ax = ((i2 - ((Bitmap)e.b()).getHeight()) / 2);
    this.ay = ((i1 - this.C.getWidth()) / 2);
    this.az = ((i2 - this.C.getHeight()) / 2);
    int i3;
    if ((paramBoolean) && (i1 != this.aD) && (i2 != this.aC))
    {
      if (this.s != 0) {
        break label279;
      }
      if ((this.ar != 0) || (this.as != 0)) {
        break label273;
      }
      i3 = 1;
      if (i3 != 0)
      {
        j();
        b();
      }
    }
    for (;;)
    {
      this.ag.setEmpty();
      this.aD = i1;
      this.aC = i2;
      if (this.I != null) {
        this.I.layout(0, i2 - b, i1, i2);
      }
      return;
      label273:
      i3 = 0;
      break;
      label279:
      if (this.s == 5)
      {
        j();
        b();
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.I != null) {
      this.I.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824), View.MeasureSpec.makeMeasureSpec(b, 1073741824));
    }
  }
  
  public final boolean p()
  {
    return (this.t != null) && (ipm.d.equals(this.t.e));
  }
  
  public final boolean q()
  {
    return ((this.Q == iqr.c) && (p())) || (this.Q == iqr.b);
  }
  
  public final int r()
  {
    if (this.D != null) {
      return this.D.getIntrinsicWidth();
    }
    if (o()) {
      return ife.b(this.l.p);
    }
    if (this.an != null) {
      return this.ao;
    }
    if (this.q != null) {
      return this.q.getIntrinsicWidth();
    }
    return 0;
  }
  
  public final int s()
  {
    if (this.D != null) {
      return this.D.getIntrinsicHeight();
    }
    if (o())
    {
      iph localiph = this.l;
      return localiph.k();
    }
    if (this.an != null) {
      return this.ap;
    }
    if (this.q != null) {
      return this.q.getIntrinsicHeight();
    }
    return 0;
  }
  
  public void setSelected(boolean paramBoolean)
  {
    if (paramBoolean != isSelected())
    {
      super.setSelected(paramBoolean);
      if (this.am != null) {
        invalidate();
      }
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((paramDrawable == this.am) || (paramDrawable == this.D)) {
      return true;
    }
    return super.verifyDrawable(paramDrawable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.media.ui.MediaView
 * JD-Core Version:    0.7.0.1
 */