public final class qgj
  extends qan<qgj>
{
  private static volatile qgj[] h;
  private qjp A = null;
  private int B = -2147483648;
  private String C = null;
  private String D = null;
  private String E = null;
  private String F = null;
  public qgd a = null;
  public Integer b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public qhh f = null;
  public String g = null;
  private Boolean i = null;
  private Boolean j = null;
  private String k = null;
  private String l = null;
  private String m = null;
  private qke n = null;
  private qgk o = null;
  private qgm p = null;
  private String[] q = qay.f;
  private String[] r = qay.f;
  private String s = null;
  private Boolean t = null;
  private qgm u = null;
  private qgk v = null;
  private qgt w = null;
  private qgp[] x = qgp.b();
  private qgo[] y = qgo.b();
  private qjq z = null;
  
  public qgj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qgj[] b()
  {
    if (h == null) {}
    synchronized (qar.a)
    {
      if (h == null) {
        h = new qgj[0];
      }
      return h;
    }
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.a != null) {
      i1 += qal.c(1, this.a);
    }
    if (this.b != null) {
      i1 += qal.e(2, this.b.intValue());
    }
    if (this.k != null) {
      i1 += qal.b(3, this.k);
    }
    if (this.c != null) {
      i1 += qal.b(4, this.c);
    }
    if (this.m != null) {
      i1 += qal.b(5, this.m);
    }
    if (this.d != null) {
      i1 += qal.b(6, this.d);
    }
    if (this.o != null) {
      i1 += qal.c(7, this.o);
    }
    if (this.p != null) {
      i1 += qal.c(8, this.p);
    }
    if ((this.q != null) && (this.q.length > 0))
    {
      int i10 = 0;
      int i11 = 0;
      int i12 = 0;
      while (i10 < this.q.length)
      {
        String str2 = this.q[i10];
        if (str2 != null)
        {
          i12++;
          int i13 = qal.a(str2);
          i11 += i13 + qal.d(i13);
        }
        i10++;
      }
      i1 = i1 + i11 + i12 * 1;
    }
    if ((this.r != null) && (this.r.length > 0))
    {
      int i6 = 0;
      int i7 = 0;
      int i8 = 0;
      while (i6 < this.r.length)
      {
        String str1 = this.r[i6];
        if (str1 != null)
        {
          i8++;
          int i9 = qal.a(str1);
          i7 += i9 + qal.d(i9);
        }
        i6++;
      }
      i1 = i1 + i7 + i8 * 1;
    }
    if (this.e != null) {
      i1 += qal.b(11, this.e);
    }
    if (this.s != null) {
      i1 += qal.b(12, this.s);
    }
    if (this.t != null) {
      i1 += qal.b(13, this.t.booleanValue());
    }
    if (this.u != null) {
      i1 += qal.c(14, this.u);
    }
    if (this.v != null) {
      i1 += qal.c(15, this.v);
    }
    if (this.j != null) {
      i1 += qal.b(16, this.j.booleanValue());
    }
    if ((this.x != null) && (this.x.length > 0))
    {
      int i4 = i1;
      for (int i5 = 0; i5 < this.x.length; i5++)
      {
        qgp localqgp = this.x[i5];
        if (localqgp != null) {
          i4 += qal.c(17, localqgp);
        }
      }
      i1 = i4;
    }
    if (this.f != null) {
      i1 += qal.c(18, this.f);
    }
    if (this.z != null) {
      i1 += qal.c(19, this.z);
    }
    if (this.A != null) {
      i1 += qal.c(20, this.A);
    }
    if (this.n != null) {
      i1 += qal.c(25, this.n);
    }
    if (this.B != -2147483648) {
      i1 += qal.e(26, this.B);
    }
    if (this.w != null) {
      i1 += qal.c(27, this.w);
    }
    if (this.C != null) {
      i1 += qal.b(28, this.C);
    }
    if (this.y != null)
    {
      int i2 = this.y.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.y.length)
        {
          qgo localqgo = this.y[i3];
          if (localqgo != null) {
            i1 += qal.c(29, localqgo);
          }
          i3++;
        }
      }
    }
    if (this.D != null) {
      i1 += qal.b(30, this.D);
    }
    if (this.E != null) {
      i1 += qal.b(31, this.E);
    }
    if (this.g != null) {
      i1 += qal.b(32, this.g);
    }
    if (this.l != null) {
      i1 += qal.b(33, this.l);
    }
    if (this.F != null) {
      i1 += qal.b(34, this.F);
    }
    if (this.i != null) {
      i1 += qal.b(35, this.i.booleanValue());
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.a(1, this.a);
    }
    if (this.b != null) {
      paramqal.a(2, this.b.intValue());
    }
    if (this.k != null) {
      paramqal.a(3, this.k);
    }
    if (this.c != null) {
      paramqal.a(4, this.c);
    }
    if (this.m != null) {
      paramqal.a(5, this.m);
    }
    if (this.d != null) {
      paramqal.a(6, this.d);
    }
    if (this.o != null) {
      paramqal.a(7, this.o);
    }
    if (this.p != null) {
      paramqal.a(8, this.p);
    }
    if ((this.q != null) && (this.q.length > 0)) {
      for (int i5 = 0; i5 < this.q.length; i5++)
      {
        String str2 = this.q[i5];
        if (str2 != null) {
          paramqal.a(9, str2);
        }
      }
    }
    if ((this.r != null) && (this.r.length > 0)) {
      for (int i4 = 0; i4 < this.r.length; i4++)
      {
        String str1 = this.r[i4];
        if (str1 != null) {
          paramqal.a(10, str1);
        }
      }
    }
    if (this.e != null) {
      paramqal.a(11, this.e);
    }
    if (this.s != null) {
      paramqal.a(12, this.s);
    }
    if (this.t != null) {
      paramqal.a(13, this.t.booleanValue());
    }
    if (this.u != null) {
      paramqal.a(14, this.u);
    }
    if (this.v != null) {
      paramqal.a(15, this.v);
    }
    if (this.j != null) {
      paramqal.a(16, this.j.booleanValue());
    }
    if ((this.x != null) && (this.x.length > 0)) {
      for (int i3 = 0; i3 < this.x.length; i3++)
      {
        qgp localqgp = this.x[i3];
        if (localqgp != null) {
          paramqal.a(17, localqgp);
        }
      }
    }
    if (this.f != null) {
      paramqal.a(18, this.f);
    }
    if (this.z != null) {
      paramqal.a(19, this.z);
    }
    if (this.A != null) {
      paramqal.a(20, this.A);
    }
    if (this.n != null) {
      paramqal.a(25, this.n);
    }
    if (this.B != -2147483648) {
      paramqal.a(26, this.B);
    }
    if (this.w != null) {
      paramqal.a(27, this.w);
    }
    if (this.C != null) {
      paramqal.a(28, this.C);
    }
    if (this.y != null)
    {
      int i1 = this.y.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.y.length)
        {
          qgo localqgo = this.y[i2];
          if (localqgo != null) {
            paramqal.a(29, localqgo);
          }
          i2++;
        }
      }
    }
    if (this.D != null) {
      paramqal.a(30, this.D);
    }
    if (this.E != null) {
      paramqal.a(31, this.E);
    }
    if (this.g != null) {
      paramqal.a(32, this.g);
    }
    if (this.l != null) {
      paramqal.a(33, this.l);
    }
    if (this.F != null) {
      paramqal.a(34, this.F);
    }
    if (this.i != null) {
      paramqal.a(35, this.i.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qgj
 * JD-Core Version:    0.7.0.1
 */