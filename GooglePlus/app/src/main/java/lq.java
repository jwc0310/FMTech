import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

final class lq
  implements lp
{
  private static final int l = ;
  private static final int m = ViewConfiguration.getTapTimeout();
  private static final int n = ViewConfiguration.getDoubleTapTimeout();
  final Handler a;
  final GestureDetector.OnGestureListener b;
  GestureDetector.OnDoubleTapListener c;
  boolean d;
  boolean e;
  boolean f;
  MotionEvent g;
  private int h;
  private int i;
  private int j;
  private int k;
  private boolean o;
  private boolean p;
  private MotionEvent q;
  private boolean r;
  private float s;
  private float t;
  private float u;
  private float v;
  private boolean w;
  private VelocityTracker x;
  
  public lq(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    if (paramHandler != null) {}
    for (this.a = new lr(this, paramHandler);; this.a = new lr(this))
    {
      this.b = paramOnGestureListener;
      if ((paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener)) {
        this.c = ((GestureDetector.OnDoubleTapListener)paramOnGestureListener);
      }
      if (paramContext != null) {
        break;
      }
      throw new IllegalArgumentException("Context must not be null");
    }
    if (this.b == null) {
      throw new IllegalArgumentException("OnGestureListener must not be null");
    }
    this.w = true;
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    int i1 = localViewConfiguration.getScaledTouchSlop();
    int i2 = localViewConfiguration.getScaledDoubleTapSlop();
    this.j = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.k = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.h = (i1 * i1);
    this.i = (i2 * i2);
  }
  
  public final void a(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.c = paramOnDoubleTapListener;
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if (this.x == null) {
      this.x = VelocityTracker.obtain();
    }
    this.x.addMovement(paramMotionEvent);
    int i2;
    if ((i1 & 0xFF) == 6)
    {
      i2 = 1;
      if (i2 == 0) {
        break label120;
      }
    }
    int i4;
    float f1;
    float f2;
    label120:
    for (int i3 = ms.b(paramMotionEvent);; i3 = -1)
    {
      i4 = ms.a.a(paramMotionEvent);
      int i5 = 0;
      f1 = 0.0F;
      f2 = 0.0F;
      while (i5 < i4)
      {
        if (i3 != i5)
        {
          f2 += ms.a.c(paramMotionEvent, i5);
          f1 += ms.a.d(paramMotionEvent, i5);
        }
        i5++;
      }
      i2 = 0;
      break;
    }
    int i6;
    float f3;
    float f4;
    if (i2 != 0)
    {
      i6 = i4 - 1;
      f3 = f2 / i6;
      f4 = f1 / i6;
    }
    label808:
    float f7;
    float f8;
    int i10;
    boolean bool3;
    switch (i1 & 0xFF)
    {
    case 4: 
    default: 
    case 5: 
    case 6: 
    case 0: 
    case 2: 
      do
      {
        do
        {
          return false;
          i6 = i4;
          break;
          this.s = f3;
          this.u = f3;
          this.t = f4;
          this.v = f4;
          this.a.removeMessages(1);
          this.a.removeMessages(2);
          this.a.removeMessages(3);
          this.r = false;
          this.o = false;
          this.p = false;
          this.e = false;
        } while (!this.f);
        this.f = false;
        return false;
        this.s = f3;
        this.u = f3;
        this.t = f4;
        this.v = f4;
        this.x.computeCurrentVelocity(1000, this.k);
        int i14 = ms.b(paramMotionEvent);
        int i15 = ms.a.b(paramMotionEvent, i14);
        VelocityTracker localVelocityTracker2 = this.x;
        float f9 = nf.a.a(localVelocityTracker2, i15);
        VelocityTracker localVelocityTracker3 = this.x;
        float f10 = nf.a.b(localVelocityTracker3, i15);
        for (int i16 = 0; i16 < i4; i16++) {
          if (i16 != i14)
          {
            int i17 = ms.a.b(paramMotionEvent, i16);
            VelocityTracker localVelocityTracker4 = this.x;
            float f11 = f9 * nf.a.a(localVelocityTracker4, i17);
            VelocityTracker localVelocityTracker5 = this.x;
            if (f11 + f10 * nf.a.b(localVelocityTracker5, i17) < 0.0F)
            {
              this.x.clear();
              return false;
            }
          }
        }
        int i11;
        if (this.c != null)
        {
          boolean bool5 = this.a.hasMessages(3);
          if (bool5) {
            this.a.removeMessages(3);
          }
          if ((this.g != null) && (this.q != null) && (bool5))
          {
            MotionEvent localMotionEvent2 = this.g;
            MotionEvent localMotionEvent3 = this.q;
            if ((this.p) && (paramMotionEvent.getEventTime() - localMotionEvent3.getEventTime() <= n))
            {
              int i12 = (int)localMotionEvent2.getX() - (int)paramMotionEvent.getX();
              int i13 = (int)localMotionEvent2.getY() - (int)paramMotionEvent.getY();
              if (i12 * i12 + i13 * i13 < this.i)
              {
                i11 = 1;
                if (i11 == 0) {
                  break label808;
                }
                this.r = true;
              }
            }
          }
        }
        for (boolean bool4 = false | this.c.onDoubleTap(this.g) | this.c.onDoubleTapEvent(paramMotionEvent);; bool4 = false)
        {
          this.s = f3;
          this.u = f3;
          this.t = f4;
          this.v = f4;
          if (this.g != null) {
            this.g.recycle();
          }
          this.g = MotionEvent.obtain(paramMotionEvent);
          this.o = true;
          this.p = true;
          this.d = true;
          this.f = false;
          this.e = false;
          if (this.w)
          {
            this.a.removeMessages(2);
            this.a.sendEmptyMessageAtTime(2, this.g.getDownTime() + m + l);
          }
          this.a.sendEmptyMessageAtTime(1, this.g.getDownTime() + m);
          return bool4 | this.b.onDown(paramMotionEvent);
          i11 = 0;
          break;
          this.a.sendEmptyMessageDelayed(3, n);
        }
      } while (this.f);
      f7 = this.s - f3;
      f8 = this.t - f4;
      if (this.r) {
        return false | this.c.onDoubleTapEvent(paramMotionEvent);
      }
      if (this.o)
      {
        int i8 = (int)(f3 - this.u);
        int i9 = (int)(f4 - this.v);
        i10 = i8 * i8 + i9 * i9;
        if (i10 <= this.h) {
          break label1416;
        }
        bool3 = this.b.onScroll(this.g, paramMotionEvent, f7, f8);
        this.s = f3;
        this.t = f4;
        this.o = false;
        this.a.removeMessages(3);
        this.a.removeMessages(1);
        this.a.removeMessages(2);
      }
      break;
    }
    for (;;)
    {
      if (i10 > this.h) {
        this.p = false;
      }
      return bool3;
      if ((Math.abs(f7) < 1.0F) && (Math.abs(f8) < 1.0F)) {
        break;
      }
      boolean bool2 = this.b.onScroll(this.g, paramMotionEvent, f7, f8);
      this.s = f3;
      this.t = f4;
      return bool2;
      this.d = false;
      MotionEvent localMotionEvent1 = MotionEvent.obtain(paramMotionEvent);
      boolean bool1;
      if (this.r) {
        bool1 = false | this.c.onDoubleTapEvent(paramMotionEvent);
      }
      for (;;)
      {
        if (this.q != null) {
          this.q.recycle();
        }
        this.q = localMotionEvent1;
        if (this.x != null)
        {
          this.x.recycle();
          this.x = null;
        }
        this.r = false;
        this.e = false;
        this.a.removeMessages(1);
        this.a.removeMessages(2);
        return bool1;
        if (this.f)
        {
          this.a.removeMessages(3);
          this.f = false;
          bool1 = false;
        }
        else if (this.o)
        {
          bool1 = this.b.onSingleTapUp(paramMotionEvent);
          if ((this.e) && (this.c != null)) {
            this.c.onSingleTapConfirmed(paramMotionEvent);
          }
        }
        else
        {
          VelocityTracker localVelocityTracker1 = this.x;
          int i7 = ms.a.b(paramMotionEvent, 0);
          localVelocityTracker1.computeCurrentVelocity(1000, this.k);
          float f5 = nf.a.b(localVelocityTracker1, i7);
          float f6 = nf.a.a(localVelocityTracker1, i7);
          if ((Math.abs(f5) > this.j) || (Math.abs(f6) > this.j))
          {
            bool1 = this.b.onFling(this.g, paramMotionEvent, f6, f5);
            continue;
            this.a.removeMessages(1);
            this.a.removeMessages(2);
            this.a.removeMessages(3);
            this.x.recycle();
            this.x = null;
            this.r = false;
            this.d = false;
            this.o = false;
            this.p = false;
            this.e = false;
            if (!this.f) {
              break;
            }
            this.f = false;
            return false;
          }
          bool1 = false;
        }
      }
      label1416:
      bool3 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lq
 * JD-Core Version:    0.7.0.1
 */