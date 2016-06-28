package com.google.android.libraries.social.avatars.ui;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import efj;
import hdg;
import kaz;
import kbb;
import lwe;
import mbb;

public final class AvatarView
  extends View
  implements kbb
{
  private static boolean j;
  private static Paint k;
  private static RectF l = new RectF();
  private static hdg m;
  public String a;
  public String b;
  public int c;
  public boolean d;
  public int e;
  public boolean f;
  public boolean g;
  public String h;
  public String i;
  private int n;
  private kaz o;
  private Matrix p;
  private Paint q;
  private String r;
  private Drawable s;
  
  public AvatarView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public AvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = i1;
    Resources localResources = paramContext.getResources();
    if (!j)
    {
      m = (hdg)mbb.a(paramContext, hdg.class);
      Paint localPaint = new Paint();
      k = localPaint;
      localPaint.setAntiAlias(i1);
      k.setStrokeWidth(4.0F);
      k.setColor(localResources.getColor(aau.yd));
      k.setStyle(Paint.Style.STROKE);
      j = i1;
    }
    this.s = localResources.getDrawable(aau.yf);
    this.s.setCallback(this);
    this.n = 2;
    this.e = 2;
    String str1;
    int i3;
    String str2;
    if (paramAttributeSet != null)
    {
      str1 = paramAttributeSet.getAttributeValue(null, "size");
      if (str1 != null)
      {
        if (!"tiny".equals(str1)) {
          break label249;
        }
        i3 = 0;
        this.n = i3;
      }
      str2 = paramAttributeSet.getAttributeValue(null, "shape");
      if (str2 != null)
      {
        if (!"normal".equals(str2)) {
          break label346;
        }
        i1 = 0;
      }
    }
    for (;;)
    {
      this.e = i1;
      String str3 = paramAttributeSet.getAttributeValue(null, "selectable");
      if (str3 != null) {
        this.g = Boolean.parseBoolean(str3);
      }
      this.d = paramAttributeSet.getAttributeBooleanValue(null, "allowNonSquare", false);
      a(this.n);
      return;
      label249:
      if ("small".equals(str1))
      {
        i3 = i1;
        break;
      }
      if ("medium".equals(str1))
      {
        i3 = 2;
        break;
      }
      if ("large".equals(str1))
      {
        i3 = 3;
        break;
      }
      String str6 = String.valueOf(str1);
      if (str6.length() != 0) {}
      for (String str7 = "Invalid avatar size: ".concat(str6);; str7 = new String("Invalid avatar size: ")) {
        throw new IllegalArgumentException(str7);
      }
      label346:
      if (!"round".equals(str2))
      {
        if (!"rounded_corners".equals(str2)) {
          break label372;
        }
        int i2 = 2;
      }
    }
    label372:
    String str4 = String.valueOf(str2);
    if (str4.length() != 0) {}
    for (String str5 = "Invalid avatar shape: ".concat(str4);; str5 = new String("Invalid avatar shape: ")) {
      throw new IllegalArgumentException(str5);
    }
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    if (this.p != null) {
      this.p.reset();
    }
    if (paramInt1 == 0) {}
    while (paramInt1 == paramInt2) {
      return;
    }
    if (this.q == null) {
      this.q = new Paint(2);
    }
    if (this.p == null) {
      this.p = new Matrix();
    }
    float f1 = paramInt1 / paramInt2;
    this.p.setScale(f1, f1);
  }
  
  public final void a()
  {
    ap_();
    this.a = null;
    this.i = null;
    this.r = null;
    this.h = null;
    if (this.p != null) {
      this.p.reset();
    }
  }
  
  public final void a(int paramInt)
  {
    this.n = paramInt;
    switch (this.n)
    {
    case 2: 
    default: 
      this.c = efj.k(getContext());
      return;
    case 0: 
      this.c = efj.g(getContext());
      return;
    case 1: 
      this.c = efj.i(getContext());
      return;
    }
    this.c = efj.m(getContext());
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((!TextUtils.equals(this.a, paramString1)) || (!TextUtils.equals(this.i, paramString2)))
    {
      ap_();
      this.a = paramString1;
      this.i = paramString2;
      this.r = null;
      this.h = null;
      b();
    }
  }
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz.q == 1)
    {
      int i1 = ((Bitmap)paramkaz.p).getWidth();
      a(getMeasuredWidth(), i1);
    }
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.o != null)
    {
      this.o.b(this);
      this.o = null;
    }
  }
  
  public final void b()
  {
    if (getWindowToken() != null) {}
    for (int i1 = 1;; i1 = 0)
    {
      if (i1 != 0)
      {
        if (this.i == null) {
          break;
        }
        this.o = m.a(getContext(), this.i, this.n, this.e, this);
      }
      return;
    }
    invalidate();
  }
  
  protected final void drawableStateChanged()
  {
    this.s.setState(getDrawableState());
    invalidate();
    super.drawableStateChanged();
  }
  
  public final CharSequence getContentDescription()
  {
    if (!TextUtils.isEmpty(this.r)) {
      return this.r;
    }
    if (!TextUtils.isEmpty(this.h))
    {
      if (isClickable())
      {
        Resources localResources = getResources();
        int i1 = efj.Gf;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.h;
        return localResources.getString(i1, arrayOfObject);
      }
      return getResources().getString(efj.Ge);
    }
    if (isClickable()) {
      return getResources().getString(efj.Gd);
    }
    return getResources().getString(efj.Gc);
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((this.o != null) && (this.o.q == 1)) {}
    for (Bitmap localBitmap = (Bitmap)this.o.p;; localBitmap = null)
    {
      if (localBitmap == null) {}
      switch (this.n)
      {
      default: 
        if (this.f)
        {
          l.set(0.0F, 0.0F, getWidth(), getHeight());
          paramCanvas.saveLayerAlpha(l, 105, 31);
        }
        if (this.p != null) {
          paramCanvas.drawBitmap(localBitmap, this.p, this.q);
        }
        break;
      }
      for (;;)
      {
        if (this.f) {
          paramCanvas.restore();
        }
        if ((this.g) && ((isPressed()) || (isFocused())) && (!this.f)) {}
        switch (this.e)
        {
        default: 
          return;
          Context localContext = getContext();
          switch (this.e)
          {
          default: 
            localBitmap = efj.h(localContext);
            break;
          case 1: 
            if (efj.FL == null) {
              efj.FL = lwe.a(efj.h(localContext));
            }
            localBitmap = efj.FL;
            break;
          case 2: 
            if (efj.FM == null) {
              efj.FM = lwe.a(efj.h(localContext), efj.o(localContext));
            }
            localBitmap = efj.FM;
            break;
            localBitmap = efj.s(getContext(), this.e);
            break;
            localBitmap = efj.t(getContext(), this.e);
            break;
            localBitmap = efj.u(getContext(), this.e);
            break;
            paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
          }
          break;
        }
      }
      this.s.draw(paramCanvas);
      return;
      float f2 = getWidth() / 2.0F;
      paramCanvas.drawCircle(f2, f2, f2 - 2.0F, k);
      return;
      float f1 = efj.o(getContext());
      l.set(0.0F, 0.0F, getWidth(), getHeight());
      paramCanvas.drawRoundRect(l, f1, f1, k);
      return;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.e == 0) {
      this.s.setBounds(0, 0, paramInt3 - paramInt1, paramInt4 - paramInt2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = this.c;
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3;
    int i5;
    int i6;
    if (i2 == 1073741824)
    {
      i1 = View.MeasureSpec.getSize(paramInt1);
      i3 = View.MeasureSpec.getMode(paramInt2);
      if (!this.d) {
        break label143;
      }
      i5 = this.c;
      if ((i3 != 1073741824) && (i3 != -2147483648)) {
        break label194;
      }
      i5 = Math.min(i5, View.MeasureSpec.getSize(paramInt2));
      i6 = i1;
    }
    for (;;)
    {
      if ((this.o != null) && (this.o.q == 1)) {}
      for (int i7 = ((Bitmap)this.o.p).getWidth();; i7 = this.c)
      {
        a(i6, i7);
        setMeasuredDimension(i6, i5);
        return;
        if (i2 != -2147483648) {
          break;
        }
        i1 = Math.min(i1, View.MeasureSpec.getSize(paramInt1));
        break;
        label143:
        if (i3 == 1073741824) {}
        for (int i4 = Math.min(i1, View.MeasureSpec.getSize(paramInt2));; i4 = Math.min(i1, this.c))
        {
          i5 = i4;
          i6 = i4;
          break;
        }
      }
      label194:
      i6 = i1;
    }
  }
  
  public final void setContentDescription(CharSequence paramCharSequence)
  {
    super.setContentDescription(paramCharSequence);
    this.r = ((String)paramCharSequence);
  }
  
  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == this.s) {
      return true;
    }
    return super.verifyDrawable(paramDrawable);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.avatars.ui.AvatarView
 * JD-Core Version:    0.7.0.1
 */