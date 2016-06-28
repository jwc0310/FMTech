import java.nio.ByteBuffer;

public final class nwd
  extends qan<nwd>
{
  private nwm a = null;
  private Long b = null;
  private Long c = null;
  private int d = -2147483648;
  private Boolean e = null;
  
  public nwd()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      nwm localnwm = this.a;
      int n = qal.d(8);
      int i1 = localnwm.a();
      localnwm.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      i += qal.d(16) + qal.b(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      i += qal.d(24) + qal.b(l1);
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label179;
      }
    }
    label179:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.e != null)
      {
        this.e.booleanValue();
        i += 1 + qal.d(40);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      nwm localnwm = this.a;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.b != null)
    {
      long l2 = this.b.longValue();
      paramqal.c(16);
      paramqal.a(l2);
    }
    if (this.c != null)
    {
      long l1 = this.c.longValue();
      paramqal.c(24);
      paramqal.a(l1);
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
      if (bool) {}
      byte b1;
      for (int i = 1;; i = 0)
      {
        b1 = (byte)i;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nwd
 * JD-Core Version:    0.7.0.1
 */