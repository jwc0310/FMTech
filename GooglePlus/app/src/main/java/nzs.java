import java.nio.ByteBuffer;

public final class nzs
  extends qan<nzs>
{
  public nzr[] a = nzr.b();
  public String b = null;
  private Long c = null;
  private Boolean d = null;
  
  static
  {
    new qao(11, nzs.class, (int)355397042L, false);
  }
  
  public nzs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nzr localnzr = this.a[m];
        if (localnzr != null)
        {
          int n = qal.d(8);
          int i1 = localnzr.a();
          localnzr.ak = i1;
          i += n + (i1 + qal.d(i1));
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      i += qal.d(32) + qal.b(l);
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(40);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        nzr localnzr = this.a[j];
        if (localnzr != null)
        {
          paramqal.c(10);
          if (localnzr.ak < 0) {
            localnzr.ak = localnzr.a();
          }
          paramqal.c(localnzr.ak);
          localnzr.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(32);
      paramqal.a(l);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(40);
      int i = 0;
      if (bool) {
        i = 1;
      }
      byte b1 = (byte)i;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nzs
 * JD-Core Version:    0.7.0.1
 */