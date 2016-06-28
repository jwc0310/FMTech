package com.google.android.libraries.social.sharekit.impl.drafts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageButton;
import efj;

public final class ImageButtonWithCount
  extends ImageButton
{
  public int a;
  private final Paint b;
  private final Paint c;
  private final Paint d;
  private final Context e;
  
  public ImageButtonWithCount(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.e = paramContext;
    this.b = new Paint();
    this.b.setColor(paramContext.getResources().getColor(efj.UV));
    this.c = new Paint();
    this.c.setColor(paramContext.getResources().getColor(efj.UW));
    this.d = new Paint();
    this.d.setColor(paramContext.getResources().getColor(efj.UW));
    this.d.setTextSize(TypedValue.applyDimension(1, 7.0F, efj.K(this.e)));
    this.d.setTextAlign(Paint.Align.CENTER);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    float f1 = paramCanvas.getHeight();
    float f2 = paramCanvas.getWidth();
    float f3 = getDrawable().getIntrinsicWidth();
    float f4 = getDrawable().getIntrinsicHeight();
    if (this.a > 0)
    {
      float f5 = f2 / 2.0F + f3 / 4.0F + TypedValue.applyDimension(1, 3.0F, efj.K(this.e));
      float f6 = f1 / 2.0F - f4 / 4.0F + TypedValue.applyDimension(1, -3.0F, efj.K(this.e));
      float f7 = f3 / 4.0F;
      float f8 = f7 + TypedValue.applyDimension(1, 1.0F, efj.K(this.e));
      float f9 = f6 + TypedValue.applyDimension(1, 2.0F, efj.K(this.e));
      paramCanvas.drawCircle(f5, f6, f8, this.c);
      paramCanvas.drawCircle(f5, f6, f7, this.b);
      paramCanvas.drawText(Integer.toString(this.a), f5, f9, this.d);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.drafts.ImageButtonWithCount
 * JD-Core Version:    0.7.0.1
 */