package com.google.android.libraries.social.collexions.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ScrollView;
import hie;

public final class CollexionEditScrollView
  extends ScrollView
{
  private GestureDetector a;
  
  public CollexionEditScrollView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CollexionEditScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CollexionEditScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    this.a = new GestureDetector(paramContext, new hie(this));
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (super.onInterceptTouchEvent(paramMotionEvent)) && (this.a.onTouchEvent(paramMotionEvent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.CollexionEditScrollView
 * JD-Core Version:    0.7.0.1
 */