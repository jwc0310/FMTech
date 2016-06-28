package com.google.android.libraries.social.accountswitcher;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import efj;

public final class TopInsetButton
  extends Button
{
  public TopInsetButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public TopInsetButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TopInsetButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @TargetApi(21)
  public TopInsetButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  protected final void onFinishInflate()
  {
    if (efj.z(getContext())) {
      setPadding(getPaddingLeft(), getPaddingTop() + efj.A(getContext()), getPaddingRight(), getPaddingBottom());
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.accountswitcher.TopInsetButton
 * JD-Core Version:    0.7.0.1
 */