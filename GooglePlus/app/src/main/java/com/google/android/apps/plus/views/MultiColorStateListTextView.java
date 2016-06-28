package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MultiColorStateListTextView
  extends TextView
{
  public MultiColorStateListTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MultiColorStateListTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MultiColorStateListTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged()
  {
    invalidate();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.MultiColorStateListTextView
 * JD-Core Version:    0.7.0.1
 */