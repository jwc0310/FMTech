import java.nio.ByteBuffer;

public final class nqg
  extends qan<nqg>
{
  public Boolean a = null;
  public String[] b = qay.f;
  private String c = null;
  
  public nqg()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    this.a.booleanValue();
    int k = j + (1 + qal.d(8));
    if (this.c != null)
    {
      String str2 = this.c;
      int i2 = qal.d(16);
      int i3 = qal.a(str2);
      k += i2 + (i3 + qal.d(i3));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int m = 0;
      int n = 0;
      while (m < this.b.length)
      {
        String str1 = this.b[m];
        if (str1 != null)
        {
          n++;
          int i1 = qal.a(str1);
          i += i1 + qal.d(i1);
        }
        m++;
      }
      k = k + i + n * 1;
    }
    return k;
  }
  
  public final void a(qal paramqal)
  {
    boolean bool = this.a.booleanValue();
    paramqal.c(8);
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
    if (this.c != null)
    {
      String str2 = this.c;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      int j = this.b.length;
      int k = 0;
      if (j > 0) {
        while (k < this.b.length)
        {
          String str1 = this.b[k];
          if (str1 != null)
          {
            paramqal.c(26);
            paramqal.a(str1);
          }
          k++;
        }
      }
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nqg
 * JD-Core Version:    0.7.0.1
 */