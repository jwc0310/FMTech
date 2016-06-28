package com.google.android.apps.photos.viewer.components.comments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import dvq;
import efj;
import git;
import hdf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kaz;
import kbb;
import lln;
import lub;
import lwj;
import lwo;
import lwu;
import lww;
import lxi;
import lxj;
import lxx;
import mbb;
import nj;
import ns;

public class DetailsView
  extends View
  implements kbb, lxj
{
  private static Bitmap j;
  private static Bitmap k;
  private static Paint l;
  private static Paint m;
  private static float n;
  private static int o;
  private static int p;
  private static int q;
  private static int r;
  private static int s;
  private static int t;
  private static int u;
  private static int v;
  private static int w;
  private static int x;
  private lxi A;
  private lww B;
  private int C;
  private final lwj D;
  private final AccessibilityManager E;
  private lub F;
  public Set<lwu> a = new HashSet();
  public hdf b;
  public lxx c;
  public dvq d;
  public String e;
  public String f;
  public String g;
  public Spannable h;
  public final List<lwu> i;
  private lwu y;
  private lxi z;
  
  public DetailsView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    if (m == null)
    {
      Resources localResources = localContext.getResources();
      n = localResources.getDimension(efj.ob);
      o = localResources.getDimensionPixelOffset(efj.oc);
      p = localResources.getDimensionPixelOffset(efj.od);
      r = localResources.getDimensionPixelOffset(efj.oe);
      q = localResources.getDimensionPixelOffset(efj.of);
      s = localResources.getDimensionPixelOffset(efj.og);
      t = localResources.getDimensionPixelOffset(efj.nP);
      u = localResources.getDimensionPixelOffset(efj.nN);
      v = localResources.getDimensionPixelOffset(efj.nO);
      w = localResources.getDimensionPixelOffset(efj.oh);
      x = localResources.getDimensionPixelOffset(efj.oa);
      j = efj.t(getContext(), 1);
      k = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      m = localPaint;
      localPaint.setColor(localResources.getColor(efj.kr));
      m.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    mbb.a(localContext, lln.class);
    mbb.a(localContext, git.class);
    this.i = new ArrayList();
    this.E = ((AccessibilityManager)localContext.getSystemService("accessibility"));
    this.D = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public DetailsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    if (m == null)
    {
      Resources localResources = localContext.getResources();
      n = localResources.getDimension(efj.ob);
      o = localResources.getDimensionPixelOffset(efj.oc);
      p = localResources.getDimensionPixelOffset(efj.od);
      r = localResources.getDimensionPixelOffset(efj.oe);
      q = localResources.getDimensionPixelOffset(efj.of);
      s = localResources.getDimensionPixelOffset(efj.og);
      t = localResources.getDimensionPixelOffset(efj.nP);
      u = localResources.getDimensionPixelOffset(efj.nN);
      v = localResources.getDimensionPixelOffset(efj.nO);
      w = localResources.getDimensionPixelOffset(efj.oh);
      x = localResources.getDimensionPixelOffset(efj.oa);
      j = efj.t(getContext(), 1);
      k = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      m = localPaint;
      localPaint.setColor(localResources.getColor(efj.kr));
      m.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    mbb.a(localContext, lln.class);
    mbb.a(localContext, git.class);
    this.i = new ArrayList();
    this.E = ((AccessibilityManager)localContext.getSystemService("accessibility"));
    this.D = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public DetailsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    if (m == null)
    {
      Resources localResources = localContext.getResources();
      n = localResources.getDimension(efj.ob);
      o = localResources.getDimensionPixelOffset(efj.oc);
      p = localResources.getDimensionPixelOffset(efj.od);
      r = localResources.getDimensionPixelOffset(efj.oe);
      q = localResources.getDimensionPixelOffset(efj.of);
      s = localResources.getDimensionPixelOffset(efj.og);
      t = localResources.getDimensionPixelOffset(efj.nP);
      u = localResources.getDimensionPixelOffset(efj.nN);
      v = localResources.getDimensionPixelOffset(efj.nO);
      w = localResources.getDimensionPixelOffset(efj.oh);
      x = localResources.getDimensionPixelOffset(efj.oa);
      j = efj.t(getContext(), 1);
      k = efj.a(localResources, efj.oC);
      Paint localPaint = new Paint();
      m = localPaint;
      localPaint.setColor(localResources.getColor(efj.kr));
      m.setStyle(Paint.Style.FILL);
      l = new Paint(2);
    }
    mbb.a(localContext, lln.class);
    mbb.a(localContext, git.class);
    this.i = new ArrayList();
    this.E = ((AccessibilityManager)localContext.getSystemService("accessibility"));
    this.D = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public final void D_()
  {
    ap_();
    this.z = null;
    this.A = null;
    this.B = null;
    this.a.clear();
    this.i.clear();
    this.y = null;
    this.h = null;
    this.b = null;
    this.c = null;
    this.e = null;
    this.f = null;
    this.g = null;
    this.C = 0;
    if (this.F != null)
    {
      setAccessibilityDelegate(null);
      this.F = null;
    }
  }
  
  public final void a(kaz paramkaz)
  {
    invalidate();
  }
  
  public final void ap_()
  {
    if (this.d != null)
    {
      this.d.ap_();
      this.a.remove(this.d);
      this.d = null;
    }
  }
  
  public final void b()
  {
    if ((lwo.a(this)) && (this.d != null)) {
      this.d.b();
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2: 
    default: 
      return false;
    case 0: 
      Iterator localIterator2 = this.a.iterator();
      while (localIterator2.hasNext())
      {
        lwu locallwu = (lwu)localIterator2.next();
        if (locallwu.a(i1, i2, 0))
        {
          this.y = locallwu;
          invalidate();
        }
      }
      return true;
    case 1: 
      this.y = null;
      Iterator localIterator1 = this.a.iterator();
      while (localIterator1.hasNext()) {
        ((lwu)localIterator1.next()).a(i1, i2, 1);
      }
      invalidate();
      return false;
    }
    if (this.y != null)
    {
      this.y.a(i1, i2, 3);
      this.y = null;
      invalidate();
      return true;
    }
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    b();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ap_();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(0.0F, this.C, getWidth(), getHeight(), m);
    if (this.d != null) {
      if (this.d.d() == null) {
        break label285;
      }
    }
    label285:
    for (Bitmap localBitmap = this.d.d();; localBitmap = j)
    {
      paramCanvas.drawBitmap(localBitmap, null, this.d.a, l);
      paramCanvas.drawBitmap(k, null, this.d.a, l);
      if (this.d.c) {
        this.d.a(paramCanvas);
      }
      if (this.A != null)
      {
        int i5 = this.A.a.left;
        int i6 = this.A.a.top;
        paramCanvas.translate(i5, i6);
        this.A.draw(paramCanvas);
        paramCanvas.translate(-i5, -i6);
      }
      if (this.z != null)
      {
        int i3 = this.z.a.left;
        int i4 = this.z.a.top;
        paramCanvas.translate(i3, i4);
        this.z.draw(paramCanvas);
        paramCanvas.translate(-i3, -i4);
      }
      if (this.B != null)
      {
        int i1 = this.B.a.left;
        int i2 = this.B.a.top;
        paramCanvas.translate(i1, i2);
        this.B.draw(paramCanvas);
        paramCanvas.translate(-i1, -i2);
      }
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.E.isEnabled()) && (this.F == null) && (getContext() != null))
    {
      this.F = new lub(this, this.i);
      lub locallub = this.F;
      nj.a.a(this, locallub);
    }
    int i1 = getPaddingLeft() + r;
    int i2 = getPaddingTop() + s;
    int i3 = getMeasuredWidth();
    int i4 = i3 - i1 - getPaddingRight() - q;
    this.C = i2;
    int i5 = i1 + u;
    int i6 = i2 + t;
    if (this.d != null) {
      this.d.a(i5, i6, i5 + o, i6 + o);
    }
    int i7 = i5 + (o + v);
    int i8 = i6 + w;
    int i9 = i4 - i7;
    Context localContext = getContext();
    TextPaint localTextPaint = efj.B(localContext, efj.yI);
    if (this.f != null)
    {
      CharSequence localCharSequence = lwj.b(this.f, localTextPaint, i9, TextUtils.TruncateAt.END, null);
      int i13 = i4 - i7;
      this.z = new lxi(localCharSequence, localTextPaint, Math.min(i13, lwj.a(localTextPaint, localCharSequence.toString())), Layout.Alignment.ALIGN_NORMAL, n, 0.0F, false);
      this.z.a(i7, i8);
      i8 += this.z.getHeight();
    }
    if (this.g != null)
    {
      int i12 = i4 - i7;
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(this.g);
      localSpannableStringBuilder.append(' ');
      this.A = new lxi(localSpannableStringBuilder, efj.B(localContext, efj.yD), i12, Layout.Alignment.ALIGN_NORMAL, n, 0.0F, false);
      this.A.a(i7, i8);
      i8 += this.A.getHeight();
    }
    int i10 = i2 + Math.max(o + t, i8 - i2);
    if (TextUtils.isEmpty(this.h)) {}
    for (;;)
    {
      setMeasuredDimension(i3, i10 + p + getPaddingBottom());
      return;
      int i11 = i10 + x;
      this.a.remove(this.B);
      this.B = new lww(this.h, efj.B(getContext(), efj.yo), i4, Layout.Alignment.ALIGN_NORMAL, n, 0.0F, false, this.c);
      this.B.a(i1, i11);
      this.a.add(this.B);
      i10 = this.B.a.bottom;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.viewer.components.comments.DetailsView
 * JD-Core Version:    0.7.0.1
 */