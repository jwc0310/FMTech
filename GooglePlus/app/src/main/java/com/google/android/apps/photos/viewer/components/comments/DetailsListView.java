package com.google.android.apps.photos.viewer.components.comments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ListView;
import bap;

public class DetailsListView
  extends ListView
{
  private int a = -1;
  
  public DetailsListView(Context paramContext)
  {
    super(paramContext);
    setOnScrollListener(new bap(this));
  }
  
  public DetailsListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnScrollListener(new bap(this));
  }
  
  public DetailsListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOnScrollListener(new bap(this));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.a > 0) && (getMeasuredWidth() > this.a)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), paramInt2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.viewer.components.comments.DetailsListView
 * JD-Core Version:    0.7.0.1
 */