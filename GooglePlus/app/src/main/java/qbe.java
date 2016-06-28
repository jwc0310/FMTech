public final class qbe
  extends qan<qbe>
{
  private static volatile qbe[] d;
  public int[] a = qay.a;
  public String b = null;
  public qbo c = null;
  private String e = null;
  private qcl f = null;
  private String g = null;
  private qcd h = null;
  private String i = null;
  
  public qbe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static qbe[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new qbe[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int j = 0;
    int k = super.a();
    int n;
    if ((this.a != null) && (this.a.length > 0))
    {
      n = 0;
      if (j < this.a.length)
      {
        int i1 = this.a[j];
        if (i1 >= 0) {}
        for (int i2 = qal.d(i1);; i2 = 10)
        {
          n += i2;
          j++;
          break;
        }
      }
    }
    for (int m = k + n + 1 * this.a.length;; m = k)
    {
      if (this.b != null) {
        m += qal.b(2, this.b);
      }
      if (this.e != null) {
        m += qal.b(3, this.e);
      }
      if (this.c != null) {
        m += qal.c(4, this.c);
      }
      if (this.f != null) {
        m += qal.c(5, this.f);
      }
      if (this.g != null) {
        m += qal.b(6, this.g);
      }
      if (this.h != null) {
        m += qal.c(7, this.h);
      }
      if (this.i != null) {
        m += qal.b(8, this.i);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++) {
        paramqal.a(1, this.a[j]);
      }
    }
    if (this.b != null) {
      paramqal.a(2, this.b);
    }
    if (this.e != null) {
      paramqal.a(3, this.e);
    }
    if (this.c != null) {
      paramqal.a(4, this.c);
    }
    if (this.f != null) {
      paramqal.a(5, this.f);
    }
    if (this.g != null) {
      paramqal.a(6, this.g);
    }
    if (this.h != null) {
      paramqal.a(7, this.h);
    }
    if (this.i != null) {
      paramqal.a(8, this.i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qbe
 * JD-Core Version:    0.7.0.1
 */