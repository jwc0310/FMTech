package com.google.android.apps.plus.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.Scroller;
import dyc;
import dyu;
import dyv;
import ms;
import mw;
import nf;
import ni;
import oh;

public class PhotoViewPager
  extends ViewPager
{
  public dyv p;
  public int q;
  public Scroller r;
  public final Runnable s = new dyu(this);
  private int t;
  
  public PhotoViewPager(Context paramContext)
  {
    super(paramContext);
    a(true, new dyc());
  }
  
  public PhotoViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(true, new dyc());
  }
  
  public final void e()
  {
    c();
    if (!this.m) {
      throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }
    VelocityTracker localVelocityTracker = this.k;
    localVelocityTracker.computeCurrentVelocity(1000, this.l);
    int i = this.j;
    int j = (int)nf.a.a(localVelocityTracker, i);
    this.g = true;
    int k = getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
    int m = getScrollX();
    oh localoh = super.b();
    a(super.a(localoh.b, (m / k - localoh.e) / localoh.d, j, (int)(this.h - this.i)), true, true, j);
    super.d();
    this.m = false;
    removeCallbacks(this.s);
    this.q = 0;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 1;
    int j;
    if ((this.p != null) && (this.p.y()))
    {
      j = i;
      int k = 0xFF & paramMotionEvent.getAction();
      if ((k == 3) || (k == i)) {
        this.t = -1;
      }
      switch (k)
      {
      }
    }
    int m;
    do
    {
      for (;;)
      {
        return super.onInterceptTouchEvent(paramMotionEvent);
        j = 0;
        break;
        if ((j != 0) && (this.t != -1))
        {
          return false;
          this.t = ms.a.b(paramMotionEvent, 0);
        }
      }
      m = ms.b(paramMotionEvent);
    } while (ms.a.b(paramMotionEvent, m) != this.t);
    if (m == 0) {}
    for (;;)
    {
      this.t = ms.a.b(paramMotionEvent, i);
      break;
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoViewPager
 * JD-Core Version:    0.7.0.1
 */