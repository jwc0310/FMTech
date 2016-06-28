public final class qcj
  extends qan<qcj>
{
  public static final qao<qbe, qcj> a = new qao(11, qcj.class, (int)214463602L, false);
  public String b = null;
  public String c = null;
  public String d = null;
  public String e = null;
  public qbe f = null;
  private String g = null;
  private qck h = null;
  private String i = null;
  private qbe[] j = qbe.b();
  private qdk[] k = qdk.a;
  
  public qcj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.b != null) {
      m += qal.b(1, this.b);
    }
    if (this.c != null) {
      m += qal.b(2, this.c);
    }
    if (this.d != null) {
      m += qal.b(3, this.d);
    }
    if (this.e != null) {
      m += qal.b(4, this.e);
    }
    if (this.h != null) {
      m += qal.c(5, this.h);
    }
    if (this.i != null) {
      m += qal.b(6, this.i);
    }
    if ((this.j != null) && (this.j.length > 0))
    {
      int i2 = m;
      for (int i3 = 0; i3 < this.j.length; i3++)
      {
        qbe localqbe = this.j[i3];
        if (localqbe != null) {
          i2 += qal.c(7, localqbe);
        }
      }
      m = i2;
    }
    if (this.g != null) {
      m += qal.b(8, this.g);
    }
    if (this.f != null) {
      m += qal.c(9, this.f);
    }
    if (this.k != null)
    {
      int n = this.k.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.k.length)
        {
          qdk localqdk = this.k[i1];
          if (localqdk != null) {
            m += qal.c(10, localqdk);
          }
          i1++;
        }
      }
    }
    return m;
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
    if ((this.j != null) && (this.j.length > 0)) {
      for (int i1 = 0; i1 < this.j.length; i1++)
      {
        qbe localqbe = this.j[i1];
        if (localqbe != null) {
          paramqal.a(7, localqbe);
        }
      }
    }
    if (this.g != null) {
      paramqal.a(8, this.g);
    }
    if (this.f != null) {
      paramqal.a(9, this.f);
    }
    if (this.k != null)
    {
      int m = this.k.length;
      int n = 0;
      if (m > 0) {
        while (n < this.k.length)
        {
          qdk localqdk = this.k[n];
          if (localqdk != null) {
            paramqal.a(10, localqdk);
          }
          n++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qcj
 * JD-Core Version:    0.7.0.1
 */