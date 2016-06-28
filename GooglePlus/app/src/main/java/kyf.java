import java.util.ArrayList;
import java.util.List;

public final class kyf
{
  public String A;
  public String B;
  public List<String> C;
  public String a;
  public String b;
  public String c;
  public int d;
  public String e;
  public String f;
  public int g;
  public int h;
  public String i;
  public int j;
  public boolean k;
  public int l = -2147483648;
  public int m = -2147483648;
  public boolean n;
  public boolean o;
  public boolean p;
  public qek q;
  public odr r;
  public int s = -2147483648;
  public oeh t;
  public String u;
  public boolean v;
  public boolean w;
  public int x = -2147483648;
  public int y = 0;
  public String z;
  
  public kyf(odi paramodi)
  {
    this(paramodi.a);
    if ((paramodi.b != null) && (paramodi.b.length > 0) && (paramodi.b[0] != null))
    {
      this.A = paramodi.b[0].c;
      this.z = paramodi.b[0].a;
      this.B = paramodi.b[0].b;
    }
  }
  
  public kyf(odk paramodk)
  {
    this(paramodk.a);
  }
  
  public kyf(oec paramoec)
  {
    this(paramoec.a);
    this.u = paramoec.b;
  }
  
  public kyf(oed paramoed)
  {
    if (paramoed == null) {
      return;
    }
    if (paramoed.b != null)
    {
      this.a = paramoed.b.a;
      this.h = paramoed.b.d;
      if (paramoed.b.c != null) {
        this.j = efj.a(Integer.valueOf(paramoed.b.c.a));
      }
      if (paramoed.b.b != null)
      {
        this.b = paramoed.b.b.a;
        this.c = paramoed.b.b.g;
        this.e = paramoed.b.b.c;
        this.f = paramoed.b.b.b;
        this.i = paramoed.b.b.e;
        this.r = paramoed.b.b.f;
        this.q = paramoed.b.b.d;
      }
    }
    if (paramoed.d != null) {
      this.d = efj.a(paramoed.d.a);
    }
    if (paramoed.h != null)
    {
      this.n = efj.b(paramoed.h.a);
      this.p = efj.b(paramoed.h.c);
      this.o = efj.b(paramoed.h.b);
      this.v = efj.b(paramoed.h.d);
      this.w = efj.b(paramoed.h.e);
    }
    if (paramoed.e != null) {
      this.s = efj.a(paramoed.e.a);
    }
    int i2;
    int i3;
    if (paramoed.i != null)
    {
      if (efj.b(paramoed.i.b))
      {
        i2 = i1;
        this.l = i2;
        if (!efj.b(paramoed.i.a)) {
          break label410;
        }
        i3 = i1;
        label369:
        this.m = i3;
      }
    }
    else
    {
      this.t = paramoed.c;
      this.g = paramoed.f;
      if (paramoed.g != i1) {
        break label416;
      }
    }
    for (;;)
    {
      this.k = i1;
      return;
      i2 = 0;
      break;
      label410:
      i3 = 0;
      break label369;
      label416:
      i1 = 0;
    }
  }
  
  public kyf(qxg paramqxg)
  {
    this.a = paramqxg.a;
    this.b = paramqxg.b;
    this.c = paramqxg.c;
    this.d = paramqxg.e.intValue();
    this.e = paramqxg.f;
    this.f = paramqxg.h;
    int i1;
    int i2;
    label166:
    boolean bool1;
    label198:
    int i3;
    label223:
    boolean bool2;
    label246:
    boolean bool3;
    label267:
    int i4;
    switch (paramqxg.g)
    {
    default: 
      i1 = 0;
      this.g = i1;
      switch (paramqxg.d)
      {
      default: 
        i2 = 0;
        this.h = i2;
        if ((this.g == 1) || (this.g == 2) || (this.g == 3))
        {
          bool1 = true;
          this.n = bool1;
          if ((paramqxg.d != 1) && (paramqxg.d != 2)) {
            break label335;
          }
          i3 = 1;
          if ((!this.n) && (this.g != 5) && (i3 == 0)) {
            break label341;
          }
          bool2 = true;
          this.o = bool2;
          if ((!this.n) && (i3 == 0)) {
            break label347;
          }
          bool3 = true;
          this.p = bool3;
          i4 = 0;
          if (i3 == 0) {
            break label353;
          }
        }
        break;
      }
      break;
    }
    for (;;)
    {
      this.j = i4;
      return;
      i1 = 1;
      break;
      i1 = 2;
      break;
      i1 = 3;
      break;
      i1 = 4;
      break;
      i1 = 5;
      break;
      i1 = 6;
      break;
      i2 = 1;
      break label166;
      i2 = 2;
      break label166;
      bool1 = false;
      break label198;
      label335:
      i3 = 0;
      break label223;
      label341:
      bool2 = false;
      break label246;
      label347:
      bool3 = false;
      break label267;
      label353:
      i4 = 1;
    }
  }
  
  public kyf(qxw paramqxw)
  {
    this(paramqxw.a);
    a(paramqxw.b);
    if (paramqxw.a(qxx.a)) {
      this.u = ((qxx)paramqxw.b(qxx.a)).b;
    }
    if (paramqxw.a(qxn.a))
    {
      qxn localqxn = (qxn)paramqxw.b(qxn.a);
      this.A = localqxn.b.b;
      this.z = localqxn.b.a;
    }
  }
  
  public final void a(qxl paramqxl)
  {
    if (paramqxl == null) {
      this.C = null;
    }
    for (;;)
    {
      return;
      int i1 = Math.min(paramqxl.a.length, 5);
      this.C = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++) {
        this.C.add(paramqxl.a[i2].a);
      }
    }
  }
  
  public final void a(qxt[] paramArrayOfqxt)
  {
    this.t = new oeh();
    this.t.a = new odw[paramArrayOfqxt.length];
    for (int i1 = 0; i1 < paramArrayOfqxt.length; i1++)
    {
      this.t.a[i1] = new odw();
      this.t.a[i1].a = paramArrayOfqxt[i1].a;
      this.t.a[i1].b = paramArrayOfqxt[i1].b;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kyf
 * JD-Core Version:    0.7.0.1
 */