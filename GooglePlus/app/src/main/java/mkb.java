import java.nio.ByteBuffer;

public final class mkb
  extends qan<mkb>
{
  private String a = null;
  private mkn b = null;
  private String c = null;
  private byte[] d = null;
  private String e = null;
  private String[] f = qay.f;
  
  public mkb()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i7 = qal.d(8);
      int i8 = qal.a(str4);
      j += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      mkn localmkn = this.b;
      int i5 = qal.d(16);
      int i6 = localmkn.a();
      localmkn.ak = i6;
      j += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i3 = qal.d(24);
      int i4 = qal.a(str3);
      j += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      j += qal.d(32) + (qal.d(arrayOfByte.length) + arrayOfByte.length);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      int i1 = qal.d(40);
      int i2 = qal.a(str2);
      j += i1 + (i2 + qal.d(i2));
    }
    if ((this.f != null) && (this.f.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.f.length)
      {
        String str1 = this.f[i];
        if (str1 != null)
        {
          m++;
          int n = qal.a(str1);
          k += n + qal.d(n);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if (this.b != null)
    {
      mkn localmkn = this.b;
      paramqal.c(18);
      if (localmkn.ak < 0) {
        localmkn.ak = localmkn.a();
      }
      paramqal.c(localmkn.ak);
      localmkn.a(paramqal);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if (this.d != null)
    {
      byte[] arrayOfByte = this.d;
      paramqal.c(34);
      paramqal.c(arrayOfByte.length);
      int k = arrayOfByte.length;
      if (paramqal.a.remaining() >= k) {
        paramqal.a.put(arrayOfByte, 0, k);
      }
    }
    else
    {
      if (this.e != null)
      {
        String str2 = this.e;
        paramqal.c(42);
        paramqal.a(str2);
      }
      if (this.f == null) {
        break label264;
      }
      int i = this.f.length;
      int j = 0;
      if (i <= 0) {
        break label264;
      }
      while (j < this.f.length)
      {
        String str1 = this.f[j];
        if (str1 != null)
        {
          paramqal.c(50);
          paramqal.a(str1);
        }
        j++;
      }
    }
    throw new qam(paramqal.a.position(), paramqal.a.limit());
    label264:
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mkb
 * JD-Core Version:    0.7.0.1
 */