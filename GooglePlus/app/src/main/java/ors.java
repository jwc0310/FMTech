public final class ors
  extends qan<ors>
{
  private static volatile ors[] d;
  public orm a = null;
  public orn b = null;
  public osf[] c = osf.b();
  private orm[] e = orm.b();
  private oru f = null;
  
  public ors()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ors[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new ors[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      orm localorm2 = this.a;
      int i9 = qal.d(8);
      int i10 = localorm2.a();
      localorm2.ak = i10;
      i += i9 + (i10 + qal.d(i10));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.e.length; i6++)
      {
        orm localorm1 = this.e[i6];
        if (localorm1 != null)
        {
          int i7 = qal.d(16);
          int i8 = localorm1.a();
          localorm1.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if (this.b != null)
    {
      orn localorn = this.b;
      int i3 = qal.d(24);
      int i4 = localorn.a();
      localorn.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.c != null)
    {
      int m = this.c.length;
      int n = 0;
      if (m > 0) {
        while (n < this.c.length)
        {
          osf localosf = this.c[n];
          if (localosf != null)
          {
            int i1 = qal.d(32);
            int i2 = localosf.a();
            localosf.ak = i2;
            i += i1 + (i2 + qal.d(i2));
          }
          n++;
        }
      }
    }
    if (this.f != null)
    {
      oru localoru = this.f;
      int j = qal.d(40);
      int k = localoru.a();
      localoru.ak = k;
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      orm localorm2 = this.a;
      paramqal.c(10);
      if (localorm2.ak < 0) {
        localorm2.ak = localorm2.a();
      }
      paramqal.c(localorm2.ak);
      localorm2.a(paramqal);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        orm localorm1 = this.e[k];
        if (localorm1 != null)
        {
          paramqal.c(18);
          if (localorm1.ak < 0) {
            localorm1.ak = localorm1.a();
          }
          paramqal.c(localorm1.ak);
          localorm1.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      orn localorn = this.b;
      paramqal.c(26);
      if (localorn.ak < 0) {
        localorn.ak = localorn.a();
      }
      paramqal.c(localorn.ak);
      localorn.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          osf localosf = this.c[j];
          if (localosf != null)
          {
            paramqal.c(34);
            if (localosf.ak < 0) {
              localosf.ak = localosf.a();
            }
            paramqal.c(localosf.ak);
            localosf.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.f != null)
    {
      oru localoru = this.f;
      paramqal.c(42);
      if (localoru.ak < 0) {
        localoru.ak = localoru.a();
      }
      paramqal.c(localoru.ak);
      localoru.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ors
 * JD-Core Version:    0.7.0.1
 */