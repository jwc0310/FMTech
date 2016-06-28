import java.nio.ByteBuffer;

public final class mkj
  extends qan<mkj>
{
  private static volatile mkj[] a;
  private byte[] b = null;
  private String c = null;
  private String d = null;
  private mkk[] e = mkk.b();
  private String f = null;
  
  public mkj()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static mkj[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new mkj[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.b != null)
    {
      byte[] arrayOfByte = this.b;
      i += qal.d(8) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i5 = qal.d(16);
      int i6 = qal.a(str3);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i3 = qal.d(24);
      int i4 = qal.a(str2);
      i += i3 + (i4 + qal.d(i4));
    }
    if ((this.e != null) && (this.e.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.e.length; n++)
      {
        mkk localmkk = this.e[n];
        if (localmkk != null)
        {
          int i1 = qal.d(32);
          int i2 = localmkk.a();
          localmkk.ak = i2;
          m += i1 + (i2 + qal.d(i2));
        }
      }
      i = m;
    }
    if (this.f != null)
    {
      String str1 = this.f;
      int j = qal.d(40);
      int k = qal.a(str1);
      i += j + (k + qal.d(k));
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != null)
    {
      byte[] arrayOfByte = this.b;
      paramqal.c(10);
      paramqal.c(arrayOfByte.length);
      int k = arrayOfByte.length;
      if (paramqal.a.remaining() >= k) {
        paramqal.a.put(arrayOfByte, 0, k);
      }
    }
    else
    {
      if (this.c != null)
      {
        String str3 = this.c;
        paramqal.c(18);
        paramqal.a(str3);
      }
      if (this.d != null)
      {
        String str2 = this.d;
        paramqal.c(26);
        paramqal.a(str2);
      }
      if (this.e == null) {
        break label217;
      }
      int i = this.e.length;
      int j = 0;
      if (i <= 0) {
        break label217;
      }
      while (j < this.e.length)
      {
        mkk localmkk = this.e[j];
        if (localmkk != null)
        {
          paramqal.c(34);
          if (localmkk.ak < 0) {
            localmkk.ak = localmkk.a();
          }
          paramqal.c(localmkk.ak);
          localmkk.a(paramqal);
        }
        j++;
      }
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
    label217:
    if (this.f != null)
    {
      String str1 = this.f;
      paramqal.c(42);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkj
 * JD-Core Version:    0.7.0.1
 */