public final class qdu
  extends qan<qdu>
{
  public qbz a = null;
  public qby b = null;
  public qbs[] c = qbs.b();
  public mip d = null;
  public qci e = null;
  public mim f = null;
  public mio g = null;
  public qbr h = null;
  private int i = -2147483648;
  private qbr[] j = qbr.b();
  private int k = -2147483648;
  
  public qdu()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int m = super.a();
    if (this.b != null) {
      m += qal.c(15, this.b);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i2 = m;
      for (int i3 = 0; i3 < this.c.length; i3++)
      {
        qbs localqbs = this.c[i3];
        if (localqbs != null) {
          i2 += qal.c(16, localqbs);
        }
      }
      m = i2;
    }
    if (this.d != null) {
      m += qal.c(17, this.d);
    }
    if (this.e != null) {
      m += qal.c(18, this.e);
    }
    if (this.f != null) {
      m += qal.c(19, this.f);
    }
    if (this.g != null) {
      m += qal.c(20, this.g);
    }
    if (this.h != null) {
      m += qal.c(21, this.h);
    }
    if (this.i != -2147483648) {
      m += qal.e(23, this.i);
    }
    if (this.j != null)
    {
      int n = this.j.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.j.length)
        {
          qbr localqbr = this.j[i1];
          if (localqbr != null) {
            m += qal.c(24, localqbr);
          }
          i1++;
        }
      }
    }
    if (this.a != null) {
      m += qal.c(32, this.a);
    }
    if (this.k != -2147483648) {
      m += qal.e(35, this.k);
    }
    return m;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null) {
      paramqal.a(15, this.b);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int i1 = 0; i1 < this.c.length; i1++)
      {
        qbs localqbs = this.c[i1];
        if (localqbs != null) {
          paramqal.a(16, localqbs);
        }
      }
    }
    if (this.d != null) {
      paramqal.a(17, this.d);
    }
    if (this.e != null) {
      paramqal.a(18, this.e);
    }
    if (this.f != null) {
      paramqal.a(19, this.f);
    }
    if (this.g != null) {
      paramqal.a(20, this.g);
    }
    if (this.h != null) {
      paramqal.a(21, this.h);
    }
    if (this.i != -2147483648) {
      paramqal.a(23, this.i);
    }
    if (this.j != null)
    {
      int m = this.j.length;
      int n = 0;
      if (m > 0) {
        while (n < this.j.length)
        {
          qbr localqbr = this.j[n];
          if (localqbr != null) {
            paramqal.a(24, localqbr);
          }
          n++;
        }
      }
    }
    if (this.a != null) {
      paramqal.a(32, this.a);
    }
    if (this.k != -2147483648) {
      paramqal.a(35, this.k);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qdu
 * JD-Core Version:    0.7.0.1
 */