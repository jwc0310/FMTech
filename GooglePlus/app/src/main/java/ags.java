import android.os.Build.VERSION;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class ags
  implements Runnable
{
  public int a;
  public int b;
  public sp c;
  private Interpolator e = RecyclerView.F;
  private boolean f = false;
  private boolean g = false;
  
  public ags(RecyclerView paramRecyclerView)
  {
    this.c = new sp(paramRecyclerView.getContext(), RecyclerView.F);
  }
  
  public final void a()
  {
    if (this.f)
    {
      this.g = true;
      return;
    }
    this.d.removeCallbacks(this);
    RecyclerView localRecyclerView = this.d;
    nj.a.a(localRecyclerView, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.e != paramInterpolator)
    {
      this.e = paramInterpolator;
      this.c = new sp(this.d.getContext(), paramInterpolator);
    }
    this.d.a(2);
    this.b = 0;
    this.a = 0;
    this.c.a(0, 0, paramInt1, paramInt2, paramInt3);
    a();
  }
  
  public final void run()
  {
    this.g = false;
    this.f = true;
    this.d.f.run();
    sp localsp = this.c;
    agp localagp = this.d.h.h;
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i15;
    int i5;
    int i6;
    int i7;
    int i14;
    if (localsp.b.e(localsp.a))
    {
      i = localsp.b.b(localsp.a);
      j = localsp.b.c(localsp.a);
      k = i - this.a;
      m = j - this.b;
      this.a = i;
      this.b = j;
      aga localaga = this.d.g;
      n = 0;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (localaga == null) {
        break label1009;
      }
      this.d.a();
      RecyclerView localRecyclerView4 = this.d;
      localRecyclerView4.r = (1 + localRecyclerView4.r);
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.beginSection("RV Scroll");
      }
      i2 = 0;
      i3 = 0;
      if (k != 0)
      {
        i3 = this.d.h.a(k, this.d.b, this.d.y);
        i2 = k - i3;
      }
      n = 0;
      i1 = 0;
      if (m != 0)
      {
        i1 = this.d.h.b(m, this.d.b, this.d.y);
        n = m - i1;
      }
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.endSection();
      }
      if (this.d.h())
      {
        int i17 = this.d.d.a();
        for (int i18 = 0; i18 < i17; i18++)
        {
          View localView1 = this.d.d.b(i18);
          agt localagt = this.d.a(localView1);
          if ((localagt != null) && (localagt.h != null))
          {
            View localView2 = localagt.h.a;
            int i19 = localView1.getLeft();
            int i20 = localView1.getTop();
            if ((i19 != localView2.getLeft()) || (i20 != localView2.getTop())) {
              localView2.layout(i19, i20, i19 + localView2.getWidth(), i20 + localView2.getHeight());
            }
          }
        }
      }
      this.d.f();
      this.d.a(false);
      if ((localagp == null) || (localagp.d) || (!localagp.e)) {
        break label1009;
      }
      i15 = this.d.y.a();
      if (i15 != 0) {
        break label978;
      }
      localagp.b();
      int i16 = i2;
      i5 = i1;
      i6 = i16;
      if (!this.d.i.isEmpty()) {
        this.d.invalidate();
      }
      RecyclerView localRecyclerView1 = this.d;
      if (nj.a.a(localRecyclerView1) != 2) {
        this.d.a(k, m);
      }
      if ((i6 != 0) || (n != 0))
      {
        i7 = (int)localsp.b.d(localsp.a);
        if (i6 == i) {
          break label1156;
        }
        if (i6 >= 0) {
          break label1024;
        }
        i14 = -i7;
      }
    }
    label580:
    for (int i8 = i14;; i8 = 0)
    {
      if (n != j) {
        if (n < 0) {
          i7 = -i7;
        }
      }
      for (;;)
      {
        label601:
        RecyclerView localRecyclerView2 = this.d;
        RecyclerView localRecyclerView3;
        if (nj.a.a(localRecyclerView2) != 2)
        {
          localRecyclerView3 = this.d;
          if (i8 >= 0) {
            break label1053;
          }
          localRecyclerView3.b();
          ru localru4 = localRecyclerView3.s;
          int i13 = -i8;
          ru.b.a(localru4.a, i13);
          if (i7 >= 0) {
            break label1089;
          }
          localRecyclerView3.d();
          ru localru3 = localRecyclerView3.t;
          int i12 = -i7;
          ru.b.a(localru3.a, i12);
          if ((i8 != 0) || (i7 != 0)) {
            nj.a.l(localRecyclerView3);
          }
        }
        if (((i8 != 0) || (i6 == i) || (localsp.b.g(localsp.a) == 0)) && ((i7 != 0) || (n == j) || (localsp.b.h(localsp.a) == 0))) {
          localsp.b.f(localsp.a);
        }
        if ((i3 != 0) || (i5 != 0)) {
          this.d.b(i3, i5);
        }
        if (!RecyclerView.a(this.d)) {
          this.d.invalidate();
        }
        int i9;
        label853:
        int i10;
        label881:
        int i11;
        if ((m != 0) && (this.d.h.f()) && (i5 == m))
        {
          i9 = 1;
          if ((k == 0) || (!this.d.h.e()) || (i3 != k)) {
            break label1131;
          }
          i10 = 1;
          if (((k != 0) || (m != 0)) && (i10 == 0) && (i9 == 0)) {
            break label1137;
          }
          i11 = 1;
          if ((!localsp.b.a(localsp.a)) && (i11 != 0)) {
            break label1143;
          }
          this.d.a(0);
        }
        for (;;)
        {
          if (localagp != null)
          {
            if (localagp.d) {
              agp.a(localagp, 0, 0);
            }
            if (!this.g) {
              localagp.b();
            }
          }
          this.f = false;
          if (this.g) {
            a();
          }
          return;
          label978:
          if (localagp.a >= i15) {
            localagp.a = (i15 - 1);
          }
          agp.a(localagp, k - i2, m - n);
          label1009:
          int i4 = i2;
          i5 = i1;
          i6 = i4;
          break;
          if (i6 > 0)
          {
            i14 = i7;
            break label580;
          }
          i14 = 0;
          break label580;
          if (n > 0) {
            break label601;
          }
          i7 = 0;
          break label601;
          if (i8 <= 0) {
            break label663;
          }
          localRecyclerView3.c();
          ru localru1 = localRecyclerView3.u;
          ru.b.a(localru1.a, i8);
          break label663;
          if (i7 <= 0) {
            break label701;
          }
          localRecyclerView3.e();
          ru localru2 = localRecyclerView3.v;
          ru.b.a(localru2.a, i7);
          break label701;
          i9 = 0;
          break label853;
          label1131:
          i10 = 0;
          break label881;
          label1137:
          i11 = 0;
          break label904;
          label1143:
          a();
        }
        i7 = 0;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ags
 * JD-Core Version:    0.7.0.1
 */