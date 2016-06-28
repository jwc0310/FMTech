public final class ogg
  extends qan<ogg>
{
  public Integer a = null;
  public Integer b = null;
  public onm c = null;
  public qbd d = null;
  public int e = -2147483648;
  
  public ogg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    int i9;
    int i10;
    if (this.a != null)
    {
      int i8 = this.a.intValue();
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int k = j + (i10 + i9);; k = j)
    {
      int i5;
      int i6;
      if (this.b != null)
      {
        i5 = this.b.intValue();
        i6 = qal.d(16);
        if (i5 < 0) {
          break label238;
        }
      }
      label238:
      for (int i7 = qal.d(i5);; i7 = i)
      {
        k += i7 + i6;
        if (this.c != null)
        {
          onm localonm = this.c;
          int i3 = qal.d(24);
          int i4 = localonm.a();
          localonm.ak = i4;
          k += i3 + (i4 + qal.d(i4));
        }
        if (this.d != null)
        {
          qbd localqbd = this.d;
          int i1 = qal.d(32);
          int i2 = localqbd.a();
          localqbd.ak = i2;
          k += i1 + (i2 + qal.d(i2));
        }
        if (this.e != -2147483648)
        {
          int m = this.e;
          int n = qal.d(40);
          if (m >= 0) {
            i = qal.d(m);
          }
          k += i + n;
        }
        return k;
        i10 = i;
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
      onm localonm = this.c;
      paramqal.c(26);
      if (localonm.ak < 0) {
        localonm.ak = localonm.a();
      }
      paramqal.c(localonm.ak);
      localonm.a(paramqal);
    }
    if (this.d != null)
    {
      qbd localqbd = this.d;
      paramqal.c(34);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    if (this.e != -2147483648)
    {
      int i = this.e;
      paramqal.c(40);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogg
 * JD-Core Version:    0.7.0.1
 */