public final class qjn
  extends qan<qjn>
{
  public Integer a = null;
  public Integer b = null;
  public qis c = null;
  public String d = null;
  public Integer e = null;
  public String f = null;
  public String g = null;
  public Boolean h = null;
  public String i = null;
  public String j = null;
  public Boolean k = null;
  private Long l = null;
  private String[] m = qay.f;
  private int n = -2147483648;
  private String o = null;
  private String p = null;
  private Boolean q = null;
  
  public qjn()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.a != null) {
      i2 += qal.h(1, this.a.intValue());
    }
    if (this.b != null) {
      i2 += qal.h(2, this.b.intValue());
    }
    if (this.d != null) {
      i2 += qal.b(3, this.d);
    }
    if (this.e != null)
    {
      int i6 = this.e.intValue();
      i2 += qal.d(32) + qal.d(i6 << 1 ^ i6 >> 31);
    }
    if (this.l != null)
    {
      long l1 = this.l.longValue();
      i2 += qal.d(40) + qal.b(l1 << 1 ^ l1 >> 63);
    }
    if (this.h != null) {
      i2 += qal.b(6, this.h.booleanValue());
    }
    if (this.f != null) {
      i2 += qal.b(7, this.f);
    }
    if (this.i != null) {
      i2 += qal.b(8, this.i);
    }
    if (this.n != -2147483648) {
      i2 += qal.e(9, this.n);
    }
    if (this.j != null) {
      i2 += qal.b(10, this.j);
    }
    if (this.c != null) {
      i2 += qal.c(11, this.c);
    }
    if (this.o != null) {
      i2 += qal.b(12, this.o);
    }
    if (this.g != null) {
      i2 += qal.b(13, this.g);
    }
    if (this.p != null) {
      i2 += qal.b(14, this.p);
    }
    if ((this.m != null) && (this.m.length > 0))
    {
      int i3 = 0;
      int i4 = 0;
      while (i1 < this.m.length)
      {
        String str = this.m[i1];
        if (str != null)
        {
          i4++;
          int i5 = qal.a(str);
          i3 += i5 + qal.d(i5);
        }
        i1++;
      }
      i2 = i2 + i3 + i4 * 2;
    }
    if (this.q != null) {
      i2 += qal.b(17, this.q.booleanValue());
    }
    if (this.k != null) {
      i2 += qal.b(18, this.k.booleanValue());
    }
    return i2;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null) {
      paramqal.d(1, this.a.intValue());
    }
    if (this.b != null) {
      paramqal.d(2, this.b.intValue());
    }
    if (this.d != null) {
      paramqal.a(3, this.d);
    }
    if (this.e != null)
    {
      int i2 = this.e.intValue();
      paramqal.c(32);
      paramqal.c(i2 << 1 ^ i2 >> 31);
    }
    if (this.l != null)
    {
      long l1 = this.l.longValue();
      paramqal.c(40);
      paramqal.a(l1 << 1 ^ l1 >> 63);
    }
    if (this.h != null) {
      paramqal.a(6, this.h.booleanValue());
    }
    if (this.f != null) {
      paramqal.a(7, this.f);
    }
    if (this.i != null) {
      paramqal.a(8, this.i);
    }
    if (this.n != -2147483648) {
      paramqal.a(9, this.n);
    }
    if (this.j != null) {
      paramqal.a(10, this.j);
    }
    if (this.c != null) {
      paramqal.a(11, this.c);
    }
    if (this.o != null) {
      paramqal.a(12, this.o);
    }
    if (this.g != null) {
      paramqal.a(13, this.g);
    }
    if (this.p != null) {
      paramqal.a(14, this.p);
    }
    if ((this.m != null) && (this.m.length > 0)) {
      for (int i1 = 0; i1 < this.m.length; i1++)
      {
        String str = this.m[i1];
        if (str != null) {
          paramqal.a(16, str);
        }
      }
    }
    if (this.q != null) {
      paramqal.a(17, this.q.booleanValue());
    }
    if (this.k != null) {
      paramqal.a(18, this.k.booleanValue());
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qjn
 * JD-Core Version:    0.7.0.1
 */