import java.nio.ByteBuffer;

public final class nnh
  extends qan<nnh>
{
  public Long a = null;
  public Double b = null;
  public String c = null;
  private byte[] d = null;
  
  public nnh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      long l = this.a.longValue();
      i += qal.d(8) + qal.b(l);
    }
    if (this.b != null)
    {
      this.b.doubleValue();
      i += 8 + qal.d(16);
    }
    if (this.c != null)
    {
      String str = this.c;
      int j = qal.d(24);
      int k = qal.a(str);
      i += j + (k + qal.d(k));
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      i += qal.d(32) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      long l = this.a.longValue();
      paramqal.c(8);
      paramqal.a(l);
    }
    if (this.b != null)
    {
      double d1 = this.b.doubleValue();
      paramqal.c(17);
      paramqal.c(Double.doubleToLongBits(d1));
    }
    if (this.c != null)
    {
      String str = this.c;
      paramqal.c(26);
      paramqal.a(str);
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      paramqal.c(34);
      paramqal.c(arrayOfByte.length);
      int i = arrayOfByte.length;
      if (paramqal.a.remaining() >= i) {
        paramqal.a.put(arrayOfByte, 0, i);
      }
    }
    else
    {
      super.a(paramqal);
      return;
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nnh
 * JD-Core Version:    0.7.0.1
 */