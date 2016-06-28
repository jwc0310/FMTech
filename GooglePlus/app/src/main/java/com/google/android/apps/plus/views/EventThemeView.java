package com.google.android.apps.plus.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import bqo;
import com.google.android.libraries.social.media.ui.MediaView;
import ipf;
import ipm;

public class EventThemeView
  extends MediaView
{
  private static int d;
  private static int e;
  private String a;
  private String b;
  private boolean c;
  
  public EventThemeView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public EventThemeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public EventThemeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    if (d == 0)
    {
      int i = bqo.a(paramContext);
      d = i;
      e = bqo.a(i);
    }
    this.s = 0;
    b(d, e);
  }
  
  public final void D_()
  {
    super.D_();
    this.a = null;
    this.b = null;
  }
  
  public final void a(String paramString1, String paramString2)
  {
    if ((!TextUtils.equals(paramString1, this.a)) || (!TextUtils.equals(paramString2, this.b)))
    {
      this.a = paramString1;
      this.c = false;
      if (this.a == null) {
        break label102;
      }
      this.b = paramString2;
      a(ipf.a(getContext(), this.a, ipm.a), null, true);
    }
    for (;;)
    {
      String str = this.b;
      Drawable localDrawable = null;
      if (str != null) {
        localDrawable = Drawable.createFromPath(this.b);
      }
      this.p = localDrawable;
      this.r = localDrawable;
      requestLayout();
      return;
      label102:
      this.b = null;
      a(null, null, true);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt4 - paramInt2 > 0) && (!this.c))
    {
      this.c = true;
      a(this.a, this.b);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j;
    if (i == 1073741824) {
      j = View.MeasureSpec.getSize(paramInt1);
    }
    for (;;)
    {
      setMeasuredDimension(j, bqo.a(j));
      return;
      j = 0;
      if (i == -2147483648) {
        j = Math.min(0, View.MeasureSpec.getSize(paramInt1));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.EventThemeView
 * JD-Core Version:    0.7.0.1
 */