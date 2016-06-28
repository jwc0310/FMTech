package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AllPhotosBar
  extends RelativeLayout
{
  public TextView a;
  public ProgressBar b;
  
  public AllPhotosBar(Context paramContext)
  {
    super(paramContext);
  }
  
  public AllPhotosBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AllPhotosBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aaw.ku));
    this.b = ((ProgressBar)findViewById(aaw.hU));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AllPhotosBar
 * JD-Core Version:    0.7.0.1
 */