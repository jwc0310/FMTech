public final class qeg
  extends qan<qeg>
{
  public static final qao<qbe, qeg> a = new qao(11, qeg.class, (int)317991610L, false);
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public qbe[] f = qbe.b();
  public qbe g = null;
  private String h = null;
  private qck i = null;
  private String j = null;
  private qbe[] k = qbe.b();
  private qbe l = null;
  private String m = null;
  private String n = null;
  private String o = null;
  
  static
  {
    new qao(11, qeg.class, (int)317991610L, false);
  }
  
  public qeg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = super.a();
    if (this.b != null) {
      i1 += qal.b(1, this.b);
    }
    if (this.c != null) {
      i1 += qal.b(2, this.c);
    }
    if (this.d != null) {
      i1 += qal.b(3, this.d);
    }
    if (this.e != null) {
      i1 += qal.b(4, this.e);
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
    if (this.f != null)
    {
      int i2 = this.f.length;
      int i3 = 0;
      if (i2 > 0) {
        while (i3 < this.f.length)
        {
          qbe localqbe1 = this.f[i3];
          if (localqbe1 != null) {
            i1 += qal.c(11, localqbe1);
          }
          i3++;
        }
      }
    }
    if (this.m != null) {
      i1 += qal.b(12, this.m);
    }
    if (this.n != null) {
      i1 += qal.b(75, this.n);
    }
    if (this.g != null) {
      i1 += qal.c(185, this.g);
    }
    if (this.o != null) {
      i1 += qal.b(254, this.o);
    }
    return i1;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(1, this.b);
    }
    if (this.c != null) {
      paramqal.a(2, this.c);
    }
    if (this.d != null) {
      paramqal.a(3, this.d);
    }
    if (this.e != null) {
      paramqal.a(4, this.e);
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
    if (this.f != null)
    {
      int i1 = this.f.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.f.length)
        {
          qbe localqbe1 = this.f[i2];
          if (localqbe1 != null) {
            paramqal.a(11, localqbe1);
          }
          i2++;
        }
      }
    }
    if (this.m != null) {
      paramqal.a(12, this.m);
    }
    if (this.n != null) {
      paramqal.a(75, this.n);
    }
    if (this.g != null) {
      paramqal.a(185, this.g);
    }
    if (this.o != null) {
      paramqal.a(254, this.o);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qeg
 * JD-Core Version:    0.7.0.1
 */