package com.google.android.libraries.photoeditor.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import efj;
import ghe;
import ghh;
import ghp;
import ghq;
import java.util.ArrayList;
import java.util.List;

public final class ParameterOverlayView
  extends View
{
  public final List<ghq> a = new ArrayList();
  public ghe b;
  private final Rect c = new Rect();
  private final RectF d = new RectF();
  private View e;
  private boolean f = true;
  
  public ParameterOverlayView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ParameterOverlayView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ParameterOverlayView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final Rect a()
  {
    if ((this.e == null) || (this.e.getRootView() != getRootView()))
    {
      this.c.set(0, 0, 0, 0);
      return this.c;
    }
    this.c.set(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
    View localView2;
    label224:
    label236:
    label242:
    for (ViewParent localViewParent1 = this.e.getParent();; localViewParent1 = localView2.getParent())
    {
      boolean bool = localViewParent1 instanceof View;
      Object localObject = null;
      ViewParent localViewParent3;
      if (bool)
      {
        localView2 = (View)localViewParent1;
        this.c.offset(localView2.getLeft() - localView2.getScrollX(), localView2.getTop() - localView2.getScrollY());
        localViewParent3 = getParent();
        if (!(localViewParent3 instanceof View)) {
          break label236;
        }
        if (localView2 != localViewParent3) {
          break label224;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label242;
        }
        localObject = localView2;
        View localView1;
        for (ViewParent localViewParent2 = getParent(); (localViewParent2 instanceof View); localViewParent2 = localView1.getParent())
        {
          localView1 = (View)localViewParent2;
          this.c.offset(localView1.getScrollX() - localView1.getLeft(), localView1.getScrollY() - localView1.getTop());
          if (localViewParent2 == localObject) {
            break;
          }
        }
        localViewParent3 = localViewParent3.getParent();
        break;
      }
    }
    Rect localRect1 = this.c;
    localRect1.left += this.e.getPaddingLeft();
    Rect localRect2 = this.c;
    localRect2.top += this.e.getPaddingTop();
    Rect localRect3 = this.c;
    localRect3.right -= this.e.getPaddingRight();
    Rect localRect4 = this.c;
    localRect4.bottom -= this.e.getPaddingBottom();
    return this.c;
  }
  
  public final void a(View paramView)
  {
    if ((paramView == null) || (paramView.getRootView() != getRootView())) {
      throw new IllegalArgumentException("The overlay target and the overlay have to be in the same view hierarchy.");
    }
    this.e = paramView;
  }
  
  public final boolean a(ghp paramghp, int paramInt)
  {
    boolean bool;
    int i;
    int j;
    if (paramghp != null)
    {
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
    }
    for (;;)
    {
      if (i >= this.a.size()) {
        break label84;
      }
      ghq localghq = (ghq)this.a.get(i);
      if (localghq.a == paramghp)
      {
        return false;
        bool = false;
        break;
      }
      if (localghq.b <= 0) {
        j = i + 1;
      }
      i++;
    }
    label84:
    this.a.add(j, new ghq(paramghp, 0));
    if (this.b == null) {
      this.b = new ghe();
    }
    ghe localghe = this.b;
    if (paramghp == null) {
      throw new IllegalArgumentException("Listener cannot be null");
    }
    if (!localghe.h.contains(paramghp)) {
      localghe.h.add(paramghp);
    }
    invalidate();
    return true;
  }
  
  public final RectF b()
  {
    Rect localRect = a();
    this.d.set(localRect);
    return this.d;
  }
  
  public final boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchHoverEvent(paramMotionEvent);
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    if (this.f) {
      for (int j = -1 + this.a.size(); j >= 0; j--)
      {
        ghp localghp2 = ((ghq)this.a.get(j)).a;
        if (localghp2.o) {
          localghp2.a(paramCanvas);
        }
      }
    }
    for (int i = 0; i < this.a.size(); i++)
    {
      ghp localghp1 = ((ghq)this.a.get(i)).a;
      if (localghp1.o) {
        localghp1.a(paramCanvas);
      }
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = isEnabled();
    boolean bool2 = false;
    ghe localghe2;
    int j;
    if (bool1)
    {
      ghe localghe1 = this.b;
      bool2 = false;
      if (localghe1 != null)
      {
        localghe2 = this.b;
        if (!localghe2.h.isEmpty()) {
          break label57;
        }
        j = 0;
        bool2 = false;
        if (j != 0) {
          bool2 = true;
        }
      }
    }
    return bool2;
    label57:
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      j = 1;
      break;
      localghe2.a = false;
      localghe2.d = 1;
      localghe2.g = true;
      localghe2.e = System.currentTimeMillis();
      float f4 = paramMotionEvent.getX();
      float f5 = paramMotionEvent.getY();
      localghe2.b(0, paramMotionEvent.getPointerId(0), f4, f5);
      localghe2.a(ghh.a, 0, f4, f5);
      continue;
      if (localghe2.g) {
        if (System.currentTimeMillis() - localghe2.e <= ViewConfiguration.getTapTimeout()) {
          localghe2.a(localghe2.c[0].x, localghe2.c[0].y);
        }
      }
      for (;;)
      {
        localghe2.a = false;
        localghe2.g = false;
        localghe2.e = 0L;
        localghe2.a(ghh.b, 0, localghe2.c[0].x, localghe2.c[0].y);
        break;
        localghe2.a(ghh.d, 0, localghe2.c[0].x, localghe2.c[0].y);
        continue;
        if (!localghe2.a) {
          localghe2.a(ghh.g, 0, localghe2.c[0].x, localghe2.c[0].y);
        }
      }
      if (!localghe2.a) {
        if (localghe2.d == 1)
        {
          int i2 = paramMotionEvent.findPointerIndex(localghe2.b[0]);
          float f1 = paramMotionEvent.getX(i2);
          float f2 = paramMotionEvent.getY(i2);
          float f3 = (float)Math.hypot(localghe2.c[0].x - f1, localghe2.c[0].y - f2);
          if ((localghe2.g) && (f3 >= localghe2.f))
          {
            localghe2.g = false;
            localghe2.a(ghh.e, 0, localghe2.c[0].x, localghe2.c[0].y);
          }
          if (!localghe2.g)
          {
            localghe2.c[0].set(f1, f2);
            localghe2.a(ghh.f, 0, localghe2.c[0].x, localghe2.c[0].y);
          }
        }
        else
        {
          int m = 0;
          if (m < localghe2.b.length)
          {
            int n = localghe2.b[m];
            int i1 = 0;
            label566:
            if (i1 < paramMotionEvent.getPointerCount()) {
              if (paramMotionEvent.getPointerId(i1) != n) {}
            }
            for (;;)
            {
              if (i1 != -1) {
                localghe2.c[m].set(paramMotionEvent.getX(i1), paramMotionEvent.getY(i1));
              }
              m++;
              break;
              i1++;
              break label566;
              i1 = -1;
            }
          }
          localghe2.a(ghh.j, localghe2.c);
          continue;
          if (localghe2.d == 1)
          {
            if (!localghe2.g) {
              localghe2.a(ghh.h, 0, 0.0F, 0.0F);
            }
            localghe2.g = false;
            int k = paramMotionEvent.getActionIndex();
            localghe2.b(1, paramMotionEvent.getPointerId(k), paramMotionEvent.getX(k), paramMotionEvent.getY(k));
            localghe2.d = 2;
            localghe2.a(ghh.i, localghe2.c);
            continue;
            int i = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
            if (paramMotionEvent.getPointerCount() <= 2)
            {
              localghe2.a(ghh.k, null);
              localghe2.a = true;
              if (i == localghe2.b[0]) {
                localghe2.b(0, localghe2.b[1], localghe2.c[1].x, localghe2.c[1].y);
              }
              localghe2.d = 1;
            }
            else if ((i == localghe2.b[0]) || (i == localghe2.b[1]))
            {
              localghe2.a(ghh.k, null);
              localghe2.b(0, paramMotionEvent.getPointerId(0), paramMotionEvent.getX(0), paramMotionEvent.getY(0));
              localghe2.b(1, paramMotionEvent.getPointerId(1), paramMotionEvent.getX(1), paramMotionEvent.getY(1));
              localghe2.a(ghh.i, localghe2.c);
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView
 * JD-Core Version:    0.7.0.1
 */