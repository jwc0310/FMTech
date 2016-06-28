package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import ms;
import mw;
import mx;
import my;
import mz;
import na;
import nj;
import ns;
import qs;
import sc;
import sg;
import sw;
import sx;
import sy;
import sz;
import ta;
import tb;
import tc;
import td;
import te;
import tf;

public class SwipeRefreshLayout
  extends ViewGroup
  implements mx, mz
{
  private static final int[] B = { 16842766 };
  private static final String m = SwipeRefreshLayout.class.getSimpleName();
  private final DecelerateInterpolator A;
  private int C = -1;
  private Animation D;
  private Animation E;
  private Animation F;
  private Animation G;
  private Animation H;
  private int I;
  private int J;
  private Animation.AnimationListener K = new sw(this);
  private final Animation L = new tb(this);
  private final Animation M;
  public tf a;
  public boolean b = false;
  public int c;
  public boolean d;
  public qs e;
  public int f;
  public float g;
  public int h;
  public sc i;
  public float j;
  public boolean k;
  public boolean l;
  private View n;
  private int o;
  private float p = -1.0F;
  private float q;
  private final na r;
  private final my s;
  private final int[] t = new int[2];
  private int u;
  private boolean v = false;
  private float w;
  private float x;
  private boolean y;
  private int z = -1;
  
  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new tc(this);
    this.M = new td(this);
    this.o = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.u = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.A = new DecelerateInterpolator(2.0F);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, B);
    setEnabled(localTypedArray.getBoolean(0, true));
    localTypedArray.recycle();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.I = ((int)(40.0F * localDisplayMetrics.density));
    this.J = ((int)(40.0F * localDisplayMetrics.density));
    this.e = new qs(getContext(), -328966, 20.0F);
    this.i = new sc(getContext(), this);
    this.i.b.w = -328966;
    this.e.setImageDrawable(this.i);
    this.e.setVisibility(8);
    addView(this.e);
    nj.a.a(this, true);
    this.j = (64.0F * localDisplayMetrics.density);
    this.p = this.j;
    this.r = new na(this);
    this.s = new my(this);
    setNestedScrollingEnabled(true);
  }
  
  private static float a(MotionEvent paramMotionEvent, int paramInt)
  {
    int i1 = ms.a.a(paramMotionEvent, paramInt);
    if (i1 < 0) {
      return -1.0F;
    }
    return ms.a.d(paramMotionEvent, i1);
  }
  
  private final Animation a(int paramInt1, int paramInt2)
  {
    if (this.d)
    {
      if (Build.VERSION.SDK_INT < 11) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return null;
      }
    }
    sz localsz = new sz(this, paramInt1, paramInt2);
    localsz.setDuration(300L);
    this.e.a = null;
    this.e.clearAnimation();
    this.e.startAnimation(localsz);
    return localsz;
  }
  
  private final void a()
  {
    if (this.n == null) {}
    for (int i1 = 0;; i1++) {
      if (i1 < getChildCount())
      {
        View localView = getChildAt(i1);
        if (!localView.equals(this.e)) {
          this.n = localView;
        }
      }
      else
      {
        return;
      }
    }
  }
  
  private final void a(MotionEvent paramMotionEvent)
  {
    int i1 = ms.b(paramMotionEvent);
    if (ms.a.b(paramMotionEvent, i1) == this.z) {
      if (i1 != 0) {
        break label39;
      }
    }
    label39:
    for (int i2 = 1;; i2 = 0)
    {
      this.z = ms.a.b(paramMotionEvent, i2);
      return;
    }
  }
  
  private final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.b != paramBoolean1)
    {
      this.k = paramBoolean2;
      a();
      this.b = paramBoolean1;
      if (this.b)
      {
        int i1 = this.c;
        Animation.AnimationListener localAnimationListener = this.K;
        this.f = i1;
        this.L.reset();
        this.L.setDuration(200L);
        this.L.setInterpolator(this.A);
        if (localAnimationListener != null) {
          this.e.a = localAnimationListener;
        }
        this.e.clearAnimation();
        this.e.startAnimation(this.L);
      }
    }
    else
    {
      return;
    }
    a(this.K);
  }
  
  private static boolean a(Animation paramAnimation)
  {
    return (paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded());
  }
  
  private final void b(float paramFloat)
  {
    this.i.b.a(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.p));
    float f2 = 5.0F * (float)Math.max(f1 - 0.4D, 0.0D) / 3.0F;
    float f3 = Math.abs(paramFloat) - this.p;
    float f4;
    float f6;
    int i1;
    if (this.l)
    {
      f4 = this.j - this.h;
      float f5 = Math.max(0.0F, Math.min(f3, f4 * 2.0F) / f4);
      f6 = 2.0F * (float)(f5 / 4.0F - Math.pow(f5 / 4.0F, 2.0D));
      float f7 = 2.0F * (f4 * f6);
      i1 = this.h + (int)(f7 + f4 * f1);
      if (this.e.getVisibility() != 0) {
        this.e.setVisibility(0);
      }
      if (!this.d)
      {
        qs localqs1 = this.e;
        nj.a.d(localqs1, 1.0F);
        qs localqs2 = this.e;
        nj.a.e(localqs2, 1.0F);
      }
      if (paramFloat >= this.p) {
        break label367;
      }
      if (this.d) {
        a(paramFloat / this.p);
      }
      if ((this.i.getAlpha() > 76) && (!a(this.F))) {
        this.F = a(this.i.getAlpha(), 76);
      }
      float f9 = f2 * 0.8F;
      this.i.a(0.0F, Math.min(0.8F, f9));
      this.i.a(Math.min(1.0F, f2));
    }
    for (;;)
    {
      float f8 = 0.5F * (-0.25F + f2 * 0.4F + f6 * 2.0F);
      sg localsg = this.i.b;
      localsg.g = f8;
      localsg.d.invalidateDrawable(null);
      a(i1 - this.c, true);
      return;
      f4 = this.j;
      break;
      label367:
      if ((this.i.getAlpha() < 255) && (!a(this.G))) {
        this.G = a(this.i.getAlpha(), 255);
      }
    }
  }
  
  private boolean b()
  {
    if (Build.VERSION.SDK_INT < 14)
    {
      if ((this.n instanceof AbsListView))
      {
        AbsListView localAbsListView = (AbsListView)this.n;
        return (localAbsListView.getChildCount() > 0) && ((localAbsListView.getFirstVisiblePosition() > 0) || (localAbsListView.getChildAt(0).getTop() < localAbsListView.getPaddingTop()));
      }
      View localView2 = this.n;
      return (nj.a.b(localView2, -1)) || (this.n.getScrollY() > 0);
    }
    View localView1 = this.n;
    return nj.a.b(localView1, -1);
  }
  
  private final void c(float paramFloat)
  {
    boolean bool1 = true;
    if (paramFloat > this.p)
    {
      a(bool1, bool1);
      return;
    }
    this.b = false;
    this.i.a(0.0F, 0.0F);
    boolean bool2 = this.d;
    ta localta = null;
    if (!bool2) {
      localta = new ta(this);
    }
    int i1 = this.c;
    if (this.d)
    {
      this.f = i1;
      if (Build.VERSION.SDK_INT < 11)
      {
        if (!bool1) {
          break label168;
        }
        this.g = this.i.getAlpha();
        label97:
        this.H = new te(this);
        this.H.setDuration(150L);
        if (localta != null) {
          this.e.a = localta;
        }
        this.e.clearAnimation();
        this.e.startAnimation(this.H);
      }
    }
    for (;;)
    {
      this.i.b.a(false);
      return;
      bool1 = false;
      break;
      label168:
      qs localqs = this.e;
      this.g = nj.a.g(localqs);
      break label97;
      this.f = i1;
      this.M.reset();
      this.M.setDuration(200L);
      this.M.setInterpolator(this.A);
      if (localta != null) {
        this.e.a = localta;
      }
      this.e.clearAnimation();
      this.e.startAnimation(this.M);
    }
  }
  
  public final void a(float paramFloat)
  {
    if (Build.VERSION.SDK_INT < 11) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      a((int)(255.0F * paramFloat));
      return;
    }
    qs localqs1 = this.e;
    nj.a.d(localqs1, paramFloat);
    qs localqs2 = this.e;
    nj.a.e(localqs2, paramFloat);
  }
  
  public final void a(int paramInt)
  {
    this.e.getBackground().setAlpha(paramInt);
    this.i.setAlpha(paramInt);
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    this.e.bringToFront();
    this.e.offsetTopAndBottom(paramInt);
    this.c = this.e.getTop();
    if ((paramBoolean) && (Build.VERSION.SDK_INT < 11)) {
      invalidate();
    }
  }
  
  public final void a(Animation.AnimationListener paramAnimationListener)
  {
    this.E = new sy(this);
    this.E.setDuration(150L);
    this.e.a = paramAnimationListener;
    this.e.clearAnimation();
    this.e.startAnimation(this.E);
  }
  
  public void a(tf paramtf)
  {
    this.a = paramtf;
  }
  
  public final void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.b != paramBoolean))
    {
      this.b = paramBoolean;
      if (!this.l) {}
      for (int i1 = (int)(this.j + this.h);; i1 = (int)this.j)
      {
        a(i1 - this.c, true);
        this.k = false;
        Animation.AnimationListener localAnimationListener = this.K;
        this.e.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
          this.i.setAlpha(255);
        }
        this.D = new sx(this);
        this.D.setDuration(this.u);
        if (localAnimationListener != null) {
          this.e.a = localAnimationListener;
        }
        this.e.clearAnimation();
        this.e.startAnimation(this.D);
        return;
      }
    }
    a(paramBoolean, false);
  }
  
  public final void a(int... paramVarArgs)
  {
    Resources localResources = getResources();
    int[] arrayOfInt = new int[7];
    for (int i1 = 0; i1 < 7; i1++) {
      arrayOfInt[i1] = localResources.getColor(paramVarArgs[i1]);
    }
    a();
    sc localsc = this.i;
    sg localsg = localsc.b;
    localsg.j = arrayOfInt;
    localsg.a(0);
    localsc.b.a(0);
  }
  
  public final void b(int... paramVarArgs)
  {
    a();
    sc localsc = this.i;
    sg localsg = localsc.b;
    localsg.j = paramVarArgs;
    localsg.a(0);
    localsc.b.a(0);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.s.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.s.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.s.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.s.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.C < 0) {}
    do
    {
      return paramInt2;
      if (paramInt2 == paramInt1 - 1) {
        return this.C;
      }
    } while (paramInt2 < this.C);
    return paramInt2 + 1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.r.a;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.s.a != null;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.s.b;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    a();
    int i1 = ms.a(paramMotionEvent);
    if ((!isEnabled()) || (b()) || (this.b)) {
      return false;
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return this.y;
      a(this.h - this.e.getTop(), true);
      this.z = ms.a.b(paramMotionEvent, 0);
      this.y = false;
      float f2 = a(paramMotionEvent, this.z);
      if (f2 == -1.0F) {
        break;
      }
      this.x = f2;
      continue;
      if (this.z == -1)
      {
        Log.e(m, "Got ACTION_MOVE event but don't have an active pointer id.");
        return false;
      }
      float f1 = a(paramMotionEvent, this.z);
      if (f1 == -1.0F) {
        break;
      }
      if ((f1 - this.x > this.o) && (!this.y))
      {
        this.w = (this.x + this.o);
        this.y = true;
        this.i.setAlpha(76);
        continue;
        a(paramMotionEvent);
        continue;
        this.y = false;
        this.z = -1;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getMeasuredWidth();
    int i2 = getMeasuredHeight();
    if (getChildCount() == 0) {}
    do
    {
      return;
      if (this.n == null) {
        a();
      }
    } while (this.n == null);
    View localView = this.n;
    int i3 = getPaddingLeft();
    int i4 = getPaddingTop();
    int i5 = i1 - getPaddingLeft() - getPaddingRight();
    int i6 = i2 - getPaddingTop() - getPaddingBottom();
    localView.layout(i3, i4, i5 + i3, i6 + i4);
    int i7 = this.e.getMeasuredWidth();
    int i8 = this.e.getMeasuredHeight();
    this.e.layout(i1 / 2 - i7 / 2, this.c, i1 / 2 + i7 / 2, i8 + this.c);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.n == null) {
      a();
    }
    if (this.n == null) {}
    for (;;)
    {
      return;
      this.n.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
      this.e.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
      if ((!this.l) && (!this.v))
      {
        this.v = true;
        int i2 = -this.e.getMeasuredHeight();
        this.h = i2;
        this.c = i2;
      }
      this.C = -1;
      for (int i1 = 0; i1 < getChildCount(); i1++) {
        if (getChildAt(i1) == this.e)
        {
          this.C = i1;
          return;
        }
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramInt2 > 0) && (this.q > 0.0F))
    {
      if (paramInt2 <= this.q) {
        break label102;
      }
      paramArrayOfInt[1] = (paramInt2 - (int)this.q);
      this.q = 0.0F;
    }
    for (;;)
    {
      b(this.q);
      int[] arrayOfInt = this.t;
      if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], arrayOfInt, null))
      {
        paramArrayOfInt[0] += arrayOfInt[0];
        paramArrayOfInt[1] += arrayOfInt[1];
      }
      return;
      label102:
      this.q -= paramInt2;
      paramArrayOfInt[1] = paramInt2;
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt4 < 0)
    {
      int i1 = Math.abs(paramInt4);
      this.q += i1;
      b(this.q);
    }
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt1, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.r.a = paramInt;
    this.q = 0.0F;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if ((isEnabled()) && ((paramInt & 0x2) != 0))
    {
      startNestedScroll(paramInt & 0x2);
      return true;
    }
    return false;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.r.a = 0;
    if (this.q > 0.0F)
    {
      c(this.q);
      this.q = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = ms.a(paramMotionEvent);
    if ((!isEnabled()) || (b())) {}
    do
    {
      return false;
      switch (i1)
      {
      case 4: 
      default: 
      case 0: 
      case 2: 
      case 5: 
      case 6: 
        for (;;)
        {
          return true;
          this.z = ms.a.b(paramMotionEvent, 0);
          this.y = false;
          continue;
          int i5 = this.z;
          int i6 = ms.a.a(paramMotionEvent, i5);
          if (i6 < 0)
          {
            Log.e(m, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
          }
          float f2 = 0.5F * (ms.a.d(paramMotionEvent, i6) - this.w);
          if (this.y)
          {
            if (f2 <= 0.0F) {
              break;
            }
            b(f2);
            continue;
            int i4 = ms.b(paramMotionEvent);
            this.z = ms.a.b(paramMotionEvent, i4);
            continue;
            a(paramMotionEvent);
          }
        }
      }
      if (this.z != -1) {
        break;
      }
    } while (i1 != 1);
    Log.e(m, "Got ACTION_UP event but don't have an active pointer id.");
    return false;
    int i2 = this.z;
    int i3 = ms.a.a(paramMotionEvent, i2);
    float f1 = 0.5F * (ms.a.d(paramMotionEvent, i3) - this.w);
    this.y = false;
    c(f1);
    this.z = -1;
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 21) || (!(this.n instanceof AbsListView))) {
      if (this.n != null)
      {
        View localView = this.n;
        if (!nj.a.C(localView)) {}
      }
      else
      {
        super.requestDisallowInterceptTouchEvent(paramBoolean);
      }
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.s.a(paramBoolean);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.s.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.s.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.SwipeRefreshLayout
 * JD-Core Version:    0.7.0.1
 */