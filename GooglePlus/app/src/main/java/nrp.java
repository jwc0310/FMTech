public final class nrp
  extends qan<nrp>
{
  public int a = -2147483648;
  public String b = null;
  public pss[] c = pss.b();
  public psl[] d = psl.b();
  
  public nrp()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      String str = this.b;
      int i8 = qal.d(8);
      int i9 = qal.a(str);
      i += i8 + (i9 + qal.d(i9));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i4 = i;
      for (int i5 = 0; i5 < this.c.length; i5++)
      {
        pss localpss = this.c[i5];
        if (localpss != null)
        {
          int i6 = qal.d(16);
          int i7 = localpss.a();
          localpss.ak = i7;
          i4 += i6 + (i7 + qal.d(i7));
        }
      }
      i = i4;
    }
    if (this.d != null)
    {
      int n = this.d.length;
      int i1 = 0;
      if (n > 0) {
        while (i1 < this.d.length)
        {
          psl localpsl = this.d[i1];
          if (localpsl != null)
          {
            int i2 = qal.d(24);
            int i3 = localpsl.a();
            localpsl.ak = i3;
            i += i2 + (i3 + qal.d(i3));
          }
          i1++;
        }
      }
    }
    int j;
    int k;
    if (this.a != -2147483648)
    {
      j = this.a;
      k = qal.d(32);
      if (j < 0) {
        break label263;
      }
    }
    label263:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(10);
      paramqal.a(str);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        pss localpss = this.c[m];
        if (localpss != null)
        {
          paramqal.c(18);
          if (localpss.ak < 0) {
            localpss.ak = localpss.a();
          }
          paramqal.c(localpss.ak);
          localpss.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      int j = this.d.length;
      int k = 0;
      if (j > 0) {
        while (k < this.d.length)
        {
          psl localpsl = this.d[k];
          if (localpsl != null)
          {
            paramqal.c(26);
            if (localpsl.ak < 0) {
              localpsl.ak = localpsl.a();
            }
            paramqal.c(localpsl.ak);
            localpsl.a(paramqal);
          }
          k++;
        }
      }
    }
    if (this.a != -2147483648)
    {
      int i = this.a;
      paramqal.c(32);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nrp
 * JD-Core Version:    0.7.0.1
 */