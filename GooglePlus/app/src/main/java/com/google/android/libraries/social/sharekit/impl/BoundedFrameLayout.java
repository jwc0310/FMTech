package com.google.android.libraries.social.sharekit.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import kkz;

public final class BoundedFrameLayout
  extends FrameLayout
{
  private int a;
  private int b;
  
  public BoundedFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public BoundedFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public BoundedFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt1), paramInt2), i);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kkz.a);
    this.a = localTypedArray.getDimensionPixelSize(kkz.c, 0);
    this.b = localTypedArray.getDimensionPixelSize(kkz.b, 0);
    localTypedArray.recycle();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a > 0) {
      paramInt1 = a(paramInt1, this.a);
    }
    if (this.b > 0) {
      paramInt2 = a(paramInt2, this.b);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.BoundedFrameLayout
 * JD-Core Version:    0.7.0.1
 */