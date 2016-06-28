public final class nkt
  extends qan<nkt>
{
  private Integer a = null;
  private int[] b = qay.a;
  private njp c = null;
  private njp[] d = njp.b();
  private String e = null;
  private String f = null;
  private String g = null;
  
  public nkt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i15;
    int i16;
    if (this.a != null)
    {
      int i14 = this.a.intValue();
      i15 = qal.d(8);
      if (i14 >= 0) {
        i16 = qal.d(i14);
      }
    }
    for (int j = i + (i16 + i15);; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int i10 = 0;
        int i11 = 0;
        label69:
        if (i10 < this.b.length)
        {
          int i12 = this.b[i10];
          if (i12 >= 0) {}
          for (int i13 = qal.d(i12);; i13 = 10)
          {
            i11 += i13;
            i10++;
            break label69;
            i16 = 10;
            break;
          }
        }
        j = j + i11 + 1 * this.b.length;
      }
      if (this.c != null)
      {
        njp localnjp2 = this.c;
        int i8 = qal.d(24);
        int i9 = localnjp2.a();
        localnjp2.ak = i9;
        j += i8 + (i9 + qal.d(i9));
      }
      if (this.d != null)
      {
        int i4 = this.d.length;
        int i5 = 0;
        if (i4 > 0) {
          while (i5 < this.d.length)
          {
            njp localnjp1 = this.d[i5];
            if (localnjp1 != null)
            {
              int i6 = qal.d(32);
              int i7 = localnjp1.a();
              localnjp1.ak = i7;
              j += i6 + (i7 + qal.d(i7));
            }
            i5++;
          }
        }
      }
      if (this.e != null)
      {
        String str3 = this.e;
        int i2 = qal.d(40);
        int i3 = qal.a(str3);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.f != null)
      {
        String str2 = this.f;
        int n = qal.d(48);
        int i1 = qal.a(str2);
        j += n + (i1 + qal.d(i1));
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int k = qal.d(56);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int n = this.a.intValue();
      paramqal.c(8);
      paramqal.a(n);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        int m = this.b[k];
        paramqal.c(16);
        paramqal.a(m);
      }
    }
    if (this.c != null)
    {
      njp localnjp2 = this.c;
      paramqal.c(26);
      if (localnjp2.ak < 0) {
        localnjp2.ak = localnjp2.a();
      }
      paramqal.c(localnjp2.ak);
      localnjp2.a(paramqal);
    }
    if (this.d != null)
    {
      int i = this.d.length;
      int j = 0;
      if (i > 0) {
        while (j < this.d.length)
        {
          njp localnjp1 = this.d[j];
          if (localnjp1 != null)
          {
            paramqal.c(34);
            if (localnjp1.ak < 0) {
              localnjp1.ak = localnjp1.a();
            }
            paramqal.c(localnjp1.ak);
            localnjp1.a(paramqal);
          }
          j++;
        }
      }
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nkt
 * JD-Core Version:    0.7.0.1
 */