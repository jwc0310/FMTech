package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import bgl;

public final class MaxWidthFrameLayout
  extends FrameLayout
{
  private int a;
  
  public MaxWidthFrameLayout(Context paramContext)
  {
    this(paramContext, null);
    a(paramContext, null);
  }
  
  public MaxWidthFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public MaxWidthFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, bgl.l);
    this.a = localTypedArray.getDimensionPixelSize(bgl.m, 2147483647);
    localTypedArray.recycle();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.a > 0) && (View.MeasureSpec.getMode(paramInt1) == -2147483648)) {
      paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), this.a), 1073741824);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.MaxWidthFrameLayout
 * JD-Core Version:    0.7.0.1
 */