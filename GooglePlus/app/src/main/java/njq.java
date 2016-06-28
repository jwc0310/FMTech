public final class njq
  extends qan<njq>
{
  private Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private String d = null;
  private nmg e = null;
  private nmt f = null;
  private nmf g = null;
  
  public njq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i13;
    int i14;
    if (this.a != null)
    {
      int i12 = this.a.intValue();
      i13 = qal.d(8);
      if (i12 >= 0) {
        i14 = qal.d(i12);
      }
    }
    for (int k = j + (i14 + i13);; k = j)
    {
      int i9;
      int i10;
      if (this.b != null)
      {
        i9 = this.b.intValue();
        i10 = qal.d(16);
        if (i9 < 0) {
          break label328;
        }
      }
      label328:
      for (int i11 = qal.d(i9);; i11 = i)
      {
        k += i11 + i10;
        if (this.c != null)
        {
          int i7 = this.c.intValue();
          int i8 = qal.d(24);
          if (i7 >= 0) {
            i = qal.d(i7);
          }
          k += i + i8;
        }
        if (this.d != null)
        {
          String str = this.d;
          int i5 = qal.d(32);
          int i6 = qal.a(str);
          k += i5 + (i6 + qal.d(i6));
        }
        if (this.e != null)
        {
          nmg localnmg = this.e;
          int i3 = qal.d(40);
          int i4 = localnmg.a();
          localnmg.ak = i4;
          k += i3 + (i4 + qal.d(i4));
        }
        if (this.f != null)
        {
          nmt localnmt = this.f;
          int i1 = qal.d(48);
          int i2 = localnmt.a();
          localnmt.ak = i2;
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.g != null)
        {
          nmf localnmf = this.g;
          int m = qal.d(56);
          int n = localnmf.a();
          localnmf.ak = n;
          k += m + (n + qal.d(n));
        }
        return k;
        i14 = i;
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
      int j = this.b.intValue();
      paramqal.c(16);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(24);
      paramqal.a(i);
    }
    if (this.d != null)
    {
      String str = this.d;
      paramqal.c(34);
      paramqal.a(str);
    }
    if (this.e != null)
    {
      nmg localnmg = this.e;
      paramqal.c(42);
      if (localnmg.ak < 0) {
        localnmg.ak = localnmg.a();
      }
      paramqal.c(localnmg.ak);
      localnmg.a(paramqal);
    }
    if (this.f != null)
    {
      nmt localnmt = this.f;
      paramqal.c(50);
      if (localnmt.ak < 0) {
        localnmt.ak = localnmt.a();
      }
      paramqal.c(localnmt.ak);
      localnmt.a(paramqal);
    }
    if (this.g != null)
    {
      nmf localnmf = this.g;
      paramqal.c(58);
      if (localnmf.ak < 0) {
        localnmf.ak = localnmf.a();
      }
      paramqal.c(localnmf.ak);
      localnmf.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     njq
 * JD-Core Version:    0.7.0.1
 */