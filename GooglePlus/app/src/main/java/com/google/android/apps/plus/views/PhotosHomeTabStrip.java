package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import efj;

public class PhotosHomeTabStrip
  extends LinearLayout
{
  public final Paint a;
  int b;
  float c;
  private final int d;
  private final Paint e;
  private final int f;
  private final Paint g;
  
  public PhotosHomeTabStrip(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PhotosHomeTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    Resources localResources = paramContext.getResources();
    this.d = localResources.getDimensionPixelSize(efj.nf);
    this.e = new Paint();
    this.e.setColor(localResources.getColor(efj.jR));
    this.f = localResources.getDimensionPixelSize(efj.ng);
    this.a = new Paint();
    this.g = new Paint();
    this.g.setColor(localResources.getColor(efj.jS));
    this.g.setStrokeWidth(localResources.getDimensionPixelSize(efj.mc));
    localResources.getDimensionPixelSize(efj.ni);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = getHeight();
    if (getChildCount() > 0)
    {
      View localView1 = getChildAt(this.b);
      int j = localView1.getLeft();
      int k = localView1.getRight();
      if ((this.c > 0.0F) && (this.b < -1 + getChildCount()))
      {
        View localView2 = getChildAt(1 + this.b);
        int m = localView2.getLeft();
        int n = localView2.getRight();
        j = (int)(this.c * m + (1.0F - this.c) * j);
        k = (int)(this.c * n + (1.0F - this.c) * k);
      }
      paramCanvas.drawRect(j, i - this.f, k, i, this.a);
    }
    paramCanvas.drawRect(0.0F, i - this.d, getWidth(), i, this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotosHomeTabStrip
 * JD-Core Version:    0.7.0.1
 */