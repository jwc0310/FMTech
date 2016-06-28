package com.google.android.libraries.social.ui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.LinearLayout;
import lua;

@TargetApi(11)
public final class FullSizeLinearLayout
  extends LinearLayout
{
  private int a;
  private float b;
  
  public FullSizeLinearLayout(Context paramContext)
  {
    this(paramContext, null);
    a(paramContext, null);
  }
  
  public FullSizeLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public FullSizeLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lua.d);
    this.a = localTypedArray.getDimensionPixelSize(lua.e, 2147483647);
    this.b = localTypedArray.getFloat(lua.f, 0.0F);
    localTypedArray.recycle();
    if (this.b > 0.0F)
    {
      WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
      this.a = Math.round(this.b * localDisplayMetrics.heightPixels);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.a > 0)
    {
      if (View.MeasureSpec.getMode(paramInt1) == -2147483648) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
      }
      if (View.MeasureSpec.getMode(paramInt2) != -2147483648) {}
    }
    for (paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(paramInt2), this.a), 1073741824);; paramInt2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), 1073741824))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
      paramInt1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1), 1073741824);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.FullSizeLinearLayout
 * JD-Core Version:    0.7.0.1
 */