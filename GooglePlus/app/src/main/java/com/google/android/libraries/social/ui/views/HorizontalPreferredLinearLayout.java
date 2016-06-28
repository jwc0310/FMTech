package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import lxe;

public final class HorizontalPreferredLinearLayout
  extends ViewGroup
{
  public lxe a;
  public boolean b;
  public int c;
  private boolean d;
  private int[] e;
  private int[] f;
  
  public HorizontalPreferredLinearLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public HorizontalPreferredLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public HorizontalPreferredLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private static int a(int[] paramArrayOfInt)
  {
    int i = -2147483648;
    for (int j = 0; j < paramArrayOfInt.length; j++) {
      if (paramArrayOfInt[j] > i) {
        i = paramArrayOfInt[j];
      }
    }
    return i;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3 - paramInt1;
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = 0;
    int n = getChildCount();
    int i1 = 0;
    int i2 = j;
    int i7;
    int i11;
    int i12;
    int i5;
    int i4;
    if (i1 < n)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 8) {
        break label212;
      }
      if (m != 0) {
        i2 += this.c;
      }
      i7 = localView.getMeasuredWidth();
      int i8 = localView.getMeasuredHeight();
      if (this.d)
      {
        i11 = getPaddingTop();
        i12 = i2;
        i5 = 1;
        int i13 = i12 + i7;
        int i14 = i11 + i8;
        localView.layout(i12, i11, i13, i14);
        k = i14;
        i4 = i13;
      }
    }
    for (;;)
    {
      i1++;
      int i6 = i5;
      i2 = i4;
      m = i6;
      break;
      if ((Build.VERSION.SDK_INT >= 17) && (getLayoutDirection() == 1)) {}
      for (int i9 = i - i7;; i9 = getPaddingLeft())
      {
        int i10 = m;
        i11 = k;
        i12 = i9;
        i5 = i10;
        break;
      }
      return;
      label212:
      int i3 = m;
      i4 = i2;
      i5 = i3;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = getChildCount();
    if ((this.e == null) || (this.e.length < k))
    {
      this.e = new int[k];
      this.f = new int[k];
    }
    int m = 0;
    int n = 0;
    label112:
    int i7;
    if (m < k)
    {
      View localView2 = getChildAt(m);
      if (localView2.getVisibility() != 8)
      {
        localView2.measure(j, j);
        this.e[m] = localView2.getMeasuredWidth();
        this.f[m] = localView2.getMeasuredHeight();
        if (this.e[m] <= 0) {
          break label459;
        }
        if (n <= 0) {
          break label177;
        }
        i7 = this.c;
      }
    }
    label133:
    label177:
    label459:
    for (int i6 = n + (i7 + this.e[m]);; i6 = n)
    {
      m++;
      n = i6;
      break;
      this.e[m] = 0;
      this.f[m] = 0;
      break label112;
      i7 = 0;
      break label133;
      if (n > 0) {
        n += getPaddingLeft() + getPaddingRight();
      }
      int i1 = resolveSize(n, paramInt1);
      boolean bool;
      if ((!this.b) && (n == i1))
      {
        bool = true;
        this.d = bool;
        if (!this.d) {
          break label288;
        }
        if (this.a != null) {
          this.a.a();
        }
      }
      int i4;
      for (int i5 = a(this.f) + getPaddingTop() + getPaddingBottom();; i5 = i4 + getPaddingTop() + getPaddingBottom())
      {
        setMeasuredDimension(n, i5);
        return;
        bool = false;
        break;
        if (this.a != null) {
          this.a.b();
        }
        int i2 = resolveSize(2147483647, paramInt1) - getPaddingLeft() - getPaddingRight();
        for (int i3 = 0; i3 < k; i3++)
        {
          View localView1 = getChildAt(i3);
          if (localView1.getVisibility() != 8)
          {
            localView1.measure(View.MeasureSpec.makeMeasureSpec(i2, -2147483648), j);
            this.e[i3] = localView1.getMeasuredWidth();
            this.f[i3] = localView1.getMeasuredHeight();
          }
        }
        n = a(this.e) + getPaddingLeft() + getPaddingRight();
        int[] arrayOfInt = this.f;
        i4 = 0;
        while (i < arrayOfInt.length)
        {
          i4 += arrayOfInt[i];
          i++;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.HorizontalPreferredLinearLayout
 * JD-Core Version:    0.7.0.1
 */