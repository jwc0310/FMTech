public final class qdc
  extends qan<qdc>
{
  public static final qao<qbe, qdc> a = new qao(11, qdc.class, (int)346417658L, false);
  public Long b = null;
  public String c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  private String h = null;
  private qck i = null;
  private String j = null;
  private qbe[] k = qbe.b();
  private qbe l = null;
  private qbe[] m = qbe.b();
  private String n = null;
  private String o = null;
  private Long p = null;
  private qbe q = null;
  private String r = null;
  
  static
  {
    new qao(11, qdc.class, (int)346417658L, false);
  }
  
  public qdc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.d != null) {
      i1 += qal.b(1, this.d);
    }
    if (this.e != null) {
      i1 += qal.b(2, this.e);
    }
    if (this.f != null) {
      i1 += qal.b(3, this.f);
    }
    if (this.g != null) {
      i1 += qal.b(4, this.g);
    }
    if (this.h != null) {
      i1 += qal.b(5, this.h);
    }
    if (this.i != null) {
      i1 += qal.c(6, this.i);
    }
    if (this.j != null) {
      i1 += qal.b(7, this.j);
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      int i4 = i1;
      for (int i5 = 0; i5 < this.k.length; i5++)
      {
        qbe localqbe2 = this.k[i5];
        if (localqbe2 != null) {
          i4 += qal.c(8, localqbe2);
        }
      }
      i1 = i4;
    }
    if (this.l != null) {
      i1 += qal.c(9, this.l);
    }
    if (this.m != null)
    {
      int i2 = this.m.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.m.length)
        {
          qbe localqbe1 = this.m[i3];
          if (localqbe1 != null) {
            i1 += qal.c(11, localqbe1);
          }
          i3++;
        }
      }
    }
    if (this.n != null) {
      i1 += qal.b(12, this.n);
    }
    if (this.o != null) {
      i1 += qal.b(75, this.o);
    }
    if (this.b != null) {
      i1 += qal.e(180, this.b.longValue());
    }
    if (this.c != null) {
      i1 += qal.b(181, this.c);
    }
    if (this.p != null) {
      i1 += qal.e(182, this.p.longValue());
    }
    if (this.q != null) {
      i1 += qal.c(185, this.q);
    }
    if (this.r != null) {
      i1 += qal.b(254, this.r);
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.d != null) {
      paramqal.a(1, this.d);
    }
    if (this.e != null) {
      paramqal.a(2, this.e);
    }
    if (this.f != null) {
      paramqal.a(3, this.f);
    }
    if (this.g != null) {
      paramqal.a(4, this.g);
    }
    if (this.h != null) {
      paramqal.a(5, this.h);
    }
    if (this.i != null) {
      paramqal.a(6, this.i);
    }
    if (this.j != null) {
      paramqal.a(7, this.j);
    }
    if ((this.k != null) && (this.k.length > 0)) {
      for (int i3 = 0; i3 < this.k.length; i3++)
      {
        qbe localqbe2 = this.k[i3];
        if (localqbe2 != null) {
          paramqal.a(8, localqbe2);
        }
      }
    }
    if (this.l != null) {
      paramqal.a(9, this.l);
    }
    if (this.m != null)
    {
      int i1 = this.m.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.m.length)
        {
          qbe localqbe1 = this.m[i2];
          if (localqbe1 != null) {
            paramqal.a(11, localqbe1);
          }
          i2++;
        }
      }
    }
    if (this.n != null) {
      paramqal.a(12, this.n);
    }
    if (this.o != null) {
      paramqal.a(75, this.o);
    }
    if (this.b != null) {
      paramqal.b(180, this.b.longValue());
    }
    if (this.c != null) {
      paramqal.a(181, this.c);
    }
    if (this.p != null) {
      paramqal.b(182, this.p.longValue());
    }
    if (this.q != null) {
      paramqal.a(185, this.q);
    }
    if (this.r != null) {
      paramqal.a(254, this.r);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qdc
 * JD-Core Version:    0.7.0.1
 */