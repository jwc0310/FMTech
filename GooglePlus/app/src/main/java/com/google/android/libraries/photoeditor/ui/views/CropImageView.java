package com.google.android.libraries.photoeditor.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import efj;
import gfv;
import ghd;

public final class CropImageView
  extends View
{
  private static final int[] d = { 16842914 };
  private static final int[] e = new int[0];
  public Bitmap a;
  public final RectF b;
  public boolean c;
  private final Paint f;
  private final Paint g;
  private final gfv h;
  private final int i;
  private final int j;
  private final RectF k;
  private boolean l;
  private boolean m;
  private final Matrix n;
  private final Rect o;
  private float p;
  private int q;
  private final RectF r;
  private final PointF[] s;
  private int[] t;
  private final RectF u;
  private final RectF v;
  
  public CropImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CropImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {}
  
  private final void a(float paramFloat1, float paramFloat2, float paramFloat3, RectF paramRectF)
  {
    if (paramFloat1 >= paramFloat2 / paramFloat3)
    {
      if (paramFloat1 > 1.0F) {
        paramFloat2 = Math.max(paramFloat1 * this.j, paramFloat2);
      }
      paramRectF.right = (paramFloat2 + paramRectF.left);
      paramRectF.bottom = (paramRectF.top + paramFloat2 / paramFloat1);
      return;
    }
    if (paramFloat1 < 1.0F) {
      paramFloat3 = Math.max(this.j / paramFloat1, paramFloat3);
    }
    paramRectF.right = (paramRectF.left + paramFloat3 * paramFloat1);
    paramRectF.bottom = (paramFloat3 + paramRectF.top);
  }
  
  private final void c()
  {
    if ((this.a == null) || (this.b.isEmpty())) {
      return;
    }
    this.n.mapRect(this.k, this.b);
    this.k.left = ((float)Math.floor(this.k.left));
    this.k.top = ((float)Math.floor(this.k.top));
    this.k.right = ((float)Math.floor(this.k.right));
    this.k.bottom = ((float)Math.floor(this.k.bottom));
    this.c = false;
  }
  
  public final RectF a()
  {
    if (this.a == null) {
      return new RectF();
    }
    return new RectF(efj.a(this.b.left / this.a.getWidth(), 0.0F, 1.0F), efj.a(this.b.top / this.a.getHeight(), 0.0F, 1.0F), efj.a(this.b.right / this.a.getWidth(), 0.0F, 1.0F), efj.a(this.b.bottom / this.a.getHeight(), 0.0F, 1.0F));
  }
  
  public final void a(float paramFloat, boolean paramBoolean)
  {
    if (paramFloat <= 0.0F) {
      throw new IllegalArgumentException("Invalid aspect ratio value");
    }
    b(paramFloat, true);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (this.a == paramBitmap) {}
    do
    {
      return;
      this.a = paramBitmap;
      this.m = true;
    } while (paramBitmap == null);
    this.u.set(0.0F, 0.0F, paramBitmap.getWidth(), paramBitmap.getHeight());
    int i1 = paramBitmap.getWidth();
    int i2 = paramBitmap.getHeight();
    float f1 = 0;
    float f2 = 0;
    float f3 = i1;
    float f4 = i2;
    float f5 = this.a.getWidth();
    float f6 = this.a.getHeight();
    float f7 = efj.a(f1, 0.0F, f5);
    float f8 = efj.a(f2, 0.0F, f6);
    float f9 = efj.a(f3 + f1, 0.0F, f5);
    float f10 = efj.a(f4 + f2, 0.0F, f6);
    this.b.set(f7, f8, f9, f10);
    this.c = true;
    invalidate();
  }
  
  public final float b()
  {
    return this.a.getWidth() / this.a.getHeight();
  }
  
  public final void b(float paramFloat, boolean paramBoolean)
  {
    this.p = paramFloat;
    if (this.a == null) {
      return;
    }
    float f1;
    if ((paramBoolean) && (this.p != 0.0F))
    {
      f1 = Math.max(this.u.width(), this.u.height());
      if (this.p < 1.0D) {
        break label242;
      }
    }
    label242:
    float f3;
    for (float f4 = f1 / this.p;; f4 = f3)
    {
      if (f1 > this.a.getWidth())
      {
        f4 /= f1 / this.a.getWidth();
        f1 = this.a.getWidth();
      }
      if (f4 > this.a.getHeight())
      {
        f1 /= f4 / this.a.getHeight();
        f4 = this.a.getHeight();
      }
      float f5 = this.u.left + (this.u.width() - f1) / 2.0F;
      float f6 = this.u.top + (this.u.height() - f4) / 2.0F;
      this.b.set(0.0F, 0.0F, f1, f4);
      this.b.offsetTo(efj.a(f5, 0.0F, this.a.getWidth() - f1), efj.a(f6, 0.0F, this.a.getHeight() - f4));
      this.c = true;
      invalidate();
      return;
      float f2 = f1 * this.p;
      f3 = f1;
      f1 = f2;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if (this.a == null) {
      return;
    }
    int i1;
    int i2;
    gfv localgfv;
    RectF localRectF;
    if (this.m)
    {
      i1 = getWidth();
      i2 = getHeight();
      if ((this.a == null) || (i1 == 0) || (i2 == 0))
      {
        paramCanvas.drawBitmap(this.a, this.n, this.g);
        paramCanvas.save();
        paramCanvas.clipRect(this.k);
        paramCanvas.drawBitmap(this.a, this.n, this.f);
        paramCanvas.restore();
        localgfv = this.h;
        localRectF = this.k;
        if (!this.l) {
          break label477;
        }
      }
    }
    label477:
    for (int[] arrayOfInt = d;; arrayOfInt = e)
    {
      localgfv.a(paramCanvas, localRectF, 3, 3, arrayOfInt);
      return;
      int i3 = i1 - getPaddingLeft() - getPaddingRight() - Math.max(this.h.c << 1, this.i);
      int i4 = i2 - getPaddingTop() - getPaddingBottom() - Math.max(this.h.c << 1, this.i);
      int i5 = this.a.getWidth();
      int i6 = this.a.getHeight();
      Point localPoint = new Point();
      if ((i3 <= 0) || (i4 <= 0) || (i5 <= 0) || (i6 <= 0)) {
        localPoint.set(0, 0);
      }
      for (;;)
      {
        this.o.set(0, 0, localPoint.x, localPoint.y);
        this.o.offsetTo((i1 - localPoint.x) / 2, (i2 - localPoint.y) / 2);
        float f1 = localPoint.x / this.a.getWidth();
        this.n.setScale(f1, f1);
        this.n.postTranslate(this.o.left, this.o.top);
        this.m = false;
        c();
        break;
        if ((i5 <= i3) && (i6 <= i4))
        {
          localPoint.set(i5, i6);
        }
        else if (i5 / i6 >= i3 / i4)
        {
          localPoint.x = Math.min(i5, i3);
          localPoint.y = (i6 * localPoint.x / i5);
        }
        else
        {
          localPoint.y = Math.min(i6, i4);
          localPoint.x = (i5 * localPoint.y / i6);
        }
      }
      if (!this.c) {
        break;
      }
      c();
      break;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.m = true;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a == null) {}
    float f11;
    float f12;
    label117:
    int i16;
    float f13;
    float f14;
    do
    {
      return false;
      if (this.c) {
        c();
      }
      switch (paramMotionEvent.getActionMasked())
      {
      default: 
        return false;
      case 0: 
        f11 = paramMotionEvent.getX();
        f12 = paramMotionEvent.getY();
        this.v.set(this.k);
        this.v.inset(-this.i, -this.i);
        if (this.v.contains(f11, f12)) {
          break label190;
        }
        i15 = 0;
        i16 = paramMotionEvent.getPointerId(0);
        f13 = paramMotionEvent.getX();
        f14 = paramMotionEvent.getY();
      }
    } while (i15 == 0);
    this.q = i15;
    this.s[0].set(f13, f14);
    this.t[0] = i16;
    this.r.set(this.k);
    this.l = true;
    invalidate();
    return true;
    label190:
    ghd localghd1 = new ghd(this.k.left, this.k.top, this.k.left, this.k.bottom);
    ghd localghd2 = new ghd(this.k.left, this.k.top, this.k.right, this.k.top);
    ghd localghd3 = new ghd(this.k.right, this.k.top, this.k.right, this.k.bottom);
    ghd localghd4 = new ghd(this.k.left, this.k.bottom, this.k.right, this.k.bottom);
    if (efj.a(localghd1, f11, f12) < this.i) {}
    for (int i15 = 1;; i15 = 0)
    {
      if (efj.a(localghd2, f11, f12) < this.i) {
        i15 |= 0x2;
      }
      if (efj.a(localghd3, f11, f12) < this.i) {
        i15 |= 0x4;
      }
      if (efj.a(localghd4, f11, f12) < this.i) {
        i15 |= 0x8;
      }
      if (((i15 & 0x5) != 5) && ((i15 & 0xA) != 10) && ((i15 != 0) || (!this.k.contains(f11, f12)))) {
        break label117;
      }
      i15 = 15;
      break label117;
      int i3;
      float f1;
      float f2;
      float f3;
      float f4;
      RectF localRectF1;
      int i5;
      label574:
      int i6;
      label584:
      label622:
      RectF localRectF2;
      int i8;
      label697:
      int i9;
      label708:
      label746:
      int i10;
      RectF localRectF3;
      RectF localRectF4;
      if (this.q != 0)
      {
        i3 = 1;
        if ((i3 == 0) || (this.t[0] != paramMotionEvent.getPointerId(0))) {
          break;
        }
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        if (this.q != 0)
        {
          f3 = f1 - this.s[0].x;
          f4 = f2 - this.s[0].y;
          int i4 = this.q;
          localRectF1 = this.r;
          if ((i4 & 0x1) == 0) {
            break label865;
          }
          i5 = 1;
          if ((i4 & 0x4) == 0) {
            break label871;
          }
          i6 = 1;
          if (i5 == 0) {
            break label953;
          }
          if (i6 == 0) {
            break label901;
          }
          if (f3 >= 0.0F) {
            break label877;
          }
          f3 = Math.max(f3, this.o.left - localRectF1.left);
          if (i5 != 0) {
            localRectF1.left = (f3 + localRectF1.left);
          }
          if (i6 != 0) {
            localRectF1.right = (f3 + localRectF1.right);
          }
          if (((i5 != 0) || (i6 != 0)) && (f3 != 0.0F)) {}
          int i7 = this.q;
          localRectF2 = this.r;
          if ((i7 & 0x2) == 0) {
            break label1010;
          }
          i8 = 1;
          if ((i7 & 0x8) == 0) {
            break label1016;
          }
          i9 = 1;
          if (i8 == 0) {
            break label1098;
          }
          if (i9 == 0) {
            break label1046;
          }
          if (f4 >= 0.0F) {
            break label1022;
          }
          f4 = Math.max(f4, this.o.top - localRectF2.top);
          if (i8 != 0) {
            localRectF2.top = (f4 + localRectF2.top);
          }
          if (i9 != 0) {
            localRectF2.bottom = (f4 + localRectF2.bottom);
          }
          if (((i8 != 0) || (i9 != 0)) && (f4 != 0.0F)) {}
          i10 = this.q;
          localRectF3 = this.r;
          localRectF4 = this.k;
          if ((this.p != 0.0F) && (i10 != 15)) {
            break label1155;
          }
          localRectF4.set(localRectF3);
        }
      }
      for (;;)
      {
        invalidate();
        this.s[0].set(f1, f2);
        return true;
        i3 = 0;
        break;
        label865:
        i5 = 0;
        break label574;
        label871:
        i6 = 0;
        break label584;
        label877:
        f3 = Math.min(f3, this.o.right - localRectF1.right);
        break label622;
        label901:
        if (f3 < 0.0F)
        {
          f3 = Math.max(f3, this.o.left - localRectF1.left);
          break label622;
        }
        f3 = Math.min(f3, localRectF1.width() - this.j);
        break label622;
        label953:
        if (i6 == 0) {
          break label622;
        }
        if (f3 < 0.0F)
        {
          f3 = Math.max(f3, this.j - localRectF1.width());
          break label622;
        }
        f3 = Math.min(f3, this.o.right - localRectF1.right);
        break label622;
        label1010:
        i8 = 0;
        break label697;
        label1016:
        i9 = 0;
        break label708;
        label1022:
        f4 = Math.min(f4, this.o.bottom - localRectF2.bottom);
        break label746;
        label1046:
        if (f4 < 0.0F)
        {
          f4 = Math.max(f4, this.o.top - localRectF2.top);
          break label746;
        }
        f4 = Math.min(f4, localRectF2.height() - this.j);
        break label746;
        label1098:
        if (i9 == 0) {
          break label746;
        }
        if (f4 < 0.0F)
        {
          f4 = Math.max(f4, this.j - localRectF2.height());
          break label746;
        }
        f4 = Math.min(f4, this.o.bottom - localRectF2.bottom);
        break label746;
        label1155:
        int i11;
        label1165:
        int i12;
        label1175:
        int i13;
        label1185:
        int i14;
        label1196:
        float f8;
        float f9;
        if ((i10 & 0x1) != 0)
        {
          i11 = 1;
          if ((i10 & 0x4) == 0) {
            break label1301;
          }
          i12 = 1;
          if ((i10 & 0x2) == 0) {
            break label1307;
          }
          i13 = 1;
          if ((i10 & 0x8) == 0) {
            break label1313;
          }
          i14 = 1;
          localRectF4.set(localRectF3);
          if (((i11 == 0) && (i13 == 0)) || (i12 != 0) || (i14 != 0)) {
            break label1357;
          }
          f8 = this.p;
          if (i11 == 0) {
            break label1319;
          }
          f9 = localRectF4.width();
          label1241:
          if (i13 == 0) {
            break label1338;
          }
        }
        label1301:
        label1307:
        label1313:
        label1319:
        label1338:
        for (float f10 = localRectF4.height();; f10 = localRectF4.bottom - this.o.top)
        {
          a(f8, f9, f10, localRectF4);
          localRectF4.offsetTo(localRectF3.right - localRectF4.width(), localRectF3.bottom - localRectF4.height());
          break;
          i11 = 0;
          break label1165;
          i12 = 0;
          break label1175;
          i13 = 0;
          break label1185;
          i14 = 0;
          break label1196;
          f9 = localRectF4.right - this.o.left;
          break label1241;
        }
        label1357:
        if (((i12 != 0) || (i14 != 0)) && (i11 == 0) && (i13 == 0))
        {
          float f5 = this.p;
          float f6;
          if (i12 != 0)
          {
            f6 = localRectF4.width();
            label1395:
            if (i14 == 0) {
              break label1441;
            }
          }
          for (float f7 = localRectF4.height();; f7 = this.o.bottom - localRectF4.top)
          {
            a(f5, f6, f7, localRectF4);
            break;
            f6 = this.o.right - localRectF4.left;
            break label1395;
          }
        }
        label1441:
        if ((i12 != 0) && (i13 != 0))
        {
          a(this.p, localRectF4.width(), localRectF4.height(), localRectF4);
          localRectF4.offsetTo(localRectF3.left, localRectF3.bottom - localRectF4.height());
        }
        else if ((i11 != 0) && (i14 != 0))
        {
          a(this.p, localRectF4.width(), localRectF4.height(), localRectF4);
          localRectF4.offsetTo(localRectF3.right - localRectF4.width(), localRectF3.top);
        }
      }
      int i1;
      if (this.q != 0)
      {
        i1 = 1;
        label1577:
        if (i1 == 0) {
          break label1664;
        }
        if (this.q == 0) {
          break label1666;
        }
      }
      label1664:
      label1666:
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 != 0)
        {
          this.q = 0;
          this.r.setEmpty();
          Matrix localMatrix = new Matrix();
          this.n.invert(localMatrix);
          localMatrix.mapRect(this.b, this.k);
          this.u.set(this.b);
          this.l = false;
          invalidate();
        }
        return true;
        i1 = 0;
        break label1577;
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.ui.views.CropImageView
 * JD-Core Version:    0.7.0.1
 */