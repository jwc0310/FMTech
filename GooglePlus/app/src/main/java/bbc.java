import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class bbc
  implements dvs, lwu
{
  static Drawable a;
  static Drawable b;
  static Drawable c;
  static Drawable d;
  static Drawable e;
  static Drawable f;
  static Drawable g;
  static Drawable h;
  static int i;
  static Paint j;
  static Paint k;
  static int l;
  static int m;
  static int n;
  int A;
  int B;
  Long C;
  String D;
  String E;
  oji F;
  boolean G;
  boolean H;
  int I;
  int J;
  Point K;
  Drawable L;
  String M;
  boolean N;
  private Rect P;
  private boolean Q;
  dvr o;
  dvr p;
  int q;
  int r;
  dvr s;
  Rect t;
  Rect u;
  Rect v;
  Rect w;
  Drawable x;
  dvr y;
  bbe z;
  
  static Rect a(Rect paramRect1, int paramInt1, int paramInt2, int paramInt3, Rect paramRect2)
  {
    int i1 = paramInt2 + paramInt1;
    int i2 = paramInt3 - paramInt1;
    if (paramRect2.left < i1 + paramInt1) {
      i1 = paramRect2.left - paramInt1;
    }
    if (paramRect2.right > paramInt3 - paramInt1) {
      i2 = paramInt1 + paramRect2.right;
    }
    int i3;
    if (paramRect1.left < i1) {
      i3 = i1 - paramRect1.left;
    }
    for (;;)
    {
      paramRect1.offset(i3, 0);
      return paramRect1;
      if (paramRect1.right > i2) {
        i3 = i2 - paramRect1.right;
      } else {
        i3 = 0;
      }
    }
  }
  
  public final Rect a()
  {
    return this.t;
  }
  
  final void a(int paramInt1, int paramInt2, Drawable paramDrawable)
  {
    int i1 = paramInt1 - paramDrawable.getIntrinsicWidth() / 2;
    this.v.set(i1, paramInt2, i1 + paramDrawable.getIntrinsicWidth(), paramInt2 + paramDrawable.getIntrinsicHeight());
    this.L = paramDrawable;
  }
  
  public final void a(Canvas paramCanvas)
  {
    if ((this.G) && (this.y != null))
    {
      this.y.a.set(this.u);
      this.y.a(paramCanvas);
      if (efj.b(this.J))
      {
        this.o.a(paramCanvas);
        this.p.a(paramCanvas);
        paramCanvas.drawLine(this.o.a.right, this.o.a.top + this.o.a.height() / 4, this.o.a.right, this.o.a.bottom - this.o.a.height() / 4, k);
      }
      if (this.N)
      {
        this.s.a(paramCanvas);
        paramCanvas.drawLine(this.u.right, this.u.top + i, this.u.right, this.u.bottom - i, j);
        paramCanvas.drawLine(this.u.right, this.u.top + this.u.height() / 4, this.u.right, this.u.bottom - this.u.height() / 4, k);
      }
      this.L.setBounds(this.v);
      this.L.draw(paramCanvas);
    }
    while (this.x == null) {
      return;
    }
    this.x.setBounds(this.t);
    this.x.draw(paramCanvas);
  }
  
  public final void a(dvr paramdvr)
  {
    boolean bool = true;
    if (paramdvr == null) {}
    do
    {
      return;
      if (paramdvr == this.s)
      {
        bbe localbbe3 = this.z;
        bbd localbbd3 = bbd.a;
        Long localLong3 = this.C;
        String str5 = this.D;
        String str6 = this.E;
        if (this.J == 3) {}
        for (;;)
        {
          localbbe3.a(localbbd3, localLong3, str5, str6, bool, this.M);
          return;
          bool = false;
        }
      }
      if (paramdvr == this.o)
      {
        bbe localbbe2 = this.z;
        bbd localbbd2 = bbd.b;
        Long localLong2 = this.C;
        String str3 = this.D;
        String str4 = this.E;
        if (this.J == 3) {}
        for (;;)
        {
          localbbe2.a(localbbd2, localLong2, str3, str4, bool, this.M);
          return;
          bool = false;
        }
      }
    } while (paramdvr != this.p);
    bbe localbbe1 = this.z;
    bbd localbbd1 = bbd.c;
    Long localLong1 = this.C;
    String str1 = this.D;
    String str2 = this.E;
    if (this.J == 3) {}
    for (;;)
    {
      localbbe1.a(localbbd1, localLong1, str1, str2, bool, this.M);
      return;
      bool = false;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.Q = paramBoolean;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.G) && (this.o.a(paramInt1, paramInt2, paramInt3))) {
      return true;
    }
    if ((this.G) && (this.p.a(paramInt1, paramInt2, paramInt3))) {
      return true;
    }
    if ((this.G) && (this.N) && (this.s.a(paramInt1, paramInt2, paramInt3))) {
      return true;
    }
    if (paramInt3 == 3)
    {
      this.Q = false;
      return true;
    }
    this.P = new Rect(this.t.left - n, this.t.top - n, this.t.right + n, this.t.bottom + n);
    if (this.G) {}
    for (Rect localRect = this.u; !localRect.contains(paramInt1, paramInt2); localRect = this.P)
    {
      if (paramInt3 == 1) {
        this.Q = false;
      }
      return false;
    }
    switch (paramInt3)
    {
    default: 
      return false;
    }
    for (this.Q = true;; this.Q = false)
    {
      return true;
      if ((this.Q) && (this.z != null)) {
        this.z.a(this);
      }
    }
  }
  
  public final CharSequence ay_()
  {
    return null;
  }
  
  public final RectF c()
  {
    return new RectF(this.F.a.floatValue(), this.F.c.floatValue(), this.F.b.floatValue(), this.F.d.floatValue());
  }
  
  public final Rect d()
  {
    if (!this.N) {}
    for (int i1 = this.u.right;; i1 = this.u.right + this.s.a.width()) {
      return new Rect(this.u.left, this.u.top, i1, this.u.bottom);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbc
 * JD-Core Version:    0.7.0.1
 */