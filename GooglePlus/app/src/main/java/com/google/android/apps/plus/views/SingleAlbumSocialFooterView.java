package com.google.android.apps.plus.views;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import aw;
import dui;
import dvq;
import dvr;
import dvs;
import dzi;
import efj;
import git;
import ill;
import ine;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lmj;
import loj;
import lwj;
import lwo;
import lwu;
import lxj;
import mbb;

public class SingleAlbumSocialFooterView
  extends View
  implements dvs, lxj
{
  private static Bitmap m;
  private static Bitmap n;
  private static Bitmap o;
  private static NinePatchDrawable p;
  private static NinePatchDrawable q;
  private static Paint r;
  private static Paint s;
  private static int t;
  private static int u;
  private static int v;
  private static int w;
  private static int x;
  private static int y;
  private static loj z;
  private lwu A;
  private dvr B;
  private dvr C;
  private dvr D;
  private StaticLayout E;
  private ill F;
  private final lwj G;
  public Set<lwu> a = new HashSet();
  public dzi b;
  public dvq c;
  public String d;
  public boolean e;
  public boolean f;
  public boolean g;
  public int h;
  public lmj i;
  public String j;
  public String k;
  public boolean l;
  
  public SingleAlbumSocialFooterView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SingleAlbumSocialFooterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SingleAlbumSocialFooterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (z == null)
    {
      Context localContext = getContext();
      Resources localResources = localContext.getResources();
      z = loj.a(localContext);
      v = localResources.getDimensionPixelSize(efj.kB);
      t = localResources.getDimensionPixelSize(efj.kv);
      u = localResources.getDimensionPixelSize(efj.ku);
      w = localResources.getDimensionPixelOffset(efj.nA);
      x = localResources.getDimensionPixelOffset(efj.nA);
      y = localResources.getDimensionPixelOffset(efj.nA);
      m = efj.t(getContext(), 1);
      n = efj.a(localResources, efj.oC);
      o = efj.a(localResources, efj.pI);
      p = (NinePatchDrawable)localResources.getDrawable(efj.oK);
      q = (NinePatchDrawable)localResources.getDrawable(efj.oL);
      Paint localPaint = new Paint();
      s = localPaint;
      localPaint.setColor(localResources.getColor(efj.jj));
      s.setStyle(Paint.Style.FILL);
      r = new Paint(2);
      z = loj.a(getContext());
    }
    mbb.a(paramContext, dui.class);
    setWillNotDraw(false);
    ill localill = new ill(paramContext, ((git)mbb.a(paramContext, git.class)).c());
    localill.a.add(ine.class);
    this.F = localill;
    this.G = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public final void D_()
  {
    c();
    this.b = null;
    this.d = null;
    this.e = false;
    this.f = false;
    this.g = false;
    this.h = 0;
    this.i = null;
    this.j = null;
    this.k = null;
  }
  
  public final void a(dvr paramdvr)
  {
    if (this.b != null)
    {
      if (this.F.a()) {
        break label32;
      }
      getContext().startActivity(this.F.b());
    }
    label32:
    label164:
    do
    {
      do
      {
        return;
        if (paramdvr != this.B) {
          break;
        }
        this.b.a(this.d, this.j, this.k, this.e, this.i);
      } while (!efj.B(getContext()));
      int i1;
      if ((this.i != null) && (this.i.c))
      {
        i1 = 1;
        if (i1 == 0) {
          break label164;
        }
      }
      for (int i2 = aau.pd;; i2 = aau.oW)
      {
        AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(16384);
        localAccessibilityEvent.getText().add(getResources().getString(i2));
        onInitializeAccessibilityEvent(localAccessibilityEvent);
        localAccessibilityEvent.setContentDescription(null);
        getParent().requestSendAccessibilityEvent(this, localAccessibilityEvent);
        return;
        i1 = 0;
        break;
      }
      if (paramdvr == this.C)
      {
        this.b.C();
        return;
      }
    } while (paramdvr != this.D);
    this.b.D();
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.c != null)) {
      this.c.b();
    }
  }
  
  public final void c()
  {
    if (this.c != null) {
      this.c.ap_();
    }
    this.B = null;
    this.C = null;
    this.E = null;
    this.c = null;
    this.D = null;
    this.a.clear();
    this.A = null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      for (;;)
      {
        return super.dispatchTouchEvent(paramMotionEvent);
        Iterator localIterator2 = this.a.iterator();
        lwu locallwu;
        do
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          locallwu = (lwu)localIterator2.next();
        } while (!locallwu.a(i1, i2, 0));
        this.A = locallwu;
        invalidate();
        return true;
        this.A = null;
        Iterator localIterator1 = this.a.iterator();
        while (localIterator1.hasNext()) {
          ((lwu)localIterator1.next()).a(i1, i2, 1);
        }
        invalidate();
      }
    } while (this.A == null);
    this.A.a(i1, i2, 3);
    this.A = null;
    invalidate();
    return true;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.c != null) {
      this.c.b();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.c != null) {
      this.c.ap_();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), s);
    if (this.c != null) {
      if (this.c.d() == null) {
        break label213;
      }
    }
    label213:
    for (Bitmap localBitmap = this.c.d();; localBitmap = m)
    {
      paramCanvas.drawBitmap(localBitmap, null, this.c.a, r);
      paramCanvas.drawBitmap(n, null, this.c.a, r);
      if (this.E != null)
      {
        int i1 = this.c.a.right + y;
        int i2 = (getHeight() - this.E.getHeight()) / 2;
        paramCanvas.translate(i1, i2);
        this.E.draw(paramCanvas);
        paramCanvas.translate(-i1, -i2);
      }
      if (this.c.c) {
        this.c.a(paramCanvas);
      }
      if (this.B != null) {
        this.B.a(paramCanvas);
      }
      if (this.C != null) {
        this.C.a(paramCanvas);
      }
      if (this.D != null) {
        this.D.a(paramCanvas);
      }
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    Context localContext = getContext();
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    int i3 = getPaddingLeft() + w;
    int i4 = i3 + (i1 - i3 - getPaddingRight() - x);
    int i5 = (i2 - v) / 2;
    if (this.c != null) {
      this.c.a(i3, i5, i3 + v, i5 + v);
    }
    int i6 = i3 + (v + y);
    Object localObject;
    String str3;
    label203:
    SingleAlbumSocialFooterView localSingleAlbumSocialFooterView1;
    label236:
    int i14;
    int i7;
    if (this.d != null) {
      if (this.h == 0)
      {
        localObject = null;
        this.a.remove(this.C);
        if ((this.h <= 0) && (!this.g)) {
          break label957;
        }
        if (this.h <= 0) {
          break label690;
        }
        Resources localResources2 = getResources();
        int i20 = efj.Zv;
        int i21 = this.h;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(this.h);
        str3 = localResources2.getQuantityString(i20, i21, arrayOfObject2);
        Bitmap localBitmap = z.e;
        TextPaint localTextPaint2 = dui.e;
        NinePatchDrawable localNinePatchDrawable1 = dui.a;
        NinePatchDrawable localNinePatchDrawable2 = dui.b;
        if (!this.g) {
          break label702;
        }
        localSingleAlbumSocialFooterView1 = this;
        this.C = new dvr(localContext, localBitmap, (CharSequence)localObject, localTextPaint2, localNinePatchDrawable1, localNinePatchDrawable2, localSingleAlbumSocialFooterView1, i4, i5, str3, false, 0);
        int i13 = i4 - this.C.a.width();
        i14 = (i2 - this.C.a.height()) / 2;
        this.C.a.offsetTo(i13, i14);
        if (this.g) {
          this.a.add(this.C);
        }
        i7 = i13 - z.k;
      }
    }
    for (;;)
    {
      int i15;
      label366:
      int i16;
      label376:
      TextPaint localTextPaint3;
      label453:
      NinePatchDrawable localNinePatchDrawable3;
      label463:
      NinePatchDrawable localNinePatchDrawable4;
      label473:
      SingleAlbumSocialFooterView localSingleAlbumSocialFooterView2;
      if ((this.i != null) && (this.i.c))
      {
        i15 = 1;
        if (this.i != null) {
          break label714;
        }
        i16 = 1;
        Resources localResources1 = getResources();
        int i17 = aau.oX;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Integer.valueOf(Math.max(i16, 1));
        String str4 = localResources1.getString(i17, arrayOfObject1);
        this.a.remove(this.B);
        if ((!this.f) && (i16 <= 0)) {
          break label756;
        }
        if (i15 == 0) {
          break label726;
        }
        localTextPaint3 = dui.f;
        if (i15 == 0) {
          break label734;
        }
        localNinePatchDrawable3 = dui.c;
        if (i15 == 0) {
          break label742;
        }
        localNinePatchDrawable4 = dui.d;
        if (!this.f) {
          break label750;
        }
        localSingleAlbumSocialFooterView2 = this;
        label483:
        this.B = new dvr(localContext, str4, localTextPaint3, localNinePatchDrawable3, localNinePatchDrawable4, localSingleAlbumSocialFooterView2, i7, i14);
        int i18 = i7 - this.B.a.width();
        int i19 = (i2 - this.B.a.height()) / 2;
        this.B.a.offsetTo(i18, i19);
        if (this.f) {
          this.a.add(this.B);
        }
        i7 = i18 - z.k;
      }
      for (;;)
      {
        if (!TextUtils.isEmpty(this.k))
        {
          lwj locallwj = this.G;
          TextPaint localTextPaint1 = efj.B(localContext, efj.yI);
          String str1 = this.k;
          int i8 = i7 - i6;
          Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
          TextUtils.TruncateAt localTruncateAt = TextUtils.TruncateAt.END;
          int i9 = Math.max(i8, 0);
          this.E = new StaticLayout(locallwj.a(str1, localTextPaint1, i9, localTruncateAt, null), localTextPaint1, i9, localAlignment, 1.0F, 0.0F, false);
        }
        return;
        localObject = String.valueOf(this.h);
        break;
        label690:
        str3 = localContext.getString(aw.ey);
        break label203;
        label702:
        localSingleAlbumSocialFooterView1 = null;
        break label236;
        i15 = 0;
        break label366;
        label714:
        i16 = this.i.b;
        break label376;
        label726:
        localTextPaint3 = dui.e;
        break label453;
        label734:
        localNinePatchDrawable3 = dui.a;
        break label463;
        label742:
        localNinePatchDrawable4 = dui.b;
        break label473;
        label750:
        localSingleAlbumSocialFooterView2 = null;
        break label483;
        label756:
        this.B = null;
        continue;
        if (!this.l)
        {
          this.a.remove(this.D);
          String str2 = localContext.getString(aau.iC);
          this.D = new dvr(localContext, o, str2, efj.B(localContext, efj.yw), p, q, this, i4, i5, str2, true, true, u, 0, 0);
          dvr localdvr = this.D;
          int i10 = t;
          if (localdvr.a != null) {
            localdvr.a.bottom = (i10 + localdvr.a.top);
          }
          int i11 = i4 - this.D.a.width();
          int i12 = (i2 - this.D.a.height()) / 2;
          this.D.a.offsetTo(i11, i12);
          this.a.add(this.D);
          i7 = i11 - z.k;
        }
        else
        {
          i7 = i4;
        }
      }
      label957:
      i7 = i4;
      i14 = i5;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.SingleAlbumSocialFooterView
 * JD-Core Version:    0.7.0.1
 */