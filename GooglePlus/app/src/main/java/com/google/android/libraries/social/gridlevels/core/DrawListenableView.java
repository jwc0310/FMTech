package com.google.android.libraries.social.gridlevels.core;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import icn;

public final class DrawListenableView
  extends View
{
  private icn a;
  
  public DrawListenableView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DrawListenableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DrawListenableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a != null) {
      this.a.a(this, paramCanvas);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gridlevels.core.DrawListenableView
 * JD-Core Version:    0.7.0.1
 */