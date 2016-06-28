public final class koh
  extends qan<koh>
{
  public Integer a = null;
  public String b = null;
  public String c = null;
  public Integer d = null;
  public Integer e = null;
  public String f = null;
  public Double g = null;
  
  public koh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i11;
    int i12;
    if (this.a != null)
    {
      int i10 = this.a.intValue();
      i11 = qal.d(8);
      if (i10 >= 0) {
        i12 = qal.d(i10);
      }
    }
    for (int k = j + (i12 + i11);; k = j)
    {
      if (this.b != null)
      {
        String str3 = this.b;
        int i8 = qal.d(16);
        int i9 = qal.a(str3);
        k += i8 + (i9 + qal.d(i9));
      }
      if (this.c != null)
      {
        String str2 = this.c;
        int i6 = qal.d(24);
        int i7 = qal.a(str2);
        k += i6 + (i7 + qal.d(i7));
      }
      int i3;
      int i4;
      if (this.d != null)
      {
        i3 = this.d.intValue();
        i4 = qal.d(32);
        if (i3 < 0) {
          break label292;
        }
      }
      label292:
      for (int i5 = qal.d(i3);; i5 = i)
      {
        k += i5 + i4;
        if (this.e != null)
        {
          int i1 = this.e.intValue();
          int i2 = qal.d(40);
          if (i1 >= 0) {
            i = qal.d(i1);
          }
          k += i + i2;
        }
        if (this.f != null)
        {
          String str1 = this.f;
          int m = qal.d(48);
          int n = qal.a(str1);
          k += m + (n + qal.d(n));
        }
        if (this.g != null)
        {
          this.g.doubleValue();
          k += 8 + qal.d(56);
        }
        return k;
        i12 = i;
        break;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(8);
      paramqal.a(k);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      paramqal.c(18);
      paramqal.a(str3);
    }
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.d != null)
    {
      int j = this.d.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    if (this.g != null)
    {
      double d1 = this.g.doubleValue();
      paramqal.c(57);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     koh
 * JD-Core Version:    0.7.0.1
 */