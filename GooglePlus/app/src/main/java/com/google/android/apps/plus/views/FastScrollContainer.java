package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.ui.swiperefresh.SwipeRefreshLayoutWithUpScroll;
import dxb;
import dxc;
import dxd;
import dxe;
import dxf;
import dxg;
import efj;

public class FastScrollContainer
  extends FrameLayout
  implements ViewGroup.OnHierarchyChangeListener, AbsListView.OnScrollListener
{
  public dxf a;
  public AbsListView.OnScrollListener b;
  private FastScrollListView c;
  private TextView d;
  private dxg e;
  private final dxd f = dxd.b;
  private final dxc g = dxc.b;
  
  public FastScrollContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public FastScrollContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public FastScrollContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    setWillNotDraw(false);
    setOnHierarchyChangeListener(this);
    this.d = new TextView(paramContext, paramAttributeSet, paramInt);
    this.d.setTextAppearance(paramContext, efj.yP);
    this.d.setBackgroundDrawable(getResources().getDrawable(efj.oU));
    this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    Resources localResources = paramContext.getResources();
    this.d.setPadding(localResources.getDimensionPixelSize(efj.lO), localResources.getDimensionPixelSize(efj.lP), 0, 0);
    this.d.setVisibility(8);
  }
  
  public final void a(dxg paramdxg)
  {
    this.e = paramdxg;
    if (this.a != null) {
      this.a.o = paramdxg;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    dxf localdxf = this.a;
    int i;
    int j;
    int i6;
    int i7;
    if (localdxf.k != 0)
    {
      i = localdxf.e;
      j = localdxf.m.getWidth();
      dxe localdxe = localdxf.j;
      if (localdxf.k != 3) {
        break label392;
      }
      i6 = localdxe.a();
      if (i6 < 127) {
        localdxf.a.setAlpha(i6 << 1);
      }
      if (!localdxf.n.equals(dxc.a)) {
        break label269;
      }
      j = localdxf.d;
      i7 = 0;
      localdxf.a.setBounds(i7, 0, j, localdxf.c);
      localdxf.l = true;
    }
    label392:
    for (int k = i6;; k = -1)
    {
      if (localdxf.b != null)
      {
        Rect localRect = localdxf.a.getBounds();
        int i2 = localRect.left;
        int i3 = (localRect.bottom - localRect.top) / 2;
        int i4 = localdxf.b.getIntrinsicWidth();
        int i5 = i2 + localdxf.d / 2 - i4 / 2;
        localdxf.b.setBounds(i5, i3, i4 + i5, localdxf.f.getHeight() - i3);
        localdxf.b.draw(paramCanvas);
      }
      paramCanvas.translate(0.0F, i);
      localdxf.a.draw(paramCanvas);
      paramCanvas.translate(0.0F, -i);
      if ((localdxf.k == 2) && (localdxf.i) && (localdxf.g == null)) {
        localdxf.a(paramCanvas, localdxf.h);
      }
      label269:
      while (localdxf.k != 3)
      {
        return;
        i7 = j - localdxf.d;
        break;
      }
      if (k == 0)
      {
        localdxf.a(0);
        return;
      }
      View localView = localdxf.m;
      int m = localdxf.m.getWidth();
      boolean bool = dxc.a.equals(localdxf.n);
      int n = 0;
      if (bool) {}
      for (;;)
      {
        int i1 = localdxf.m.getWidth();
        if (dxc.a.equals(localdxf.n)) {
          i1 = localdxf.d;
        }
        localView.invalidate(n, i, i1, i + localdxf.c);
        return;
        n = m - localdxf.d;
      }
    }
  }
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    if ((paramView2 instanceof FastScrollListView)) {}
    for (this.c = ((FastScrollListView)paramView2);; this.c = ((FastScrollListView)paramView2.findViewById(aaw.lH)))
    {
      if (this.d.getParent() != this) {
        addView(this.d);
      }
      dxd localdxd = this.f;
      dxc localdxc = this.g;
      this.a = new dxf(this.c.getContext(), this.c, this.d, this, localdxd, localdxc);
      this.c.a = this.a;
      this.a.o = this.e;
      this.c.setOnScrollListener(this);
      do
      {
        return;
      } while (!(paramView2 instanceof SwipeRefreshLayoutWithUpScroll));
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    if (paramView2 == this.c)
    {
      this.c = null;
      this.a.b();
      this.a = null;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.a.a(paramMotionEvent);
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.a(paramAbsListView, paramInt1, paramInt2, paramInt3);
    } while (this.b == null);
    this.b.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.b != null) {
      this.b.onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.a.b(paramMotionEvent)) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.FastScrollContainer
 * JD-Core Version:    0.7.0.1
 */