package com.google.android.libraries.social.acl2;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import gpc;
import gpd;
import mbb;

public final class Shareousel
  extends ViewPager
  implements gpd
{
  private boolean p = true;
  
  public Shareousel(Context paramContext)
  {
    super(paramContext);
    gpc localgpc = (gpc)mbb.b(getContext(), gpc.class);
    if (localgpc != null) {
      localgpc.a(this);
    }
  }
  
  public Shareousel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    gpc localgpc = (gpc)mbb.b(getContext(), gpc.class);
    if (localgpc != null) {
      localgpc.a(this);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      this.p = bool;
      return;
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.p) && (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.p) && (super.onTouchEvent(paramMotionEvent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.acl2.Shareousel
 * JD-Core Version:    0.7.0.1
 */