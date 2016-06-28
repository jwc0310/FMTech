import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public final class lsr
{
  static final lsp<Bitmap> a = new lsq(64);
  private final RectF A = new RectF();
  private final RectF B = new RectF();
  private int C;
  private final Rect[] D;
  private boolean E;
  int b;
  lsv c;
  int d;
  int e = 0;
  final kp<lss> f = new kp();
  final Object g = new Object();
  final lsu h = new lsu();
  final lsu i = new lsu();
  final lsu j = new lsu();
  int k = -1;
  int l = -1;
  public int m;
  public int n;
  public float o;
  public boolean p;
  final Rect q = new Rect();
  lst r;
  public int s;
  public int t;
  View u;
  private iax v;
  private int w;
  private int x;
  private int y;
  private boolean z;
  
  public lsr(View paramView)
  {
    Rect[] arrayOfRect = new Rect[2];
    arrayOfRect[0] = new Rect();
    arrayOfRect[1] = new Rect();
    this.D = arrayOfRect;
    this.u = paramView;
    this.r = new lst(this);
    this.r.setName("TileDecoder");
    this.r.start();
  }
  
  public static int a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    if ((localDisplayMetrics.heightPixels > 2048) || (localDisplayMetrics.widthPixels > 2048)) {}
    for (int i1 = 1; i1 != 0; i1 = 0) {
      return 512;
    }
    return 256;
  }
  
  private final void a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, float paramFloat, int paramInt4)
  {
    double d1 = Math.toRadians(-paramInt4);
    double d2 = this.s;
    double d3 = this.t;
    double d4 = Math.cos(d1);
    double d5 = Math.sin(d1);
    int i1 = (int)Math.ceil(Math.max(Math.abs(d4 * d2 - d5 * d3), Math.abs(d4 * d2 + d5 * d3)));
    int i2 = (int)Math.ceil(Math.max(Math.abs(d5 * d2 + d4 * d3), Math.abs(d5 * d2 - d4 * d3)));
    int i3 = (int)Math.floor(paramInt1 - i1 / (2.0F * paramFloat));
    int i4 = (int)Math.floor(paramInt2 - i2 / (2.0F * paramFloat));
    int i5 = (int)Math.ceil(i3 + i1 / paramFloat);
    int i6 = (int)Math.ceil(i4 + i2 / paramFloat);
    int i7 = this.b << paramInt3;
    paramRect.set(Math.max(0, i7 * (i3 / i7)), Math.max(0, i7 * (i4 / i7)), Math.min(this.k, i5), Math.min(this.l, i6));
  }
  
  private final void a(lss paramlss)
  {
    synchronized (this.g)
    {
      if (paramlss.o == 1)
      {
        paramlss.o = 2;
        if (this.j.a(paramlss)) {
          this.g.notifyAll();
        }
      }
      return;
    }
  }
  
  private final boolean a(lss paramlss, iaz paramiaz, RectF paramRectF1, RectF paramRectF2)
  {
    if (paramlss.j())
    {
      paramiaz.a(paramlss, paramRectF1, paramRectF2);
      return true;
    }
    if (1 + paramlss.l == paramlss.p.d) {}
    int i2;
    int i3;
    for (lss locallss = null; locallss == null; locallss = paramlss.p.a(i2, i3, 1 + paramlss.l))
    {
      return false;
      int i1 = paramlss.p.b << 1 + paramlss.l;
      i2 = i1 * (paramlss.j / i1);
      i3 = i1 * (paramlss.k / i1);
    }
    if (paramlss.j == locallss.j)
    {
      paramRectF1.left /= 2.0F;
      paramRectF1.right /= 2.0F;
      label139:
      if (paramlss.k != locallss.k) {
        break label212;
      }
      paramRectF1.top /= 2.0F;
    }
    for (paramRectF1.bottom /= 2.0F;; paramRectF1.bottom = ((this.b + paramRectF1.bottom) / 2.0F))
    {
      paramlss = locallss;
      break;
      paramRectF1.left = ((this.b + paramRectF1.left) / 2.0F);
      paramRectF1.right = ((this.b + paramRectF1.right) / 2.0F);
      break label139;
      label212:
      paramRectF1.top = ((this.b + paramRectF1.top) / 2.0F);
    }
  }
  
  private final lss b(int paramInt1, int paramInt2, int paramInt3)
  {
    synchronized (this.g)
    {
      lss locallss1 = this.h.a();
      if (locallss1 != null)
      {
        locallss1.o = 1;
        locallss1.j = paramInt1;
        locallss1.k = paramInt2;
        locallss1.l = paramInt3;
        if (locallss1.i != null) {
          locallss1.i();
        }
        locallss1.h = false;
        locallss1.c = -1;
        locallss1.d = -1;
        return locallss1;
      }
      lss locallss2 = new lss(this, paramInt1, paramInt2, paramInt3);
      return locallss2;
    }
  }
  
  private final void b()
  {
    synchronized (this.g)
    {
      this.j.a = null;
      this.i.a = null;
      kp localkp = this.f;
      if (localkp.b) {
        localkp.a();
      }
      int i1 = localkp.e;
      for (int i2 = 0; i2 < i1; i2++) {
        b((lss)this.f.b(i2));
      }
      this.f.c();
      return;
    }
  }
  
  private final void b(lss paramlss)
  {
    synchronized (this.g)
    {
      if (paramlss.o == 4)
      {
        paramlss.o = 32;
        return;
      }
      paramlss.o = 64;
      if (paramlss.n != null)
      {
        a.a(paramlss.n);
        paramlss.n = null;
      }
      this.h.a(paramlss);
      return;
    }
  }
  
  private static long c(int paramInt1, int paramInt2, int paramInt3)
  {
    return (paramInt1 << 16 | paramInt2) << 16 | paramInt3;
  }
  
  private final void c()
  {
    this.E = true;
    kp localkp = this.f;
    if (localkp.b) {
      localkp.a();
    }
    int i1 = localkp.e;
    for (int i2 = 0; i2 < i1; i2++)
    {
      lss locallss = (lss)this.f.b(i2);
      if (!locallss.j()) {
        a(locallss);
      }
    }
  }
  
  final lss a(int paramInt1, int paramInt2, int paramInt3)
  {
    return (lss)this.f.a(c(paramInt1, paramInt2, paramInt3));
  }
  
  public final void a()
  {
    this.p = true;
    this.r.interrupt();
    synchronized (this.g)
    {
      this.i.a = null;
      this.j.a = null;
      for (lss locallss = this.h.a(); locallss != null; locallss = this.h.a()) {
        locallss.g();
      }
      kp localkp = this.f;
      if (localkp.b) {
        localkp.a();
      }
      int i1 = localkp.e;
      int i2 = 0;
      if (i2 < i1)
      {
        ((lss)this.f.b(i2)).g();
        i2++;
      }
    }
    this.f.c();
    this.q.set(0, 0, 0, 0);
    while (a.a() != null) {}
  }
  
  public final void a(lsv paramlsv, int paramInt)
  {
    if (this.c != paramlsv)
    {
      this.c = paramlsv;
      b();
      if (this.c != null) {
        break label68;
      }
      this.k = 0;
      this.l = 0;
      this.d = 0;
      this.v = null;
    }
    for (;;)
    {
      this.p = true;
      if (this.C != paramInt)
      {
        this.C = paramInt;
        this.p = true;
      }
      return;
      label68:
      this.k = this.c.b();
      this.l = this.c.c();
      this.v = this.c.d();
      this.b = this.c.a();
      if (this.v != null)
      {
        this.d = Math.max(0, iaw.a(this.k / this.v.b()));
      }
      else
      {
        int i1 = Math.max(this.k, this.l);
        int i2 = this.b;
        for (int i3 = 1; i2 < i1; i3++) {
          i2 <<= 1;
        }
        this.d = i3;
      }
    }
  }
  
  public final boolean a(iaz paramiaz)
  {
    int i1;
    lss locallss1;
    if ((this.s == 0) || (this.t == 0) || (!this.p))
    {
      i1 = 1;
      locallss1 = null;
    }
    int i18;
    int i19;
    for (;;)
    {
      for (;;)
      {
        if (i1 <= 0) {
          break label837;
        }
        synchronized (this.g)
        {
          locallss1 = this.i.a();
          if (locallss1 == null) {
            break label837;
          }
          if (!locallss1.j()) {
            if (locallss1.o == 8)
            {
              locallss1.b(paramiaz);
              i1--;
              continue;
              this.p = false;
              this.e = iaw.a(iaw.b(1.0F / this.o), 0, this.d);
              int i14;
              if (this.e != this.d)
              {
                Rect localRect4 = this.q;
                a(localRect4, this.m, this.n, this.e, this.o, this.C);
                this.w = Math.round(this.s / 2.0F + (localRect4.left - this.m) * this.o);
                this.x = Math.round(this.t / 2.0F + (localRect4.top - this.n) * this.o);
                if (this.o * (1 << this.e) > 0.75F) {
                  i14 = -1 + this.e;
                }
              }
              int i15;
              int i16;
              Rect[] arrayOfRect;
              for (;;)
              {
                i15 = Math.max(0, Math.min(i14, -2 + this.d));
                i16 = Math.min(i15 + 2, this.d);
                arrayOfRect = this.D;
                for (int i17 = i15; i17 < i16; i17++)
                {
                  Rect localRect3 = arrayOfRect[(i17 - i15)];
                  int i32 = this.m;
                  int i33 = this.n;
                  int i34 = this.C;
                  a(localRect3, i32, i33, i17, Math.scalb(1.0F, -(i17 + 1)), i34);
                }
                i14 = this.e;
                continue;
                i14 = -2 + this.e;
                this.w = Math.round(this.s / 2.0F - this.m * this.o);
                this.x = Math.round(this.t / 2.0F - this.n * this.o);
              }
              if (this.C % 90 != 0) {
                break;
              }
              for (;;)
              {
                int i24;
                int i25;
                int i28;
                int i31;
                long l1;
                synchronized (this.g)
                {
                  this.j.a = null;
                  this.i.a = null;
                  this.E = false;
                  kp localkp1 = this.f;
                  if (localkp1.b) {
                    localkp1.a();
                  }
                  i18 = localkp1.e;
                  i19 = 0;
                  if (i19 < i18)
                  {
                    lss locallss3 = (lss)this.f.b(i19);
                    int i20 = locallss3.l;
                    if ((i20 >= i15) && (i20 < i16) && (arrayOfRect[(i20 - i15)].contains(locallss3.j, locallss3.k))) {
                      break label1433;
                    }
                    kp localkp2 = this.f;
                    if (localkp2.d[i19] != kp.a)
                    {
                      localkp2.d[i19] = kp.a;
                      localkp2.b = true;
                    }
                    i19--;
                    i18--;
                    b(locallss3);
                    break label1433;
                  }
                  i24 = i15;
                  if (i24 >= i16) {
                    break;
                  }
                  i25 = this.b << i24;
                  Rect localRect2 = arrayOfRect[(i24 - i15)];
                  int i26 = localRect2.top;
                  int i27 = localRect2.bottom;
                  i28 = i26;
                  if (i28 >= i27) {
                    break label783;
                  }
                  int i29 = localRect2.left;
                  int i30 = localRect2.right;
                  i31 = i29;
                  if (i31 >= i30) {
                    break label773;
                  }
                  l1 = c(i31, i28, i24);
                  lss locallss4 = (lss)this.f.a(l1);
                  if (locallss4 != null)
                  {
                    if (locallss4.o == 2) {
                      locallss4.o = 1;
                    }
                    i31 += i25;
                  }
                }
                lss locallss5 = b(i31, i28, i24);
                this.f.a(l1, locallss5);
                continue;
                label773:
                i28 += i25;
                continue;
                label783:
                i24++;
              }
              this.u.postInvalidate();
            }
          }
        }
      }
      int i13 = locallss1.o;
      new StringBuilder(51).append("Tile in upload queue has invalid state: ").append(i13);
    }
    label837:
    if (locallss1 != null) {
      this.u.postInvalidate();
    }
    this.y = 1;
    this.z = true;
    int i2 = this.e;
    int i3 = this.C;
    int i4;
    if (i3 != 0)
    {
      i4 = 2;
      label878:
      if (i4 != 0)
      {
        paramiaz.a(2);
        if (i3 != 0)
        {
          int i11 = this.s / 2;
          int i12 = this.t / 2;
          paramiaz.a(i11, i12);
          paramiaz.a(i3, 0.0F, 0.0F, 1.0F);
          paramiaz.a(-i11, -i12);
        }
      }
    }
    for (;;)
    {
      int i5;
      int i6;
      int i7;
      int i8;
      int i9;
      lss locallss2;
      try
      {
        if (i2 == this.d) {
          break label1319;
        }
        i5 = this.b << i2;
        float f1 = i5 * this.o;
        Rect localRect1 = this.q;
        i6 = localRect1.top;
        i7 = 0;
        if (i6 >= localRect1.bottom) {
          break label1370;
        }
        float f2 = this.x + f1 * i7;
        i8 = localRect1.left;
        i9 = 0;
        if (i8 >= localRect1.right) {
          break label1471;
        }
        float f3 = this.w + f1 * i9;
        RectF localRectF1 = this.A;
        RectF localRectF2 = this.B;
        localRectF2.set(f3, f2, f3 + f1, f2 + f1);
        localRectF1.set(0.0F, 0.0F, this.b, this.b);
        locallss2 = a(i8, i6, i2);
        if (locallss2 != null)
        {
          if (!locallss2.j())
          {
            if (locallss2.o != 8) {
              break label1295;
            }
            if (this.y > 0)
            {
              this.y = (-1 + this.y);
              locallss2.b(paramiaz);
            }
          }
          else
          {
            if (a(locallss2, paramiaz, localRectF1, localRectF2)) {
              break label1458;
            }
          }
        }
        else
        {
          if (this.v == null) {
            break label1458;
          }
          int i10 = this.b << i2;
          float f4 = this.v.b() / this.k;
          float f5 = this.v.c() / this.l;
          localRectF1.set(f4 * i8, f5 * i6, f4 * (i8 + i10), f5 * (i10 + i6));
          paramiaz.a(this.v, localRectF1, localRectF2);
          break label1458;
        }
        this.z = false;
        continue;
        if (locallss2.o == 16) {
          continue;
        }
      }
      finally
      {
        if (i4 != 0) {
          paramiaz.b();
        }
      }
      label1295:
      this.z = false;
      a(locallss2);
      continue;
      label1319:
      if (this.v != null) {
        paramiaz.a(this.v, this.w, this.x, Math.round(this.k * this.o), Math.round(this.l * this.o));
      }
      label1370:
      if (i4 != 0) {
        paramiaz.b();
      }
      if (this.z) {
        if (!this.E) {
          c();
        }
      }
      while ((this.z) || (this.v != null))
      {
        return true;
        this.u.postInvalidate();
      }
      return false;
      i4 = 0;
      break label878;
      label1433:
      int i21 = i19;
      int i22 = i18;
      int i23 = i21 + 1;
      i18 = i22;
      i19 = i23;
      break;
      label1458:
      i8 += i5;
      i9++;
      continue;
      label1471:
      i6 += i5;
      i7++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsr
 * JD-Core Version:    0.7.0.1
 */