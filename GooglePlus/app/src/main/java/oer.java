import java.nio.ByteBuffer;

public final class oer
  extends qan<oer>
{
  public int[] a = qay.a;
  public Boolean b = null;
  private Boolean c = null;
  private Boolean d = null;
  
  public oer()
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
      for (int m = 0; m < this.a.length; m++)
      {
        int n = this.a[m];
        paramqal.c(8);
        paramqal.a(n);
      }
    }
    if (this.b != null)
    {
      boolean bool3 = this.b.booleanValue();
      paramqal.c(16);
      if (bool3) {}
      byte b3;
      for (int k = i;; k = 0)
      {
        b3 = (byte)k;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b3);
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
 * Qualified Name:     oer
 * JD-Core Version:    0.7.0.1
 */