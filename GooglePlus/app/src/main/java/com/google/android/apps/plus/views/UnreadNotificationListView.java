package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import efj;

public class UnreadNotificationListView
  extends ListView
{
  private static int a = -1;
  private static int b = -1;
  
  public UnreadNotificationListView(Context paramContext)
  {
    super(paramContext);
    if (a < 0)
    {
      Resources localResources = getResources();
      a = localResources.getDimensionPixelSize(efj.mz);
      b = localResources.getDimensionPixelSize(efj.mx);
    }
  }
  
  public UnreadNotificationListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (a < 0)
    {
      Resources localResources = getResources();
      a = localResources.getDimensionPixelSize(efj.mz);
      b = localResources.getDimensionPixelSize(efj.mx);
    }
  }
  
  public UnreadNotificationListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (a < 0)
    {
      Resources localResources = getResources();
      a = localResources.getDimensionPixelSize(efj.mz);
      b = localResources.getDimensionPixelSize(efj.mx);
    }
  }
  
  private static void a(View paramView, int paramInt)
  {
    int i = paramInt - paramView.getBottom();
    if (i > 0) {
      paramView.layout(paramView.getLeft(), i + paramView.getTop(), paramView.getRight(), i + paramView.getBottom());
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    int i = getMeasuredHeight();
    int j = getCount();
    View localView1;
    int k;
    if (j > 0)
    {
      localView1 = getChildAt(0);
      if (localView1 != null)
      {
        k = getDividerHeight();
        View localView4 = localView1.findViewById(aaw.fX);
        int m = 0;
        if (localView4 != null) {
          m = 1;
        }
        if (m == 0) {}
      }
      switch (j)
      {
      default: 
        View localView2 = getChildAt(j - 1);
        if (localView2 != null) {
          a(localView2, paramInt4);
        }
        break;
      }
    }
    View localView3;
    do
    {
      int n;
      int i1;
      do
      {
        return;
        int i3 = i - k - a;
        localView1.layout(localView1.getLeft(), localView1.getTop(), localView1.getRight(), i3 + localView1.getTop());
        break;
        n = i - (k << 1) - b - a;
        i1 = localView1.getTop();
        localView1.layout(localView1.getLeft(), i1, localView1.getRight(), i1 + n);
      } while (getChildCount() <= 1);
      int i2 = k + (n + i1);
      View localView5 = getChildAt(1);
      localView5.layout(localView5.getLeft(), i2, localView5.getRight(), i2 + b);
      break;
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      localView3 = getChildAt(j - 1);
    } while (localView3 == null);
    a(localView3, paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.UnreadNotificationListView
 * JD-Core Version:    0.7.0.1
 */