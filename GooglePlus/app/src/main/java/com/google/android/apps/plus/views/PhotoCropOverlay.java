package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import dya;
import efj;
import nj;
import ns;
import ru;
import rx;

public class PhotoCropOverlay
  extends View
{
  private static Paint i;
  private static Paint j;
  private static boolean k;
  public float a = 1.0F;
  public int b = 0;
  public ru c;
  public ru d;
  public boolean e;
  public boolean f;
  public final Rect g = new Rect();
  public dya h;
  private final Rect l = new Rect();
  
  public PhotoCropOverlay(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public PhotoCropOverlay(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public PhotoCropOverlay(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private final void b()
  {
    Context localContext = getContext();
    setWillNotDraw(false);
    setFocusable(false);
    setClickable(false);
    this.c = new ru(localContext);
    this.d = new ru(localContext);
    if (!k)
    {
      k = true;
      Resources localResources = localContext.getApplicationContext().getResources();
      Paint localPaint1 = new Paint();
      i = localPaint1;
      localPaint1.setAntiAlias(true);
      i.setColor(localResources.getColor(efj.jI));
      i.setStyle(Paint.Style.FILL);
      Paint localPaint2 = new Paint();
      j = localPaint2;
      localPaint2.setAntiAlias(true);
      j.setColor(localResources.getColor(efj.jJ));
      j.setStyle(Paint.Style.STROKE);
      j.setStrokeWidth(localResources.getDimension(efj.mJ));
    }
  }
  
  public final void a()
  {
    int m = getWidth();
    int n;
    Rect localRect1;
    float f1;
    Rect localRect2;
    if (this.b == 0)
    {
      n = getWidth();
      int i1 = Math.min(m, n);
      int i2 = (getWidth() - i1) / 2;
      this.l.set(i2, 0, i1 + i2, getHeight());
      localRect1 = this.l;
      f1 = this.a;
      localRect2 = this.g;
      if (localRect1.width() / localRect1.height() <= f1) {
        break label354;
      }
      int i10 = (int)(0.5F * (f1 * localRect1.height()));
      localRect2.set(localRect1.centerX() - i10, localRect1.top, i10 + localRect1.centerX(), localRect1.bottom);
    }
    for (;;)
    {
      int i4 = (int)(0.1F * this.g.height());
      int i5 = (int)(0.1F * this.g.width());
      Rect localRect3 = this.g;
      localRect3.left = (i5 + localRect3.left);
      Rect localRect4 = this.g;
      localRect4.right -= i5;
      Rect localRect5 = this.g;
      localRect5.top = (i4 + localRect5.top);
      Rect localRect6 = this.g;
      localRect6.bottom -= i4;
      ru localru1 = this.c;
      int i6 = this.g.width();
      int i7 = this.g.height();
      ru.b.a(localru1.a, i6, i7);
      ru localru2 = this.d;
      int i8 = this.g.height();
      int i9 = this.g.width();
      ru.b.a(localru2.a, i8, i9);
      if (this.h != null) {
        this.h.a(new Rect(this.g));
      }
      return;
      n = this.b;
      break;
      label354:
      int i3 = (int)(0.5F * (localRect1.width() * (1.0F / f1)));
      localRect2.set(localRect1.left, localRect1.centerY() - i3, localRect1.right, i3 + localRect1.centerY());
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int m = getWidth();
    int n = getHeight();
    paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.g.top, i);
    paramCanvas.drawRect(0.0F, this.g.top, this.g.left, this.g.bottom, i);
    paramCanvas.drawRect(this.g.right, this.g.top, getWidth(), this.g.bottom, i);
    paramCanvas.drawRect(0.0F, this.g.bottom, getWidth(), getHeight(), i);
    paramCanvas.drawRect(this.g, j);
    if (this.c != null)
    {
      ru localru3 = this.c;
      if (ru.b.a(localru3.a)) {
        break label439;
      }
      int i4 = paramCanvas.save();
      if (!this.e) {
        break label380;
      }
      paramCanvas.translate(-m, n);
      paramCanvas.rotate(180.0F, m, 0.0F);
      paramCanvas.translate(m - this.g.right, n - this.g.bottom);
      ru localru4 = this.c;
      ru.b.a(localru4.a, paramCanvas);
      paramCanvas.restoreToCount(i4);
    }
    label403:
    label433:
    label439:
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0) {
        nj.a.l(this);
      }
      if (this.d != null)
      {
        ru localru1 = this.d;
        if (ru.b.a(localru1.a)) {
          break label433;
        }
        int i2 = paramCanvas.save();
        if (!this.f) {
          break label403;
        }
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(this.g.top, -this.g.right);
        label337:
        ru localru2 = this.d;
        ru.b.a(localru2.a, paramCanvas);
        paramCanvas.restoreToCount(i2);
      }
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 != 0) {
          nj.a.l(this);
        }
        return;
        label380:
        paramCanvas.translate(this.g.left, this.g.top);
        break;
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-this.g.bottom, this.g.left);
        break label337;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoCropOverlay
 * JD-Core Version:    0.7.0.1
 */