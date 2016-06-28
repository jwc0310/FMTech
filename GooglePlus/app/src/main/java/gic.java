import android.app.Activity;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class gic
  extends Handler
{
  private static final int d = (int)TimeUnit.SECONDS.toMillis(1L) / 90;
  private static final List<Integer> e;
  boolean a;
  boolean b;
  long c = -1L;
  private final Activity f;
  private final gib g;
  private final List<ghw> h;
  private long i = -1L;
  private final Map<ghw, Integer> j;
  private long k = -1L;
  private MotionEvent l;
  private long m = -1L;
  private List<ghw> n;
  private ghw o;
  private int p;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[4];
    arrayOfInteger[0] = Integer.valueOf(3);
    arrayOfInteger[1] = Integer.valueOf(4);
    arrayOfInteger[2] = Integer.valueOf(1);
    arrayOfInteger[3] = Integer.valueOf(6);
    e = Collections.unmodifiableList(Arrays.asList(arrayOfInteger));
  }
  
  public gic(Activity paramActivity, gib paramgib, List<ghw> paramList)
  {
    super(Looper.getMainLooper());
    this.f = paramActivity;
    this.g = paramgib;
    this.h = paramList;
    this.j = new HashMap(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      ghw localghw = (ghw)localIterator.next();
      this.j.put(localghw, Integer.valueOf(4));
    }
  }
  
  private final void a()
  {
    Iterator localIterator = this.h.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (!a((ghw)localIterator.next()));
    for (int i1 = 1;; i1 = 0)
    {
      if ((this.c > this.m) || (i1 != 0))
      {
        sendEmptyMessageDelayed(2, d);
        return;
      }
      sendEmptyMessage(3);
      return;
    }
  }
  
  private final boolean a(ghw paramghw)
  {
    return !e.contains(this.j.get(paramghw));
  }
  
  private final void b()
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      ghw localghw = (ghw)localIterator.next();
      if ((localghw.a() <= this.m) && (this.m <= localghw.b()))
      {
        if (a(localghw))
        {
          this.n.add(localghw);
        }
        else if (this.o == null)
        {
          this.o = localghw;
          this.p = 0;
        }
      }
      else if (a(localghw)) {
        if (this.o == null)
        {
          this.o = localghw;
          this.p = 1;
        }
        else
        {
          this.n.add(localghw);
        }
      }
    }
  }
  
  private final void c()
  {
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
    {
      ghw localghw = (ghw)localIterator.next();
      if (a(localghw)) {
        if (this.o == null)
        {
          this.o = localghw;
          this.p = 1;
        }
        else
        {
          this.n.add(localghw);
        }
      }
    }
  }
  
  private final void d()
  {
    if (this.k == -1L) {
      this.k = this.m;
    }
    int i10;
    int i1;
    if ((this.n.size() > 0) && (this.o != null))
    {
      if (this.p == 0)
      {
        i10 = 5;
        this.p = i10;
      }
    }
    else
    {
      if (this.o == null) {
        break label217;
      }
      i1 = this.p;
      if ((this.p == 6) || (this.p == 5)) {
        i1 |= this.n.size() << 8;
      }
    }
    int i2;
    MotionEvent.PointerProperties[] arrayOfPointerProperties;
    MotionEvent.PointerCoords[] arrayOfPointerCoords;
    int i3;
    for (;;)
    {
      i2 = this.n.size();
      if (this.o != null) {
        i2++;
      }
      arrayOfPointerProperties = new MotionEvent.PointerProperties[i2];
      arrayOfPointerCoords = new MotionEvent.PointerCoords[i2];
      Iterator localIterator = this.n.iterator();
      for (i3 = 0; localIterator.hasNext(); i3++)
      {
        ghw localghw = (ghw)localIterator.next();
        arrayOfPointerProperties[i3] = localghw.c();
        arrayOfPointerCoords[i3] = localghw.a(this.m);
        this.j.put(localghw, Integer.valueOf(2));
      }
      i10 = 6;
      break;
      label217:
      i1 = 2;
    }
    if (this.o != null)
    {
      arrayOfPointerProperties[i3] = this.o.c();
      arrayOfPointerCoords[i3] = this.o.a(this.m);
      this.j.put(this.o, Integer.valueOf(this.p));
    }
    long l1 = this.i + this.k;
    long l2 = this.i + this.m;
    int i4 = gia.a;
    int i5 = arrayOfPointerCoords.length;
    int i6 = 0;
    int i7 = 0;
    if (i6 < i5)
    {
      MotionEvent.PointerCoords localPointerCoords = arrayOfPointerCoords[i6];
      View localView = this.f.getWindow().getDecorView();
      RectF localRectF = new RectF(localPointerCoords.x - localPointerCoords.touchMinor, localPointerCoords.y - localPointerCoords.touchMinor, localPointerCoords.x + localPointerCoords.touchMinor, localPointerCoords.y + localPointerCoords.touchMinor);
      int i8;
      if ((localRectF.left < 0.0F) && (0.0F < localRectF.right))
      {
        i8 = 4;
        label417:
        if ((localRectF.top >= 0.0F) || (0.0F >= localRectF.bottom)) {
          break label511;
        }
        i8 |= 0x1;
      }
      for (;;)
      {
        int i9 = i8 | i7;
        i6++;
        i7 = i9;
        break;
        boolean bool1 = localRectF.left < localView.getRight();
        i8 = 0;
        if (!bool1) {
          break label417;
        }
        boolean bool2 = localView.getRight() < localRectF.right;
        i8 = 0;
        if (!bool2) {
          break label417;
        }
        i8 = 8;
        break label417;
        label511:
        if ((localRectF.top < localView.getBottom()) && (localView.getBottom() < localRectF.bottom)) {
          i8 |= 0x2;
        }
      }
    }
    this.l = MotionEvent.obtain(l1, l2, i1, i2, arrayOfPointerProperties, arrayOfPointerCoords, 0, 0, 0.0F, 0.0F, i4, i7, 2, 0);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 3)
    {
      if (!this.b) {
        this.g.a();
      }
      return;
    }
    int i1 = paramMessage.what;
    long l1 = SystemClock.uptimeMillis();
    if (i1 == 1)
    {
      this.i = l1;
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        ghw localghw = (ghw)localIterator.next();
        if (localghw.b() > this.c) {
          this.c = localghw.b();
        }
      }
    }
    this.m = (l1 - this.i);
    this.n = new ArrayList(this.h.size());
    this.o = null;
    this.p = 4;
    if (this.a) {
      c();
    }
    for (;;)
    {
      if ((this.n.size() > 0) || (this.o != null))
      {
        d();
        this.f.dispatchTouchEvent(this.l);
        this.l.recycle();
        this.l = null;
        if (this.p == 1) {
          this.k = -1L;
        }
      }
      a();
      return;
      b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gic
 * JD-Core Version:    0.7.0.1
 */