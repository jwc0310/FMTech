import java.nio.ByteBuffer;

public final class nsm
  extends qan<nsm>
{
  public String a = null;
  public nsn[] b = nsn.b();
  public Boolean c = null;
  public Boolean d = null;
  private String[] e = qay.f;
  private int f = -2147483648;
  
  public nsm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    String str1 = this.a;
    int j = qal.d(8);
    int k = qal.a(str1);
    int m = i + (j + (k + qal.d(k)));
    int i9;
    int i10;
    if ((this.e != null) && (this.e.length > 0))
    {
      int i8 = 0;
      i9 = 0;
      i10 = 0;
      while (i8 < this.e.length)
      {
        String str2 = this.e[i8];
        if (str2 != null)
        {
          i10++;
          int i11 = qal.a(str2);
          i9 += i11 + qal.d(i11);
        }
        i8++;
      }
    }
    for (int n = i9 + m + i10 * 1;; n = m)
    {
      if (this.d != null)
      {
        this.d.booleanValue();
        n += 1 + qal.d(24);
      }
      int i5;
      int i6;
      if (this.f != -2147483648)
      {
        i5 = this.f;
        i6 = qal.d(32);
        if (i5 < 0) {
          break label285;
        }
      }
      label285:
      for (int i7 = qal.d(i5);; i7 = 10)
      {
        n += i7 + i6;
        if (this.b == null) {
          break;
        }
        int i1 = this.b.length;
        int i2 = 0;
        if (i1 <= 0) {
          break;
        }
        while (i2 < this.b.length)
        {
          nsn localnsn = this.b[i2];
          if (localnsn != null)
          {
            int i3 = qal.d(40);
            int i4 = localnsn.a();
            localnsn.ak = i4;
            n += i3 + (i4 + qal.d(i4));
          }
          i2++;
        }
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        n += 1 + qal.d(48);
      }
      return n;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    String str1 = this.a;
    paramqal.c(10);
    paramqal.a(str1);
    if ((this.e != null) && (this.e.length > 0)) {
      for (int n = 0; n < this.e.length; n++)
      {
        String str2 = this.e[n];
        if (str2 != null)
        {
          paramqal.c(18);
          paramqal.a(str2);
        }
      }
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int m = i;; m = 0)
      {
        b2 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.f != -2147483648)
    {
      int k = this.f;
      paramqal.c(32);
      paramqal.a(k);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int j = 0; j < this.b.length; j++)
      {
        nsn localnsn = this.b[j];
        if (localnsn != null)
        {
          paramqal.c(42);
          if (localnsn.ak < 0) {
            localnsn.ak = localnsn.a();
          }
          paramqal.c(localnsn.ak);
          localnsn.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(48);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        i = 0;
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nsm
 * JD-Core Version:    0.7.0.1
 */