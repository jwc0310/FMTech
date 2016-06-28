package com.google.android.apps.photos.viewer.components.captionbar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import azk;
import azl;
import dvq;
import efj;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Set;
import kaz;
import kbb;
import lwj;
import lwu;
import lxi;
import lxj;
import mbb;
import nj;
import ns;

public class CaptionBarView
  extends View
  implements kbb, lxj
{
  private static Bitmap i;
  private static Bitmap j;
  private static Paint k;
  private static Paint l;
  private static float m;
  private static int n;
  private static int o;
  private static int p;
  private static int q;
  private static int r;
  private static int s;
  private static int t;
  private static int u;
  private static int v;
  private static int w;
  private int A;
  private final lwj B;
  public Set<lwu> a = new HashSet();
  public azk b;
  public dvq c;
  public String d;
  public Spannable e;
  public String f;
  public boolean g;
  public final NumberFormat h = NumberFormat.getIntegerInstance();
  private lxi x;
  private lxi y;
  private lxi z;
  
  public CaptionBarView(Context paramContext)
  {
    super(paramContext);
    if (i == null)
    {
      Resources localResources = getContext().getResources();
      m = localResources.getDimension(efj.ob);
      n = localResources.getDimensionPixelOffset(efj.nQ);
      o = localResources.getDimensionPixelOffset(efj.nW);
      p = localResources.getDimensionPixelOffset(efj.nU);
      q = localResources.getDimensionPixelOffset(efj.nV);
      r = localResources.getDimensionPixelOffset(efj.nX);
      s = localResources.getDimensionPixelOffset(efj.nS);
      t = localResources.getDimensionPixelOffset(efj.nT);
      u = localResources.getDimensionPixelOffset(efj.nZ);
      v = localResources.getDimensionPixelOffset(efj.nY);
      w = localResources.getDimensionPixelOffset(efj.nR);
      i = efj.t(getContext(), 1);
      j = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setColor(0);
      k.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    azl localazl = new azl(this);
    nj.a.a(this, localazl);
    this.B = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public CaptionBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (i == null)
    {
      Resources localResources = getContext().getResources();
      m = localResources.getDimension(efj.ob);
      n = localResources.getDimensionPixelOffset(efj.nQ);
      o = localResources.getDimensionPixelOffset(efj.nW);
      p = localResources.getDimensionPixelOffset(efj.nU);
      q = localResources.getDimensionPixelOffset(efj.nV);
      r = localResources.getDimensionPixelOffset(efj.nX);
      s = localResources.getDimensionPixelOffset(efj.nS);
      t = localResources.getDimensionPixelOffset(efj.nT);
      u = localResources.getDimensionPixelOffset(efj.nZ);
      v = localResources.getDimensionPixelOffset(efj.nY);
      w = localResources.getDimensionPixelOffset(efj.nR);
      i = efj.t(getContext(), 1);
      j = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setColor(0);
      k.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    azl localazl = new azl(this);
    nj.a.a(this, localazl);
    this.B = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public CaptionBarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (i == null)
    {
      Resources localResources = getContext().getResources();
      m = localResources.getDimension(efj.ob);
      n = localResources.getDimensionPixelOffset(efj.nQ);
      o = localResources.getDimensionPixelOffset(efj.nW);
      p = localResources.getDimensionPixelOffset(efj.nU);
      q = localResources.getDimensionPixelOffset(efj.nV);
      r = localResources.getDimensionPixelOffset(efj.nX);
      s = localResources.getDimensionPixelOffset(efj.nS);
      t = localResources.getDimensionPixelOffset(efj.nT);
      u = localResources.getDimensionPixelOffset(efj.nZ);
      v = localResources.getDimensionPixelOffset(efj.nY);
      w = localResources.getDimensionPixelOffset(efj.nR);
      i = efj.t(getContext(), 1);
      j = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setColor(0);
      k.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    azl localazl = new azl(this);
    nj.a.a(this, localazl);
    this.B = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public final void D_()
  {
    ap_();
    this.x = null;
    this.y = null;
    this.z = null;
    this.a.clear();
    this.a = null;
    this.d = null;
    this.e = null;
    this.f = null;
    this.b = null;
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.c != null)
    {
      this.c.ap_();
      this.a.remove(this.c);
      this.c = null;
    }
  }
  
  public final void b()
  {
    if (this.c != null) {
      this.c.b();
    }
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
    ap_();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.c == null) {
      return;
    }
    paramCanvas.drawRect(0.0F, this.A, getWidth(), getHeight(), k);
    if (this.c.d() != null) {}
    for (Bitmap localBitmap = this.c.d();; localBitmap = i)
    {
      paramCanvas.drawBitmap(localBitmap, null, this.c.a, l);
      paramCanvas.drawBitmap(j, null, this.c.a, l);
      if (this.c.c) {
        this.c.a(paramCanvas);
      }
      if (this.x != null)
      {
        int i5 = this.x.a.left;
        int i6 = this.x.a.top;
        paramCanvas.translate(i5, i6);
        this.x.draw(paramCanvas);
        paramCanvas.translate(-i5, -i6);
      }
      if (this.y != null)
      {
        int i3 = this.y.a.left;
        int i4 = this.y.a.top;
        paramCanvas.translate(i3, i4);
        this.y.draw(paramCanvas);
        paramCanvas.translate(-i3, -i4);
      }
      if (this.z == null) {
        break;
      }
      int i1 = this.z.a.left;
      int i2 = this.z.a.top;
      paramCanvas.translate(i1, i2);
      this.z.draw(paramCanvas);
      paramCanvas.translate(-i1, -i2);
      return;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null)
    {
      setMeasuredDimension(0, 0);
      return;
    }
    int i1 = getPaddingLeft() + q;
    int i2 = getPaddingTop() + o;
    this.A = getPaddingTop();
    int i3 = getMeasuredWidth();
    if (this.f != null) {}
    for (int i4 = i3 - v;; i4 = i3)
    {
      int i5 = i4 - i1 - getPaddingRight();
      int i16;
      if (this.c == null)
      {
        i16 = 0;
        setMeasuredDimension(i4, i16 + p + getPaddingBottom());
        if (this.b != null)
        {
          azk localazk = this.b;
          getMeasuredHeight();
          localazk.a();
        }
        if (this.g) {
          break;
        }
        setVisibility(8);
        return;
      }
      int i6 = i1 + n + s;
      int i7 = i5 - i6;
      Context localContext = getContext();
      TextPaint localTextPaint1 = efj.B(localContext, efj.yK);
      this.c.a(i1, i2, i1 + n, i2 + n);
      CharSequence localCharSequence1 = lwj.b(this.d, localTextPaint1, i7, TextUtils.TruncateAt.END, null);
      int i8 = i5 - i6;
      this.x = new lxi(localCharSequence1, localTextPaint1, Math.min(i8, lwj.a(localTextPaint1, localCharSequence1.toString())), Layout.Alignment.ALIGN_NORMAL, m, 0.0F, false);
      if ((this.e == null) && (this.f == null)) {}
      for (int i9 = i2 + r;; i9 = i2)
      {
        this.x.a(i6, i9);
        int i10 = i9 + this.x.getHeight();
        TextPaint localTextPaint2 = efj.B(localContext, efj.yD);
        int i11 = lwj.a(localTextPaint2, this.f);
        if (this.e == null) {
          this.y = null;
        }
        for (;;)
        {
          label350:
          if (this.f == null) {
            this.z = null;
          }
          int i13;
          int i14;
          for (int i15 = i10;; i15 = i14 + this.z.getHeight())
          {
            i16 = i2 + Math.max(n, i15 - i2);
            break;
            TextPaint localTextPaint3 = efj.B(localContext, efj.yv);
            int i12 = i5 - i6 - i11;
            CharSequence localCharSequence2 = lwj.b(this.e, localTextPaint3, i12, TextUtils.TruncateAt.END, null);
            this.y = new lxi(localCharSequence2, localTextPaint3, i12, Layout.Alignment.ALIGN_NORMAL, m, 0.0F, false);
            this.y.a(i6, i10);
            i13 = i6 + lwj.a(localTextPaint3, localCharSequence2.toString());
            if (this.f == null) {
              break label564;
            }
            i6 = i13 + t;
            break label350;
            this.z = new lxi(this.f, localTextPaint2, i11, Layout.Alignment.ALIGN_NORMAL, m, 0.0F, false);
            i14 = i10 + u;
            this.z.a(i6, i14);
          }
          label564:
          i6 = i13;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.viewer.components.captionbar.CaptionBarView
 * JD-Core Version:    0.7.0.1
 */