package com.google.android.libraries.social.help.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import efj;

public final class PageIndicatorView
  extends View
{
  int a;
  int b;
  private int c;
  private int d;
  private int e = getResources().getDimensionPixelSize(efj.ML);
  private final Paint f = new Paint(1);
  private final Paint g = new Paint(1);
  
  public PageIndicatorView(Context paramContext)
  {
    super(paramContext);
    this.f.setColor(getResources().getColor(efj.MJ));
    this.g.setColor(getResources().getColor(efj.MK));
  }
  
  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f.setColor(getResources().getColor(efj.MJ));
    this.g.setColor(getResources().getColor(efj.MK));
  }
  
  public PageIndicatorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.f.setColor(getResources().getColor(efj.MJ));
    this.g.setColor(getResources().getColor(efj.MK));
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    float f1 = 0.5F * this.c;
    int i = 0;
    if (i < this.a)
    {
      float f2 = i * (this.c + this.d) + getPaddingLeft();
      paramCanvas.translate(f2, 0.0F);
      if (i == this.b) {}
      for (Paint localPaint = this.g;; localPaint = this.f)
      {
        paramCanvas.drawCircle(f1, f1, f1, localPaint);
        paramCanvas.translate(-f2, 0.0F);
        i++;
        break;
      }
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j;
    if (i == 1073741824) {
      j = View.MeasureSpec.getSize(paramInt2);
    }
    for (;;)
    {
      this.c = (j - (getPaddingTop() + getPaddingBottom()));
      this.d = this.c;
      setMeasuredDimension(this.d * (-1 + this.a) + this.c * this.a + getPaddingLeft() + getPaddingRight(), j);
      return;
      j = 0;
      if (i == -2147483648) {
        j = Math.min(this.e, View.MeasureSpec.getSize(paramInt2));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.help.impl.PageIndicatorView
 * JD-Core Version:    0.7.0.1
 */