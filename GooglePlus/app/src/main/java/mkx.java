import java.nio.ByteBuffer;

public final class mkx
  extends qan<mkx>
{
  private byte[] a = null;
  private String b = null;
  private int c = -2147483648;
  
  public mkx()
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
      String str = this.b;
      int n = qal.d(16);
      int i1 = qal.a(str);
      i += n + (i1 + qal.d(i1));
    }
    int j;
    int k;
    if (this.c != -2147483648)
    {
      j = this.c;
      k = qal.d(24);
      if (j < 0) {
        break label117;
      }
    }
    label117:
    for (int m = qal.d(j);; m = 10)
    {
      i += m + k;
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      byte[] arrayOfByte = this.a;
      paramqal.c(10);
      paramqal.c(arrayOfByte.length);
      int j = arrayOfByte.length;
      if (paramqal.a.remaining() >= j) {
        paramqal.a.put(arrayOfByte, 0, j);
      }
    }
    else
    {
      if (this.b != null)
      {
        String str = this.b;
        paramqal.c(18);
        paramqal.a(str);
      }
      if (this.c != -2147483648)
      {
        int i = this.c;
        paramqal.c(24);
        paramqal.a(i);
      }
      super.a(paramqal);
      return;
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkx
 * JD-Core Version:    0.7.0.1
 */