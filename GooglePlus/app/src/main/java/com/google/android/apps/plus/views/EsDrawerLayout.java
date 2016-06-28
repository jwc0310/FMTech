package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ms;
import rf;

public class EsDrawerLayout
  extends rf
{
  private static int i = -1;
  private float j = -1.0F;
  private float k = -1.0F;
  private boolean l = false;
  private boolean m = false;
  
  public EsDrawerLayout(Context paramContext)
  {
    super(paramContext);
    if (i < 0) {
      i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  public EsDrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (i < 0) {
      i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  public EsDrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (i < 0) {
      i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  private final void a(float paramFloat1, float paramFloat2)
  {
    this.j = paramFloat1;
    this.k = paramFloat2;
    this.l = false;
    this.m = false;
    a(2, 5);
  }
  
  private final void b()
  {
    this.j = -1.0F;
    this.k = -1.0F;
    this.l = false;
    this.m = false;
    a(0, 5);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = ms.a(paramMotionEvent);
    boolean bool2;
    if (!d(5))
    {
      bool2 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool2;
    }
    switch (n)
    {
    case 1: 
    default: 
      b();
    }
    for (;;)
    {
      boolean bool1 = this.l;
      bool2 = false;
      if (bool1) {
        break;
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
      a(paramMotionEvent.getX(), paramMotionEvent.getY());
      continue;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((this.j < 0.0F) || (this.k < 0.0F))
      {
        a(f1, f2);
        paramMotionEvent.setAction(0);
      }
      else
      {
        float f3 = f1 - this.j;
        float f4 = Math.abs(f2 - this.k);
        if (f3 * f3 + f4 * f4 > i * i) {}
        for (int i1 = 1;; i1 = 0)
        {
          if ((this.l) || (this.m) || (i1 == 0)) {
            break label233;
          }
          if ((f3 <= 0.0F) || (f3 <= f4)) {
            break label235;
          }
          this.m = true;
          a(0, 5);
          break;
        }
        label233:
        continue;
        label235:
        this.l = true;
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      return false;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = ms.a(paramMotionEvent);
    if (!d(5)) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (n)
    {
    case 1: 
    default: 
      b();
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      a(paramMotionEvent.getX(), paramMotionEvent.getY());
      continue;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((this.j < 0.0F) || (this.k < 0.0F))
      {
        a(f1, f2);
        paramMotionEvent.setAction(0);
      }
      else
      {
        float f3 = f1 - this.j;
        float f4 = Math.abs(f2 - this.k);
        if (f3 * f3 + f4 * f4 > i * i) {}
        for (int i1 = 1;; i1 = 0)
        {
          if ((this.l) || (this.m) || (i1 == 0)) {
            break label215;
          }
          if ((f3 <= 0.0F) || (f3 <= f4)) {
            break label217;
          }
          this.m = true;
          a(0, 5);
          break;
        }
        label215:
        continue;
        label217:
        this.l = true;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.EsDrawerLayout
 * JD-Core Version:    0.7.0.1
 */