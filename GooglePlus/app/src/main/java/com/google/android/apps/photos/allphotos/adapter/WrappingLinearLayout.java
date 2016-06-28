package com.google.android.apps.photos.allphotos.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import api;

public class WrappingLinearLayout
  extends ViewGroup
{
  public WrappingLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public WrappingLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WrappingLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof api;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new api(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new api(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new api(paramLayoutParams);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      api localapi = (api)localView.getLayoutParams();
      localView.layout(localapi.a, localapi.b, localapi.a + localView.getMeasuredWidth(), localapi.b + localView.getMeasuredHeight());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getSize(paramInt1) - getPaddingRight();
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getChildCount();
    int n = 0;
    View localView;
    int i3;
    int i4;
    int i6;
    if (n < m)
    {
      localView = getChildAt(n);
      if (localView.getVisibility() != 8)
      {
        measureChild(localView, paramInt1, paramInt2);
        i3 = Math.max(localView.getMeasuredHeight(), k);
        i4 = j + localView.getMeasuredWidth();
        if (i4 <= i) {
          break label205;
        }
        int i5 = getPaddingLeft() + localView.getMeasuredWidth();
        i6 = i3 + localView.getMeasuredHeight();
        j = i5;
      }
    }
    for (k = i6;; k = i3)
    {
      api localapi = (api)localView.getLayoutParams();
      localapi.a = (j - localView.getMeasuredWidth());
      localapi.b = (k - localView.getMeasuredHeight());
      n++;
      break;
      int i1 = j + getPaddingRight();
      int i2 = k + getPaddingBottom();
      setMeasuredDimension(resolveSize(i1, paramInt1), resolveSize(i2, paramInt2));
      return;
      label205:
      j = i4;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.allphotos.adapter.WrappingLinearLayout
 * JD-Core Version:    0.7.0.1
 */