public final class ojz
  extends qan<ojz>
{
  private ojh a = null;
  private Long b = null;
  private Integer c = null;
  private Integer d = null;
  private String e = null;
  private String f = null;
  
  public ojz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.a != null)
    {
      ojh localojh = this.a;
      int i9 = qal.d(8);
      int i10 = localojh.a();
      localojh.ak = i10;
      j += i9 + (i10 + qal.d(i10));
    }
    long l = this.b.longValue();
    int k = j + (qal.d(16) + qal.b(l));
    int i7;
    int i8;
    if (this.c != null)
    {
      int i6 = this.c.intValue();
      i7 = qal.d(24);
      if (i6 >= 0) {
        i8 = qal.d(i6);
      }
    }
    for (int m = k + (i8 + i7);; m = k)
    {
      if (this.d != null)
      {
        int i4 = this.d.intValue();
        int i5 = qal.d(32);
        if (i4 >= 0) {
          i = qal.d(i4);
        }
        m += i + i5;
      }
      if (this.e != null)
      {
        String str2 = this.e;
        int i2 = qal.d(40);
        int i3 = qal.a(str2);
        m += i2 + (i3 + qal.d(i3));
      }
      if (this.f != null)
      {
        String str1 = this.f;
        int n = qal.d(48);
        int i1 = qal.a(str1);
        m += n + (i1 + qal.d(i1));
      }
      return m;
      i8 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ojh localojh = this.a;
      paramqal.c(10);
      if (localojh.ak < 0) {
        localojh.ak = localojh.a();
      }
      paramqal.c(localojh.ak);
      localojh.a(paramqal);
    }
    long l = this.b.longValue();
    paramqal.c(16);
    paramqal.a(l);
    if (this.c != null)
    {
      int j = this.c.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(42);
      paramqal.a(str2);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(50);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ojz
 * JD-Core Version:    0.7.0.1
 */