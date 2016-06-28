import java.nio.ByteBuffer;

public final class nxx
  extends qan<nxx>
{
  public int a = -2147483648;
  public nwu[] b = nwu.b();
  public Boolean c = null;
  public Boolean d = null;
  
  public nxx()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i3;
    int i4;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      i3 = qal.d(8);
      if (i2 >= 0) {
        i4 = qal.d(i2);
      }
    }
    for (int j = i + (i4 + i3);; j = i)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int k = j;
        int m = 0;
        for (;;)
        {
          if (m < this.b.length)
          {
            nwu localnwu = this.b[m];
            if (localnwu != null)
            {
              int n = qal.d(16);
              int i1 = localnwu.a();
              localnwu.ak = i1;
              k += n + (i1 + qal.d(i1));
            }
            m++;
            continue;
            i4 = 10;
            break;
          }
        }
        j = k;
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        j += 1 + qal.d(24);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        j += 1 + qal.d(32);
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if (this.a != -2147483648)
    {
      int m = this.a;
      paramqal.c(8);
      paramqal.a(m);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        nwu localnwu = this.b[k];
        if (localnwu != null)
        {
          paramqal.c(18);
          if (localnwu.ak < 0) {
            localnwu.ak = localnwu.a();
          }
          paramqal.c(localnwu.ak);
          localnwu.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool2 = this.c.booleanValue();
      paramqal.c(24);
      if (bool2) {}
      byte b2;
      for (int j = i;; j = 0)
      {
        b2 = (byte)j;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.d != null)
    {
      boolean bool1 = this.d.booleanValue();
      paramqal.c(32);
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
 * Qualified Name:     nxx
 * JD-Core Version:    0.7.0.1
 */