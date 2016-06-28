import java.nio.ByteBuffer;

public final class ohy
  extends qan<ohy>
{
  private Boolean a = null;
  private oia b = null;
  private long[] c = qay.b;
  private String d = null;
  private Integer e = null;
  private String f = null;
  private ohz g = null;
  
  public ohy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      this.a.booleanValue();
      j += 1 + qal.d(8);
    }
    if (this.b != null)
    {
      oia localoia = this.b;
      int i8 = qal.d(16);
      int i9 = localoia.a();
      localoia.ak = i9;
      j += i8 + (i9 + qal.d(i9));
    }
    if ((this.c != null) && (this.c.length > 0))
    {
      int i7 = 0;
      while (i < this.c.length)
      {
        i7 += qal.b(this.c[i]);
        i++;
      }
      j = j + i7 + 1 * this.c.length;
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i5 = qal.d(32);
      int i6 = qal.a(str2);
      j += i5 + (i6 + qal.d(i6));
    }
    int i2;
    int i3;
    if (this.e != null)
    {
      i2 = this.e.intValue();
      i3 = qal.d(40);
      if (i2 < 0) {
        break label313;
      }
    }
    label313:
    for (int i4 = qal.d(i2);; i4 = 10)
    {
      j += i4 + i3;
      if (this.g != null)
      {
        ohz localohz = this.g;
        int n = qal.d(48);
        int i1 = localohz.a();
        localohz.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.f != null)
      {
        String str1 = this.f;
        int k = qal.d(56);
        int m = qal.a(str1);
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      boolean bool = this.a.booleanValue();
      paramqal.c(8);
      if (bool) {}
      byte b1;
      for (int m = 1;; m = 0)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.b != null)
    {
      oia localoia = this.b;
      paramqal.c(18);
      if (localoia.ak < 0) {
        localoia.ak = localoia.a();
      }
      paramqal.c(localoia.ak);
      localoia.a(paramqal);
    }
    if (this.c != null)
    {
      int j = this.c.length;
      int k = 0;
      if (j > 0) {
        while (k < this.c.length)
        {
          long l = this.c[k];
          paramqal.c(24);
          paramqal.a(l);
          k++;
        }
      }
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(34);
      paramqal.a(str2);
    }
    if (this.e != null)
    {
      int i = this.e.intValue();
      paramqal.c(40);
      paramqal.a(i);
    }
    if (this.g != null)
    {
      ohz localohz = this.g;
      paramqal.c(50);
      if (localohz.ak < 0) {
        localohz.ak = localohz.a();
      }
      paramqal.c(localohz.ak);
      localohz.a(paramqal);
    }
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ohy
 * JD-Core Version:    0.7.0.1
 */