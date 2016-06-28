package com.google.android.libraries.social.ui.views.expandingscrollview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import lyo;
import lyp;
import lyq;
import lyr;
import lys;
import lyt;
import lyu;
import lyv;
import lyw;
import lyx;
import lyy;
import lza;
import lzb;
import lzc;
import x;

public final class ExpandingScrollView
  extends lzc
{
  public static final lyv a = new lyv();
  public static final lyv b = new lyx();
  private static boolean l;
  public int c;
  public boolean d = true;
  public lyu e = lyu.a;
  public final Set<lyt> f = new CopyOnWriteArraySet();
  final Set<x> g = new CopyOnWriteArraySet();
  public View h;
  public Drawable i;
  private final int m;
  private lza n;
  private lyv o = a;
  private lyv p = a;
  private lyv q = b;
  private lyu r;
  private lyu s;
  private lyu t;
  private final float[] u = new float[lyu.values().length];
  
  static
  {
    new lyw();
    new lyr();
  }
  
  public ExpandingScrollView(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getResources();
    if (!l)
    {
      a(localResources.getConfiguration());
      l = true;
    }
    this.n = new lza(this, new lyp(this), new lyq(this));
    this.m = ((int)(400.0F * localResources.getDisplayMetrics().density));
    c();
  }
  
  public ExpandingScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getResources();
    if (!l)
    {
      a(localResources.getConfiguration());
      l = true;
    }
    this.n = new lza(this, new lyp(this), new lyq(this));
    this.m = ((int)(400.0F * localResources.getDisplayMetrics().density));
    c();
  }
  
  public ExpandingScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getResources();
    if (!l)
    {
      a(localResources.getConfiguration());
      l = true;
    }
    this.n = new lza(this, new lyp(this), new lyq(this));
    this.m = ((int)(400.0F * localResources.getDisplayMetrics().density));
    c();
  }
  
  private final void a(Configuration paramConfiguration)
  {
    if (paramConfiguration.orientation == 2) {}
    for (lyv locallyv = this.q;; locallyv = this.p)
    {
      this.o = locallyv;
      a(this.e, false);
      return;
    }
  }
  
  private final void b(lyu paramlyu)
  {
    lyu locallyu = this.e;
    this.e = paramlyu;
    d();
    if (this.e != locallyu)
    {
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext()) {
        ((lyt)localIterator.next()).a(locallyu, this.e);
      }
    }
  }
  
  private void c()
  {
    for (lyu locallyu : ) {
      this.u[locallyu.ordinal()] = locallyu.g;
    }
  }
  
  private final void d()
  {
    if (this.e == lyu.a)
    {
      int i1 = a(lyu.a);
      this.j[0] = i1;
      this.j[1] = i1;
      return;
    }
    lyu locallyu = (lyu)Collections.max(this.o.a);
    int j = a(lyu.b);
    int k = a(locallyu);
    this.j[0] = j;
    this.j[1] = k;
  }
  
  public final int a(lyu paramlyu)
  {
    return Math.round(this.c * this.u[paramlyu.ordinal()] / 100.0F);
  }
  
  final void a()
  {
    super.a();
    this.t = this.e;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  protected final void a(float paramFloat)
  {
    if (this.e == lyu.a) {
      return;
    }
    Object localObject1;
    int i2;
    Object localObject2;
    int i4;
    if (Math.abs(paramFloat) > this.m)
    {
      int i1 = (int)(0.3F * paramFloat + getScrollY());
      localObject1 = null;
      i2 = 2147483647;
      Iterator localIterator = this.o.a.iterator();
      if (!localIterator.hasNext()) {
        break label206;
      }
      lyu locallyu4 = (lyu)localIterator.next();
      int i3 = Math.abs(a(locallyu4) - i1);
      if (i3 >= i2) {
        break label231;
      }
      localObject2 = locallyu4;
      i4 = i3;
    }
    for (;;)
    {
      i2 = i4;
      localObject1 = localObject2;
      break;
      localObject1 = this.e;
      lyu locallyu3;
      if (getScrollY() > a(this.e)) {
        locallyu3 = this.e;
      }
      label206:
      lyu locallyu1;
      for (lyu locallyu2 = this.o.b(locallyu3);; locallyu2 = this.o.a(locallyu1))
      {
        if (locallyu2 != this.e)
        {
          int j = a(this.e);
          int k = a(locallyu2);
          if ((getScrollY() - j) / (k - j) > 0.2F) {
            localObject1 = locallyu2;
          }
        }
        a((lyu)localObject1, true);
        return;
        locallyu1 = this.e;
      }
      label231:
      i4 = i2;
      localObject2 = localObject1;
    }
  }
  
  public final void a(Iterable<lyt> paramIterable)
  {
    int j = 0;
    int k = getScrollY();
    Object localObject = lyu.values()[0];
    lyu[] arrayOflyu = lyu.values();
    int i1 = arrayOflyu.length;
    while (j < i1)
    {
      lyu locallyu2 = arrayOflyu[j];
      if (k < a(locallyu2)) {
        break;
      }
      j++;
      localObject = locallyu2;
    }
    if (this.u[localObject.ordinal()] == 100.0F)
    {
      Iterator localIterator2 = paramIterable.iterator();
      while (localIterator2.hasNext()) {
        ((lyt)localIterator2.next()).a((lyu)localObject, 0.0F);
      }
    }
    int i2 = a((lyu)localObject);
    if (localObject == lyu.a) {}
    for (lyu locallyu1 = lyu.b;; locallyu1 = this.o.b((lyu)localObject))
    {
      int i3 = a(locallyu1);
      float f1 = 0.0F;
      if (i3 != i2) {
        f1 = (k - i2) / (i3 - i2);
      }
      Iterator localIterator1 = paramIterable.iterator();
      while (localIterator1.hasNext()) {
        ((lyt)localIterator1.next()).a((lyu)localObject, f1);
      }
    }
  }
  
  public final void a(lyu paramlyu, float paramFloat)
  {
    int j = paramlyu.ordinal();
    if (this.u[j] == paramFloat) {}
    do
    {
      return;
      lyu locallyu1 = this.o.a(paramlyu);
      if ((paramlyu != locallyu1) && (paramFloat < this.u[locallyu1.ordinal()])) {
        throw new IllegalArgumentException("exposure percentage less than previous state");
      }
      lyu locallyu2 = this.o.b(paramlyu);
      if ((paramlyu != locallyu2) && (paramFloat > this.u[locallyu2.ordinal()])) {
        throw new IllegalArgumentException("exposure percentage more than next state");
      }
      this.u[j] = paramFloat;
      d();
      if (this.k)
      {
        int k = getScrollY();
        for (;;)
        {
          lyu locallyu3 = this.e;
          if (k >= a(this.o.a(locallyu3))) {
            break;
          }
          lyu locallyu8 = this.e;
          lyu locallyu9 = this.e;
          if (locallyu8 == this.o.a(locallyu9)) {
            break;
          }
          lyu locallyu10 = this.e;
          b(this.o.a(locallyu10));
        }
        for (;;)
        {
          lyu locallyu4 = this.e;
          if (k <= a(this.o.b(locallyu4))) {
            break;
          }
          lyu locallyu5 = this.e;
          lyu locallyu6 = this.e;
          if (locallyu5 == this.o.b(locallyu6)) {
            break;
          }
          lyu locallyu7 = this.e;
          b(this.o.b(locallyu7));
        }
      }
    } while (this.e != paramlyu);
    a(a(paramlyu), true, 500);
  }
  
  public final void a(lyu paramlyu, boolean paramBoolean)
  {
    if (paramBoolean) {}
    int k;
    for (int j = 500;; j = 0)
    {
      lyu locallyu = this.o.c(paramlyu);
      b(locallyu);
      k = a(locallyu);
      if (j <= 0) {
        break;
      }
      a(k, false, j);
      return;
    }
    a(k);
  }
  
  public final void a(lyv paramlyv1, lyv paramlyv2)
  {
    this.p = paramlyv1;
    this.q = paramlyv2;
    a(getContext().getResources().getConfiguration());
    this.r = null;
    this.s = null;
  }
  
  final void b()
  {
    super.b();
    this.t = null;
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  protected final void dispatchDraw(Canvas paramCanvas)
  {
    if (this.i != null) {
      this.i.draw(paramCanvas);
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    lyu locallyu = this.e;
    a(paramConfiguration);
    if (this.e != locallyu)
    {
      this.r = locallyu;
      this.s = this.e;
    }
    while ((this.r == null) || (!this.o.a.contains(this.r))) {
      return;
    }
    if (this.e == this.s) {
      a(this.r, false);
    }
    this.r = null;
    this.s = null;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    if ((getChildCount() > 0) && (this.h == null))
    {
      View localView = getChildAt(0);
      removeAllViews();
      this.n.e.b();
      this.h = localView;
      if (localView != null) {
        addView(localView);
      }
    }
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = (paramInt4 - paramInt2) / 2;
    if (this.c != j) {
      this.c = j;
    }
    for (int k = 1;; k = 0)
    {
      int i1 = this.c;
      if (this.i != null) {
        this.i.setBounds(0, i1 - this.i.getIntrinsicHeight(), paramInt3 - paramInt1, i1);
      }
      int i2 = paramInt3 - paramInt1;
      int i3 = i1;
      int i4 = 0;
      while (i4 < getChildCount())
      {
        View localView2 = getChildAt(i4);
        int i6 = i3 + localView2.getMeasuredHeight();
        int i7 = i2 - getPaddingRight();
        localView2.layout(getPaddingLeft(), i3, i7, i6);
        i4++;
        i3 = i6;
      }
      View localView1;
      if ((!(this.h instanceof lys)) || (((lys)this.h).a()))
      {
        localView1 = findViewById(0);
        if (localView1 != null) {
          break label220;
        }
      }
      label220:
      for (int i5 = 0;; i5 = localView1.getHeight())
      {
        if (i5 > 0) {
          a(lyu.b, 100.0F * i5 / this.c);
        }
        d();
        if (k != 0) {
          a(this.e, false);
        }
        return;
      }
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 0;
    int k = View.MeasureSpec.getSize(paramInt2);
    int i1 = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
    int i2 = 0;
    while (j < getChildCount())
    {
      getChildAt(j).measure(paramInt1, i1);
      i2 = Math.max(i2, getChildAt(j).getMeasuredWidth());
      j++;
    }
    setMeasuredDimension(i2, k * 2);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    lyy locallyy = (lyy)paramParcelable;
    super.onRestoreInstanceState(locallyy.getSuperState());
    this.e = locallyy.a;
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    return new lyy(super.onSaveInstanceState(), this.e, this.u);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    lza locallza = this.n;
    lyu locallyu = locallza.c.e;
    if (locallyu == lyu.a) {}
    int j;
    float f2;
    float f3;
    float f4;
    int i2;
    do
    {
      return false;
      j = locallza.c.c - locallza.c.getScrollY();
      float f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if ((locallza.c.d) && (locallyu == lyu.c) && (f2 < j) && (paramMotionEvent.getAction() == 1) && (Math.abs(paramMotionEvent.getX() - locallza.g) < locallza.a) && (Math.abs(paramMotionEvent.getY() - locallza.h) < locallza.a))
      {
        locallza.c.a(lyu.b, true);
        Iterator localIterator = locallza.c.g.iterator();
        while (localIterator.hasNext()) {
          localIterator.next();
        }
      }
      if (paramMotionEvent.getAction() == 0)
      {
        locallza.g = f1;
        locallza.h = f2;
        locallza.i = (f2 - j);
        locallza.k = -1.0F;
        locallza.l = false;
      }
      int k = locallza.c.c - locallza.c.getScrollY();
      int i1 = paramMotionEvent.getAction();
      f3 = paramMotionEvent.getX();
      f4 = paramMotionEvent.getY();
      if (i1 != 0) {
        break label468;
      }
      if ((f4 < k) && ((!locallza.c.d) || (locallza.c.e != lyu.c))) {
        break;
      }
      i2 = lzb.b;
      locallza.f = i2;
    } while (locallza.f == lzb.a);
    boolean bool1;
    label320:
    boolean bool2;
    if (locallza.e.a != null)
    {
      bool1 = true;
      if (locallza.c.h != null) {
        break label617;
      }
      bool2 = false;
      label333:
      if (!bool2) {
        break label797;
      }
      locallza.d.a();
      if ((locallza.f != lzb.b) || (locallza.k == -1.0F)) {
        break label785;
      }
      paramMotionEvent.offsetLocation(0.0F, locallza.k - f2);
      label378:
      if (bool1)
      {
        boolean bool3 = Math.abs(paramMotionEvent.getY() - locallza.k) < locallza.a;
        int i4 = 0;
        if (bool3) {
          i4 = 1;
        }
        if (i4 != 0) {
          locallza.l = true;
        }
      }
      if (locallza.k == -1.0F) {
        locallza.k = paramMotionEvent.getY();
      }
      locallza.e.a(paramMotionEvent);
    }
    for (;;)
    {
      locallza.j = f2;
      return true;
      i2 = lzb.a;
      break;
      label468:
      if (locallza.f == lzb.b)
      {
        float f6 = Math.abs(f3 - locallza.g);
        float f7 = Math.abs(f4 - locallza.h);
        int i5;
        int i6;
        if (f6 > locallza.b)
        {
          i5 = 1;
          if (f7 <= locallza.a) {
            break label562;
          }
          i6 = 1;
        }
        for (;;)
        {
          if ((i6 != 0) && (i5 != 0))
          {
            if (f6 > f7)
            {
              i2 = lzb.c;
              break;
              i5 = 0;
              break label516;
              i6 = 0;
              continue;
            }
            i2 = lzb.d;
            break;
          }
        }
        if (i6 != 0)
        {
          i2 = lzb.d;
          break;
        }
        if (i5 != 0)
        {
          i2 = lzb.c;
          break;
        }
      }
      label516:
      label562:
      i2 = locallza.f;
      break;
      bool1 = false;
      break label320;
      label617:
      int i3 = paramMotionEvent.getAction();
      float f5 = paramMotionEvent.getY();
      switch (i3)
      {
      }
      do
      {
        do
        {
          bool2 = bool1;
          break;
          bool2 = true;
          break;
        } while (locallza.f != lzb.d);
        if (locallza.c.getScrollY() < locallza.c.a(lyu.d))
        {
          bool2 = false;
          break;
        }
        if (f5 < locallza.j)
        {
          bool2 = true;
          break;
        }
        bool2 = lza.a(locallza.c.h, (int)locallza.g, (int)locallza.i);
        break;
        if (locallza.f == lzb.b)
        {
          bool2 = true;
          break;
        }
      } while ((locallza.f != lzb.d) || (locallza.l));
      bool2 = false;
      break label333;
      label785:
      paramMotionEvent.offsetLocation(0.0F, -j);
      break label378;
      label797:
      locallza.e.a();
      locallza.k = -1.0F;
      locallza.l = false;
      locallza.d.a(paramMotionEvent);
    }
  }
  
  public final void scrollTo(int paramInt1, int paramInt2)
  {
    super.scrollTo(paramInt1, paramInt2);
    if (!this.f.isEmpty()) {
      a(this.f);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView
 * JD-Core Version:    0.7.0.1
 */