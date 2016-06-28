package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import dxn;

public class MiniShareTouchHandler
  extends ViewGroup
{
  public View a;
  public View b;
  public View c;
  public View d;
  public dxn e;
  private View f;
  private int[] g = new int[2];
  
  public MiniShareTouchHandler(Context paramContext)
  {
    super(paramContext);
  }
  
  public MiniShareTouchHandler(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MiniShareTouchHandler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    if ((this.f == null) && (this.a != null) && (this.a.getVisibility() == 0) && (this.b != null))
    {
      this.b.getLocationOnScreen(this.g);
      if ((f1 >= this.g[0]) && (f1 < this.g[0] + this.b.getWidth()) && (f2 >= this.g[1]) && (f2 < this.g[1] + this.b.getHeight())) {
        this.f = this.a;
      }
    }
    if ((this.f == null) && (this.a != null) && (this.a.getVisibility() == 0))
    {
      if ((this.d == null) || (this.d.getVisibility() != 0)) {
        break label269;
      }
      this.d.getLocationOnScreen(this.g);
      if (f2 >= this.g[1]) {
        this.f = this.a;
      }
      if (f2 >= this.g[1]) {
        this.f = this.a;
      }
    }
    int i = paramMotionEvent.getAction();
    if (this.f != null)
    {
      localView = this.f;
      if (paramMotionEvent.getAction() == 3)
      {
        localView.dispatchTouchEvent(paramMotionEvent);
        if ((i == 3) || (i == 1)) {
          this.f = null;
        }
      }
    }
    label269:
    while (this.e == null) {
      for (;;)
      {
        View localView;
        return true;
        if ((this.c != null) && (this.c.getVisibility() == 0))
        {
          this.c.getLocationOnScreen(this.g);
          break;
        }
        this.g[0] = 2147483647;
        this.g[1] = 2147483647;
        break;
        MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        localMotionEvent.offsetLocation(getScrollX() - localView.getLeft(), getScrollY() - localView.getTop());
        localView.dispatchTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
    }
    this.e.a(i);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.MiniShareTouchHandler
 * JD-Core Version:    0.7.0.1
 */