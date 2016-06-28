package com.google.android.apps.plus.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.ListView;
import dzb;
import dzc;
import lwo;

public class ReadNotificationListView
  extends ListView
{
  private static int c = -1;
  public View a;
  public dzc b;
  private float d = -1.0F;
  private boolean e = false;
  
  public ReadNotificationListView(Context paramContext)
  {
    super(paramContext);
    if (c < 0) {
      c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  public ReadNotificationListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (c < 0) {
      c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  public ReadNotificationListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (c < 0) {
      c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
  }
  
  @TargetApi(12)
  private final void a(float paramFloat)
  {
    float f = Math.abs(paramFloat) / getHeight();
    setTranslationY(paramFloat);
    if (this.a != null) {
      this.a.setAlpha(f);
    }
  }
  
  public final void a()
  {
    clearAnimation();
    if (Build.VERSION.SDK_INT >= 12) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        lwo.h(this);
        setTranslationY(0.0F);
        setAlpha(1.0F);
        if (this.a != null)
        {
          this.a.clearAnimation();
          lwo.h(this.a);
          this.a.setAlpha(1.0F);
        }
      }
      this.e = false;
      this.d = -1.0F;
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (Build.VERSION.SDK_INT >= 12) {}
    for (int i = 1; i == 0; i = 0) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      this.d = paramMotionEvent.getY();
      this.e = false;
      return super.onTouchEvent(paramMotionEvent);
    case 3: 
      this.d = -1.0F;
      a(0.0F);
    case 2: 
      for (;;)
      {
        return true;
        if ((getFirstVisiblePosition() == 0) && (getChildAt(0).getTop() == getTop())) {}
        for (int k = 1; k == 0; k = 0) {
          return super.onTouchEvent(paramMotionEvent);
        }
        float f8 = paramMotionEvent.getY();
        if (this.d < 0.0F)
        {
          this.e = false;
          this.d = f8;
        }
        float f9 = f8 + getTranslationY() - this.d;
        if ((!this.e) && (f9 > c)) {
          this.e = true;
        }
        if ((!this.e) || (f9 <= 0.0F)) {
          break;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        a(f9);
      }
      return super.onTouchEvent(paramMotionEvent);
    }
    if (this.e)
    {
      float f1 = paramMotionEvent.getY() + getTranslationY() - this.d;
      int j = getHeight();
      float f2 = Math.min(Math.abs(f1), j);
      float f3;
      float f4;
      boolean bool;
      if (f1 > j / 5)
      {
        float f6 = f2 / j;
        float f7 = j;
        f3 = f6;
        f4 = f7;
        bool = true;
      }
      for (;;)
      {
        long l = (int)(200.0F * (1.0F - f3));
        if (this.a != null)
        {
          ViewPropertyAnimator localViewPropertyAnimator = this.a.animate().setDuration(l);
          float f5 = 0.0F;
          if (bool) {
            f5 = 1.0F;
          }
          localViewPropertyAnimator.alpha(f5);
        }
        animate().setDuration(l).translationY(f4).setListener(new dzb(this, bool));
        this.d = -1.0F;
        break;
        f3 = 1.0F - f2 / j;
        bool = false;
        f4 = 0.0F;
      }
    }
    this.d = -1.0F;
    return super.onTouchEvent(paramMotionEvent);
  }
  
  @TargetApi(19)
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (Build.VERSION.SDK_INT >= 19) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (this.a != null))
      {
        if (paramInt != 0) {
          break;
        }
        this.a.setImportantForAccessibility(4);
      }
      return;
    }
    this.a.setImportantForAccessibility(1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.ReadNotificationListView
 * JD-Core Version:    0.7.0.1
 */