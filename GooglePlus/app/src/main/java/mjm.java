public final class mjm
  extends qan<mjm>
{
  private static volatile mjm[] d;
  public mju a = null;
  public Long b = null;
  public mjn c = null;
  private mjw[] e = mjw.b();
  private String[] f = qay.f;
  
  public mjm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mjm[] b()
  {
    if (d == null) {}
    synchronized (qar.a)
    {
      if (d == null) {
        d = new mjm[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      mju localmju = this.a;
      int i7 = qal.d(8);
      int i8 = localmju.a();
      localmju.ak = i8;
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      j += qal.d(16) + qal.b(l);
    }
    if (this.c != null)
    {
      mjn localmjn = this.c;
      int i5 = qal.d(24);
      int i6 = localmjn.a();
      localmjn.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i1 = j;
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        mjw localmjw = this.e[i2];
        if (localmjw != null)
        {
          int i3 = qal.d(32);
          int i4 = localmjw.a();
          localmjw.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      j = i1;
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.f.length)
      {
        String str = this.f[i];
        if (str != null)
        {
          m++;
          int n = qal.a(str);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      mju localmju = this.a;
      paramqal.c(10);
      if (localmju.ak < 0) {
        localmju.ak = localmju.a();
      }
      paramqal.c(localmju.ak);
      localmju.a(paramqal);
    }
    if (this.b != null)
    {
      long l = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.c != null)
    {
      mjn localmjn = this.c;
      paramqal.c(26);
      if (localmjn.ak < 0) {
        localmjn.ak = localmjn.a();
      }
      paramqal.c(localmjn.ak);
      localmjn.a(paramqal);
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        mjw localmjw = this.e[k];
        if (localmjw != null)
        {
          paramqal.c(34);
          if (localmjw.ak < 0) {
            localmjw.ak = localmjw.a();
          }
          paramqal.c(localmjw.ak);
          localmjw.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      int i = this.f.length;
      int j = 0;
      if (i > 0) {
        while (j < this.f.length)
        {
          String str = this.f[j];
          if (str != null)
          {
            paramqal.c(42);
            paramqal.a(str);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mjm
 * JD-Core Version:    0.7.0.1
 */