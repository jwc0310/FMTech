public final class old
  extends qan<old>
{
  private static volatile old[] d;
  public int a = -2147483648;
  public Long b = null;
  public qbr[] c = qbr.b();
  private Long e = null;
  private qbu[] f = qbu.a;
  private Integer g = null;
  
  public old()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static old[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new old[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i10;
    int i11;
    if (this.a != -2147483648)
    {
      int i9 = this.a;
      i10 = qal.d(8);
      if (i9 >= 0) {
        i11 = qal.d(i9);
      }
    }
    for (int k = j + (i11 + i10);; k = j)
    {
      if (this.e != null)
      {
        long l2 = this.e.longValue();
        k += qal.d(16) + qal.b(l2);
      }
      if (this.b != null)
      {
        long l1 = this.b.longValue();
        k += qal.d(24) + qal.b(l1);
      }
      if ((this.f != null) && (this.f.length > 0))
      {
        int i5 = k;
        int i6 = 0;
        for (;;)
        {
          if (i6 < this.f.length)
          {
            qbu localqbu = this.f[i6];
            if (localqbu != null)
            {
              int i7 = qal.d(32);
              int i8 = localqbu.a();
              localqbu.ak = i8;
              i5 += i7 + (i8 + qal.d(i8));
            }
            i6++;
            continue;
            i11 = i;
            break;
          }
        }
        k = i5;
      }
      if (this.g != null)
      {
        int i3 = this.g.intValue();
        int i4 = qal.d(40);
        if (i3 >= 0) {
          i = qal.d(i3);
        }
        k += i + i4;
      }
      if (this.c != null)
      {
        int m = this.c.length;
        int n = 0;
        if (m > 0) {
          while (n < this.c.length)
          {
            qbr localqbr = this.c[n];
            if (localqbr != null)
            {
              int i1 = qal.d(48);
              int i2 = localqbr.a();
              localqbr.ak = i2;
              k += i1 + (i2 + qal.d(i2));
            }
            n++;
          }
        }
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int n = this.a;
      paramqal.c(8);
      paramqal.a(n);
    }
    if (this.e != null)
    {
      long l2 = this.e.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.b != null)
    {
      long l1 = this.b.longValue();
      paramqal.c(24);
      paramqal.a(l1);
    }
    if ((this.f != null) && (this.f.length > 0)) {
      for (int m = 0; m < this.f.length; m++)
      {
        qbu localqbu = this.f[m];
        if (localqbu != null)
        {
          paramqal.c(34);
          if (localqbu.ak < 0) {
            localqbu.ak = localqbu.a();
          }
          paramqal.c(localqbu.ak);
          localqbu.a(paramqal);
        }
      }
    }
    if (this.g != null)
    {
      int k = this.g.intValue();
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          qbr localqbr = this.c[j];
          if (localqbr != null)
          {
            paramqal.c(50);
            if (localqbr.ak < 0) {
              localqbr.ak = localqbr.a();
            }
            paramqal.c(localqbr.ak);
            localqbr.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     old
 * JD-Core Version:    0.7.0.1
 */