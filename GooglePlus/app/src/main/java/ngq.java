public final class ngq
  extends qan<ngq>
{
  public String a = null;
  public ngj b = null;
  public int c = -2147483648;
  public qbu[] d = qbu.a;
  private qec[] e = qec.a;
  
  public ngq()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i10 = qal.d(8);
      int i11 = qal.a(str);
      i += i10 + (i11 + qal.d(i11));
    }
    int i7;
    int i8;
    if (this.c != -2147483648)
    {
      i7 = this.c;
      i8 = qal.d(16);
      if (i7 < 0) {
        break label176;
      }
    }
    int i3;
    label176:
    for (int i9 = qal.d(i7);; i9 = 10)
    {
      i += i9 + i8;
      if ((this.d == null) || (this.d.length <= 0)) {
        break label186;
      }
      i3 = i;
      for (int i4 = 0; i4 < this.d.length; i4++)
      {
        qbu localqbu = this.d[i4];
        if (localqbu != null)
        {
          int i5 = qal.d(24);
          int i6 = localqbu.a();
          localqbu.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
    }
    i = i3;
    label186:
    if (this.b != null)
    {
      ngj localngj = this.b;
      int i1 = qal.d(32);
      int i2 = localngj.a();
      localngj.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          qec localqec = this.e[k];
          if (localqec != null)
          {
            int m = qal.d(40);
            int n = localqec.a();
            localqec.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.c != -2147483648)
    {
      int m = this.c;
      paramqal.c(16);
      paramqal.a(m);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int k = 0; k < this.d.length; k++)
      {
        qbu localqbu = this.d[k];
        if (localqbu != null)
        {
          paramqal.c(26);
          if (localqbu.ak < 0) {
            localqbu.ak = localqbu.a();
          }
          paramqal.c(localqbu.ak);
          localqbu.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      ngj localngj = this.b;
      paramqal.c(34);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
    }
    if (this.e != null)
    {
      int i = this.e.length;
      int j = 0;
      if (i > 0) {
        while (j < this.e.length)
        {
          qec localqec = this.e[j];
          if (localqec != null)
          {
            paramqal.c(42);
            if (localqec.ak < 0) {
              localqec.ak = localqec.a();
            }
            paramqal.c(localqec.ak);
            localqec.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngq
 * JD-Core Version:    0.7.0.1
 */