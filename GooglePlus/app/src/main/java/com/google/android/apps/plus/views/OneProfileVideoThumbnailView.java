package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import hfa;
import loh;

public class OneProfileVideoThumbnailView
  extends MediaView
{
  private static Drawable a;
  private static Drawable b;
  
  public OneProfileVideoThumbnailView(Context paramContext)
  {
    super(paramContext);
    e(256);
    this.N = 0.5F;
    a = getContext().getResources().getDrawable(efj.ra);
    b = getContext().getResources().getDrawable(efj.oy);
  }
  
  public OneProfileVideoThumbnailView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    e(256);
    this.N = 0.5F;
    a = getContext().getResources().getDrawable(efj.ra);
    b = getContext().getResources().getDrawable(efj.oy);
  }
  
  public OneProfileVideoThumbnailView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    e(256);
    this.N = 0.5F;
    a = getContext().getResources().getDrawable(efj.ra);
    b = getContext().getResources().getDrawable(efj.oy);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    int k = a.getIntrinsicHeight();
    if (j > k) {}
    for (int m = j - k;; m = 0)
    {
      a.setBounds(0, 0, i, k);
      b.setBounds(0, 0, i, j);
      paramCanvas.save();
      paramCanvas.translate(0.0F, m);
      a.draw(paramCanvas);
      paramCanvas.restore();
      if (!new hfa(getContext(), loh.a).b()) {
        b.draw(paramCanvas);
      }
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = resolveSize(2147483647, paramInt1);
    int j = (int)Math.floor((i - getPaddingLeft() - getPaddingRight()) / 1.777778F) + getPaddingTop() + getPaddingBottom();
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(j, 1073741824));
    b(i, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.OneProfileVideoThumbnailView
 * JD-Core Version:    0.7.0.1
 */