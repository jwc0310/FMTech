public final class onk
  extends qan<onk>
{
  public int a = -2147483648;
  public ood[] b = ood.b();
  public String c = null;
  private Integer d = null;
  private ond[] e = ond.b();
  
  public onk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i12;
    int i13;
    if (this.a != -2147483648)
    {
      int i11 = this.a;
      i12 = qal.d(8);
      if (i11 >= 0) {
        i13 = qal.d(i11);
      }
    }
    for (int k = j + (i13 + i12);; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i7 = k;
        int i8 = 0;
        for (;;)
        {
          if (i8 < this.b.length)
          {
            ood localood = this.b[i8];
            if (localood != null)
            {
              int i9 = qal.d(16);
              int i10 = localood.a();
              localood.ak = i10;
              i7 += i9 + (i10 + qal.d(i10));
            }
            i8++;
            continue;
            i13 = i;
            break;
          }
        }
        k = i7;
      }
      if (this.d != null)
      {
        int i5 = this.d.intValue();
        int i6 = qal.d(24);
        if (i5 >= 0) {
          i = qal.d(i5);
        }
        k += i + i6;
      }
      if (this.c != null)
      {
        String str = this.c;
        int i3 = qal.d(32);
        int i4 = qal.a(str);
        k += i3 + (i4 + qal.d(i4));
      }
      if (this.e != null)
      {
        int m = this.e.length;
        int n = 0;
        if (m > 0) {
          while (n < this.e.length)
          {
            ond localond = this.e[n];
            if (localond != null)
            {
              int i1 = qal.d(40);
              int i2 = localond.a();
              localond.ak = i2;
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int m = 0; m < this.b.length; m++)
      {
        ood localood = this.b[m];
        if (localood != null)
        {
          paramqal.c(18);
          if (localood.ak < 0) {
            localood.ak = localood.a();
          }
          paramqal.c(localood.ak);
          localood.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          ond localond = this.e[j];
          if (localond != null)
          {
            paramqal.c(42);
            if (localond.ak < 0) {
              localond.ak = localond.a();
            }
            paramqal.c(localond.ak);
            localond.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     onk
 * JD-Core Version:    0.7.0.1
 */