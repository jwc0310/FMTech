package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public final class BoundedLinearLayout
  extends LinearLayout
{
  private int a = -1;
  private int b = -1;
  
  public BoundedLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public BoundedLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public BoundedLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private final void a(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, new int[] { 16843039, 16843040 });
    this.a = localTypedArray.getDimensionPixelSize(0, -1);
    this.b = localTypedArray.getDimensionPixelSize(1, -1);
    localTypedArray.recycle();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1073741824;
    int j = View.MeasureSpec.getMode(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt1);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i1;
    int i2;
    if (this.a >= 0) {
      switch (j)
      {
      default: 
        int i6 = Math.min(m, this.a);
        i1 = j;
        i2 = i6;
      }
    }
    for (;;)
    {
      label83:
      int i3;
      if (this.b >= 0) {
        switch (k)
        {
        default: 
          i = k;
        case -2147483648: 
          int i5 = Math.min(n, this.b);
          k = i;
          i3 = i5;
        }
      }
      for (;;)
      {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i2, i1), View.MeasureSpec.makeMeasureSpec(i3, k));
        return;
        i2 = this.a;
        i1 = i;
        break label83;
        j = i;
        break;
        int i4 = this.b;
        k = i;
        i3 = i4;
        continue;
        i3 = n;
      }
      i1 = j;
      i2 = m;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.BoundedLinearLayout
 * JD-Core Version:    0.7.0.1
 */