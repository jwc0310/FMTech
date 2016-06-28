package com.google.android.libraries.social.oneprofile.about;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import aw;

public final class OneProfileAboutReviewSummaryHistogramView
  extends LinearLayout
{
  private static final int[] b;
  private static final int[] c;
  private static final int[] d;
  private static int e;
  float[] a = new float[5];
  private int f;
  private int g;
  private View[] h = new View[5];
  private View[] i = new View[5];
  private View[] j = new View[5];
  
  static
  {
    int[] arrayOfInt1 = new int[5];
    arrayOfInt1[0] = aw.bf;
    arrayOfInt1[1] = aw.be;
    arrayOfInt1[2] = aw.bd;
    arrayOfInt1[3] = aw.bc;
    arrayOfInt1[4] = aw.bb;
    b = arrayOfInt1;
    int[] arrayOfInt2 = new int[5];
    arrayOfInt2[0] = aw.ba;
    arrayOfInt2[1] = aw.aZ;
    arrayOfInt2[2] = aw.aY;
    arrayOfInt2[3] = aw.aX;
    arrayOfInt2[4] = aw.aW;
    c = arrayOfInt2;
    int[] arrayOfInt3 = new int[5];
    arrayOfInt3[0] = aw.cl;
    arrayOfInt3[1] = aw.ck;
    arrayOfInt3[2] = aw.cj;
    arrayOfInt3[3] = aw.ci;
    arrayOfInt3[4] = aw.ch;
    d = arrayOfInt3;
  }
  
  public OneProfileAboutReviewSummaryHistogramView(Context paramContext)
  {
    super(paramContext);
    if (e == 0) {
      e = getContext().getResources().getDimensionPixelSize(aaw.pg);
    }
  }
  
  public OneProfileAboutReviewSummaryHistogramView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (e == 0) {
      e = getContext().getResources().getDimensionPixelSize(aaw.pg);
    }
  }
  
  public OneProfileAboutReviewSummaryHistogramView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (e == 0) {
      e = getContext().getResources().getDimensionPixelSize(aaw.pg);
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    for (int k = 0; k < 5; k++) {
      this.h[k] = findViewById(b[k]);
    }
    int n;
    for (int m = 0;; m++)
    {
      n = 0;
      if (m >= 5) {
        break;
      }
      this.j[m] = findViewById(c[m]);
    }
    while (n < 5)
    {
      this.i[n] = findViewById(d[n]);
      n++;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 0;
    if (this.g == 0)
    {
      super.onMeasure(paramInt1, paramInt2);
      for (int n = 0; n < 5; n++) {
        this.g = Math.max(this.g, this.h[n].getMeasuredWidth());
      }
      for (int i1 = 0; i1 < 5; i1++) {
        this.i[i1].getLayoutParams().width = this.g;
      }
    }
    if (paramInt1 != 0)
    {
      int m = resolveSize(2147483647, paramInt1);
      if (this.f != m)
      {
        this.f = (m - this.g - e);
        while (k < 5)
        {
          this.j[k].getLayoutParams().width = ((int)Math.floor(this.f * this.a[k]));
          k++;
        }
      }
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), paramInt2);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutReviewSummaryHistogramView
 * JD-Core Version:    0.7.0.1
 */