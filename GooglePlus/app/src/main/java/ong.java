public final class ong
  extends qan<ong>
{
  public qoq a = null;
  public String b = null;
  public Integer c = null;
  private String d = null;
  private String e = null;
  private String f = null;
  
  public ong()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      qoq localqoq = this.a;
      int i8 = qal.d(8);
      int i9 = localqoq.a();
      localqoq.ak = i9;
      i += i8 + (i9 + qal.d(i9));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i6 = qal.d(16);
      int i7 = qal.a(str4);
      i += i6 + (i7 + qal.d(i7));
    }
    if (this.d != null)
    {
      String str3 = this.d;
      int i4 = qal.d(24);
      int i5 = qal.a(str3);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i2 = qal.d(32);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.c != null)
    {
      m = this.c.intValue();
      n = qal.d(40);
      if (m < 0) {
        break label258;
      }
    }
    label258:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.f != null)
      {
        String str1 = this.f;
        int j = qal.d(48);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      qoq localqoq = this.a;
      paramqal.c(10);
      if (localqoq.ak < 0) {
        localqoq.ak = localqoq.a();
      }
      paramqal.c(localqoq.ak);
      localqoq.a(paramqal);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.d != null)
    {
      String str3 = this.d;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      int i = this.c.intValue();
      paramqal.c(40);
      paramqal.a(i);
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
 * Qualified Name:     ong
 * JD-Core Version:    0.7.0.1
 */