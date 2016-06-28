import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.PopupWindow;

public abstract class afi
  implements View.OnTouchListener
{
  final View a;
  boolean b;
  boolean c;
  private final float d;
  private final int e;
  private final int f;
  private Runnable g;
  private Runnable h;
  private int i;
  private final int[] j = new int[2];
  
  public afi(View paramView)
  {
    this.a = paramView;
    this.d = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    this.e = ViewConfiguration.getTapTimeout();
    this.f = ((this.e + ViewConfiguration.getLongPressTimeout()) / 2);
  }
  
  private final boolean a(MotionEvent paramMotionEvent)
  {
    int k = 1;
    View localView = this.a;
    afe localafe = a();
    if ((localafe == null) || (!localafe.e.isShowing())) {
      k = 0;
    }
    for (;;)
    {
      return k;
      afh localafh = localafe.f;
      if ((localafh == null) || (!localafh.isShown())) {
        return false;
      }
      MotionEvent localMotionEvent = MotionEvent.obtainNoHistory(paramMotionEvent);
      int[] arrayOfInt1 = this.j;
      localView.getLocationOnScreen(arrayOfInt1);
      localMotionEvent.offsetLocation(arrayOfInt1[0], arrayOfInt1[k]);
      int[] arrayOfInt2 = this.j;
      localafh.getLocationOnScreen(arrayOfInt2);
      localMotionEvent.offsetLocation(-arrayOfInt2[0], -arrayOfInt2[k]);
      boolean bool = localafh.a(localMotionEvent, this.i);
      localMotionEvent.recycle();
      int m = ms.a(paramMotionEvent);
      if ((m != k) && (m != 3)) {}
      int i1;
      for (int n = k; (!bool) || (n == 0); i1 = 0) {
        return false;
      }
    }
  }
  
  public abstract afe a();
  
  public boolean b()
  {
    afe localafe = a();
    if ((localafe != null) && (!localafe.e.isShowing())) {
      localafe.b();
    }
    return true;
  }
  
  public boolean c()
  {
    afe localafe = a();
    if ((localafe != null) && (localafe.e.isShowing())) {
      localafe.c();
    }
    return true;
  }
  
  final void d()
  {
    if (this.h != null) {
      this.a.removeCallbacks(this.h);
    }
    if (this.g != null) {
      this.a.removeCallbacks(this.g);
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.b;
    boolean bool3;
    if (bool1)
    {
      if (this.c) {
        bool3 = a(paramMotionEvent);
      }
      for (;;)
      {
        this.b = bool3;
        boolean bool4;
        if (!bool3)
        {
          bool4 = false;
          if (!bool1) {}
        }
        else
        {
          bool4 = true;
        }
        return bool4;
        if ((a(paramMotionEvent)) || (!c())) {
          bool3 = true;
        } else {
          bool3 = false;
        }
      }
    }
    View localView = this.a;
    if (localView.isEnabled()) {}
    label124:
    int k;
    switch (ms.a(paramMotionEvent))
    {
    default: 
      k = 0;
      label127:
      if ((k == 0) || (!b())) {
        break;
      }
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      if (bool2)
      {
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        this.a.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      bool3 = bool2;
      break;
      this.i = paramMotionEvent.getPointerId(0);
      this.c = false;
      if (this.g == null) {
        this.g = new afj(this);
      }
      localView.postDelayed(this.g, this.e);
      if (this.h == null) {
        this.h = new afk(this);
      }
      localView.postDelayed(this.h, this.f);
      break label124;
      int m = paramMotionEvent.findPointerIndex(this.i);
      if (m < 0) {
        break label124;
      }
      float f1 = paramMotionEvent.getX(m);
      float f2 = paramMotionEvent.getY(m);
      float f3 = this.d;
      if ((f1 >= -f3) && (f2 >= -f3) && (f1 < f3 + (localView.getRight() - localView.getLeft())) && (f2 < f3 + (localView.getBottom() - localView.getTop()))) {}
      for (int n = 1; n == 0; n = 0)
      {
        d();
        localView.getParent().requestDisallowInterceptTouchEvent(true);
        k = 1;
        break label127;
      }
      d();
      break label124;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     afi
 * JD-Core Version:    0.7.0.1
 */