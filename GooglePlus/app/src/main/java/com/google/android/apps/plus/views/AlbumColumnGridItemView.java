package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import lwj;
import lyg;
import mbb;

public class AlbumColumnGridItemView
  extends MediaView
  implements lyg
{
  private static int U;
  private static int V;
  private static int W;
  private static boolean a;
  private static Bitmap aa;
  private static Bitmap ab;
  private static Bitmap ac;
  private static Paint b;
  private static TextPaint c;
  private static Paint d;
  private static Rect e;
  private static int f;
  private static int g;
  private static int h;
  private lwj ad;
  
  public AlbumColumnGridItemView(Context paramContext)
  {
    this(paramContext, null);
    this.ad = ((lwj)mbb.a(paramContext, lwj.class));
  }
  
  public AlbumColumnGridItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.ad = ((lwj)mbb.a(paramContext, lwj.class));
    this.s = 2;
    this.v = true;
    b(true);
    Context localContext = paramContext.getApplicationContext();
    if (!a)
    {
      Resources localResources = localContext.getResources();
      c = efj.B(localContext, efj.yv);
      Paint localPaint1 = new Paint();
      b = localPaint1;
      localPaint1.setColor(localResources.getColor(efj.jl));
      b.setStyle(Paint.Style.FILL);
      Paint localPaint2 = new Paint();
      d = localPaint2;
      localPaint2.setColor(localResources.getColor(efj.ji));
      d.setStyle(Paint.Style.FILL);
      e = new Rect();
      h = localResources.getDimensionPixelSize(efj.kH);
      g = localResources.getDimensionPixelSize(efj.kJ);
      f = localResources.getDimensionPixelSize(efj.kI);
      U = localResources.getDimensionPixelSize(efj.kG);
      V = localResources.getDimensionPixelSize(efj.kK);
      W = localResources.getDimensionPixelSize(efj.kL);
      aa = efj.a(localResources, efj.ri);
      ab = efj.a(localResources, efj.pm);
      ac = efj.a(localResources, efj.si);
      a = true;
    }
  }
  
  public final boolean d()
  {
    return isEnabled();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    super.onDraw(paramCanvas);
    paramCanvas.restoreToCount(i);
    if (!n()) {}
    while (isEnabled()) {
      return;
    }
    e.set(0, 0, getWidth(), getHeight());
    paramCanvas.drawRect(e, d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.AlbumColumnGridItemView
 * JD-Core Version:    0.7.0.1
 */