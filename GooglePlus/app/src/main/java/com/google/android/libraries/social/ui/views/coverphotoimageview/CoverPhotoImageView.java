package com.google.android.libraries.social.ui.views.coverphotoimageview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.libraries.social.media.ui.MediaView;
import ipb;
import ipf;
import iph;
import ipm;
import iqw;
import kaz;
import lyl;
import lym;
import lyn;
import mbb;
import nxh;

public class CoverPhotoImageView
  extends MediaView
{
  private static final Paint e;
  private int U;
  private int V;
  private Matrix W = new Matrix();
  public boolean a = true;
  private Bitmap aa;
  private Bitmap ab;
  private iph ac;
  private Matrix ad = new Matrix();
  public int b = lym.a;
  public int c;
  public ipf d;
  private ipb f = (ipb)mbb.a(getContext(), ipb.class);
  private boolean g;
  private int h;
  
  static
  {
    Paint localPaint = new Paint();
    e = localPaint;
    localPaint.setFilterBitmap(true);
  }
  
  public CoverPhotoImageView(Context paramContext)
  {
    super(paramContext);
    this.s = 0;
    if (getContext().getResources().getConfiguration().orientation == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.g = bool;
      return;
    }
  }
  
  public CoverPhotoImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.s = 0;
    if (getContext().getResources().getConfiguration().orientation == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.g = bool;
      return;
    }
  }
  
  public CoverPhotoImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.s = 0;
    if (getContext().getResources().getConfiguration().orientation == 2) {}
    for (boolean bool = true;; bool = false)
    {
      this.g = bool;
      return;
    }
  }
  
  private final void b(Canvas paramCanvas)
  {
    if (this.ac != null) {}
    for (Bitmap localBitmap = this.ac.j(); localBitmap == null; localBitmap = null) {
      return;
    }
    this.ad.reset();
    int i = localBitmap.getHeight();
    float f1 = this.c / i;
    this.ad.postScale(f1, f1);
    this.ad.postTranslate(0.0F, -this.U / 2);
    paramCanvas.drawBitmap(localBitmap, this.ad, e);
  }
  
  protected final void a(Canvas paramCanvas)
  {
    if (this.b == lym.a)
    {
      this.W.reset();
      i2 = r();
      i3 = s();
      if (this.h > i2)
      {
        f3 = this.h / i2;
        this.W.postScale(f3, f3);
        i2 = this.h;
        i3 = (int)(f3 * i3);
      }
      if (this.c > i3)
      {
        f2 = this.c / i3;
        this.W.postScale(f2, f2);
        i2 = (int)(f2 * i2);
        i3 = this.c;
      }
      if (i2 > this.h) {
        this.W.postTranslate(0.0F, -(i3 - this.c) / 2);
      }
      if (i3 > this.c) {
        this.W.postTranslate(-(i2 - this.h) / 2, 0.0F);
      }
      this.W.postTranslate(0.0F, -this.U / 2);
      localMatrix = this.W;
      this.w = 2;
      this.x = localMatrix;
      this.y = new Matrix();
      this.x.invert(this.y);
      if (i3 < this.c) {
        b(paramCanvas);
      }
      super.a(paramCanvas);
    }
    while ((this.b != lym.b) || (!o()))
    {
      int i2;
      int i3;
      float f3;
      float f2;
      Matrix localMatrix;
      return;
    }
    int i = r();
    int j = s();
    this.W.reset();
    int k;
    int m;
    int i1;
    if (this.h > i)
    {
      float f1 = this.h / i;
      k = this.h;
      j = (int)(f1 * j);
      this.W.postScale(f1, f1);
      m = this.V;
      if (m != 0)
      {
        if (k >= 940) {
          break label530;
        }
        i1 = Math.round(i / 940.0F * this.V);
      }
    }
    for (;;)
    {
      label370:
      this.W.postTranslate(0.0F, i1);
      int n = (int)(this.h / 5.0F);
      if (j > n)
      {
        if (this.ab == null)
        {
          this.ab = Bitmap.createBitmap(this.h, n, Bitmap.Config.ARGB_8888);
          new Canvas(this.ab).drawBitmap(this.aa, this.W, e);
        }
        this.W.reset();
        j = n;
      }
      this.W.postTranslate(0.0F, (this.c - j) / 2);
      this.W.postTranslate(0.0F, -this.U / 2);
      b(paramCanvas);
      if (this.ab != null) {}
      for (Bitmap localBitmap = this.ab;; localBitmap = this.aa)
      {
        paramCanvas.drawBitmap(localBitmap, this.W, e);
        return;
        k = i;
        break;
        label530:
        if (k <= 940) {
          break label567;
        }
        i1 = Math.round(k / 940.0F * this.V);
        break label370;
      }
      label567:
      i1 = m;
    }
  }
  
  public final void a(String paramString, nxh paramnxh, int paramInt, boolean paramBoolean)
  {
    RectF localRectF1;
    String str1;
    int j;
    int k;
    label140:
    String str3;
    String str4;
    String str5;
    if (paramnxh != null)
    {
      localRectF1 = new RectF(paramnxh.b.floatValue(), paramnxh.a.floatValue(), paramnxh.d.floatValue(), paramnxh.c.floatValue());
      lyn locallyn = new lyn(paramString, localRectF1, paramInt);
      str1 = locallyn.a;
      if ((this.b != lym.a) || (!this.g) || (!this.a) || (locallyn.b == null)) {
        break label388;
      }
      int i = str1.indexOf("-fcrop64");
      if (i == -1) {
        break label388;
      }
      j = str1.indexOf('-', i + 1);
      k = str1.indexOf('/', i + 1);
      if (j != -1) {
        break label355;
      }
      if (k == -1) {
        k = str1.length();
      }
      RectF localRectF2 = locallyn.b;
      float f1 = (localRectF2.top + localRectF2.bottom) / 2.0F;
      float f2 = (f1 - localRectF2.top) / 2.0F;
      float f3 = f1 - f2;
      float f4 = f1 + f2;
      RectF localRectF3 = new RectF(localRectF2.left, f3, localRectF2.right, f4);
      str3 = String.valueOf(str1.substring(0, i));
      str4 = String.valueOf(iqw.a(localRectF3, locallyn.c));
      str5 = String.valueOf(str1.substring(k));
    }
    label388:
    for (String str2 = 0 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + str3 + str4 + str5;; str2 = str1)
    {
      Context localContext = getContext();
      if (paramBoolean) {}
      for (ipm localipm = ipm.d;; localipm = ipm.a)
      {
        super.a(ipf.a(localContext, str2, localipm));
        return;
        localRectF1 = null;
        break;
        label355:
        if (k != -1)
        {
          k = Math.min(j, k);
          break label140;
        }
        k = j;
        break label140;
      }
    }
  }
  
  protected final void b(kaz paramkaz)
  {
    super.b(paramkaz);
    if ((this.b == lym.b) && ((paramkaz instanceof iph))) {
      this.aa = ((iph)paramkaz).j();
    }
  }
  
  public final void f(int paramInt)
  {
    int i = -this.c;
    if (paramInt < i) {
      paramInt = i;
    }
    if (this.U != paramInt)
    {
      this.U = paramInt;
      invalidate();
    }
  }
  
  public final void g(int paramInt)
  {
    if (this.V != paramInt)
    {
      this.V = paramInt;
      invalidate();
    }
  }
  
  protected final void i()
  {
    super.i();
    if (this.d != null) {
      this.ac = this.f.a(this.d, 4, new lyl(this));
    }
  }
  
  public final void j()
  {
    super.j();
    if (this.ac != null)
    {
      this.ac.b(this);
      this.ac = null;
    }
    if (this.ab != null)
    {
      this.ab.recycle();
      this.ab = null;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 940;
    super.onMeasure(paramInt1, paramInt2);
    this.h = getMeasuredWidth();
    if ((this.g) && (this.a))
    {
      this.c = Math.round(this.h / 3.55F);
      if (this.b != lym.a) {
        break label102;
      }
      b(this.h, this.c);
    }
    label102:
    while (this.b != lym.b)
    {
      setMeasuredDimension(this.h, this.c);
      return;
      this.c = Math.round(this.h / 1.777778F);
      break;
    }
    if (this.h > i) {}
    for (;;)
    {
      b(i, 0);
      break;
      i = this.h;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.coverphotoimageview.CoverPhotoImageView
 * JD-Core Version:    0.7.0.1
 */