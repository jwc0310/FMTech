import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

public final class ghe
{
  public boolean a;
  public final int[] b = { -1, -1 };
  public final PointF[] c;
  public int d;
  public long e;
  public float f;
  public boolean g;
  public final List<ghi> h;
  int i;
  Runnable j;
  final PointF k;
  private Handler l;
  
  public ghe()
  {
    PointF[] arrayOfPointF = new PointF[2];
    arrayOfPointF[0] = new PointF();
    arrayOfPointF[1] = new PointF();
    this.c = arrayOfPointF;
    this.d = 0;
    this.e = 0L;
    this.f = 5.0F;
    this.h = new ArrayList(16);
    this.i = 0;
    this.k = new PointF();
    this.l = new Handler(Looper.getMainLooper());
  }
  
  private static float a(PointF paramPointF1, PointF paramPointF2)
  {
    return (float)Math.toDegrees(Math.atan2(paramPointF2.y - paramPointF1.y, paramPointF2.x - paramPointF1.x));
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    for (;;)
    {
      try
      {
        if (this.j == null)
        {
          this.i = 1;
          this.k.set(paramFloat1, paramFloat2);
          this.j = new ghf(this);
          Handler localHandler = this.l;
          Runnable localRunnable = this.j;
          if (this.i > 1)
          {
            l1 = ViewConfiguration.getTapTimeout();
            localHandler.postDelayed(localRunnable, l1);
          }
        }
        else
        {
          this.l.removeCallbacks(this.j);
          this.i = (1 + this.i);
          continue;
        }
        long l1 = ViewConfiguration.getDoubleTapTimeout();
      }
      finally {}
    }
  }
  
  public final void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    int m = -1 + this.h.size();
    boolean bool2;
    for (boolean bool1 = false;; bool1 = bool2)
    {
      ghi localghi;
      if (m >= 0)
      {
        localghi = (ghi)this.h.get(m);
        if (!localghi.m) {
          break label195;
        }
        switch (ghg.a[(paramInt1 - 1)])
        {
        default: 
          bool2 = bool1;
        }
      }
      while (bool2)
      {
        return;
        bool2 = false;
        continue;
        bool2 = false;
        continue;
        bool2 = localghi.a(paramInt2, paramFloat1, paramFloat2);
        continue;
        bool2 = localghi.c(paramFloat1, paramFloat2);
        continue;
        bool2 = localghi.d(paramFloat1, paramFloat2);
        continue;
        bool2 = localghi.e(paramFloat1, paramFloat2);
        continue;
        bool2 = localghi.d();
        continue;
        bool2 = localghi.d();
      }
      label195:
      bool2 = bool1;
      m--;
    }
  }
  
  public final void a(int paramInt, PointF[] paramArrayOfPointF)
  {
    int m = -1 + this.h.size();
    boolean bool1 = false;
    ghi localghi;
    boolean bool2;
    if (m >= 0)
    {
      localghi = (ghi)this.h.get(m);
      if (!localghi.m) {
        break label330;
      }
      switch (ghg.a[(paramInt - 1)])
      {
      default: 
        bool2 = bool1;
        label80:
        if (bool2) {
          break;
        }
      }
    }
    for (;;)
    {
      m--;
      bool1 = bool2;
      break;
      if (localghi.a(efj.a(paramArrayOfPointF[0].x, paramArrayOfPointF[0].y, paramArrayOfPointF[1].x, paramArrayOfPointF[1].y), a(paramArrayOfPointF[0], paramArrayOfPointF[1])))
      {
        bool2 = true;
        break label80;
      }
      bool2 = false;
      break label80;
      if (localghi.b(efj.a(paramArrayOfPointF[0].x, paramArrayOfPointF[0].y, paramArrayOfPointF[1].x, paramArrayOfPointF[1].y), a(paramArrayOfPointF[0], paramArrayOfPointF[1])))
      {
        bool2 = true;
        break label80;
      }
      bool2 = false;
      break label80;
      bool2 = localghi.a();
      break label80;
      return;
      label330:
      bool2 = bool1;
    }
  }
  
  public final void b(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 1)) {
      throw new IndexOutOfBoundsException();
    }
    this.b[paramInt1] = paramInt2;
    this.c[paramInt1].set(paramFloat1, paramFloat2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghe
 * JD-Core Version:    0.7.0.1
 */