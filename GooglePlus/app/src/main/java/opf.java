import java.nio.ByteBuffer;

public final class opf
  extends qan<opf>
{
  public int[] a = qay.a;
  public int[] b = qay.a;
  public Boolean c = null;
  public Boolean d = null;
  
  public opf()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int i3;
    if ((this.a != null) && (this.a.length > 0))
    {
      int i2 = 0;
      i3 = 0;
      if (i2 < this.a.length)
      {
        int i4 = this.a[i2];
        if (i4 >= 0) {}
        for (int i5 = qal.d(i4);; i5 = 10)
        {
          i3 += i5;
          i2++;
          break;
        }
      }
    }
    for (int k = j + i3 + 1 * this.a.length;; k = j)
    {
      if ((this.b != null) && (this.b.length > 0))
      {
        int m = 0;
        if (i < this.b.length)
        {
          int n = this.b[i];
          if (n >= 0) {}
          for (int i1 = qal.d(n);; i1 = 10)
          {
            m += i1;
            i++;
            break;
          }
        }
        k = k + m + 1 * this.b.length;
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        k += 1 + qal.d(24);
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        k += 1 + qal.d(32);
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int n = 0; n < this.a.length; n++)
      {
        int i1 = this.a[n];
        paramqal.c(8);
        paramqal.a(i1);
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        int m = this.b[k];
        paramqal.c(16);
        paramqal.a(m);
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
 * Qualified Name:     opf
 * JD-Core Version:    0.7.0.1
 */