package com.google.android.libraries.social.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;
import eyg;

public final class FriendLocationsTouchHandler
  extends ViewGroup
{
  public DeprecatedExpandingScrollView a;
  public View b;
  public View c;
  public View d;
  private View e;
  private int[] f = new int[2];
  
  public FriendLocationsTouchHandler(Context paramContext)
  {
    super(paramContext);
  }
  
  public FriendLocationsTouchHandler(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FriendLocationsTouchHandler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final boolean a(View paramView, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    if ((paramView == null) || (paramView.getVisibility() != 0)) {
      bool = false;
    }
    do
    {
      return bool;
      paramView.getLocationOnScreen(this.f);
    } while ((paramFloat1 >= this.f[0]) && (paramFloat1 < this.f[0] + paramView.getWidth()) && (paramFloat2 >= this.f[bool]) && (paramFloat2 < this.f[bool] + paramView.getHeight()));
    return false;
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    if ((this.e == null) && (this.b != null) && (this.b.getVisibility() == 0))
    {
      if ((a(this.b.findViewById(16908298), f1, f2)) || (a(this.b.findViewById(eyg.Y), f1, f2))) {
        this.e = this.b;
      }
      if ((this.e == null) && (a(this.d, f1, f2)))
      {
        this.e = this.b;
        this.a.d = true;
      }
    }
    if (this.e == null) {
      this.e = this.c;
    }
    View localView;
    if (this.e != null)
    {
      localView = this.e;
      if (paramMotionEvent.getAction() != 3) {
        break label191;
      }
      localView.dispatchTouchEvent(paramMotionEvent);
    }
    for (;;)
    {
      int i = paramMotionEvent.getAction();
      if ((i == 3) || (i == 1))
      {
        this.e = null;
        this.a.d = false;
      }
      return true;
      label191:
      MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      localMotionEvent.offsetLocation(getScrollX() - localView.getLeft(), getScrollY() - localView.getTop());
      localView.dispatchTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.location.FriendLocationsTouchHandler
 * JD-Core Version:    0.7.0.1
 */