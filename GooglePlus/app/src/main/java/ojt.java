public final class ojt
  extends qan<ojt>
{
  private Integer a = null;
  private Integer b = null;
  private Integer c = null;
  private Integer d = null;
  private Integer e = null;
  private Integer f = null;
  
  public ojt()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i14;
    int i15;
    if (this.a != null)
    {
      int i13 = this.a.intValue();
      i14 = qal.d(8);
      if (i13 >= 0) {
        i15 = qal.d(i13);
      }
    }
    for (int k = j + (i15 + i14);; k = j)
    {
      int i12;
      label86:
      int i9;
      label129:
      int i6;
      label172:
      int i1;
      int i2;
      if (this.b != null)
      {
        int i10 = this.b.intValue();
        int i11 = qal.d(16);
        if (i10 >= 0)
        {
          i12 = qal.d(i10);
          k += i12 + i11;
        }
      }
      else
      {
        if (this.c != null)
        {
          int i7 = this.c.intValue();
          int i8 = qal.d(24);
          if (i7 < 0) {
            break label278;
          }
          i9 = qal.d(i7);
          k += i9 + i8;
        }
        if (this.e != null)
        {
          int i4 = this.e.intValue();
          int i5 = qal.d(32);
          if (i4 < 0) {
            break label284;
          }
          i6 = qal.d(i4);
          k += i6 + i5;
        }
        if (this.f != null)
        {
          i1 = this.f.intValue();
          i2 = qal.d(40);
          if (i1 < 0) {
            break label290;
          }
        }
      }
      label278:
      label284:
      label290:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.d != null)
        {
          int m = this.d.intValue();
          int n = qal.d(48);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i15 = i;
        break;
        i12 = i;
        break label86;
        i9 = i;
        break label129;
        i6 = i;
        break label172;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i1 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i1);
    }
    if (this.b != null)
    {
      int n = this.b.intValue();
      paramqal.c(16);
      paramqal.a(n);
    }
    if (this.c != null)
    {
      int m = this.c.intValue();
      paramqal.c(24);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      int k = this.e.intValue();
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(40);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(48);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojt
 * JD-Core Version:    0.7.0.1
 */