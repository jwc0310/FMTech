package com.google.android.apps.plus.views;

import aau;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import atu;
import aud;
import com.google.android.libraries.social.media.ui.MediaView;
import cpa;
import dvt;
import dvu;
import dxl;
import dyd;
import dye;
import dyg;
import dyh;
import efj;
import hch;
import isp;
import isq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import jeo;
import jer;
import lwj;
import lwu;
import lyg;
import mbb;

public class PhotoTileView
  extends MediaView
  implements dvu, lyg
{
  private static boolean U;
  private static Paint V;
  private static TextPaint W;
  private static Bitmap aA;
  private static Bitmap aB;
  private static Bitmap aC;
  private static Bitmap aD;
  private static int aE;
  private static int aF;
  private static int aG;
  private static Rect aH;
  private static Rect aI;
  private static Paint aJ;
  private static Bitmap aK;
  private static int aL;
  private static TextPaint aa;
  private static Drawable ab;
  private static Drawable ac;
  private static Paint ad;
  private static Rect ae;
  private static int af;
  private static int ag;
  private static int ah;
  private static int ai;
  private static Bitmap aj;
  private static Drawable ak;
  private static Bitmap al;
  private static Paint am;
  private static Rect an;
  private static NinePatchDrawable ao;
  private static Rect ap;
  private static Rect aq;
  private static Bitmap ar;
  private static int as;
  private static Bitmap au;
  private static Paint av;
  private static Paint aw;
  private static Rect ax;
  private static Paint ay;
  private static NinePatchDrawable az;
  public isp a;
  private CharSequence aM;
  private CharSequence aN;
  private boolean aO;
  private hch aP = hch.a;
  private float aQ;
  private Set<lwu> aR = new HashSet();
  private lwu aS;
  private dyg aT;
  private int aU = 255;
  private long aV;
  private CharSequence aW;
  private final atu aX;
  private final jer<aud> aY;
  private final jer<atu> aZ;
  private dvt at;
  public boolean b;
  private final lwj ba;
  public boolean c;
  public boolean d;
  public int e;
  public final cpa f;
  public final aud g;
  public final dxl h;
  
  public PhotoTileView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PhotoTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.ba = ((lwj)mbb.a(paramContext, lwj.class));
    Resources localResources = paramContext.getApplicationContext().getResources();
    if (!U)
    {
      ab = new ColorDrawable(localResources.getColor(efj.jM));
      ac = localResources.getDrawable(efj.rj);
      al = efj.a(localResources, efj.rp);
      TextPaint localTextPaint1 = new TextPaint();
      W = localTextPaint1;
      localTextPaint1.setAntiAlias(true);
      W.setColor(localResources.getColor(efj.kq));
      W.setTextSize(localResources.getDimension(efj.nK));
      W.setTypeface(Typeface.DEFAULT_BOLD);
      lwj.a(W, efj.nK);
      TextPaint localTextPaint2 = new TextPaint();
      aa = localTextPaint2;
      localTextPaint2.setAntiAlias(true);
      aa.setColor(localResources.getColor(efj.kq));
      aa.setTextSize(localResources.getDimension(efj.nK));
      aa.setTypeface(Typeface.DEFAULT_BOLD);
      lwj.a(aa, efj.nK);
      Paint localPaint1 = new Paint();
      V = localPaint1;
      localPaint1.setColor(localResources.getColor(efj.jl));
      V.setStyle(Paint.Style.FILL);
      Paint localPaint2 = new Paint();
      ad = localPaint2;
      localPaint2.setColor(localResources.getColor(efj.ji));
      ad.setStyle(Paint.Style.FILL);
      ae = new Rect();
      ai = localResources.getDimensionPixelSize(efj.kH);
      ag = localResources.getDimensionPixelSize(efj.kJ);
      af = localResources.getDimensionPixelSize(efj.kI);
      ah = localResources.getDimensionPixelSize(efj.kF);
      aj = efj.a(localResources, efj.pm);
      ak = localResources.getDrawable(efj.qH);
      Paint localPaint3 = new Paint();
      am = localPaint3;
      localPaint3.setColor(localResources.getColor(efj.jL));
      am.setStyle(Paint.Style.FILL);
      an = new Rect();
      aK = efj.a(localResources, efj.qY);
      aL = localResources.getDimensionPixelSize(efj.mM);
      int i = localResources.getDimensionPixelSize(efj.mK);
      ao = (NinePatchDrawable)localResources.getDrawable(efj.qH);
      ap = new Rect();
      ar = efj.a(localResources, efj.rn);
      as = localResources.getDimensionPixelSize(efj.mL);
      aq = new Rect(0, 0, i + as + ar.getWidth(), i + as + ar.getHeight());
      au = efj.a(localResources, efj.rq);
      Paint localPaint4 = new Paint();
      av = localPaint4;
      localPaint4.setColor(localResources.getColor(efj.jm));
      av.setStyle(Paint.Style.FILL);
      Paint localPaint5 = new Paint();
      aw = localPaint5;
      localPaint5.setColor(localResources.getColor(efj.jk));
      aw.setStyle(Paint.Style.FILL);
      ax = new Rect();
      ay = new Paint();
      az = (NinePatchDrawable)localResources.getDrawable(efj.qH);
      aA = efj.a(localResources, efj.pk);
      aB = efj.a(localResources, efj.pl);
      aC = efj.a(localResources, efj.pj);
      aD = efj.a(localResources, efj.qE);
      aE = localResources.getDimensionPixelOffset(efj.mX);
      aF = localResources.getDimensionPixelOffset(efj.mZ);
      aG = localResources.getDimensionPixelOffset(efj.mY);
      aH = new Rect();
      aI = new Rect();
      aJ = new Paint();
      U = true;
    }
    this.s = 2;
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if ((Build.VERSION.SDK_INT < 11) || ((Build.VERSION.SDK_INT >= 19) && (localActivityManager.isLowRamDevice()))) {}
    for (boolean bool = true;; bool = false)
    {
      this.v = bool;
      this.p = ab;
      this.r = ac;
      this.q = ac;
      this.c = true;
      this.aT = new dyg(new dyh(this));
      this.h = ((dxl)mbb.a(paramContext, dxl.class));
      this.f = ((cpa)mbb.a(paramContext, cpa.class));
      this.g = ((aud)mbb.a(paramContext, aud.class));
      this.aX = ((atu)mbb.a(paramContext, atu.class));
      this.aY = new dyd(this);
      this.aZ = new dye(this);
      return;
    }
  }
  
  private final void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      CharSequence[] arrayOfCharSequence = new CharSequence[2];
      arrayOfCharSequence[0] = this.aW;
      arrayOfCharSequence[1] = getContext().getString(aau.ky);
      efj.a(localStringBuilder, arrayOfCharSequence);
      super.setContentDescription(localStringBuilder.toString());
      return;
    }
    super.setContentDescription(this.aW);
  }
  
  public final void D_()
  {
    super.D_();
    this.aR.clear();
    this.aS = null;
    this.aM = null;
    this.aN = null;
    this.at = null;
    this.aP = hch.a;
    this.aQ = 0.0F;
    this.e = 0;
  }
  
  public final void a(dvt paramdvt)
  {
    if ((paramdvt == this.at) && (this.f != null)) {
      this.f.a(this.a);
    }
  }
  
  public final void a(hch paramhch, float paramFloat, long paramLong)
  {
    this.aP = paramhch;
    this.aQ = paramFloat;
    this.aV = paramLong;
    invalidate();
  }
  
  public final void a(isp paramisp)
  {
    this.a = paramisp;
    if (this.at != null) {
      this.aR.remove(this.at);
    }
    this.at = new dvt(aq, this, null);
  }
  
  public final void a(Integer paramInteger)
  {
    if ((paramInteger == null) || (paramInteger.intValue() == 0))
    {
      this.aM = null;
      return;
    }
    this.aM = paramInteger.toString();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.aO = paramBoolean;
    if (!this.aO) {}
    for (boolean bool = true;; bool = false)
    {
      this.o = bool;
      return;
    }
  }
  
  public final void b(Integer paramInteger)
  {
    String str1;
    if ((paramInteger == null) || (paramInteger.intValue() == 0)) {
      str1 = null;
    }
    for (;;)
    {
      this.aN = str1;
      return;
      String str2 = String.valueOf(paramInteger.toString());
      if (str2.length() != 0) {
        str1 = "+".concat(str2);
      } else {
        str1 = new String("+");
      }
    }
  }
  
  public final boolean d()
  {
    return isEnabled();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      for (;;)
      {
        return super.dispatchTouchEvent(paramMotionEvent);
        Iterator localIterator2 = this.aR.iterator();
        lwu locallwu;
        do
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          locallwu = (lwu)localIterator2.next();
        } while (!locallwu.a(i, j, 0));
        this.aS = locallwu;
        invalidate();
        return true;
        this.aS = null;
        Iterator localIterator1 = this.aR.iterator();
        while (localIterator1.hasNext()) {
          ((lwu)localIterator1.next()).a(i, j, 1);
        }
        invalidate();
      }
    } while (this.aS == null);
    this.aS.a(i, j, 3);
    this.aS = null;
    invalidate();
    return true;
  }
  
  protected final boolean e()
  {
    return (super.e()) && (this.aX.c());
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.aX.a.a(this.aT, true);
    this.aX.a.a(this.aZ, true);
    this.g.a.a(this.aY, true);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.aX.a.a(this.aT);
    this.aX.a.a(this.aZ);
    this.g.a.a(this.aY);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    super.onDraw(paramCanvas);
    paramCanvas.restoreToCount(i);
    Paint localPaint;
    if (this.aO)
    {
      ax.set(0, 0, getWidth(), getHeight());
      Rect localRect = ax;
      if (n())
      {
        localPaint = aw;
        paramCanvas.drawRect(localRect, localPaint);
        paramCanvas.drawBitmap(au, (getWidth() - au.getWidth()) / 2, (getHeight() - au.getHeight()) / 2, null);
      }
    }
    do
    {
      do
      {
        return;
        localPaint = av;
        break;
      } while ((!n()) && (!this.aX.d()));
      if (!isEnabled())
      {
        ae.set(0, 0, getWidth(), getHeight());
        paramCanvas.drawRect(ae, ad);
        return;
      }
      if (this.d) {
        paramCanvas.drawBitmap(aK, getWidth() - aK.getWidth() - aL, aL, null);
      }
      if (((0x1 & this.e) == 1) && ((0x1 & this.e) != 0))
      {
        int i4 = getWidth() / 8;
        int i5 = getHeight() / 8;
        aJ.setTextSize(i4);
        aI.set(i4 * 1, 0, i4 * 2, i5);
        aJ.setColor(efj.b(this.e, 4));
        paramCanvas.drawRect(aI, aJ);
        aJ.setColor(-16777216);
        paramCanvas.drawText("L", 4 + aI.left, -4 + aI.bottom, aJ);
        aI.set(i4 * 2, 0, i4 * 3, i5);
        aJ.setColor(efj.b(this.e, 2));
        paramCanvas.drawRect(aI, aJ);
        aJ.setColor(-16777216);
        paramCanvas.drawText("S", 4 + aI.left, -4 + aI.bottom, aJ);
        aI.set(i4 * 3, 0, i4 * 4, i5);
        aJ.setColor(efj.b(this.e, 8));
        paramCanvas.drawRect(aI, aJ);
        aJ.setColor(-16777216);
        paramCanvas.drawText("A", 4 + aI.left, -4 + aI.bottom, aJ);
      }
      if (!this.aX.d()) {
        break label720;
      }
      if (this.a != null)
      {
        aud localaud = this.g;
        isp localisp = this.a;
        if (localaud.b.b(localisp))
        {
          an.set(0, 0, getWidth(), getHeight());
          paramCanvas.drawRect(an, am);
          paramCanvas.drawBitmap(al, (getWidth() - al.getWidth()) / 2, (getHeight() - al.getHeight()) / 2, null);
        }
      }
      ap.set(0, getHeight() - ao.getIntrinsicHeight(), getWidth(), getHeight());
      ao.setBounds(ap);
      ao.draw(paramCanvas);
    } while (!this.c);
    this.aR.remove(this.at);
    if (this.at != null) {
      this.aR.add(this.at);
    }
    int i2 = getWidth() - ar.getWidth() - as;
    int i3 = getHeight() - ar.getHeight() - as;
    paramCanvas.drawBitmap(ar, i2, i3, null);
    return;
    label720:
    int k;
    int m;
    Bitmap localBitmap2;
    if (this.aP != hch.a)
    {
      k = getWidth();
      m = getHeight();
      aH.set(0, m - aE, k, m);
      az.setBounds(aH);
      az.draw(paramCanvas);
      ay.setAlpha(255);
      switch (dyf.a[this.aP.ordinal()])
      {
      default: 
        localBitmap2 = aA;
      }
    }
    for (;;)
    {
      int n = k - localBitmap2.getWidth() - aF;
      int i1 = m - localBitmap2.getHeight() - aG;
      if ((this.aP == hch.c) && (this.aQ > 0.0F))
      {
        paramCanvas.save();
        paramCanvas.clipRect(n, i1, n + this.aQ * localBitmap2.getWidth(), i1 + localBitmap2.getHeight());
        paramCanvas.drawBitmap(aB, n, i1, null);
        paramCanvas.restore();
      }
      paramCanvas.drawBitmap(localBitmap2, n, i1, ay);
      if ((this.aN == null) && (this.aM == null)) {
        break;
      }
      int j = getHeight() - ak.getIntrinsicHeight();
      ak.setBounds(0, j, getWidth(), getHeight());
      ak.draw(paramCanvas);
      if (this.aN != null)
      {
        float f7 = getHeight() - ah - aa.descent();
        float f8 = af;
        paramCanvas.drawText(this.aN, 0, this.aN.length(), f8, f7, aa);
      }
      if (this.aM == null) {
        break;
      }
      Bitmap localBitmap1 = aj;
      float f1 = lwj.a(W);
      float f2 = getHeight() - ah - f1;
      float f3 = getWidth() - ag - localBitmap1.getWidth();
      paramCanvas.drawBitmap(localBitmap1, f3, f2, null);
      float f4 = lwj.a(W, this.aM.toString());
      float f5 = f2 - W.ascent();
      float f6 = f3 - (f4 + ai);
      paramCanvas.drawText(this.aM, 0, this.aM.length(), f6, f5, W);
      return;
      localBitmap2 = aC;
      continue;
      localBitmap2 = aC;
      ay.setAlpha(0);
      if ((System.currentTimeMillis() - this.aV < 6000L) && (this.aU != 0))
      {
        this.aU = (-8 + this.aU);
        if (this.aU < 0) {
          this.aU = 0;
        }
        ay.setAlpha(this.aU);
        postInvalidateDelayed(33L);
        continue;
        localBitmap2 = aD;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.at != null)
    {
      Rect localRect = this.at.a;
      localRect.offsetTo(paramInt3 - paramInt1 - localRect.width(), paramInt4 - paramInt2 - localRect.height());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.b) {
      paramInt2 = paramInt1;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.equals(this.aW, paramCharSequence)) {
      this.aW = paramCharSequence;
    }
    if (this.a != null)
    {
      aud localaud = this.g;
      isp localisp = this.a;
      if (!localaud.b.b(localisp)) {}
    }
    for (boolean bool = true;; bool = false)
    {
      d(bool);
      return;
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.aT.a = paramOnClickListener;
    if (paramOnClickListener != null) {}
    for (dyg localdyg = this.aT;; localdyg = null)
    {
      super.setOnClickListener(localdyg);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoTileView
 * JD-Core Version:    0.7.0.1
 */