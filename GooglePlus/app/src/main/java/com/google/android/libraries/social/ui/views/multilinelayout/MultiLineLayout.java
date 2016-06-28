package com.google.android.libraries.social.ui.views.multilinelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import lzg;
import lzh;
import lzi;

public final class MultiLineLayout
  extends ViewGroup
{
  public int a = 0;
  public int b = 0;
  public int c = 0;
  private lzh d = new lzh(this);
  private lzi e = new lzg(this);
  
  public MultiLineLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final int a(int paramInt)
  {
    return Math.max(getPaddingTop() * (paramInt + 1) + paramInt * this.b, this.c);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e.a(paramInt3 - paramInt1);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    lzh locallzh = this.d;
    int i = this.c;
    locallzh.c = paramInt1;
    locallzh.d = paramInt2;
    locallzh.e = i;
    locallzh.b = 0;
    locallzh.a = 0;
    this.d.a(resolveSize(2147483647, paramInt1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.multilinelayout.MultiLineLayout
 * JD-Core Version:    0.7.0.1
 */