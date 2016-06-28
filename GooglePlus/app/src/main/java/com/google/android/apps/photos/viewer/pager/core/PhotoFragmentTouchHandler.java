package com.google.android.apps.photos.viewer.pager.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.apps.plus.views.TouchInterceptParent;

public class PhotoFragmentTouchHandler
  extends FrameLayout
{
  public TouchInterceptParent a;
  public boolean b;
  public boolean c;
  public boolean d;
  public boolean e;
  private boolean f;
  
  public PhotoFragmentTouchHandler(Context paramContext)
  {
    super(paramContext);
  }
  
  public PhotoFragmentTouchHandler(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PhotoFragmentTouchHandler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (((this.d) && (!this.c) && (!this.b) && (!this.f) && (paramMotionEvent.getPointerCount() == 1)) || (this.e))
    {
      MotionEvent localMotionEvent2 = MotionEvent.obtain(paramMotionEvent);
      this.a.a(localMotionEvent2);
      localMotionEvent2.recycle();
    }
    boolean bool;
    if (!this.e)
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      if (this.b) {
        this.f = true;
      }
    }
    for (;;)
    {
      if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1)) {
        this.f = false;
      }
      return bool;
      MotionEvent localMotionEvent1 = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent1.setAction(3);
      super.dispatchTouchEvent(localMotionEvent1);
      localMotionEvent1.recycle();
      bool = true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.viewer.pager.core.PhotoFragmentTouchHandler
 * JD-Core Version:    0.7.0.1
 */