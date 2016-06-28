package com.google.android.libraries.social.ui.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.BaseAdapter;
import android.widget.Scroller;
import efj;
import java.util.ArrayList;
import lua;
import lwo;
import lxk;
import lxl;
import lxm;
import lxn;
import lxo;
import lxs;
import ms;
import mw;
import nf;
import ni;
import nj;
import ns;
import ru;
import rx;

public final class RecyclingViewGroup
  extends ViewGroup
{
  private boolean A;
  private boolean B;
  private lxo C;
  public BaseAdapter a;
  public lxl b;
  public final lxm c = new lxm(this);
  public final lxs d;
  public int e;
  public int f;
  public int g;
  public boolean h;
  public boolean i;
  public boolean j = false;
  private DataSetObserver k = new lxn(this);
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private float q;
  private float r;
  private int s;
  private final VelocityTracker t = VelocityTracker.obtain();
  private final ru u;
  private final ru v;
  private int w;
  private int x;
  private int y;
  private boolean z;
  
  public RecyclingViewGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclingViewGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclingViewGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.m = localViewConfiguration.getScaledTouchSlop();
    this.n = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.o = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.d = lxs.a(paramContext);
    this.u = new ru(paramContext);
    this.v = new ru(paramContext);
    setWillNotDraw(false);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lua.g);
    this.B = localTypedArray.getBoolean(lua.h, false);
    if (this.B)
    {
      if (!this.h) {
        break label164;
      }
      setHorizontalScrollBarEnabled(this.B);
    }
    for (;;)
    {
      localTypedArray.recycle();
      return;
      label164:
      setVerticalScrollBarEnabled(this.B);
    }
  }
  
  private final int a(int paramInt1, int paramInt2)
  {
    if (this.h) {}
    View localView;
    for (int i1 = getPaddingLeft();; i1 = getPaddingTop())
    {
      int i2 = -paramInt2;
      if ((this.x <= i2) || (paramInt1 < 0)) {
        break label264;
      }
      localView = d(paramInt1);
      if (localView != null) {
        break;
      }
      return 0;
    }
    lxk locallxk = (lxk)localView.getLayoutParams();
    label87:
    int i3;
    int i4;
    int i7;
    if (localView.getParent() != this)
    {
      if (this.z) {
        addViewInLayout(localView, 0, locallxk);
      }
    }
    else
    {
      a(localView);
      i3 = localView.getMeasuredWidth();
      i4 = localView.getMeasuredHeight();
      if (!this.h) {
        break label206;
      }
      this.x -= i3 + this.g;
      i7 = this.x;
      if (!locallxk.a) {
        break label200;
      }
    }
    label200:
    for (int i8 = (getMeasuredHeight() - i4) / 2;; i8 = 0)
    {
      localView.layout(i7, i8, i3 + i7, i4 + i8);
      int i9 = paramInt1 - 1;
      this.e = paramInt1;
      paramInt1 = i9;
      break;
      addView(localView, 0);
      break label87;
    }
    label206:
    this.x -= i4 + this.g;
    int i5 = this.x;
    if (locallxk.a) {}
    for (int i6 = (getMeasuredWidth() - i3) / 2;; i6 = 0)
    {
      i7 = i6;
      i8 = i5;
      break;
    }
    label264:
    return i1 - this.x;
  }
  
  private final void a(View paramView)
  {
    lxk locallxk = (lxk)paramView.getLayoutParams();
    int i1;
    int i2;
    if (locallxk.width == -2)
    {
      i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      if (locallxk.height != -2) {
        break label91;
      }
      i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    }
    for (;;)
    {
      paramView.measure(i1, i2);
      return;
      if (locallxk.width == -1)
      {
        i1 = View.MeasureSpec.makeMeasureSpec(getWidth() - getPaddingLeft() - getPaddingRight(), 1073741824);
        break;
      }
      i1 = View.MeasureSpec.makeMeasureSpec(locallxk.width, 1073741824);
      break;
      label91:
      if (locallxk.height == -1) {
        i2 = View.MeasureSpec.makeMeasureSpec(getHeight() - getPaddingTop() - getPaddingBottom(), 1073741824);
      } else {
        i2 = View.MeasureSpec.makeMeasureSpec(locallxk.height, 1073741824);
      }
    }
  }
  
  private final boolean a(int paramInt, boolean paramBoolean)
  {
    boolean bool = b();
    int i1 = Math.abs(paramInt);
    int i7;
    int i9;
    int i10;
    if (!bool)
    {
      this.A = true;
      int i6 = b(this.e + getChildCount(), i1);
      i7 = a(-1 + this.e, i1) + this.g;
      int i8;
      label86:
      int i12;
      if (paramInt > 0)
      {
        i8 = 1;
        i9 = Math.min(i7, i1);
        if (i9 == 0) {
          break label738;
        }
        if (i8 == 0) {
          break label185;
        }
        i10 = i9;
        if (!this.h) {
          break label193;
        }
        i12 = 0;
      }
      for (int i13 = i10;; i13 = 0)
      {
        int i14 = getChildCount();
        for (int i15 = 0; i15 < i14; i15++)
        {
          View localView4 = getChildAt(i15);
          localView4.layout(i13 + localView4.getLeft(), i12 + localView4.getTop(), i13 + localView4.getRight(), i12 + localView4.getBottom());
        }
        if (i6 < 0) {
          i6 = 0;
        }
        i7 = i6;
        i8 = 0;
        break;
        label185:
        i10 = -i9;
        break label86;
        label193:
        i12 = i10;
      }
      this.x = (i10 + this.x);
      this.y = (i10 + this.y);
      int i16;
      int i17;
      label246:
      View localView3;
      int i23;
      if (this.h)
      {
        i16 = getWidth();
        i17 = -1 + getChildCount();
        if (i17 < 0) {
          break label337;
        }
        localView3 = getChildAt(i17);
        if (!this.h) {
          break label318;
        }
        i23 = localView3.getLeft();
        label273:
        if (i23 <= i16) {
          break label337;
        }
        if (!this.z) {
          break label328;
        }
        removeViewsInLayout(i17, 1);
      }
      for (;;)
      {
        this.c.a(localView3);
        i17--;
        break label246;
        i16 = getHeight();
        break;
        label318:
        i23 = localView3.getTop();
        break label273;
        label328:
        removeViewAt(i17);
      }
      label337:
      if (getChildCount() > 0)
      {
        View localView2 = getChildAt(0);
        int i22;
        if (this.h)
        {
          i22 = localView2.getRight();
          label365:
          if (i22 >= 0) {
            break label423;
          }
          if (!this.z) {
            break label415;
          }
          removeViewsInLayout(0, 1);
        }
        for (;;)
        {
          this.c.a(localView2);
          this.e = (1 + this.e);
          break;
          i22 = localView2.getBottom();
          break label365;
          removeViewAt(0);
        }
      }
      label415:
      label423:
      this.w = getChildCount();
      if (this.w > 0)
      {
        this.x = 2147483647;
        this.y = -2147483648;
        int i18 = 0;
        if (i18 < this.w)
        {
          View localView1 = getChildAt(i18);
          int i19;
          if (this.h)
          {
            i19 = localView1.getLeft();
            label486:
            if (!this.h) {
              break label551;
            }
          }
          label551:
          for (int i20 = localView1.getRight();; i20 = localView1.getBottom())
          {
            int i21 = i20 + this.g;
            this.x = Math.min(this.x, i19);
            this.y = Math.max(this.y, i21);
            i18++;
            break;
            i19 = localView1.getTop();
            break label486;
          }
        }
        if (this.x != 2147483647) {}
      }
      else
      {
        e(0);
      }
    }
    for (;;)
    {
      this.A = false;
      int i11 = i1 - i7;
      int i3 = i10;
      int i2 = i11;
      ru localru;
      if (paramBoolean)
      {
        int i4 = nj.a.a(this);
        if (((i4 == 0) || ((i4 == 1) && (!bool))) && (i2 > 0))
        {
          if (paramInt <= 0) {
            break label718;
          }
          localru = this.u;
          label639:
          if (!this.h) {
            break label727;
          }
        }
      }
      label718:
      label727:
      for (int i5 = getWidth();; i5 = getHeight())
      {
        float f1 = Math.abs(paramInt) / i5;
        ru.b.a(localru.a, f1);
        nj.a.l(this);
        if (i3 != 0) {
          b(i3);
        }
        if ((paramInt != 0) && (i3 == 0)) {
          break label736;
        }
        return true;
        i2 = i1;
        i3 = 0;
        break;
        localru = this.v;
        break label639;
      }
      label736:
      return false;
      label738:
      i10 = i9;
    }
  }
  
  private final int b(int paramInt1, int paramInt2)
  {
    if (this.h) {}
    View localView;
    for (int i1 = getWidth() - getPaddingRight();; i1 = getHeight() - getPaddingBottom())
    {
      int i2 = i1 + paramInt2;
      if ((this.y >= i2) || (paramInt1 >= this.f)) {
        break label268;
      }
      localView = d(paramInt1);
      if (localView != null) {
        break;
      }
      return 0;
    }
    lxk locallxk = (lxk)localView.getLayoutParams();
    label102:
    int i3;
    int i4;
    int i7;
    if (localView.getParent() != this)
    {
      if (this.z) {
        addViewInLayout(localView, -1, locallxk);
      }
    }
    else
    {
      a(localView);
      i3 = localView.getMeasuredWidth();
      i4 = localView.getMeasuredHeight();
      if (!this.h) {
        break label210;
      }
      i7 = this.y;
      this.y += i3 + this.g;
      if (!locallxk.a) {
        break label204;
      }
    }
    label204:
    for (int i8 = (getMeasuredHeight() - i4) / 2;; i8 = 0)
    {
      localView.layout(i7, i8, i3 + i7, i4 + i8);
      paramInt1++;
      break;
      addView(localView);
      break label102;
    }
    label210:
    int i5 = this.y;
    this.y += i4 + this.g;
    if (locallxk.a) {}
    for (int i6 = (getMeasuredWidth() - i3) / 2;; i6 = 0)
    {
      i7 = i6;
      i8 = i5;
      break;
    }
    label268:
    return this.y - i1;
  }
  
  private final boolean b()
  {
    if ((this.e != 0) || (this.f != getChildCount())) {
      return false;
    }
    int i1;
    if (this.h) {
      i1 = getPaddingLeft();
    }
    for (int i2 = getWidth() - getPaddingRight(); (this.x >= i1) && (this.y <= i2); i2 = getHeight() - getPaddingBottom())
    {
      return true;
      i1 = getPaddingTop();
    }
    return false;
  }
  
  private final void c()
  {
    int i1 = 0;
    int i2 = getChildCount();
    while (i1 < i2)
    {
      this.c.a(getChildAt(i1));
      i1++;
    }
    if (this.z)
    {
      removeAllViewsInLayout();
      return;
    }
    removeAllViews();
  }
  
  private final void c(int paramInt)
  {
    if (paramInt != this.l)
    {
      this.l = paramInt;
      if (this.b != null) {
        this.b.a(this, paramInt);
      }
    }
  }
  
  private View d(int paramInt)
  {
    int i1 = this.a.getItemViewType(paramInt);
    lxm locallxm = this.c;
    View localView1 = null;
    View localView2;
    lxk locallxk;
    if (i1 == -1)
    {
      localView2 = this.a.getView(paramInt, localView1, this);
      if ((localView2 != localView1) && (localView1 != null)) {
        this.c.a(localView1);
      }
      locallxk = (lxk)localView2.getLayoutParams();
      if (localView2.getParent() != this)
      {
        if (locallxk != null) {
          break label171;
        }
        locallxk = new lxk(-2, -2);
      }
    }
    for (;;)
    {
      localView2.setLayoutParams(locallxk);
      locallxk.b = this.a.getItemViewType(paramInt);
      return localView2;
      ArrayList localArrayList = locallxm.b[i1];
      boolean bool = localArrayList.isEmpty();
      localView1 = null;
      if (bool) {
        break;
      }
      int i2 = -1 + localArrayList.size();
      localView1 = (View)localArrayList.get(i2);
      localArrayList.remove(i2);
      break;
      label171:
      if (!checkLayoutParams(locallxk)) {
        locallxk = (lxk)generateLayoutParams(locallxk);
      }
    }
  }
  
  private final void d()
  {
    ru localru1 = this.u;
    boolean bool = false;
    if (localru1 != null)
    {
      ru localru3 = this.u;
      bool = ru.b.c(localru3.a);
    }
    if (this.v != null)
    {
      ru localru2 = this.v;
      bool |= ru.b.c(localru2.a);
    }
    if (bool) {
      nj.a.l(this);
    }
  }
  
  private final void e(int paramInt)
  {
    if (this.h) {}
    for (int i1 = getPaddingLeft();; i1 = getPaddingTop())
    {
      this.x = (paramInt + (i1 + this.g));
      this.y = this.x;
      return;
    }
  }
  
  public final void a()
  {
    int i1 = getHeight();
    int i2 = getWidth();
    int i3 = this.e;
    int i4 = this.g;
    if (i3 < this.f)
    {
      View localView = d(i3);
      a(localView);
      int i7 = localView.getMeasuredWidth();
      int i8 = localView.getMeasuredHeight();
      if (this.h) {}
      for (;;)
      {
        i4 = i4 + i7 + this.g;
        i3++;
        break;
        i7 = i8;
      }
    }
    int i5 = d(this.e).getTop();
    if (this.h) {}
    for (int i6 = i2;; i6 = i1)
    {
      a(i5 + (i6 - i4), false);
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.g != paramInt)
    {
      this.g = paramInt;
      requestLayout();
      invalidate();
    }
  }
  
  public final void a(BaseAdapter paramBaseAdapter, int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.a != null) {
      this.a.unregisterDataSetObserver(this.k);
    }
    c();
    e(paramInt2);
    lxm locallxm1 = this.c;
    int i2 = locallxm1.c;
    for (int i3 = 0; i3 < i2; i3++) {
      locallxm1.b[i3].clear();
    }
    this.e = paramInt1;
    this.w = 0;
    this.q = 0.0F;
    this.a = paramBaseAdapter;
    this.i = true;
    if (this.a == null) {}
    lxm locallxm2;
    int i5;
    for (int i4 = 0;; i4 = this.a.getCount())
    {
      this.f = i4;
      if (this.a == null) {
        return;
      }
      this.a.registerDataSetObserver(this.k);
      locallxm2 = this.c;
      i5 = this.a.getViewTypeCount();
      if (i5 > 0) {
        break;
      }
      throw new IllegalArgumentException(61 + "Must have at least one view type (" + i5 + " types reported)");
    }
    if (i5 != locallxm2.c)
    {
      ArrayList[] arrayOfArrayList = new ArrayList[i5];
      while (i1 < i5)
      {
        arrayOfArrayList[i1] = new ArrayList();
        i1++;
      }
      locallxm2.c = i5;
      locallxm2.b = arrayOfArrayList;
    }
  }
  
  public final void b(int paramInt)
  {
    if (this.b != null) {
      this.b.a(this, this.e, paramInt, this.w);
    }
    onScrollChanged(0, 0, 0, 0);
    if (this.C == null) {
      this.C = new lxo(this);
    }
    if (!this.C.a)
    {
      this.C.a = true;
      lxo locallxo = this.C;
      efj.m().postDelayed(locallxo, 100L);
    }
  }
  
  protected final int computeHorizontalScrollExtent()
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      int i2 = i1 * 100;
      View localView1 = getChildAt(0);
      int i3 = localView1.getLeft();
      int i4 = localView1.getWidth();
      if (i4 > 0) {
        i2 += i3 * 100 / i4;
      }
      View localView2 = getChildAt(i1 - 1);
      int i5 = localView2.getRight();
      int i6 = localView2.getHeight();
      if (i6 > 0) {
        i2 -= 100 * (i5 - getWidth()) / i6;
      }
      return i2;
    }
    return 0;
  }
  
  protected final int computeHorizontalScrollOffset()
  {
    int i1 = this.e;
    int i2 = getChildCount();
    int i3 = 0;
    if (i1 >= 0)
    {
      i3 = 0;
      if (i2 > 0)
      {
        View localView = getChildAt(0);
        int i4 = localView.getLeft();
        int i5 = localView.getWidth();
        i3 = 0;
        if (i5 > 0) {
          i3 = Math.max(i1 * 100 - i4 * 100 / i5 + (int)(100.0F * (getScrollX() / getWidth() * this.f)), 0);
        }
      }
    }
    return i3;
  }
  
  protected final int computeHorizontalScrollRange()
  {
    int i1 = Math.max(100 * this.f, 0);
    if (getScrollX() != 0) {
      i1 += Math.abs((int)(100.0F * (getScrollX() / getWidth() * this.f)));
    }
    return i1;
  }
  
  public final void computeScroll()
  {
    int i1;
    int i2;
    if (this.d.a.computeScrollOffset())
    {
      if (!this.h) {
        break label82;
      }
      i1 = this.d.a.getCurrX();
      i2 = (int)(i1 - this.q);
      this.q = i1;
      if (a(i2, false)) {
        break label96;
      }
    }
    label82:
    label96:
    for (int i3 = 1;; i3 = 0)
    {
      if ((i3 != 0) || (this.d.a.isFinished())) {
        break label101;
      }
      nj.a.l(this);
      return;
      i1 = this.d.a.getCurrY();
      break;
    }
    label101:
    if (i3 != 0) {
      if (nj.a.a(this) != 2) {
        if (i2 <= 0) {
          break label178;
        }
      }
    }
    label178:
    for (ru localru = this.u;; localru = this.v)
    {
      int i4 = Math.abs((int)this.d.a());
      ru.b.a(localru.a, i4);
      nj.a.l(this);
      this.d.a.abortAnimation();
      c(0);
      return;
    }
  }
  
  protected final int computeVerticalScrollExtent()
  {
    int i1 = getChildCount();
    if (i1 > 0)
    {
      int i2 = i1 * 100;
      View localView1 = getChildAt(0);
      int i3 = localView1.getTop();
      int i4 = localView1.getHeight();
      if (i4 > 0) {
        i2 += i3 * 100 / i4;
      }
      View localView2 = getChildAt(i1 - 1);
      int i5 = localView2.getBottom();
      int i6 = localView2.getHeight();
      if (i6 > 0) {
        i2 -= 100 * (i5 - getHeight()) / i6;
      }
      return i2;
    }
    return 0;
  }
  
  protected final int computeVerticalScrollOffset()
  {
    int i1 = this.e;
    int i2 = getChildCount();
    int i3 = 0;
    if (i1 >= 0)
    {
      i3 = 0;
      if (i2 > 0)
      {
        View localView = getChildAt(0);
        int i4 = localView.getTop();
        int i5 = localView.getHeight();
        i3 = 0;
        if (i5 > 0) {
          i3 = Math.max(i1 * 100 - i4 * 100 / i5 + (int)(100.0F * (getScrollY() / getHeight() * this.f)), 0);
        }
      }
    }
    return i3;
  }
  
  protected final int computeVerticalScrollRange()
  {
    int i1 = Math.max(100 * this.f, 0);
    if (getScrollY() != 0) {
      i1 += Math.abs((int)(100.0F * (getScrollY() / getHeight() * this.f)));
    }
    return i1;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    int i1 = 1;
    super.draw(paramCanvas);
    int i2;
    if (this.u != null)
    {
      ru localru1 = this.u;
      boolean bool = ru.b.a(localru1.a);
      i2 = 0;
      if (!bool)
      {
        if (!this.h) {
          break label194;
        }
        int i6 = paramCanvas.save();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-getHeight(), 0.0F);
        ru localru6 = this.u;
        ru.b.a(localru6.a, paramCanvas);
        paramCanvas.restoreToCount(i6);
        i2 = i1;
      }
      ru localru2 = this.v;
      if (ru.b.a(localru2.a)) {
        break label284;
      }
      if (!this.h) {
        break label218;
      }
      int i5 = paramCanvas.save();
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(0.0F, -getWidth());
      ru localru4 = this.v;
      ru.b.a(localru4.a, paramCanvas);
      paramCanvas.restoreToCount(i5);
    }
    for (;;)
    {
      if (i1 != 0) {
        nj.a.l(this);
      }
      return;
      label194:
      ru localru5 = this.u;
      ru.b.a(localru5.a, paramCanvas);
      break;
      label218:
      int i3 = paramCanvas.save();
      int i4 = getWidth();
      paramCanvas.translate(-i4, getHeight());
      paramCanvas.rotate(180.0F, i4, 0.0F);
      ru localru3 = this.v;
      ru.b.a(localru3.a, paramCanvas);
      paramCanvas.restoreToCount(i3);
      continue;
      label284:
      i1 = i2;
    }
  }
  
  @TargetApi(12)
  public final boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((Build.VERSION.SDK_INT >= 12) && (!b()) && ((0x2 & paramMotionEvent.getSource()) != 0)) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return super.onGenericMotionEvent(paramMotionEvent);
      float f1;
      if ((0x1 & paramMotionEvent.getMetaState()) != 0) {
        if (this.h) {
          f1 = paramMotionEvent.getAxisValue(9);
        }
      }
      while (f1 != 0.0F)
      {
        if (this.p == 0) {
          this.p = lwo.a(getContext());
        }
        if (!a((int)(f1 * this.p), true)) {
          this.t.clear();
        }
        awakenScrollBars();
        return true;
        f1 = 0.0F;
        continue;
        if (this.h) {
          f1 = paramMotionEvent.getAxisValue(10);
        } else {
          f1 = paramMotionEvent.getAxisValue(9);
        }
      }
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      paramAccessibilityEvent.setScrollable(true);
      paramAccessibilityEvent.setItemCount(this.f);
      paramAccessibilityEvent.setFromIndex(this.e);
    }
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(RecyclingViewGroup.class.getCanonicalName());
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.t.addMovement(paramMotionEvent);
    switch (0xFF & paramMotionEvent.getAction())
    {
    case 1: 
    default: 
      return false;
    case 0: 
      this.t.clear();
      this.d.a.abortAnimation();
      if (this.h) {}
      for (float f5 = paramMotionEvent.getX();; f5 = paramMotionEvent.getY())
      {
        this.q = f5;
        this.s = ms.a.b(paramMotionEvent, 0);
        this.r = 0.0F;
        if (this.l != 2) {
          break;
        }
        c(1);
        return true;
      }
    }
    int i1 = this.s;
    int i2 = ms.a.a(paramMotionEvent, i1);
    if (i2 < 0)
    {
      int i4 = this.s;
      Log.e("RecyclingViewGroup", 127 + "onInterceptTouchEvent could not find pointer with id " + i4 + " - did RecyclingViewGroup receive an inconsistent event stream?");
      return false;
    }
    float f1;
    label202:
    float f2;
    int i3;
    label233:
    float f4;
    if (this.h)
    {
      f1 = ms.a.c(paramMotionEvent, i2);
      f2 = f1 - this.q + this.r;
      if (Math.abs(f2) <= this.m) {
        break label310;
      }
      i3 = 1;
      if (i3 == 0) {
        break label326;
      }
      if (f2 <= 0.0F) {
        break label316;
      }
      f4 = -this.m;
    }
    label253:
    for (float f3 = f4 + f2;; f3 = f2)
    {
      this.r = (f3 - (int)f3);
      if (i3 == 0) {
        break;
      }
      ViewParent localViewParent = getParent();
      if (localViewParent != null) {
        localViewParent.requestDisallowInterceptTouchEvent(true);
      }
      return true;
      f1 = ms.a.d(paramMotionEvent, i2);
      break label202;
      i3 = 0;
      break label233;
      f4 = this.m;
      break label253;
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.z = true;
    int i1;
    int i2;
    label150:
    int i14;
    int i15;
    int i16;
    label252:
    int i17;
    label378:
    int i19;
    label384:
    label442:
    label451:
    label460:
    label475:
    int i20;
    if ((getWidth() == 0) || (getHeight() == 0))
    {
      this.z = false;
      i1 = paramInt3 - paramInt1;
      i2 = paramInt4 - paramInt2;
      if (this.h)
      {
        ru localru3 = this.u;
        ru.b.a(localru3.a, i2, i1);
        ru localru4 = this.v;
        ru.b.a(localru4.a, i2, i1);
      }
    }
    else
    {
      this.y = this.x;
      this.A = true;
      int i12;
      if (this.i)
      {
        c();
        b(this.e + getChildCount(), 0);
        int i11 = -1 + this.e;
        if (!this.h) {
          break label442;
        }
        i12 = getPaddingLeft();
        a(i11, i12);
        this.A = false;
        this.i = false;
        if (!this.h) {
          break label451;
        }
      }
      for (int i13 = getWidth();; i13 = getHeight())
      {
        if ((this.y < i13) && (this.x <= 0))
        {
          i14 = i13 - this.y;
          i15 = Math.abs(this.x);
          if (i15 < i14) {
            break label460;
          }
          i16 = i14;
          a(i16, false);
        }
        b(0);
        break;
        int i3 = getChildCount();
        int i4 = 0;
        View localView1;
        lxk locallxk;
        int i5;
        int i6;
        int i9;
        if (i4 < i3)
        {
          localView1 = getChildAt(i4);
          locallxk = (lxk)localView1.getLayoutParams();
          if (localView1.isLayoutRequested()) {
            a(localView1);
          }
          i5 = localView1.getMeasuredWidth();
          i6 = localView1.getMeasuredHeight();
          if (!this.h) {
            break label384;
          }
          i9 = this.y;
          this.y += i5 + this.g;
          if (!locallxk.a) {
            break label378;
          }
        }
        for (int i10 = (getMeasuredHeight() - i6) / 2;; i10 = 0)
        {
          localView1.layout(i9, i10, i5 + i9, i6 + i10);
          i4++;
          break label252;
          break;
        }
        int i7 = this.y;
        this.y += i6 + this.g;
        if (locallxk.a) {}
        for (int i8 = (getMeasuredWidth() - i5) / 2;; i8 = 0)
        {
          i9 = i8;
          i10 = i7;
          break;
        }
        i12 = getPaddingTop();
        break label150;
      }
      if (this.f > 0)
      {
        i17 = -1 + this.e;
        if ((i17 >= 0) && (i15 < i14))
        {
          View localView2 = d(i17);
          if (localView2 == null) {
            break label615;
          }
          a(localView2);
          i19 = localView2.getMeasuredWidth();
          i20 = localView2.getMeasuredHeight();
          if (!this.h) {}
        }
      }
    }
    label527:
    label615:
    for (int i18 = i19 + i15 + this.g;; i18 = i15)
    {
      i17--;
      i15 = i18;
      break label475;
      i19 = i20;
      break label527;
      i16 = Math.min(i15, i14);
      break;
      ru localru1 = this.u;
      ru.b.a(localru1.a, i1, i2);
      ru localru2 = this.v;
      ru.b.a(localru2.a, i1, i2);
      return;
    }
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i2;
    View localView;
    if (this.j)
    {
      int i1 = getChildCount();
      if (!this.h) {
        break label76;
      }
      i2 = getWidth();
      if (i1 > 0)
      {
        localView = getChildAt(i1 - 1);
        if (!this.h) {
          break label85;
        }
      }
    }
    label76:
    label85:
    for (int i3 = localView.getRight();; i3 = localView.getBottom())
    {
      int i4 = i2 - i3;
      if (i4 > 0) {
        a(i4, false);
      }
      return;
      i2 = getHeight();
      break;
    }
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.B)
    {
      awakenScrollBars();
      nj.a.l(this);
    }
    this.t.addMovement(paramMotionEvent);
    int i4;
    float f2;
    label247:
    float f3;
    float f5;
    label316:
    float f4;
    switch (0xFF & paramMotionEvent.getAction())
    {
    default: 
      return true;
    case 0: 
      if (!this.d.a.isFinished())
      {
        ViewParent localViewParent2 = getParent();
        if (localViewParent2 != null) {
          localViewParent2.requestDisallowInterceptTouchEvent(true);
        }
      }
      this.t.clear();
      this.d.a.abortAnimation();
      if (this.h) {}
      for (float f6 = paramMotionEvent.getX();; f6 = paramMotionEvent.getY())
      {
        this.q = f6;
        this.s = ms.a.b(paramMotionEvent, 0);
        this.r = 0.0F;
        break;
      }
    case 2: 
      int i3 = this.s;
      i4 = ms.a.a(paramMotionEvent, i3);
      if (i4 < 0)
      {
        int i6 = this.s;
        Log.e("RecyclingViewGroup", 126 + "onInterceptTouchEvent could not find pointer with id " + i6 + " - did StaggeredGridView receive an inconsistent event stream?");
        return false;
      }
      if (this.h)
      {
        f2 = ms.a.c(paramMotionEvent, i4);
        f3 = f2 - this.q + this.r;
        if ((this.l != 0) || (Math.abs(f3) <= this.m)) {
          break label580;
        }
        ViewParent localViewParent1 = getParent();
        if (localViewParent1 != null) {
          localViewParent1.requestDisallowInterceptTouchEvent(true);
        }
        if (f3 <= 0.0F) {
          break label391;
        }
        f5 = -this.m;
        f4 = f5 + f3;
        c(1);
      }
      break;
    }
    for (;;)
    {
      int i5 = (int)f4;
      this.r = (f4 - i5);
      if (this.l != 1) {
        break;
      }
      this.q = f2;
      if (a(i5, true)) {
        break;
      }
      this.t.clear();
      break;
      f2 = ms.a.d(paramMotionEvent, i4);
      break label247;
      label391:
      f5 = this.m;
      break label316;
      c(0);
      for (;;)
      {
        d();
        break;
        this.t.computeCurrentVelocity(1000, this.n);
        float f1;
        if (this.h)
        {
          VelocityTracker localVelocityTracker2 = this.t;
          int i2 = this.s;
          f1 = nf.a.a(localVelocityTracker2, i2);
          label461:
          if (Math.abs(f1) <= this.o) {
            break label572;
          }
          c(2);
          if (!this.h) {
            break label548;
          }
          this.d.a(0, 0, (int)f1, 0, -2147483648, 2147483647, 0, 0);
        }
        for (;;)
        {
          this.q = 0.0F;
          nj.a.l(this);
          break;
          VelocityTracker localVelocityTracker1 = this.t;
          int i1 = this.s;
          f1 = nf.a.b(localVelocityTracker1, i1);
          break label461;
          label548:
          this.d.a(0, 0, 0, (int)f1, 0, 0, -2147483648, 2147483647);
        }
        label572:
        c(0);
      }
      label580:
      f4 = f3;
    }
  }
  
  public final void requestLayout()
  {
    if (!this.A) {
      super.requestLayout();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.RecyclingViewGroup
 * JD-Core Version:    0.7.0.1
 */