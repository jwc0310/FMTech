package com.google.android.apps.plus.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import eal;

public class WarmWelcomeIllustrationView
  extends ImageView
{
  public eal a;
  
  public WarmWelcomeIllustrationView(Context paramContext)
  {
    super(paramContext);
  }
  
  public WarmWelcomeIllustrationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public WarmWelcomeIllustrationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.a != null)
    {
      eal localeal = this.a;
      int i = getMeasuredWidth();
      getMeasuredHeight();
      localeal.a(i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.WarmWelcomeIllustrationView
 * JD-Core Version:    0.7.0.1
 */