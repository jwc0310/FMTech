import java.nio.ByteBuffer;

public final class nxm
  extends qan<nxm>
{
  public ors a = null;
  public Boolean b = null;
  public Boolean c = null;
  private orj[] d = orj.b();
  private orj[] e = orj.b();
  
  public nxm()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      ors localors = this.a;
      int i5 = qal.d(8);
      int i6 = localors.a();
      localors.ak = i6;
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(16);
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.d.length; i2++)
      {
        orj localorj2 = this.d[i2];
        if (localorj2 != null)
        {
          int i3 = qal.d(32);
          int i4 = localorj2.a();
          localorj2.ak = i4;
          i1 += i3 + (i4 + qal.d(i4));
        }
      }
      i = i1;
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          orj localorj1 = this.e[k];
          if (localorj1 != null)
          {
            int m = qal.d(40);
            int n = localorj1.a();
            localorj1.ak = n;
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
    int i = 1;
    if (this.a != null)
    {
      ors localors = this.a;
      paramqal.c(10);
      if (localors.ak < 0) {
        localors.ak = localors.a();
      }
      paramqal.c(localors.ak);
      localors.a(paramqal);
    }
    if (this.b != null)
    {
      boolean bool2 = this.b.booleanValue();
      paramqal.c(16);
      if (bool2) {}
      byte b2;
      for (int n = i;; n = 0)
      {
        b2 = (byte)n;
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
    if ((this.d != null) && (this.d.length > 0)) {
      for (int m = 0; m < this.d.length; m++)
      {
        orj localorj2 = this.d[m];
        if (localorj2 != null)
        {
          paramqal.c(34);
          if (localorj2.ak < 0) {
            localorj2.ak = localorj2.a();
          }
          paramqal.c(localorj2.ak);
          localorj2.a(paramqal);
        }
      }
    }
    if (this.e != null)
    {
      int j = this.e.length;
      int k = 0;
      if (j > 0) {
        while (k < this.e.length)
        {
          orj localorj1 = this.e[k];
          if (localorj1 != null)
          {
            paramqal.c(42);
            if (localorj1.ak < 0) {
              localorj1.ak = localorj1.a();
            }
            paramqal.c(localorj1.ak);
            localorj1.a(paramqal);
          }
          k++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nxm
 * JD-Core Version:    0.7.0.1
 */