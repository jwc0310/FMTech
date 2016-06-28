package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import com.google.android.libraries.social.ui.views.RecyclingViewGroup;
import efj;

public class StreamOneUpViewGroup
  extends ViewGroup
{
  public LinearLayout a;
  public MentionMultiAutoCompleteTextView b;
  public View c;
  public View d;
  public RecyclingViewGroup e;
  private float f;
  private int g;
  private boolean h;
  
  public StreamOneUpViewGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StreamOneUpViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StreamOneUpViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.h = efj.L(paramContext);
    if (this.h) {}
    for (float f1 = 0.9F;; f1 = 1.0F)
    {
      this.f = f1;
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt)
    {
      this.g = paramInt;
      requestLayout();
      invalidate();
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((LinearLayout)findViewById(aaw.dG));
    this.b = ((MentionMultiAutoCompleteTextView)this.a.findViewById(aaw.dL));
    this.c = this.a.findViewById(aaw.dJ);
    this.d = findViewById(aaw.im);
    this.e = ((RecyclingViewGroup)this.d.findViewById(16908298));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    if (paramInt2 < 0) {
      j -= paramInt2;
    }
    int k = this.d.getMeasuredWidth();
    int m = this.d.getMeasuredHeight();
    int n = this.a.getMeasuredWidth();
    int i1 = (i - k) / 2;
    this.d.layout(i1, 0, k + i1, m);
    int i2 = (i - n) / 2;
    if (this.a.getVisibility() != 8) {
      this.a.layout(i2, j - this.a.getMeasuredHeight(), n + i2, j);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    if (this.a.getVisibility() != 8) {
      this.a.measure(i, j);
    }
    for (int k = this.a.getMeasuredHeight();; k = 0)
    {
      int m = View.MeasureSpec.getSize(paramInt2);
      int n = (int)(this.f * m);
      int i1 = n - k;
      int i2 = ((FrameLayout.LayoutParams)getLayoutParams()).topMargin;
      if (i2 < 0) {}
      for (int i3 = i1 - i2;; i3 = i1)
      {
        int i4 = Math.max(0, i3);
        this.d.measure(i, View.MeasureSpec.makeMeasureSpec(i4, -2147483648));
        int i5 = 0 + this.d.getMeasuredHeight();
        if (this.h) {}
        for (int i6 = Math.min(i5 + k, n);; i6 = n)
        {
          setMeasuredDimension(this.g, i6);
          return;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.StreamOneUpViewGroup
 * JD-Core Version:    0.7.0.1
 */