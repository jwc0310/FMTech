public final class eyn
  extends eyf<eyn>
{
  private String[] c = eym.c;
  private String[] d = eym.c;
  private int[] e = eym.a;
  private long[] f = eym.b;
  
  public eyn()
  {
    this.a = null;
    this.b = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i9;
    int i10;
    if ((this.c != null) && (this.c.length > 0))
    {
      int i8 = 0;
      i9 = 0;
      i10 = 0;
      while (i8 < this.c.length)
      {
        String str2 = this.c[i8];
        if (str2 != null)
        {
          i10++;
          int i11 = eyd.a(str2);
          i9 += i11 + eyd.b(i11);
        }
        i8++;
      }
    }
    for (int k = j + i9 + i10 * 1;; k = j)
    {
      if ((this.d != null) && (this.d.length > 0))
      {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.d.length)
        {
          String str1 = this.d[i4];
          if (str1 != null)
          {
            i6++;
            int i7 = eyd.a(str1);
            i5 += i7 + eyd.b(i7);
          }
          i4++;
        }
        k = k + i5 + i6 * 1;
      }
      if ((this.e != null) && (this.e.length > 0))
      {
        int n = 0;
        int i1 = 0;
        if (n < this.e.length)
        {
          int i2 = this.e[n];
          if (i2 >= 0) {}
          for (int i3 = eyd.b(i2);; i3 = 10)
          {
            i1 += i3;
            n++;
            break;
          }
        }
        k = k + i1 + 1 * this.e.length;
      }
      if ((this.f != null) && (this.f.length > 0))
      {
        int m = 0;
        while (i < this.f.length)
        {
          m += eyd.b(this.f[i]);
          i++;
        }
        k = k + m + 1 * this.f.length;
      }
      return k;
    }
  }
  
  public final void a(eyd parameyd)
  {
    if ((this.c != null) && (this.c.length > 0)) {
      for (int n = 0; n < this.c.length; n++)
      {
        String str2 = this.c[n];
        if (str2 != null) {
          parameyd.a(1, str2);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int m = 0; m < this.d.length; m++)
      {
        String str1 = this.d[m];
        if (str1 != null) {
          parameyd.a(2, str1);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++) {
        parameyd.a(3, this.e[k]);
      }
    }
    if (this.f != null)
    {
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          parameyd.a(4, this.f[j]);
          j++;
        }
      }
    }
    super.a(parameyd);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyn localeyn;
    boolean bool6;
    do
    {
      boolean bool5;
      do
      {
        boolean bool4;
        do
        {
          boolean bool3;
          do
          {
            boolean bool1;
            do
            {
              return bool2;
              bool1 = paramObject instanceof eyn;
              bool2 = false;
            } while (!bool1);
            localeyn = (eyn)paramObject;
            bool3 = eyj.a(this.c, localeyn.c);
            bool2 = false;
          } while (!bool3);
          bool4 = eyj.a(this.d, localeyn.d);
          bool2 = false;
        } while (!bool4);
        bool5 = eyj.a(this.e, localeyn.e);
        bool2 = false;
      } while (!bool5);
      bool6 = eyj.a(this.f, localeyn.f);
      bool2 = false;
    } while (!bool6);
    return a(localeyn);
  }
  
  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 * (527 + eyj.a(this.c)) + eyj.a(this.d)) + eyj.a(this.e)) + eyj.a(this.f)) + b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyn
 * JD-Core Version:    0.7.0.1
 */