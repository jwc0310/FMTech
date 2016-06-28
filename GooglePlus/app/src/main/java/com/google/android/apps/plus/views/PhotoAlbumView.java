package com.google.android.apps.plus.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import dxy;
import dxz;

public class PhotoAlbumView
  extends RelativeLayout
{
  private float a = 1.0F;
  private AlphaAnimation b = new AlphaAnimation(0.0F, 1.0F);
  private AlphaAnimation c;
  
  public PhotoAlbumView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PhotoAlbumView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b.setInterpolator(new DecelerateInterpolator());
    this.b.setDuration(250L);
    this.b.setAnimationListener(new dxy(this));
    this.c = new AlphaAnimation(1.0F, 0.0F);
    this.c.setInterpolator(new AccelerateInterpolator());
    this.c.setStartOffset(500L);
    this.c.setDuration(250L);
    this.c.setAnimationListener(new dxz(this));
    if (Build.VERSION.SDK_INT < 11) {
      new AlphaAnimation(1.0F, 1.0F);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoAlbumView
 * JD-Core Version:    0.7.0.1
 */