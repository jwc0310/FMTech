package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.Scroller;
import lua;
import lwx;
import lwy;
import lwz;
import lxa;
import lxp;

@Deprecated
public class DeprecatedExpandingScrollView
  extends lxp
{
  public int a;
  public Boolean b;
  public lwz c;
  public boolean d;
  private int h = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  private Runnable i;
  private Runnable j;
  private int k;
  private int l;
  private int m;
  private boolean n;
  private int o;
  private boolean p;
  
  public DeprecatedExpandingScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public DeprecatedExpandingScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public DeprecatedExpandingScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lua.a);
    this.l = localTypedArray.getDimensionPixelOffset(lua.c, 0);
    this.m = localTypedArray.getDimensionPixelOffset(lua.b, -1);
    localTypedArray.recycle();
  }
  
  private final void d()
  {
    this.p = false;
    this.b = Boolean.valueOf(true);
    if (this.i == null) {
      this.i = new lwx(this);
    }
    removeCallbacks(this.i);
    removeCallbacks(this.j);
    post(this.i);
  }
  
  private final int e(int paramInt)
  {
    if (this.m < 0) {
      return paramInt;
    }
    return Math.min(paramInt, Math.max(this.l, this.m));
  }
  
  public final void a(int paramInt)
  {
    if (this.l != paramInt)
    {
      this.l = paramInt;
      this.n = true;
      requestLayout();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
    if (this.c != null) {
      this.c.a(this.b.booleanValue());
    }
  }
  
  public final boolean a()
  {
    return (this.b != null) && (this.b.booleanValue());
  }
  
  public final void b()
  {
    if (this.n)
    {
      this.p = true;
      requestLayout();
      return;
    }
    d();
  }
  
  public final void b(int paramInt)
  {
    if (this.m != paramInt)
    {
      this.o = this.m;
      this.m = paramInt;
      this.n = true;
      requestLayout();
    }
  }
  
  public final void c()
  {
    this.b = Boolean.valueOf(false);
    if (this.j == null) {
      this.j = new lwy(this);
    }
    removeCallbacks(this.i);
    removeCallbacks(this.j);
    post(this.j);
  }
  
  protected final void c(int paramInt)
  {
    boolean bool;
    int i1;
    if (paramInt >= 0)
    {
      bool = true;
      this.b = Boolean.valueOf(bool);
      i1 = 0;
      if (paramInt >= 0) {
        break label34;
      }
    }
    for (;;)
    {
      a(i1, 500);
      return;
      bool = false;
      break;
      label34:
      i1 = this.a;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    if (this.i != null)
    {
      removeCallbacks(this.i);
      this.i = null;
    }
    if (this.j != null)
    {
      removeCallbacks(this.j);
      this.j = null;
    }
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2;
    if (!this.g.isFinished()) {
      bool2 = true;
    }
    boolean bool1;
    do
    {
      return bool2;
      bool1 = this.d;
      bool2 = false;
    } while (bool1);
    int i1 = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 1: 
    default: 
      return false;
    case 0: 
      a(paramMotionEvent);
      this.k = i1;
      return false;
    }
    int i2 = getScrollY();
    boolean bool3;
    label97:
    int i3;
    int i4;
    label123:
    View localView;
    int i5;
    if (i2 == this.a)
    {
      bool3 = true;
      this.b = Boolean.valueOf(bool3);
      i3 = i1 - this.k;
      if (i3 >= 0) {
        break label263;
      }
      i4 = 1;
      localView = findViewById(16908298);
      if (!(localView instanceof AbsListView)) {
        break label275;
      }
      AbsListView localAbsListView = (AbsListView)localView;
      if ((localAbsListView.getChildCount() != 0) && ((localAbsListView.getFirstVisiblePosition() != 0) || (localAbsListView.getChildAt(0).getTop() != localAbsListView.getListPaddingTop()) || (localAbsListView.getScrollY() != 0))) {
        break label269;
      }
      i5 = 1;
    }
    for (;;)
    {
      if (i2 != 0)
      {
        bool2 = false;
        if (i4 != 0) {
          break;
        }
        bool2 = false;
        if (i5 == 0) {
          break;
        }
        int i6 = this.a;
        bool2 = false;
        if (i2 != i6) {
          break;
        }
      }
      super.onInterceptTouchEvent(paramMotionEvent);
      if (i3 <= this.h)
      {
        int i7 = -this.h;
        bool2 = false;
        if (i3 >= i7) {
          break;
        }
      }
      return true;
      bool3 = false;
      break label97;
      label263:
      i4 = 0;
      break label123;
      label269:
      i5 = 0;
      continue;
      label275:
      boolean bool4 = localView instanceof RecyclingViewGroup;
      bool2 = false;
      if (!bool4) {
        break;
      }
      RecyclingViewGroup localRecyclingViewGroup = (RecyclingViewGroup)localView;
      if ((localRecyclingViewGroup.getChildCount() == 0) || ((localRecyclingViewGroup.e == 0) && (localRecyclingViewGroup.getChildAt(0).getTop() == localRecyclingViewGroup.getPaddingTop()) && (localRecyclingViewGroup.getScrollY() == 0))) {
        i5 = 1;
      } else {
        i5 = 0;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = this.a;
    int i2 = paramInt4 - i1;
    int i3 = i1 + (i2 - e(i2));
    int i4 = 0;
    while (i4 < getChildCount())
    {
      View localView = getChildAt(i4);
      int i7 = i3 + localView.getMeasuredHeight();
      localView.layout(paramInt1, i3, paramInt3, i7);
      i4++;
      i3 = i7;
    }
    int i5 = this.a;
    this.e[0] = 0;
    this.e[1] = i5;
    if ((this.b != null) && (this.b.booleanValue())) {
      if ((!this.n) || (this.o >= this.m) || (this.o < 0)) {
        break label193;
      }
    }
    label193:
    for (int i6 = this.m - this.o;; i6 = 0)
    {
      d(Math.max(0, this.a - i6));
      if (this.p) {
        d();
      }
      this.n = false;
      this.o = this.m;
      return;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = View.MeasureSpec.getSize(paramInt2);
    int i3 = e(i2);
    this.a = (i3 - this.l);
    int i4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
    int i5 = 0;
    while (i1 < getChildCount())
    {
      getChildAt(i1).measure(paramInt1, i4);
      i5 = Math.max(i5, getChildAt(i1).getMeasuredWidth());
      i1++;
    }
    setMeasuredDimension(i5, i2 + this.a);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    lxa locallxa = (lxa)paramParcelable;
    super.onRestoreInstanceState(locallxa.getSuperState());
    this.b = Boolean.valueOf(locallxa.a);
    this.l = locallxa.b;
    this.m = locallxa.c;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    if ((this.a != 0) && (getScrollY() == this.a)) {}
    for (boolean bool = true;; bool = false) {
      return new lxa(localParcelable, bool, this.l, this.m);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView
 * JD-Core Version:    0.7.0.1
 */