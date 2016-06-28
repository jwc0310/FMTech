import java.nio.ByteBuffer;

public final class aij
  extends qan<aij>
{
  private Integer a = null;
  private Integer b = null;
  private int[] c = qay.a;
  private int d = -2147483648;
  private Boolean e = null;
  
  public aij()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = 10;
    int k = super.a();
    int i9;
    int i10;
    if (this.a != null)
    {
      int i8 = this.a.intValue();
      i9 = qal.d(8);
      if (i8 >= 0) {
        i10 = qal.d(i8);
      }
    }
    for (int m = k + (i10 + i9);; m = k)
    {
      int i7;
      label89:
      int i2;
      label117:
      int i3;
      if (this.b != null)
      {
        int i5 = this.b.intValue();
        int i6 = qal.d(16);
        if (i5 >= 0)
        {
          i7 = qal.d(i5);
          m += i7 + i6;
        }
      }
      else
      {
        if ((this.c == null) || (this.c.length <= 0)) {
          break label191;
        }
        i2 = 0;
        if (i2 >= this.c.length) {
          break label177;
        }
        i3 = this.c[i2];
        if (i3 < 0) {
          break label171;
        }
      }
      label171:
      for (int i4 = qal.d(i3);; i4 = j)
      {
        i += i4;
        i2++;
        break label117;
        i10 = j;
        break;
        i7 = j;
        break label89;
      }
      label177:
      m = m + i + 1 * this.c.length;
      label191:
      if (this.d != -2147483648)
      {
        int n = this.d;
        int i1 = qal.d(32);
        if (n >= 0) {
          j = qal.d(n);
        }
        m += j + i1;
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        m += 1 + qal.d(40);
      }
      return m;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int i1 = this.a.intValue();
      paramqal.c(8);
      paramqal.a(i1);
    }
    if (this.b != null)
    {
      int n = this.b.intValue();
      paramqal.c(16);
      paramqal.a(n);
    }
    if ((this.c != null) && (this.c.length > 0)) {
      for (int k = 0; k < this.c.length; k++)
      {
        int m = this.c[k];
        paramqal.c(24);
        paramqal.a(m);
      }
    }
    if (this.d != -2147483648)
    {
      int j = this.d;
      paramqal.c(32);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
 * Qualified Name:     aij
 * JD-Core Version:    0.7.0.1
 */