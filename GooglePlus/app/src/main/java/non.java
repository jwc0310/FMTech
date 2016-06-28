import java.nio.ByteBuffer;

public final class non
  extends qan<non>
{
  private byte[] a = null;
  private String b = null;
  private String c = null;
  private String d = null;
  
  public non()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      byte[] arrayOfByte = this.a;
      i += qal.d(8) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.b != null)
    {
      String str3 = this.b;
      int i1 = qal.d(16);
      int i2 = qal.a(str3);
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int m = qal.d(24);
      int n = qal.a(str2);
      i += m + (n + qal.d(n));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int j = qal.d(32);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      byte[] arrayOfByte = this.a;
      paramqal.c(10);
      paramqal.c(arrayOfByte.length);
      int i = arrayOfByte.length;
      if (paramqal.a.remaining() >= i) {
        paramqal.a.put(arrayOfByte, 0, i);
      }
    }
    else
    {
      if (this.b != null)
      {
        String str3 = this.b;
        paramqal.c(18);
        paramqal.a(str3);
      }
      if (this.c != null)
      {
        String str2 = this.c;
        paramqal.c(26);
        paramqal.a(str2);
      }
      if (this.d != null)
      {
        String str1 = this.d;
        paramqal.c(34);
        paramqal.a(str1);
      }
      super.a(paramqal);
      return;
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     non
 * JD-Core Version:    0.7.0.1
 */