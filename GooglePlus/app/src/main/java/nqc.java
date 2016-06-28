public final class nqc
  extends qan<nqc>
{
  public String a = null;
  public Long b = null;
  public oji c = null;
  public Long d = null;
  public nqd e = null;
  private ojh f = null;
  
  public nqc()
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
      int i3 = qal.d(8);
      int i4 = qal.a(str);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.f != null)
    {
      ojh localojh = this.f;
      int i1 = qal.d(24);
      int i2 = localojh.a();
      localojh.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      i += qal.d(32) + qal.b(l1);
    }
    if (this.e != null)
    {
      nqd localnqd = this.e;
      int m = qal.d(40);
      int n = localnqd.a();
      localnqd.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      oji localoji = this.c;
      int j = qal.d(48);
      int k = localoji.a();
      localoji.ak = k;
      i += j + (k + qal.d(k));
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
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.f != null)
    {
      ojh localojh = this.f;
      paramqal.c(26);
      if (localojh.ak < 0) {
        localojh.ak = localojh.a();
      }
      paramqal.c(localojh.ak);
      localojh.a(paramqal);
    }
    if (this.d != null)
    {
      long l1 = this.d.longValue();
      paramqal.c(32);
      paramqal.a(l1);
    }
    if (this.e != null)
    {
      nqd localnqd = this.e;
      paramqal.c(42);
      if (localnqd.ak < 0) {
        localnqd.ak = localnqd.a();
      }
      paramqal.c(localnqd.ak);
      localnqd.a(paramqal);
    }
    if (this.c != null)
    {
      oji localoji = this.c;
      paramqal.c(50);
      if (localoji.ak < 0) {
        localoji.ak = localoji.a();
      }
      paramqal.c(localoji.ak);
      localoji.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqc
 * JD-Core Version:    0.7.0.1
 */