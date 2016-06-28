package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import efj;
import ok;

public class PhotosHomeTabContainer
  extends HorizontalScrollView
  implements ok
{
  public PhotosHomeTabStrip a;
  public ViewPager b;
  public boolean c;
  private final int d;
  private int e;
  private int f;
  
  public PhotosHomeTabContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PhotosHomeTabContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    BitmapDrawable localBitmapDrawable = (BitmapDrawable)getResources().getDrawable(efj.rk);
    localBitmapDrawable.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    setBackgroundDrawable(localBitmapDrawable);
    setHorizontalScrollBarEnabled(false);
    this.d = paramContext.getResources().getDimensionPixelSize(efj.nh);
  }
  
  public final void a(int paramInt)
  {
    if (this.e == 0)
    {
      PhotosHomeTabStrip localPhotosHomeTabStrip = this.a;
      localPhotosHomeTabStrip.b = paramInt;
      localPhotosHomeTabStrip.c = 0.0F;
      localPhotosHomeTabStrip.invalidate();
      a(paramInt, 0);
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = this.a.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {
      return;
    }
    PhotosHomeTabStrip localPhotosHomeTabStrip = this.a;
    localPhotosHomeTabStrip.b = paramInt1;
    localPhotosHomeTabStrip.c = paramFloat;
    localPhotosHomeTabStrip.invalidate();
    View localView = this.a.getChildAt(paramInt1);
    if (localView == null) {}
    for (int j = 0;; j = (int)(paramFloat * localView.getWidth()))
    {
      a(paramInt1, j);
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = this.a.getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {}
    int j;
    do
    {
      View localView;
      do
      {
        return;
        if (this.e == 0) {
          c(paramInt1);
        }
        localView = this.a.getChildAt(paramInt1);
      } while (localView == null);
      j = paramInt2 + localView.getLeft();
      if ((paramInt1 > 0) || (paramInt2 > 0)) {
        j -= this.d;
      }
    } while (j == this.f);
    this.f = j;
    scrollTo(j, 0);
  }
  
  public final void b(int paramInt)
  {
    this.e = paramInt;
    if (this.e == 0) {
      c(this.b.d);
    }
  }
  
  public final void c(int paramInt)
  {
    int i = this.a.getChildCount();
    if (i >= 0)
    {
      View localView = this.a.getChildAt(i);
      TextView localTextView;
      if ((localView instanceof TextView))
      {
        localTextView = (TextView)localView;
        if (i != paramInt) {
          break label67;
        }
      }
      label67:
      for (int j = getContext().getResources().getColor(efj.jQ);; j = getContext().getResources().getColor(efj.jP))
      {
        localTextView.setTextColor(j);
        i--;
        break;
      }
    }
    invalidate();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((PhotosHomeTabStrip)findViewById(aaw.gT));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotosHomeTabContainer
 * JD-Core Version:    0.7.0.1
 */