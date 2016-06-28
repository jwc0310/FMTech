package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.libraries.social.media.ui.MediaView;
import ipf;

public final class OneProfileReviewsSummaryMapView
  extends MediaView
{
  private float a;
  
  public OneProfileReviewsSummaryMapView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileReviewsSummaryMapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileReviewsSummaryMapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a == 0.0F)
    {
      ipf localipf = this.t;
      if (localipf != null)
      {
        String str = localipf.c;
        if (!TextUtils.isEmpty(str))
        {
          int i = str.indexOf("size=");
          if (i != -1)
          {
            int j = i + 5;
            int k = str.indexOf('&', j);
            if (k == -1) {
              k = str.length();
            }
            String[] arrayOfString = str.substring(j, k).split("x");
            if (arrayOfString.length == 2)
            {
              int m = Integer.parseInt(arrayOfString[0]);
              int n = Integer.parseInt(arrayOfString[1]);
              this.a = (m / n);
            }
          }
        }
      }
    }
    if (this.a != 0.0F) {}
    for (float f = this.a;; f = 1.431034F)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec((int)Math.floor((resolveSize(2147483647, paramInt1) - getPaddingLeft() - getPaddingRight()) / f) + getPaddingTop() + getPaddingBottom(), 1073741824));
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileReviewsSummaryMapView
 * JD-Core Version:    0.7.0.1
 */