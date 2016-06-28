import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class lxp
  extends ViewGroup
{
  private static final Interpolator p = new lxq();
  private float[] a = { 0.0F, 0.0F };
  private int b;
  private int c;
  private int d;
  public final int[] e = { -2147483647, 2147483647 };
  public lxr f;
  public Scroller g;
  private float h = 0.0F;
  private int i = 0;
  private VelocityTracker j;
  private boolean k = true;
  private boolean l = true;
  private boolean m = false;
  private boolean n = true;
  private boolean o = false;
  
  public lxp(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.g = new Scroller(localContext, p);
  }
  
  public lxp(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.g = new Scroller(localContext, p);
  }
  
  public lxp(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.g = new Scroller(localContext, p);
  }
  
  private final int a(int paramInt)
  {
    if (paramInt < this.e[0]) {
      paramInt = this.e[0];
    }
    while (paramInt <= this.e[1]) {
      return paramInt;
    }
    return this.e[1];
  }
  
  private final void a()
  {
    this.m = true;
    this.h = 0.0F;
    this.i = 0;
    this.g.abortAnimation();
  }
  
  private int b()
  {
    if (this.k) {
      return getScrollY();
    }
    return getScrollX();
  }
  
  private final boolean b(MotionEvent paramMotionEvent)
  {
    if (!this.n) {}
    label154:
    label196:
    label202:
    label208:
    label228:
    for (;;)
    {
      return false;
      if (this.m)
      {
        this.m = false;
        return false;
      }
      switch (paramMotionEvent.getAction())
      {
      case 1: 
      default: 
        return false;
      case 0: 
        a(paramMotionEvent);
        if (!this.g.isFinished())
        {
          a();
          return true;
        }
        this.o = true;
        return false;
      }
      float f1 = paramMotionEvent.getX() - this.a[0];
      float f2 = paramMotionEvent.getY() - this.a[1];
      int i1;
      int i2;
      int i3;
      if ((f1 > this.b) || (f1 < -this.b))
      {
        i1 = 1;
        if ((f2 <= this.b) && (f2 >= -this.b)) {
          break label196;
        }
        i2 = 1;
        if (!this.k) {
          break label208;
        }
        if ((i2 == 0) || (i1 != 0)) {
          break label202;
        }
        i3 = 1;
      }
      for (;;)
      {
        if (i3 == 0) {
          break label228;
        }
        a(paramMotionEvent);
        a();
        return true;
        i1 = 0;
        break;
        i2 = 0;
        break label154;
        i3 = 0;
        continue;
        if ((i1 != 0) && (i2 == 0)) {
          i3 = 1;
        } else {
          i3 = 0;
        }
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = a(paramInt1) - b();
    if (this.k) {
      this.g.startScroll(0, getScrollY(), 0, i1, paramInt2);
    }
    for (;;)
    {
      invalidate();
      return;
      this.g.startScroll(getScrollX(), 0, i1, 0, paramInt2);
    }
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    this.a[0] = paramMotionEvent.getX();
    this.a[1] = paramMotionEvent.getY();
  }
  
  public void addView(View paramView)
  {
    View localView = paramView.findViewById(eyg.bY);
    int i3;
    if (localView != null)
    {
      int i1 = ((Integer)localView.getTag()).intValue();
      int i2 = getChildCount();
      i3 = 0;
      if (i3 >= i2) {
        break label97;
      }
      if (((Integer)getChildAt(i3).findViewById(eyg.bY).getTag()).intValue() > i1) {
        addView(paramView, i3);
      }
    }
    label97:
    for (int i4 = 1;; i4 = 0)
    {
      if (i4 == 0) {
        super.addView(paramView);
      }
      return;
      i3++;
      break;
      super.addView(paramView);
      return;
    }
  }
  
  public void c(int paramInt) {}
  
  public void computeScroll()
  {
    int i1;
    int i2;
    if (this.g.computeScrollOffset())
    {
      if (!this.k) {
        break label92;
      }
      i1 = this.g.getCurrY();
      d(i1);
      invalidate();
      if (!this.k) {
        break label103;
      }
      i2 = this.g.getFinalY();
      label49:
      if (i1 == i2) {
        this.g.abortAnimation();
      }
      if (this.h != 0.0F) {
        if (this.h <= 0.0F) {
          break label114;
        }
      }
    }
    label92:
    label103:
    label114:
    for (int i3 = 1;; i3 = -1)
    {
      this.h = 0.0F;
      c(i3);
      return;
      i1 = this.g.getCurrX();
      break;
      i2 = this.g.getFinalX();
      break label49;
    }
  }
  
  public final void d(int paramInt)
  {
    if (this.k)
    {
      scrollTo(0, a(paramInt));
      return;
    }
    scrollTo(a(paramInt), 0);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return b(paramMotionEvent);
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.f != null) {
      this.f.a(paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if (this.l)
    {
      if (this.j == null) {
        this.j = VelocityTracker.obtain();
      }
      this.j.addMovement(paramMotionEvent);
    }
    if (!this.m)
    {
      if (b(paramMotionEvent)) {}
      while ((i1 != 1) || (!this.o)) {
        return true;
      }
      this.o = false;
      return performClick();
    }
    int i3;
    float f3;
    label165:
    float f4;
    int i4;
    int i5;
    switch (i1)
    {
    default: 
      return true;
    case 1: 
    case 3: 
      if (i1 == 3)
      {
        i3 = 1;
        this.m = false;
        if ((i3 != 0) || (!this.l) || (getChildCount() <= 0)) {
          break label426;
        }
        this.j.computeCurrentVelocity(1000, this.c);
        if (!this.k) {
          break label371;
        }
        f3 = this.j.getYVelocity();
        if ((f3 <= this.d) && (f3 >= -this.d)) {
          break label415;
        }
        f4 = -f3;
        this.h = f4;
        i4 = getScrollX();
        i5 = getScrollY();
        if (!this.k) {
          break label383;
        }
        this.g.fling(i4, i5, 0, (int)f4, 0, 0, this.e[0], this.e[1]);
        label247:
        invalidate();
      }
      break;
    }
    for (;;)
    {
      if ((this.l) && (this.j != null))
      {
        this.j.recycle();
        this.j = null;
      }
      this.o = false;
      return true;
      int i2;
      label293:
      float f2;
      if (this.k)
      {
        i2 = 1;
        float f1 = this.a[i2];
        a(paramMotionEvent);
        f2 = f1 - this.a[i2];
        if (f2 >= -1.0F) {
          break label350;
        }
        this.i = -1;
      }
      for (;;)
      {
        d(b() + (int)f2);
        break;
        i2 = 0;
        break label293;
        label350:
        if (f2 > 1.0F) {
          this.i = 1;
        }
      }
      i3 = 0;
      break;
      label371:
      f3 = this.j.getXVelocity();
      break label165;
      label383:
      this.g.fling(i4, i5, (int)f4, 0, this.e[0], this.e[1], 0, 0);
      break label247;
      label415:
      c(this.i);
      continue;
      label426:
      c(this.i);
    }
  }
  
  public boolean showContextMenuForChild(View paramView)
  {
    requestDisallowInterceptTouchEvent(true);
    return super.showContextMenuForChild(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lxp
 * JD-Core Version:    0.7.0.1
 */