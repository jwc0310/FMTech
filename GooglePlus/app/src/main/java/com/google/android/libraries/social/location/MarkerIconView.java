package com.google.android.libraries.social.location;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import ikb;
import ikd;
import java.util.Arrays;
import lxj;
import nve;

public final class MarkerIconView
  extends View
  implements ikd, lxj
{
  private ikb a;
  private Bitmap b;
  private int c;
  
  public MarkerIconView(Context paramContext)
  {
    super(paramContext, null);
  }
  
  public MarkerIconView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public MarkerIconView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    this.a.a();
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
  }
  
  public final void a(int paramInt, String paramString)
  {
    if (paramInt == 2) {}
    for (boolean bool = true;; bool = false)
    {
      nve localnve = new nve();
      localnve.d = paramString;
      this.a = new ikb(getContext(), Arrays.asList(new nve[] { localnve }), bool, false);
      this.a.f = this;
      invalidate();
      return;
    }
  }
  
  public final void a(ikb paramikb)
  {
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
    invalidate();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((this.b == null) && (this.a != null)) {
      this.b = this.a.d();
    }
    if (this.b != null) {
      paramCanvas.drawBitmap(this.b, this.c, 0.0F, null);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    Context localContext = getContext();
    ikb.a(localContext);
    int i = ikb.c;
    ikb.a(localContext);
    int j = ikb.d;
    ikb.a(localContext);
    int k = (int)(2.0D * ((ikb.e.x - 0.5D) * i));
    int m = i + Math.abs(k);
    if (k < 0) {}
    for (int n = -k;; n = 0)
    {
      this.c = n;
      setMeasuredDimension(m, j);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.location.MarkerIconView
 * JD-Core Version:    0.7.0.1
 */