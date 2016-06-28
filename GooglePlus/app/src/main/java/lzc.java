import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class lzc
  extends ViewGroup
{
  private static final Interpolator m = new lzd();
  private float[] a = { 0.0F, 0.0F };
  private int b;
  private int c;
  private int d;
  private float e = 0.0F;
  private VelocityTracker f;
  private boolean g = false;
  private boolean h = false;
  private Scroller i;
  public final int[] j = { -2147483647, 2147483647 };
  public boolean k = false;
  private boolean l = true;
  
  public lzc(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.i = new Scroller(localContext, m);
  }
  
  public lzc(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.i = new Scroller(localContext, m);
  }
  
  public lzc(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    setFocusable(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    this.b = localViewConfiguration.getScaledTouchSlop();
    this.d = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.c = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.i = new Scroller(localContext, m);
  }
  
  private final boolean a(MotionEvent paramMotionEvent)
  {
    if (!this.l) {}
    label154:
    label189:
    label195:
    label199:
    for (;;)
    {
      return false;
      if (this.k)
      {
        this.k = false;
        return false;
      }
      switch (paramMotionEvent.getAction())
      {
      case 1: 
      default: 
        return false;
      case 0: 
        b(paramMotionEvent);
        if (!this.i.isFinished())
        {
          c();
          return true;
        }
        this.h = true;
        return false;
      }
      float f1 = paramMotionEvent.getX() - this.a[0];
      float f2 = paramMotionEvent.getY() - this.a[1];
      int n;
      int i1;
      if ((f1 > this.b) || (f1 < -this.b))
      {
        n = 1;
        if ((f2 <= this.b) && (f2 >= -this.b)) {
          break label189;
        }
        i1 = 1;
        if ((i1 == 0) || (n != 0)) {
          break label195;
        }
      }
      for (int i2 = 1;; i2 = 0)
      {
        if (i2 == 0) {
          break label199;
        }
        b(paramMotionEvent);
        c();
        return true;
        n = 0;
        break;
        i1 = 0;
        break label154;
      }
    }
  }
  
  private final int b(int paramInt)
  {
    if (paramInt < this.j[0]) {
      paramInt = this.j[0];
    }
    while (paramInt <= this.j[1]) {
      return paramInt;
    }
    return this.j[1];
  }
  
  private void b(MotionEvent paramMotionEvent)
  {
    this.a[0] = paramMotionEvent.getX();
    this.a[1] = paramMotionEvent.getY();
  }
  
  private final void c()
  {
    if ((!this.k) && (this.i.isFinished()))
    {
      a();
      this.g = true;
    }
    this.k = true;
    this.e = 0.0F;
    this.i.abortAnimation();
  }
  
  public void a() {}
  
  public void a(float paramFloat) {}
  
  public final void a(int paramInt)
  {
    this.i.forceFinished(true);
    scrollTo(0, b(paramInt));
  }
  
  public final void a(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    if (paramBoolean) {
      paramInt1 = b(paramInt1);
    }
    int n = paramInt1 - getScrollY();
    this.i.startScroll(0, getScrollY(), 0, n, paramInt2);
    invalidate();
  }
  
  public void b() {}
  
  public void computeScroll()
  {
    if (this.i.computeScrollOffset())
    {
      int n = this.i.getCurrY();
      scrollTo(0, n);
      invalidate();
      if (this.e != 0.0F)
      {
        a(this.e);
        this.e = 0.0F;
      }
      if (n == this.i.getFinalY())
      {
        this.i.abortAnimation();
        if (this.g)
        {
          this.g = false;
          b();
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return a(paramMotionEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = paramMotionEvent.getAction();
    if (this.f == null) {
      this.f = VelocityTracker.obtain();
    }
    this.f.addMovement(paramMotionEvent);
    if (!this.k)
    {
      if (a(paramMotionEvent)) {}
      while ((n != 1) || (!this.h)) {
        return true;
      }
      this.h = false;
      return performClick();
    }
    int i1;
    switch (n)
    {
    default: 
      return true;
    case 1: 
    case 3: 
      if (n == 3)
      {
        i1 = 1;
        this.k = false;
        if ((i1 != 0) || (getChildCount() <= 0)) {
          break label301;
        }
        this.f.computeCurrentVelocity(1000, this.c);
        float f3 = this.f.getYVelocity();
        if ((f3 <= this.d) && (f3 >= -this.d)) {
          break label293;
        }
        float f4 = -f3;
        this.e = f4;
        int i2 = getScrollX();
        int i3 = getScrollY();
        this.i.fling(i2, i3, 0, (int)f4, 0, 0, this.j[0], this.j[1]);
        invalidate();
      }
      break;
    }
    for (;;)
    {
      if (this.f != null)
      {
        this.f.recycle();
        this.f = null;
      }
      for (;;)
      {
        this.h = false;
        return true;
        float f1 = this.a[1];
        b(paramMotionEvent);
        float f2 = f1 - this.a[1];
        a(getScrollY() + Math.round(f2));
      }
      i1 = 0;
      break;
      label293:
      a(0.0F);
      continue;
      label301:
      a(0.0F);
    }
  }
  
  public boolean showContextMenuForChild(View paramView)
  {
    requestDisallowInterceptTouchEvent(true);
    return super.showContextMenuForChild(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lzc
 * JD-Core Version:    0.7.0.1
 */