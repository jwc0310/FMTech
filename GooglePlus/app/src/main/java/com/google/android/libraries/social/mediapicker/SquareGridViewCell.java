package com.google.android.libraries.social.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public final class SquareGridViewCell
  extends FrameLayout
{
  public float a = 1.0F;
  
  public SquareGridViewCell(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareGridViewCell(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareGridViewCell(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (View.MeasureSpec.getMode(paramInt2) != 0)
    {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize(paramInt2) * this.a), 1073741824), paramInt2);
      return;
    }
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize(paramInt1) / this.a), 1073741824));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediapicker.SquareGridViewCell
 * JD-Core Version:    0.7.0.1
 */