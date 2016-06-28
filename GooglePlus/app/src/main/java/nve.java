public final class nve
  extends qan<nve>
{
  private static volatile nve[] f;
  public String a = null;
  public nvv[] b = nvv.b();
  public String c = null;
  public String d = null;
  public nva e = null;
  private Long g = null;
  
  public nve()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static nve[] b()
  {
    if (f == null) {}
    synchronized (qar.a)
    {
      if (f == null) {
        f = new nve[0];
      }
      return f;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.g != null)
    {
      long l = this.g.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.b.length; i6++)
      {
        nvv localnvv = this.b[i6];
        if (localnvv != null)
        {
          int i7 = qal.d(16);
          int i8 = localnvv.a();
          localnvv.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i3 = qal.d(24);
      int i4 = qal.a(str3);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i1 = qal.d(32);
      int i2 = qal.a(str2);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      String str1 = this.a;
      int m = qal.d(40);
      int n = qal.a(str1);
      i += m + (n + qal.d(n));
    }
    if (this.e != null)
    {
      nva localnva = this.e;
      int j = qal.d(48);
      int k = localnva.a();
      localnva.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.g != null)
    {
      long l = this.g.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int i = 0; i < this.b.length; i++)
      {
        nvv localnvv = this.b[i];
        if (localnvv != null)
        {
          paramqal.c(18);
          if (localnvv.ak < 0) {
            localnvv.ak = localnvv.a();
          }
          paramqal.c(localnvv.ak);
          localnvv.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.a != null)
    {
      String str1 = this.a;
      paramqal.c(42);
      paramqal.a(str1);
    }
    if (this.e != null)
    {
      nva localnva = this.e;
      paramqal.c(50);
      if (localnva.ak < 0) {
        localnva.ak = localnva.a();
      }
      paramqal.c(localnva.ak);
      localnva.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nve
 * JD-Core Version:    0.7.0.1
 */