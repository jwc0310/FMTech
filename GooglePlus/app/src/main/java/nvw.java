import java.nio.ByteBuffer;

public final class nvw
  extends qan<nvw>
{
  public nvv[] a = nvv.b();
  public Boolean b = null;
  private nwm c = null;
  private nwm d = null;
  
  public nvw()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.c != null)
    {
      nwm localnwm2 = this.c;
      int i3 = qal.d(8);
      int i4 = localnwm2.a();
      localnwm2.ak = i4;
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.a != null) && (this.a.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.a.length; n++)
      {
        nvv localnvv = this.a[n];
        if (localnvv != null)
        {
          int i1 = qal.d(16);
          int i2 = localnvv.a();
          localnvv.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.d != null)
    {
      nwm localnwm1 = this.d;
      int j = qal.d(24);
      int k = localnwm1.a();
      localnwm1.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.b != null)
    {
      this.b.booleanValue();
      i += 1 + qal.d(32);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.c != null)
    {
      nwm localnwm2 = this.c;
      paramqal.c(10);
      if (localnwm2.ak < 0) {
        localnwm2.ak = localnwm2.a();
      }
      paramqal.c(localnwm2.ak);
      localnwm2.a(paramqal);
    }
    if ((this.a != null) && (this.a.length > 0)) {
      for (int j = 0; j < this.a.length; j++)
      {
        nvv localnvv = this.a[j];
        if (localnvv != null)
        {
          paramqal.c(18);
          if (localnvv.ak < 0) {
            localnvv.ak = localnvv.a();
          }
          paramqal.c(localnvv.ak);
          localnvv.a(paramqal);
        }
      }
    }
    if (this.d != null)
    {
      nwm localnwm1 = this.d;
      paramqal.c(26);
      if (localnwm1.ak < 0) {
        localnwm1.ak = localnwm1.a();
      }
      paramqal.c(localnwm1.ak);
      localnwm1.a(paramqal);
    }
    if (this.b != null)
    {
      boolean bool = this.b.booleanValue();
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
 * Qualified Name:     nvw
 * JD-Core Version:    0.7.0.1
 */