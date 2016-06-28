import java.nio.ByteBuffer;

public final class nzz
  extends qan<nzz>
{
  public oad[] a = oad.b();
  private nzx[] b = nzx.b();
  private Long c = null;
  private Boolean d = null;
  private String e = null;
  
  static
  {
    new qao(11, nzz.class, (int)364463794L, false);
  }
  
  public nzz()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.b != null) && (this.b.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.b.length; i4++)
      {
        nzx localnzx = this.b[i4];
        if (localnzx != null)
        {
          int i5 = qal.d(8);
          int i6 = localnzx.a();
          localnzx.ak = i6;
          i3 += i5 + (i6 + qal.d(i6));
        }
      }
      i = i3;
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      i += qal.d(16) + qal.b(l);
    }
    if (this.e != null)
    {
      String str = this.e;
      int i1 = qal.d(24);
      int i2 = qal.a(str);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.a != null)
    {
      int j = this.a.length;
      int k = 0;
      if (j > 0) {
        while (k < this.a.length)
        {
          oad locaload = this.a[k];
          if (locaload != null)
          {
            int m = qal.d(32);
            int n = locaload.a();
            locaload.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
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
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        nzx localnzx = this.b[k];
        if (localnzx != null)
        {
          paramqal.c(10);
          if (localnzx.ak < 0) {
            localnzx.ak = localnzx.a();
          }
          paramqal.c(localnzx.ak);
          localnzx.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      long l = this.c.longValue();
      paramqal.c(16);
      paramqal.a(l);
    }
    if (this.e != null)
    {
      String str = this.e;
      paramqal.c(26);
      paramqal.a(str);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        oad locaload = this.a[j];
        if (locaload != null)
        {
          paramqal.c(34);
          if (locaload.ak < 0) {
            locaload.ak = locaload.a();
          }
          paramqal.c(locaload.ak);
          locaload.a(paramqal);
        }
      }
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
 * Qualified Name:     nzz
 * JD-Core Version:    0.7.0.1
 */