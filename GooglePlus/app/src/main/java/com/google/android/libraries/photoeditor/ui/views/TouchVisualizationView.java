package com.google.android.libraries.photoeditor.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import efj;
import gft;
import ghj;
import ghn;
import ghu;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TouchVisualizationView
  extends View
  implements ghn
{
  public Integer a;
  private final ghj<Integer, ghu> b = new ghj();
  private final Paint d = new Paint();
  private final Rect e = new Rect();
  private final int[] f = new int[2];
  private int g;
  private Drawable h;
  private boolean i;
  
  public TouchVisualizationView(Context paramContext)
  {
    super(paramContext);
    a(null);
  }
  
  public TouchVisualizationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public TouchVisualizationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private final void a(AttributeSet paramAttributeSet)
  {
    this.g = getResources().getInteger(17694720);
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, gft.J);
    int j = -1 + localTypedArray.getIndexCount();
    int k = -12417548;
    if (j >= 0)
    {
      int m = localTypedArray.getIndex(j);
      if (m == gft.K) {
        k = localTypedArray.getColor(m, -12417548);
      }
      for (;;)
      {
        j--;
        break;
        if (m == gft.N) {
          this.g = localTypedArray.getInteger(m, this.g);
        } else if (m == gft.M)
        {
          if (localTypedArray.getResourceId(m, 0) > 0) {
            this.h = localTypedArray.getDrawable(m);
          }
        }
        else if (m == gft.L) {
          this.i = localTypedArray.getBoolean(m, false);
        }
      }
    }
    localTypedArray.recycle();
    this.d.setColor(k);
    this.d.setAntiAlias(true);
    this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
  }
  
  private final boolean a(ghu paramghu, boolean paramBoolean, Canvas paramCanvas)
  {
    int j = 255;
    if (getDrawingTime() >= paramghu.e + this.g) {
      return false;
    }
    if (paramBoolean)
    {
      float f1 = 1.0F - (float)(getDrawingTime() - paramghu.e) / this.g;
      j = efj.a(Math.round(255.0F * (f1 * f1)), 0, j);
    }
    this.d.setAlpha(j);
    if (this.h != null)
    {
      this.h.setBounds(paramghu.a(0, 0));
      this.h.draw(paramCanvas);
    }
    for (;;)
    {
      return true;
      paramCanvas.clipRect(paramghu.a(0, 0), Region.Op.UNION);
      paramCanvas.drawCircle(paramghu.a, paramghu.b, paramghu.c, this.d);
    }
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    if ((this.a == null) || (paramMotionEvent.getDeviceId() == this.a.intValue()))
    {
      getLocationInWindow(this.f);
      this.e.setEmpty();
      for (int j = 0; j < paramMotionEvent.getPointerCount(); j++)
      {
        ghu localghu = new ghu(paramMotionEvent, j);
        this.e.union(localghu.a(-this.f[0], -this.f[1]));
        ghj localghj = this.b;
        Integer localInteger = Integer.valueOf(paramMotionEvent.getPointerId(j));
        if (!localghj.containsKey(localInteger)) {
          localghj.put(localInteger, new ArrayDeque());
        }
        ((Deque)localghj.get(localInteger)).add(localghu);
      }
      invalidate(this.e);
    }
    return false;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (this.b.isEmpty()) {
      return;
    }
    getLocationInWindow(this.f);
    this.e.setEmpty();
    int j = paramCanvas.save();
    paramCanvas.translate(-this.f[0], -this.f[1]);
    Iterator localIterator1 = this.b.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Deque localDeque = (Deque)((Map.Entry)localIterator1.next()).getValue();
      boolean bool1;
      Iterator localIterator2;
      boolean bool2;
      boolean bool3;
      if (((ghu)localDeque.getLast()).d == 1)
      {
        bool1 = true;
        localIterator2 = localDeque.descendingIterator();
        bool2 = false;
        bool3 = bool1;
      }
      for (;;)
      {
        if (!localIterator2.hasNext()) {
          break label269;
        }
        ghu localghu = (ghu)localIterator2.next();
        if ((this.i) && (!bool2))
        {
          bool2 = a(localghu, bool3, paramCanvas);
          this.e.union(localghu.a(-this.f[0], -this.f[1]));
          continue;
          bool1 = false;
          break;
        }
        if ((!this.i) && (a(localghu, bool3, paramCanvas)))
        {
          this.e.union(localghu.a(-this.f[0], -this.f[1]));
          bool3 = true;
        }
        else
        {
          localIterator2.remove();
        }
      }
      label269:
      if (localDeque.isEmpty()) {
        localIterator1.remove();
      }
    }
    paramCanvas.restoreToCount(j);
    invalidate(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.ui.views.TouchVisualizationView
 * JD-Core Version:    0.7.0.1
 */