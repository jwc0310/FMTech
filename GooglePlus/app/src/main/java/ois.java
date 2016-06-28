public final class ois
  extends qan<ois>
{
  public Integer a = null;
  public Integer b = null;
  public Integer c = null;
  public Integer d = null;
  public Integer e = null;
  public Integer f = null;
  public Integer g = null;
  
  public ois()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i17;
    int i18;
    if (this.a != null)
    {
      int i16 = this.a.intValue();
      i17 = qal.d(8);
      if (i16 >= 0) {
        i18 = qal.d(i16);
      }
    }
    for (int k = j + (i18 + i17);; k = j)
    {
      int i15;
      label86:
      int i12;
      label129:
      int i9;
      label172:
      int i6;
      label215:
      int i1;
      int i2;
      if (this.b != null)
      {
        int i13 = this.b.intValue();
        int i14 = qal.d(16);
        if (i13 >= 0)
        {
          i15 = qal.d(i13);
          k += i15 + i14;
        }
      }
      else
      {
        if (this.c != null)
        {
          int i10 = this.c.intValue();
          int i11 = qal.d(24);
          if (i10 < 0) {
            break label321;
          }
          i12 = qal.d(i10);
          k += i12 + i11;
        }
        if (this.d != null)
        {
          int i7 = this.d.intValue();
          int i8 = qal.d(32);
          if (i7 < 0) {
            break label327;
          }
          i9 = qal.d(i7);
          k += i9 + i8;
        }
        if (this.e != null)
        {
          int i4 = this.e.intValue();
          int i5 = qal.d(40);
          if (i4 < 0) {
            break label333;
          }
          i6 = qal.d(i4);
          k += i6 + i5;
        }
        if (this.f != null)
        {
          i1 = this.f.intValue();
          i2 = qal.d(48);
          if (i1 < 0) {
            break label339;
          }
        }
      }
      label321:
      label327:
      label333:
      label339:
      for (int i3 = qal.d(i1);; i3 = i)
      {
        k += i3 + i2;
        if (this.g != null)
        {
          int m = this.g.intValue();
          int n = qal.d(56);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i18 = i;
        break;
        i15 = i;
        break label86;
        i12 = i;
        break label129;
        i9 = i;
        break label172;
        i6 = i;
        break label215;
      }
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i2 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      int n = this.c.intValue();
      paramqal.c(24);
      paramqal.a(n);
    }
    if (this.d != null)
    {
      int m = this.d.intValue();
      paramqal.c(32);
      paramqal.a(m);
    }
    if (this.e != null)
    {
      int k = this.e.intValue();
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.f != null)
    {
      int j = this.f.intValue();
      paramqal.c(48);
      paramqal.a(j);
    }
    if (this.g != null)
    {
      int i = this.g.intValue();
      paramqal.c(56);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ois
 * JD-Core Version:    0.7.0.1
 */