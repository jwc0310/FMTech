public final class ohk
  extends qan<ohk>
{
  public ood[] a = ood.b();
  public Integer b = null;
  public Integer c = null;
  private String d = null;
  private String e = null;
  
  public ohk()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    String str1 = this.d;
    int k = qal.d(8);
    int m = qal.a(str1);
    int n = j + (k + (m + qal.d(m)));
    if ((this.a != null) && (this.a.length > 0))
    {
      int i8 = n;
      for (int i9 = 0; i9 < this.a.length; i9++)
      {
        ood localood = this.a[i9];
        if (localood != null)
        {
          int i10 = qal.d(16);
          int i11 = localood.a();
          localood.ak = i11;
          i8 += i10 + (i11 + qal.d(i11));
        }
      }
      n = i8;
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i6 = qal.d(24);
      int i7 = qal.a(str2);
      n += i6 + (i7 + qal.d(i7));
    }
    int i3;
    int i4;
    if (this.b != null)
    {
      i3 = this.b.intValue();
      i4 = qal.d(32);
      if (i3 < 0) {
        break label268;
      }
    }
    label268:
    for (int i5 = qal.d(i3);; i5 = i)
    {
      n += i5 + i4;
      if (this.c != null)
      {
        int i1 = this.c.intValue();
        int i2 = qal.d(40);
        if (i1 >= 0) {
          i = qal.d(i1);
        }
        n += i2 + i;
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.d;
    paramqal.c(10);
    paramqal.a(str1);
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        ood localood = this.a[k];
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
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(26);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohk
 * JD-Core Version:    0.7.0.1
 */