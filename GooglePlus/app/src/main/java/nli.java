import java.nio.ByteBuffer;

public final class nli
  extends qan<nli>
{
  private int[] a = qay.a;
  private Boolean b = null;
  private Boolean c = null;
  
  public nli()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int m;
    if ((this.a != null) && (this.a.length > 0))
    {
      m = 0;
      if (i < this.a.length)
      {
        int n = this.a[i];
        if (n >= 0) {}
        for (int i1 = qal.d(n);; i1 = 10)
        {
          m += i1;
          i++;
          break;
        }
      }
    }
    for (int k = j + m + 1 * this.a.length;; k = j)
    {
      if (this.b != null)
      {
        this.b.booleanValue();
        k += 1 + qal.d(16);
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        k += 1 + qal.d(24);
      }
      return k;
    }
  }
  
  public final void a(qal paramqal)
  {
    int i = 1;
    if ((this.a != null) && (this.a.length > 0)) {
      for (int k = 0; k < this.a.length; k++)
      {
        int m = this.a[k];
        paramqal.c(8);
        paramqal.a(m);
      }
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(16);
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
    if (this.c != null)
    {
      boolean bool1 = this.c.booleanValue();
      paramqal.c(24);
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
 * Qualified Name:     nli
 * JD-Core Version:    0.7.0.1
 */