package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import efj;

public class UpperCaseLabel
  extends TextView
{
  public UpperCaseLabel(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public UpperCaseLabel(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, efj.ym);
  }
  
  public UpperCaseLabel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    CharSequence localCharSequence = getText();
    if (localCharSequence != null) {
      setText(localCharSequence.toString().toUpperCase());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.UpperCaseLabel
 * JD-Core Version:    0.7.0.1
 */