package com.google.android.libraries.social.ui.swiperefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class CanScrollVerticallyDelegateFrameLayout
  extends FrameLayout
{
  public View a;
  
  public CanScrollVerticallyDelegateFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public CanScrollVerticallyDelegateFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CanScrollVerticallyDelegateFrameLayout(Context paramContext, View paramView)
  {
    super(paramContext);
    this.a = paramView;
  }
  
  public final boolean canScrollVertically(int paramInt)
  {
    return (this.a != null) && (this.a.canScrollVertically(paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.swiperefresh.CanScrollVerticallyDelegateFrameLayout
 * JD-Core Version:    0.7.0.1
 */