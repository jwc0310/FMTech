package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import dzj;

public class SingleAlbumTouchHandler
  extends ViewGroup
{
  public View a;
  public View b;
  public View c;
  public View d;
  public View e;
  public View f;
  public View g;
  public dzj h;
  private View i;
  private int[] j = new int[2];
  
  public SingleAlbumTouchHandler(Context paramContext)
  {
    super(paramContext);
  }
  
  public SingleAlbumTouchHandler(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SingleAlbumTouchHandler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    if ((this.i == null) && (this.a != null) && (this.a.getVisibility() == 0))
    {
      if ((this.d != null) && (this.d.getVisibility() == 0))
      {
        this.d.getLocationOnScreen(this.j);
        if ((f1 >= this.j[0]) && (f1 < this.j[0] + this.d.getWidth()) && (f2 >= this.j[1]) && (f2 < this.j[1] + this.d.getHeight())) {
          this.i = this.a;
        }
      }
      if (this.b == null) {
        this.b = this.a.findViewById(16908298);
      }
      if (this.b != null)
      {
        this.b.getLocationOnScreen(this.j);
        if ((f1 >= this.j[0]) && (f1 < this.j[0] + this.b.getWidth()) && (f2 >= this.j[1]) && (f2 < this.j[1] + this.b.getHeight())) {
          this.i = this.a;
        }
      }
      if (this.c == null) {
        this.c = this.a.findViewById(aaw.dG);
      }
      if ((this.i == null) && (this.c != null))
      {
        this.c.getLocationOnScreen(this.j);
        if ((f1 >= this.j[0]) && (f1 < this.j[0] + this.c.getWidth()) && (f2 >= this.j[1]) && (f2 < this.j[1] + this.c.getHeight())) {
          this.i = this.a;
        }
      }
    }
    if ((this.i == null) && (this.e != null) && (this.e.getVisibility() == 0))
    {
      this.e.getLocationOnScreen(this.j);
      if ((f1 >= this.j[0]) && (f1 < this.j[0] + this.e.getWidth()) && (f2 >= this.j[1]) && (f2 < this.j[1] + this.e.getHeight())) {
        this.i = this.e;
      }
    }
    if ((this.i == null) && (this.f != null) && (this.f.getVisibility() == 0))
    {
      this.f.getLocationOnScreen(this.j);
      if ((f1 >= this.j[0]) && (f1 < this.j[0] + this.f.getWidth()) && (f2 >= this.j[1]) && (f2 < this.j[1] + this.f.getHeight())) {
        this.i = this.f;
      }
    }
    if (this.i == null) {
      this.i = this.g;
    }
    View localView;
    if (this.i != null)
    {
      localView = this.i;
      if (paramMotionEvent.getAction() != 3) {
        break label644;
      }
      localView.dispatchTouchEvent(paramMotionEvent);
    }
    for (;;)
    {
      int k = paramMotionEvent.getAction();
      if ((k == 3) || (k == 1)) {
        this.i = null;
      }
      return true;
      label644:
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.offsetLocation(getScrollX() - localView.getLeft(), getScrollY() - localView.getTop());
      localView.dispatchTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
    }
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
 * Qualified Name:     com.google.android.apps.plus.views.SingleAlbumTouchHandler
 * JD-Core Version:    0.7.0.1
 */