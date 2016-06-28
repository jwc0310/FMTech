package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.social.media.ui.MediaView;
import due;
import dut;
import efj;
import java.util.Iterator;
import java.util.Set;
import lwj;
import lwm;
import lwu;
import lww;
import lxx;
import lyg;
import mbb;

public class AlbumCoverView
  extends MediaView
  implements lxx, lyg
{
  private static int U;
  private static int V;
  private static int W;
  private static int aa;
  private static boolean d;
  private static Drawable e;
  private static Drawable f;
  private static Drawable g;
  private static int h;
  public CharSequence a;
  private int ab;
  private int ac;
  private StaticLayout ad;
  private lww ae;
  private due af;
  private final lwj ag;
  public CharSequence b;
  public dut c;
  
  public AlbumCoverView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AlbumCoverView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (!d)
    {
      Resources localResources = paramContext.getResources();
      e = new ColorDrawable(localResources.getColor(efj.jM));
      f = localResources.getDrawable(efj.rj);
      g = localResources.getDrawable(efj.oq);
      h = localResources.getDimensionPixelSize(efj.ky);
      U = localResources.getDimensionPixelSize(efj.kz);
      V = localResources.getDimensionPixelSize(efj.kA);
      W = localResources.getDimensionPixelSize(efj.kw);
      aa = localResources.getDimensionPixelSize(efj.kx);
      d = true;
    }
    this.s = 0;
    b(1);
    this.v = true;
    this.p = e;
    this.r = f;
    this.q = f;
    a(null);
    this.af = new due(this);
    this.ag = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public final void D_()
  {
    super.D_();
    this.a = null;
    this.b = null;
    this.ad = null;
    this.ae = null;
  }
  
  public final void a(URLSpan paramURLSpan)
  {
    if (this.c != null)
    {
      Rect localRect = new Rect(this.ae.a);
      this.c.a(this, localRect);
    }
  }
  
  public final boolean d()
  {
    return false;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    super.onDraw(paramCanvas);
    paramCanvas.restoreToCount(i);
    if (!n()) {}
    int k;
    int m;
    do
    {
      return;
      g.setBounds(0, 0, getWidth(), getHeight());
      g.draw(paramCanvas);
      StaticLayout localStaticLayout = this.ad;
      int j = 0;
      if (localStaticLayout != null) {
        j = 0 + this.ad.getHeight();
      }
      if (this.ae != null) {
        j += aa + this.ae.getHeight();
      }
      k = h;
      m = getMeasuredHeight() - W - j;
      if (this.ad != null)
      {
        paramCanvas.translate(k, m);
        this.ad.draw(paramCanvas);
        paramCanvas.translate(-k, -m);
        m += this.ad.getHeight() + aa;
      }
    } while (this.ae == null);
    paramCanvas.translate(k, m);
    this.ae.draw(paramCanvas);
    paramCanvas.translate(-k, -m);
    this.ae.getHeight();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    int k = i - h - U;
    int m = j - V - W;
    Context localContext = getContext();
    CharSequence localCharSequence1 = this.a;
    TextPaint localTextPaint2;
    int i3;
    lwj locallwj;
    Layout.Alignment localAlignment;
    TextUtils.TruncateAt localTruncateAt;
    int i4;
    Object localObject;
    StaticLayout localStaticLayout;
    if (!TextUtils.isEmpty(localCharSequence1))
    {
      localTextPaint2 = efj.B(localContext, efj.yn);
      int i2 = m / lwj.a(localTextPaint2);
      if (i2 > 0)
      {
        i3 = Math.min(i2, 2);
        locallwj = this.ag;
        localAlignment = Layout.Alignment.ALIGN_NORMAL;
        localTruncateAt = TextUtils.TruncateAt.END;
        i4 = Math.max(k, 0);
        if (i3 == 0)
        {
          localObject = "";
          localStaticLayout = new StaticLayout((CharSequence)localObject, localTextPaint2, i4, localAlignment, 1.0F, 0.0F, false);
          label154:
          this.ad = localStaticLayout;
          if (this.ad == null) {
            break label525;
          }
        }
      }
    }
    label525:
    for (int n = m - (this.ad.getHeight() + aa);; n = m)
    {
      due localdue1 = this.af;
      lww locallww1 = this.ae;
      localdue1.b.remove(locallww1);
      CharSequence localCharSequence2 = this.b;
      TextPaint localTextPaint1;
      int i1;
      if (!TextUtils.isEmpty(localCharSequence2))
      {
        localTextPaint1 = efj.B(localContext, efj.yv);
        i1 = n / lwj.a(localTextPaint1);
        if (i1 <= 0) {}
      }
      for (lww locallww2 = lww.a(localContext, localTextPaint1, localCharSequence2, k, Math.min(i1, 1), 1.0F, this);; locallww2 = null)
      {
        this.ae = locallww2;
        if (this.ae != null)
        {
          this.ae.getHeight();
          this.ae.a(h, j - W - this.ae.getHeight());
          due localdue2 = this.af;
          lww locallww3 = this.ae;
          localdue2.b.add(locallww3);
        }
        return;
        if (i3 == 1)
        {
          localObject = locallwj.a(localCharSequence1, localTextPaint2, i4, localTruncateAt, null);
          break;
        }
        localStaticLayout = new StaticLayout(localCharSequence1, localTextPaint2, i4, localAlignment, 1.0F, 0.0F, false);
        if (localStaticLayout.getLineCount() <= i3) {
          break label154;
        }
        int i5 = localStaticLayout.getLineEnd(i3 - 2);
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localCharSequence1.subSequence(0, i5));
        boolean bool = localCharSequence1 instanceof Spanned;
        if (bool) {
          efj.k();
        }
        for (lwm locallwm = locallwj.b;; locallwm = null)
        {
          localSpannableStringBuilder.append(locallwj.a(localCharSequence1.subSequence(i5, localCharSequence1.length()), localTextPaint2, i4, localTruncateAt, locallwm));
          if (bool) {
            lwj.a((Spanned)localCharSequence1, i5, localSpannableStringBuilder, locallwm);
          }
          localObject = localSpannableStringBuilder;
          break;
        }
        localStaticLayout = null;
        break label154;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.ab == 0) && (getMeasuredWidth() > 0))
    {
      this.ab = getMeasuredWidth();
      this.ac = getMeasuredHeight();
      b(this.ab, this.ac);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    due localdue = this.af;
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      for (int k = 0;; k = 1)
      {
        if (k != 0) {
          break label227;
        }
        return super.onTouchEvent(paramMotionEvent);
        Iterator localIterator2 = localdue.b.iterator();
        lwu locallwu;
        do
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          locallwu = (lwu)localIterator2.next();
        } while (!locallwu.a(i, j, 0));
        localdue.a = locallwu;
        localdue.c.invalidate();
      }
      localdue.a = null;
      Iterator localIterator1 = localdue.b.iterator();
      while (localIterator1.hasNext()) {
        ((lwu)localIterator1.next()).a(i, j, 1);
      }
      localdue.c.invalidate();
      continue;
      if (localdue.a != null)
      {
        localdue.a.a(i, j, 3);
        localdue.a = null;
        localdue.c.invalidate();
      }
    }
    label227:
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AlbumCoverView
 * JD-Core Version:    0.7.0.1
 */