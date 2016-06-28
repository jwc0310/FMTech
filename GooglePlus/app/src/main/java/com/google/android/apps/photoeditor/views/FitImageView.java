package com.google.android.apps.photoeditor.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

public class FitImageView
  extends View
{
  public Bitmap a;
  public boolean b;
  public float c;
  private final Matrix d = new Matrix();
  private final Paint e = new Paint();
  
  public FitImageView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public FitImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public FitImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private final void a()
  {
    setBackgroundColor(0);
    this.e.setAntiAlias(true);
    this.e.setFilterBitmap(true);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a == null) {
      return;
    }
    int i;
    int j;
    int k;
    int m;
    Point localPoint;
    if (this.b)
    {
      i = getWidth();
      j = getHeight();
      if (this.a != null)
      {
        k = this.a.getWidth();
        m = this.a.getHeight();
        this.d.setTranslate(-k / 2.0F, -m / 2.0F);
        this.d.postRotate(this.c);
        this.d.postTranslate(i / 2.0F, j / 2.0F);
        if ((this.c != 90.0F) && (this.c != 270.0F)) {
          break label305;
        }
        localPoint = new Point();
        if ((j > 0) && (i > 0) && (k > 0) && (m > 0)) {
          break label205;
        }
        localPoint.set(0, 0);
      }
    }
    label305:
    for (;;)
    {
      float f = localPoint.x / k;
      this.d.postScale(f, f, i / 2.0F, j / 2.0F);
      this.b = false;
      paramCanvas.drawBitmap(this.a, this.d, this.e);
      return;
      label205:
      if ((k <= j) && (m <= i))
      {
        localPoint.set(k, m);
      }
      else if (k / m >= j / i)
      {
        localPoint.x = Math.min(k, j);
        localPoint.y = (m * localPoint.x / k);
      }
      else
      {
        localPoint.y = Math.min(m, i);
        localPoint.x = (k * localPoint.y / m);
        continue;
        localPoint = new Point();
        if ((i <= 0) || (j <= 0) || (k <= 0) || (m <= 0))
        {
          localPoint.set(0, 0);
        }
        else if ((k <= i) && (m <= j))
        {
          localPoint.set(k, m);
        }
        else if (k / m >= i / j)
        {
          localPoint.x = Math.min(k, i);
          localPoint.y = (m * localPoint.x / k);
        }
        else
        {
          localPoint.y = Math.min(m, j);
          localPoint.x = (k * localPoint.y / m);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.b = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photoeditor.views.FitImageView
 * JD-Core Version:    0.7.0.1
 */