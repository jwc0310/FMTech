package com.google.android.libraries.social.ui.swiperefresh;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import efj;
import lvx;
import lvy;
import tf;

public final class SwipeRefreshLayoutWithUpScroll
  extends SwipeRefreshLayout
{
  public lvy m;
  public final Runnable n = new lvx(this);
  public final int o = getResources().getInteger(17694721);
  
  public SwipeRefreshLayoutWithUpScroll(Context paramContext)
  {
    super(paramContext);
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = efj.aab;
    arrayOfInt[1] = efj.aaa;
    arrayOfInt[2] = efj.ZW;
    arrayOfInt[3] = efj.ZX;
    arrayOfInt[4] = efj.ZY;
    arrayOfInt[5] = efj.aac;
    arrayOfInt[6] = efj.ZZ;
    a(arrayOfInt);
  }
  
  public SwipeRefreshLayoutWithUpScroll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = new int[7];
    arrayOfInt[0] = efj.aab;
    arrayOfInt[1] = efj.aaa;
    arrayOfInt[2] = efj.ZW;
    arrayOfInt[3] = efj.ZX;
    arrayOfInt[4] = efj.ZY;
    arrayOfInt[5] = efj.aac;
    arrayOfInt[6] = efj.ZZ;
    a(arrayOfInt);
  }
  
  public final void a(tf paramtf)
  {
    super.a(paramtf);
    if ((paramtf instanceof lvy)) {
      this.m = ((lvy)paramtf);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll
 * JD-Core Version:    0.7.0.1
 */