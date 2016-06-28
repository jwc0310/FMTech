package com.google.android.libraries.social.ui.views.autoresizetextview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import kl;

public final class AutoResizeTextView
  extends TextView
{
  public float a = 16.0F;
  private final DisplayMetrics b = getResources().getDisplayMetrics();
  private final RectF c = new RectF();
  private final RectF d = new RectF();
  private boolean e = true;
  private final kl<CharSequence, Integer> f = new kl();
  private final TextPaint g = new TextPaint();
  private float h;
  private float i = 1.0F;
  private float j = 0.0F;
  private int k;
  private int l;
  
  public AutoResizeTextView(Context paramContext)
  {
    super(paramContext);
    this.g.set(getPaint());
    this.h = (getTextSize() / this.b.scaledDensity);
    if (this.l == 0) {
      setMaxLines(-1);
    }
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.g.set(getPaint());
    this.h = (getTextSize() / this.b.scaledDensity);
    if (this.l == 0) {
      setMaxLines(-1);
    }
  }
  
  public AutoResizeTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g.set(getPaint());
    this.h = (getTextSize() / this.b.scaledDensity);
    if (this.l == 0) {
      setMaxLines(-1);
    }
  }
  
  private final int a(int paramInt1, int paramInt2, RectF paramRectF)
  {
    int m = paramInt1;
    while (paramInt1 <= paramInt2)
    {
      int n = (paramInt1 + paramInt2) / 2;
      float f1 = TypedValue.applyDimension(2, n, this.b);
      this.g.setTextSize(f1);
      String str = getText().toString();
      int i1;
      if (this.l == 1)
      {
        i1 = 1;
        label59:
        if (i1 == 0) {
          break label139;
        }
        this.c.bottom = this.g.getFontSpacing();
      }
      label139:
      label196:
      int i2;
      for (this.c.right = this.g.measureText(str);; this.c.right = i2)
      {
        this.c.offsetTo(0.0F, 0.0F);
        StaticLayout localStaticLayout;
        for (boolean bool = paramRectF.contains(this.c);; bool = false)
        {
          if (!bool) {
            break label272;
          }
          int i4 = n + 1;
          m = paramInt1;
          paramInt1 = i4;
          break;
          i1 = 0;
          break label59;
          localStaticLayout = new StaticLayout(str, this.g, this.k, Layout.Alignment.ALIGN_NORMAL, this.i, this.j, true);
          if ((this.l == -1) || (localStaticLayout.getLineCount() <= this.l)) {
            break label196;
          }
        }
        this.c.bottom = localStaticLayout.getHeight();
        i2 = -1;
        for (int i3 = 0; i3 < localStaticLayout.getLineCount(); i3++) {
          if (localStaticLayout.getLineWidth(i3) > i2) {
            i2 = (int)Math.ceil(localStaticLayout.getLineWidth(i3));
          }
        }
      }
      label272:
      paramInt2 = n - 1;
      m = paramInt2;
    }
    return m;
  }
  
  private final void a()
  {
    int m = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    int n = getMeasuredHeight() - getPaddingBottom() - getPaddingTop();
    if ((m <= 0) || (n <= 0)) {
      return;
    }
    this.k = m;
    this.d.right = m;
    this.d.bottom = n;
    int i1 = (int)this.a;
    int i2 = (int)this.h;
    RectF localRectF = this.d;
    float f1;
    if (!this.e) {
      f1 = a(i1, i2, localRectF);
    }
    for (;;)
    {
      super.setTextSize(2, f1);
      return;
      CharSequence localCharSequence = getText();
      if ((localCharSequence != null) && (this.f.containsKey(localCharSequence)))
      {
        f1 = ((Integer)this.f.get(localCharSequence)).intValue();
      }
      else
      {
        int i3 = a(i1, i2, localRectF);
        this.f.put(localCharSequence, Integer.valueOf(i3));
        f1 = i3;
      }
    }
  }
  
  public final int getMaxLines()
  {
    return this.l;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    a();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4))
    {
      this.f.clear();
      a();
    }
  }
  
  protected final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    a();
  }
  
  public final void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    super.setLineSpacing(paramFloat1, paramFloat2);
    this.i = paramFloat2;
    this.j = paramFloat1;
  }
  
  public final void setMaxLines(int paramInt)
  {
    super.setMaxLines(paramInt);
    this.l = paramInt;
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    this.h = (TypedValue.applyDimension(paramInt, paramFloat, this.b) / this.b.scaledDensity);
    this.f.clear();
    requestLayout();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.autoresizetextview.AutoResizeTextView
 * JD-Core Version:    0.7.0.1
 */