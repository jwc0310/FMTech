import java.nio.ByteBuffer;

public final class odo
  extends qan<odo>
{
  public String a = null;
  public odp b = null;
  public ods c = null;
  public int d = -2147483648;
  private Boolean e = null;
  
  public odo()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.b != null)
    {
      odp localodp = this.b;
      int i2 = qal.d(16);
      int i3 = localodp.a();
      localodp.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    if (this.c != null)
    {
      ods localods = this.c;
      int n = qal.d(24);
      int i1 = localods.a();
      localods.ak = i1;
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.d != -2147483648)
    {
      j = this.d;
      k = qal.d(32);
      if (j < 0) {
        break label208;
      }
    }
    label208:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      if (this.e != null)
      {
        this.e.booleanValue();
        i += 1 + qal.d(48);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      odp localodp = this.b;
      paramqal.c(18);
      if (localodp.ak < 0) {
        localodp.ak = localodp.a();
      }
      paramqal.c(localodp.ak);
      localodp.a(paramqal);
    }
    if (this.c != null)
    {
      ods localods = this.c;
      paramqal.c(26);
      if (localods.ak < 0) {
        localods.ak = localods.a();
      }
      paramqal.c(localods.ak);
      localods.a(paramqal);
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
      paramqal.c(48);
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
 * Qualified Name:     odo
 * JD-Core Version:    0.7.0.1
 */