import java.nio.ByteBuffer;

public final class ntm
  extends qan<ntm>
{
  public okn[] a = okn.b();
  public String b = null;
  private pss[] c = pss.b();
  private Boolean d = null;
  private pwr[] e = pwr.b();
  private ntn[] f = ntn.b();
  
  public ntm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i11 = i;
      for (int i12 = 0; i12 < this.a.length; i12++)
      {
        okn localokn = this.a[i12];
        if (localokn != null)
        {
          int i13 = qal.d(8);
          int i14 = localokn.a();
          localokn.ak = i14;
          i11 += i13 + (i14 + qal.d(i14));
        }
      }
      i = i11;
    }
    if (this.b != null)
    {
      String str = this.b;
      int i9 = qal.d(16);
      int i10 = qal.a(str);
      i += i9 + (i10 + qal.d(i10));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(24);
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        pss localpss = this.c[i6];
        if (localpss != null)
        {
          int i7 = qal.d(32);
          int i8 = localpss.a();
          localpss.ak = i8;
          i5 += i7 + (i8 + qal.d(i8));
        }
      }
      i = i5;
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.e.length; i2++)
      {
        pwr localpwr = this.e[i2];
        if (localpwr != null)
        {
          int i3 = qal.d(40);
          int i4 = localpwr.a();
          localpwr.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.f != null)
    {
      int j = this.f.length;
      int k = 0;
      if (j > 0) {
        while (k < this.f.length)
        {
          ntn localntn = this.f[k];
          if (localntn != null)
          {
            int m = qal.d(48);
            int n = localntn.a();
            localntn.ak = n;
            i += m + (n + qal.d(n));
          }
          k++;
        }
      }
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        okn localokn = this.a[i1];
        if (localokn != null)
        {
          paramqal.c(10);
          if (localokn.ak < 0) {
            localokn.ak = localokn.a();
          }
          paramqal.c(localokn.ak);
          localokn.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      String str = this.b;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(24);
      if (bool) {}
      byte b1;
      for (int n = 1;; n = 0)
      {
        b1 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int m = 0; m < this.c.length; m++)
      {
        pss localpss = this.c[m];
        if (localpss != null)
        {
          paramqal.c(34);
          if (localpss.ak < 0) {
            localpss.ak = localpss.a();
          }
          paramqal.c(localpss.ak);
          localpss.a(paramqal);
        }
      }
    }
    if ((this.e != null) && (this.e.length > 0)) {
      for (int k = 0; k < this.e.length; k++)
      {
        pwr localpwr = this.e[k];
        if (localpwr != null)
        {
          paramqal.c(42);
          if (localpwr.ak < 0) {
            localpwr.ak = localpwr.a();
          }
          paramqal.c(localpwr.ak);
          localpwr.a(paramqal);
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
          ntn localntn = this.f[j];
          if (localntn != null)
          {
            paramqal.c(50);
            if (localntn.ak < 0) {
              localntn.ak = localntn.a();
            }
            paramqal.c(localntn.ak);
            localntn.a(paramqal);
          }
          j++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ntm
 * JD-Core Version:    0.7.0.1
 */