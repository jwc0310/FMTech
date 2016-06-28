package com.google.android.apps.photos.allphotos.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;

public class ScaleGestureTouchCaptureView
  extends FrameLayout
{
  public ScaleGestureDetector a;
  public boolean b;
  
  public ScaleGestureTouchCaptureView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ScaleGestureTouchCaptureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ScaleGestureTouchCaptureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a != null)
    {
      this.a.onTouchEvent(paramMotionEvent);
      if (this.b) {
        return true;
      }
    }
    return super.dispatchTouchEvent(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.allphotos.ui.ScaleGestureTouchCaptureView
 * JD-Core Version:    0.7.0.1
 */