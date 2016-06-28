public final class npv
  extends qan<npv>
{
  public String a = null;
  public String[] b = qay.f;
  public String[] c = qay.f;
  public psl d = null;
  
  public npv()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    String str1 = this.a;
    int k = qal.d(8);
    int m = qal.a(str1);
    int n = j + (k + (m + qal.d(m)));
    int i8;
    int i9;
    if ((this.b != null) && (this.b.length > 0))
    {
      int i7 = 0;
      i8 = 0;
      i9 = 0;
      while (i7 < this.b.length)
      {
        String str3 = this.b[i7];
        if (str3 != null)
        {
          i9++;
          int i10 = qal.a(str3);
          i8 += i10 + qal.d(i10);
        }
        i7++;
      }
    }
    for (int i1 = i8 + n + i9 * 1;; i1 = n)
    {
      if (this.d != null)
      {
        psl localpsl = this.d;
        int i5 = qal.d(24);
        int i6 = localpsl.a();
        localpsl.ak = i6;
        i1 += i5 + (i6 + qal.d(i6));
      }
      if ((this.c != null) && (this.c.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i < this.c.length)
        {
          String str2 = this.c[i];
          if (str2 != null)
          {
            i3++;
            int i4 = qal.a(str2);
            i2 += i4 + qal.d(i4);
          }
          i++;
        }
        i1 = i1 + i2 + i3 * 1;
      }
      return i1;
    }
  }
  
  public final void a(qal paramqal)
  {
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        String str3 = this.b[k];
        if (str3 != null)
        {
          paramqal.c(18);
          paramqal.a(str3);
        }
      }
    }
    if (this.d != null)
    {
      psl localpsl = this.d;
      paramqal.c(26);
      if (localpsl.ak < 0) {
        localpsl.ak = localpsl.a();
      }
      paramqal.c(localpsl.ak);
      localpsl.a(paramqal);
    }
    if (this.c != null)
    {
      int i = this.c.length;
      int j = 0;
      if (i > 0) {
        while (j < this.c.length)
        {
          String str2 = this.c[j];
          if (str2 != null)
          {
            paramqal.c(34);
            paramqal.a(str2);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     npv
 * JD-Core Version:    0.7.0.1
 */