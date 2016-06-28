public final class ntp
  extends qan<ntp>
{
  public String a = null;
  public okn[] b = okn.b();
  private oir[] c = oir.b();
  private oir[] d = oir.b();
  private Integer e = null;
  private ojv f = null;
  
  public ntp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.c != null) && (this.c.length > 0))
    {
      int i12 = i;
      for (int i13 = 0; i13 < this.c.length; i13++)
      {
        oir localoir2 = this.c[i13];
        if (localoir2 != null)
        {
          int i14 = qal.d(8);
          int i15 = localoir2.a();
          localoir2.ak = i15;
          i12 += i14 + (i15 + qal.d(i15));
        }
      }
      i = i12;
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i8 = i;
      for (int i9 = 0; i9 < this.d.length; i9++)
      {
        oir localoir1 = this.d[i9];
        if (localoir1 != null)
        {
          int i10 = qal.d(16);
          int i11 = localoir1.a();
          localoir1.ak = i11;
          i8 += i10 + (i11 + qal.d(i11));
        }
      }
      i = i8;
    }
    int i5;
    int i6;
    if (this.e != null)
    {
      i5 = this.e.intValue();
      i6 = qal.d(24);
      if (i5 < 0) {
        break label401;
      }
    }
    label401:
    for (int i7 = qal.d(i5);; i7 = 10)
    {
      i += i7 + i6;
      if (this.f != null)
      {
        ojv localojv = this.f;
        int i3 = qal.d(32);
        int i4 = localojv.a();
        localojv.ak = i4;
        i += i3 + (i4 + qal.d(i4));
      }
      if (this.a != null)
      {
        String str = this.a;
        int i1 = qal.d(40);
        int i2 = qal.a(str);
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.b == null) {
        break;
      }
      int j = this.b.length;
      int k = 0;
      if (j <= 0) {
        break;
      }
      while (k < this.b.length)
      {
        okn localokn = this.b[k];
        if (localokn != null)
        {
          int m = qal.d(48);
          int n = localokn.a();
          localokn.ak = n;
          i += m + (n + qal.d(n));
        }
        k++;
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.c != null) && (this.c.length > 0)) {
      for (int n = 0; n < this.c.length; n++)
      {
        oir localoir2 = this.c[n];
        if (localoir2 != null)
        {
          paramqal.c(10);
          if (localoir2.ak < 0) {
            localoir2.ak = localoir2.a();
          }
          paramqal.c(localoir2.ak);
          localoir2.a(paramqal);
        }
      }
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int m = 0; m < this.d.length; m++)
      {
        oir localoir1 = this.d[m];
        if (localoir1 != null)
        {
          paramqal.c(18);
          if (localoir1.ak < 0) {
            localoir1.ak = localoir1.a();
          }
          paramqal.c(localoir1.ak);
          localoir1.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int k = this.e.intValue();
      paramqal.c(24);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      ojv localojv = this.f;
      paramqal.c(34);
      if (localojv.ak < 0) {
        localojv.ak = localojv.a();
      }
      paramqal.c(localojv.ak);
      localojv.a(paramqal);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(42);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      int i = this.b.length;
      int j = 0;
      if (i > 0) {
        while (j < this.b.length)
        {
          okn localokn = this.b[j];
          if (localokn != null)
          {
            paramqal.c(50);
            if (localokn.ak < 0) {
              localokn.ak = localokn.a();
            }
            paramqal.c(localokn.ak);
            localokn.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntp
 * JD-Core Version:    0.7.0.1
 */