package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import dvt;
import dvu;
import dyb;
import efj;
import isp;
import java.util.ArrayList;
import java.util.List;
import lwu;

public class PhotoOneUpSelectionButton
  extends View
  implements dvu
{
  public static Rect a;
  private static boolean i;
  private static Paint j;
  private static Bitmap k;
  private static Bitmap l;
  private static Bitmap m;
  private static Bitmap n;
  private static int o;
  public dvt b;
  public boolean c;
  public boolean d;
  public boolean e;
  public boolean f;
  public isp g;
  public dyb h;
  private List<lwu> p;
  private lwu q;
  
  public PhotoOneUpSelectionButton(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public PhotoOneUpSelectionButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public PhotoOneUpSelectionButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private final void a()
  {
    Resources localResources = getResources();
    if (!i)
    {
      int i1 = localResources.getInteger(efj.sn);
      Paint localPaint = new Paint();
      j = localPaint;
      localPaint.setAlpha(i1);
      l = efj.a(localResources, efj.rd);
      k = efj.a(localResources, efj.re);
      m = efj.a(localResources, efj.rc);
      n = efj.a(localResources, efj.pf);
      o = localResources.getDimensionPixelSize(efj.mP);
      a = new Rect(0, 0, 2 * o + l.getWidth(), 2 * o + l.getHeight());
      i = true;
    }
    this.p = new ArrayList();
  }
  
  public final void a(dvt paramdvt)
  {
    if (paramdvt == this.b)
    {
      if (!this.d) {
        break label105;
      }
      if (this.e) {
        break label78;
      }
      bool = true;
      if ((bool != this.e) && ((!bool) || (this.d)))
      {
        this.e = bool;
        if (this.h != null)
        {
          if (!this.e) {
            break label83;
          }
          this.h.a(this.g);
        }
        invalidate();
      }
    }
    label78:
    label83:
    label105:
    while (this.h == null) {
      for (;;)
      {
        return;
        boolean bool = false;
        continue;
        if (!this.h.b(this.g)) {
          this.e = true;
        }
      }
    }
    this.h.a(this);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Bitmap localBitmap;
    if (this.c)
    {
      if (!this.e) {
        break label61;
      }
      if (!this.f) {
        break label54;
      }
      localBitmap = m;
      if (!this.e) {
        break label82;
      }
    }
    label54:
    label61:
    label82:
    for (Paint localPaint = null;; localPaint = j)
    {
      paramCanvas.drawBitmap(localBitmap, o, o, localPaint);
      return;
      localBitmap = k;
      break;
      if (this.d)
      {
        localBitmap = l;
        break;
      }
      localBitmap = n;
      break;
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.p.remove(this.b);
    if ((this.c) && (this.b != null)) {
      this.p.add(this.b);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      int i3 = 0;
      for (;;)
      {
        label51:
        if ((i3 == 0) && (!this.p.contains(this.q)) && (!super.onTouchEvent(paramMotionEvent))) {
          break label260;
        }
        return true;
        for (int i5 = -1 + this.p.size(); i5 >= 0; i5--)
        {
          lwu locallwu = (lwu)this.p.get(i5);
          if (locallwu.a(i1, i2, 0))
          {
            this.q = locallwu;
            invalidate();
            i3 = 1;
            break label51;
          }
        }
        this.q = null;
        for (int i4 = -1 + this.p.size(); i4 >= 0; i4--) {
          if (((lwu)this.p.get(i4)).a(i1, i2, 1))
          {
            invalidate();
            i3 = 1;
            break label51;
          }
        }
        if ((this.q == null) || (!this.q.a(i1, i2, 3))) {
          break label252;
        }
        invalidate();
        this.q = null;
        i3 = 1;
      }
      label252:
      this.q = null;
    }
    label260:
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoOneUpSelectionButton
 * JD-Core Version:    0.7.0.1
 */