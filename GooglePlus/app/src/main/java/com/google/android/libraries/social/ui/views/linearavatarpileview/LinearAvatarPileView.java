package com.google.android.libraries.social.ui.views.linearavatarpileview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import efj;
import hdg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kaz;
import kbb;
import mbb;

public final class LinearAvatarPileView
  extends View
  implements kbb
{
  private static final int[] b = { 0, 1, 2 };
  public String[] a;
  private final hdg c = (hdg)mbb.a(getContext(), hdg.class);
  private final List<kaz> d = new ArrayList(5);
  private int e = 0;
  private final Paint f = new Paint(2);
  private final Paint g = new Paint(1);
  private final Rect h = new Rect();
  private int[] i = { 0, 1, -1, 2, -2 };
  private int j = 0;
  private float k = 0.25F;
  private int l = 0;
  
  public LinearAvatarPileView(Context paramContext)
  {
    super(paramContext);
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    this.g.setStrokeWidth(localDisplayMetrics.density);
    this.g.setColor(getResources().getColor(17170443));
    this.g.setStyle(Paint.Style.STROKE);
  }
  
  public LinearAvatarPileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    this.g.setStrokeWidth(localDisplayMetrics.density);
    this.g.setColor(getResources().getColor(17170443));
    this.g.setStyle(Paint.Style.STROKE);
  }
  
  public LinearAvatarPileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    DisplayMetrics localDisplayMetrics = getContext().getResources().getDisplayMetrics();
    this.g.setStrokeWidth(localDisplayMetrics.density);
    this.g.setColor(getResources().getColor(17170443));
    this.g.setStyle(Paint.Style.STROKE);
  }
  
  private final int a(int paramInt)
  {
    int m = b[(-1 + b.length)];
    for (int n = 0; n < b.length; n++) {
      if (efj.r(getContext(), b[n]) >= paramInt) {
        return b[n];
      }
    }
    return m;
  }
  
  public final void a(kaz paramkaz)
  {
    if (paramkaz.q == 1) {
      invalidate();
    }
  }
  
  public final void a(String[] paramArrayOfString)
  {
    int m = 0;
    if (!Arrays.equals(paramArrayOfString, this.a))
    {
      ap_();
      this.a = paramArrayOfString;
      if (this.a == null) {}
      int n;
      for (boolean bool = true;; bool = false)
      {
        setWillNotDraw(bool);
        if (this.a == null) {
          return;
        }
        n = 2147483647;
        while ((m < this.a.length) && (m < this.i.length))
        {
          if (this.i[m] < n) {
            n = this.i[m];
          }
          m++;
        }
      }
      this.j = (-n);
    }
    requestLayout();
  }
  
  public final void ap_()
  {
    for (int m = 0; m < this.d.size(); m++) {
      ((kaz)this.d.get(m)).b(this);
    }
    this.d.clear();
  }
  
  public final void b()
  {
    if (this.d.isEmpty())
    {
      if ((this.a == null) || (this.a.length == 0)) {
        invalidate();
      }
    }
    else {
      return;
    }
    int m = 0;
    label34:
    List localList;
    hdg localhdg;
    Context localContext;
    if ((m < this.a.length) && (m < 5))
    {
      localList = this.d;
      localhdg = this.c;
      localContext = getContext();
      if (!TextUtils.isEmpty(this.a[m])) {
        break label109;
      }
    }
    label109:
    for (String str = "https://lh3.googleusercontent.com/uFp_tsTJboUY7kue5XAsGA";; str = this.a[m])
    {
      localList.add(localhdg.a(localContext, str, this.e, 1, this));
      m++;
      break label34;
      break;
    }
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    float f1 = (1.0F - this.k) * this.l;
    float f2 = this.g.getStrokeWidth() / 2.0F;
    float f3 = 0.5F * this.l;
    int m = getPaddingTop();
    for (int n = -1 + this.d.size(); n >= 0; n--)
    {
      kaz localkaz = (kaz)this.d.get(n);
      if (localkaz != null)
      {
        Bitmap localBitmap = (Bitmap)localkaz.p;
        if (localBitmap != null)
        {
          float f4 = f1 * (this.i[n] + this.j) + getPaddingLeft();
          paramCanvas.translate(f4, m);
          paramCanvas.drawBitmap(localBitmap, null, this.h, this.f);
          paramCanvas.drawCircle(f3, f3, f3 - f2, this.g);
          paramCanvas.translate(-f4, -m);
        }
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = View.MeasureSpec.getMode(paramInt2);
    if (n != 1073741824) {
      m = efj.r(getContext(), a(m - getPaddingTop() - getPaddingBottom())) + getPaddingTop() + getPaddingBottom();
    }
    if (n == -2147483648) {
      m = Math.min(m, View.MeasureSpec.getSize(paramInt2));
    }
    int i1 = m - (getPaddingTop() + getPaddingBottom());
    if (i1 != this.l)
    {
      this.l = i1;
      this.e = a(this.l);
      int i4 = Math.round(this.g.getStrokeWidth() / 2.0F);
      this.h.set(i4, i4, this.l - i4, this.l - i4);
    }
    b();
    float f1 = 1.0F - this.k;
    if (this.a == null) {}
    for (int i2 = 0;; i2 = this.a.length)
    {
      int i3 = Math.min(i2, 5);
      setMeasuredDimension((int)(this.l * (this.k + f1 * i3)) + getPaddingLeft() + getPaddingRight(), m);
      return;
    }
  }
  
  public final void setPressed(boolean paramBoolean)
  {
    super.setPressed(paramBoolean);
    Paint localPaint = this.g;
    Resources localResources = getResources();
    if ((paramBoolean) && (hasOnClickListeners())) {}
    for (int m = 17170450;; m = 17170443)
    {
      localPaint.setColor(localResources.getColor(m));
      invalidate();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.linearavatarpileview.LinearAvatarPileView
 * JD-Core Version:    0.7.0.1
 */