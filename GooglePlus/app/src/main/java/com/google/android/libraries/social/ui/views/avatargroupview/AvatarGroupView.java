package com.google.android.libraries.social.ui.views.avatargroupview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import lwo;

public final class AvatarGroupView
  extends ViewGroup
{
  private int[] a;
  private Integer b = Integer.valueOf(0);
  private Integer c = Integer.valueOf(0);
  
  public AvatarGroupView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public AvatarGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public AvatarGroupView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    View localView = getChildAt(paramInt1);
    if (localView != null) {
      localView.layout(paramInt2, paramInt3, paramInt4, paramInt5);
    }
  }
  
  private final void a(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = localResources.getDimensionPixelSize(efj.aaA);
    arrayOfInt[1] = localResources.getDimensionPixelSize(efj.aaB);
    arrayOfInt[2] = localResources.getDimensionPixelSize(efj.aaD);
    arrayOfInt[3] = localResources.getDimensionPixelSize(efj.aaF);
    this.a = arrayOfInt;
    this.b = Integer.valueOf(localResources.getDimensionPixelSize(efj.aaE));
    this.c = Integer.valueOf(localResources.getDimensionPixelSize(efj.aaC));
    lwo.g(this);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AvatarView localAvatarView = new AvatarView(getContext());
    localAvatarView.a(paramInt);
    localAvatarView.f = paramBoolean1;
    localAvatarView.invalidate();
    localAvatarView.d = true;
    localAvatarView.a(paramString1, paramString2);
    localAvatarView.e = 1;
    localAvatarView.setVisibility(0);
    addView(localAvatarView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getMeasuredWidth();
    int j = getMeasuredHeight();
    int k = getChildCount();
    int m = this.a[(-1 + Math.min(getChildCount(), this.a.length))];
    switch (k)
    {
    default: 
      a(0, 0, 0, m, m);
      a(1, i - m, 0, i, m);
      a(2, 0, j - m, m, j);
      a(3, i - m, j - m, i, j);
      return;
    case 1: 
      a(0, 0, 0, m, m);
      return;
    case 2: 
      a(0, 0, 0, m, m);
      a(1, i - m, j - m, i, j);
      return;
    }
    a(0, 0, m - this.c.intValue(), m, j - this.c.intValue());
    a(1, (i - m) / 2, this.b.intValue(), (i + m) / 2, m + this.b.intValue());
    a(2, m, m - this.c.intValue(), i, j - this.c.intValue());
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = resolveSize(0, paramInt1);
    int k = resolveSize(0, paramInt2);
    if (getChildCount() > 0)
    {
      int m = -1 + Math.min(getChildCount(), this.a.length);
      while (i <= m)
      {
        int n = this.a[m];
        int i1 = this.a[m];
        View localView = getChildAt(i);
        if (localView != null) {
          localView.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), View.MeasureSpec.makeMeasureSpec(i1, 1073741824));
        }
        i++;
      }
    }
    setMeasuredDimension(j, k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.avatargroupview.AvatarGroupView
 * JD-Core Version:    0.7.0.1
 */