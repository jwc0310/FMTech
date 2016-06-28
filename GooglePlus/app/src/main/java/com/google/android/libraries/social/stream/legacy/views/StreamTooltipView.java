package com.google.android.libraries.social.stream.legacy.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import az;
import efj;
import eyg;
import gxq;
import gxs;
import lqc;
import lwj;
import lwm;
import mbb;
import pkh;

public final class StreamTooltipView
  extends View
  implements gxs
{
  public Layout.Alignment a = Layout.Alignment.ALIGN_NORMAL;
  public int b;
  public Runnable c = new lqc(this);
  private final Drawable d;
  private final int e;
  private final int f;
  private Rect g = new Rect();
  private StaticLayout h;
  private final lwj i = (lwj)mbb.a(getContext(), lwj.class);
  
  public StreamTooltipView(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getResources();
    this.f = localResources.getDimensionPixelSize(eyg.bQ);
    this.d = localResources.getDrawable(efj.YU);
    this.e = localResources.getDimensionPixelSize(eyg.bR);
  }
  
  public StreamTooltipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getResources();
    this.f = localResources.getDimensionPixelSize(eyg.bQ);
    this.d = localResources.getDrawable(efj.YU);
    this.e = localResources.getDimensionPixelSize(eyg.bR);
  }
  
  public StreamTooltipView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    this.f = localResources.getDimensionPixelSize(eyg.bQ);
    this.d = localResources.getDrawable(efj.YU);
    this.e = localResources.getDimensionPixelSize(eyg.bR);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
    requestLayout();
    invalidate();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int j = getWidth();
    int k = getHeight();
    int m = j - this.g.left - this.g.right;
    int n = k - this.g.top - this.g.bottom;
    this.d.setBounds(this.g.left, this.g.top, j - this.g.right, k - this.g.bottom);
    this.d.draw(paramCanvas);
    if (this.h != null)
    {
      int i1 = (m - this.h.getWidth()) / 2 + this.g.left;
      int i2 = (n - this.h.getHeight()) / 2 + this.g.top;
      paramCanvas.translate(i1, i2);
      this.h.draw(paramCanvas);
      paramCanvas.translate(-i1, -i2);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    TextPaint localTextPaint = efj.B(localContext, az.Z);
    String str = localContext.getString(this.b);
    int j = View.MeasureSpec.getSize(paramInt1) - this.g.left - this.g.right - 2 * this.f;
    int k = lwj.a(localTextPaint, str);
    if (j <= 0) {}
    lwj locallwj;
    Layout.Alignment localAlignment;
    TextUtils.TruncateAt localTruncateAt;
    int m;
    StaticLayout localStaticLayout;
    for (;;)
    {
      locallwj = this.i;
      localAlignment = this.a;
      localTruncateAt = TextUtils.TruncateAt.END;
      m = Math.max(k, 0);
      localStaticLayout = new StaticLayout(str, localTextPaint, m, localAlignment, 1.0F, 0.0F, false);
      if (localStaticLayout.getLineCount() > 2147483647) {
        break;
      }
      this.h = localStaticLayout;
      setMeasuredDimension(this.g.left + this.g.right + this.h.getWidth() + 2 * this.f, this.g.top + this.g.bottom + Math.max(this.h.getHeight(), this.e));
      return;
      k = Math.min(j, k);
    }
    int n = localStaticLayout.getLineEnd(2147483645);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(str.subSequence(0, n));
    boolean bool = str instanceof Spanned;
    if (bool) {
      efj.k();
    }
    for (lwm locallwm = locallwj.b;; locallwm = null)
    {
      localSpannableStringBuilder.append(locallwj.a(str.subSequence(n, str.length()), localTextPaint, m, localTruncateAt, locallwm));
      if (bool) {
        lwj.a((Spanned)str, n, localSpannableStringBuilder, locallwm);
      }
      localStaticLayout = new StaticLayout(localSpannableStringBuilder, localTextPaint, m, localAlignment, 1.0F, 0.0F, false);
      break;
    }
  }
  
  public final gxq v()
  {
    return new gxq(pkh.E);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.stream.legacy.views.StreamTooltipView
 * JD-Core Version:    0.7.0.1
 */