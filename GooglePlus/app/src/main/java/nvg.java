import java.nio.ByteBuffer;

public final class nvg
  extends qan<nvg>
{
  public String a = null;
  private nwm b = null;
  private Boolean c = null;
  private Integer d = null;
  private Integer e = null;
  private Integer f = null;
  
  public nvg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 10;
    int j = super.a();
    if (this.b != null)
    {
      nwm localnwm = this.b;
      int i8 = qal.d(8);
      int i9 = localnwm.a();
      localnwm.ak = i9;
      j += i8 + (i9 + qal.d(i9));
    }
    if (this.a != null)
    {
      String str = this.a;
      int i6 = qal.d(16);
      int i7 = qal.a(str);
      j += i6 + (i7 + qal.d(i7));
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + qal.d(24);
    }
    int i5;
    int n;
    int i1;
    if (this.d != null)
    {
      int i3 = this.d.intValue();
      int i4 = qal.d(32);
      if (i3 >= 0)
      {
        i5 = qal.d(i3);
        j += i5 + i4;
      }
    }
    else if (this.e != null)
    {
      n = this.e.intValue();
      i1 = qal.d(40);
      if (n < 0) {
        break label254;
      }
    }
    label254:
    for (int i2 = qal.d(n);; i2 = i)
    {
      j += i2 + i1;
      if (this.f != null)
      {
        int k = this.f.intValue();
        int m = qal.d(48);
        if (k >= 0) {
          i = qal.d(k);
        }
        j += m + i;
      }
      return j;
      i5 = i;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      nwm localnwm = this.b;
      paramqal.c(10);
      if (localnwm.ak < 0) {
        localnwm.ak = localnwm.a();
      }
      paramqal.c(localnwm.ak);
      localnwm.a(paramqal);
    }
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(18);
      paramqal.a(str);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
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
    if (this.d != null)
    {
      int k = this.d.intValue();
      paramqal.c(32);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      int j = this.e.intValue();
      paramqal.c(40);
      paramqal.a(j);
    }
    if (this.f != null)
    {
      int i = this.f.intValue();
      paramqal.c(48);
      paramqal.a(i);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nvg
 * JD-Core Version:    0.7.0.1
 */