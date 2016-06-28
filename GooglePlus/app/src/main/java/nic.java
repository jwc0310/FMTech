import java.nio.ByteBuffer;

public final class nic
  extends qan<nic>
{
  public nia[] a = nia.b();
  public nia b = null;
  public nia c = null;
  public Boolean d = null;
  
  public nic()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0)) {
      for (int i1 = 0; i1 < this.a.length; i1++)
      {
        nia localnia3 = this.a[i1];
        if (localnia3 != null)
        {
          int i2 = qal.d(8);
          int i3 = localnia3.a();
          localnia3.ak = i3;
          i += i2 + (i3 + qal.d(i3));
        }
      }
    }
    if (this.b != null)
    {
      nia localnia2 = this.b;
      int m = qal.d(16);
      int n = localnia2.a();
      localnia2.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.c != null)
    {
      nia localnia1 = this.c;
      int j = qal.d(24);
      int k = localnia1.a();
      localnia1.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      this.d.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        nia localnia3 = this.a[j];
        if (localnia3 != null)
        {
          paramqal.c(10);
          if (localnia3.ak < 0) {
            localnia3.ak = localnia3.a();
          }
          paramqal.c(localnia3.ak);
          localnia3.a(paramqal);
        }
      }
    }
    if (this.b != null)
    {
      nia localnia2 = this.b;
      paramqal.c(18);
      if (localnia2.ak < 0) {
        localnia2.ak = localnia2.a();
      }
      paramqal.c(localnia2.ak);
      localnia2.a(paramqal);
    }
    if (this.c != null)
    {
      nia localnia1 = this.c;
      paramqal.c(26);
      if (localnia1.ak < 0) {
        localnia1.ak = localnia1.a();
      }
      paramqal.c(localnia1.ak);
      localnia1.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(32);
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
 * Qualified Name:     nic
 * JD-Core Version:    0.7.0.1
 */