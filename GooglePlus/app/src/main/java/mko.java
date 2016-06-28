import java.nio.ByteBuffer;

public final class mko
  extends qan<mko>
{
  private String a = null;
  private mkp[] b = mkp.b();
  private Boolean c = null;
  private Integer d = null;
  private String e = null;
  private String f = null;
  private String g = null;
  
  public mko()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str4 = this.a;
      int i10 = qal.d(8);
      int i11 = qal.a(str4);
      i += i10 + (i11 + qal.d(i11));
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i6 = i;
      for (int i7 = 0; i7 < this.b.length; i7++)
      {
        mkp localmkp = this.b[i7];
        if (localmkp != null)
        {
          int i8 = qal.d(16);
          int i9 = localmkp.a();
          localmkp.ak = i9;
          i6 += i8 + (i9 + qal.d(i9));
        }
      }
      i = i6;
    }
    if (this.c != null)
    {
      this.c.booleanValue();
      i += 1 + qal.d(24);
    }
    int i3;
    int i4;
    if (this.d != null)
    {
      i3 = this.d.intValue();
      i4 = qal.d(32);
      if (i3 < 0) {
        break label326;
      }
    }
    label326:
    for (int i5 = qal.d(i3);; i5 = 10)
    {
      i += i5 + i4;
      if (this.e != null)
      {
        String str3 = this.e;
        int i1 = qal.d(40);
        int i2 = qal.a(str3);
        i += i1 + (i2 + qal.d(i2));
      }
      if (this.f != null)
      {
        String str2 = this.f;
        int m = qal.d(48);
        int n = qal.a(str2);
        i += m + (n + qal.d(n));
      }
      if (this.g != null)
      {
        String str1 = this.g;
        int j = qal.d(56);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str4 = this.a;
      paramqal.c(10);
      paramqal.a(str4);
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        mkp localmkp = this.b[k];
        if (localmkp != null)
        {
          paramqal.c(18);
          if (localmkp.ak < 0) {
            localmkp.ak = localmkp.a();
          }
          paramqal.c(localmkp.ak);
          localmkp.a(paramqal);
        }
      }
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(24);
      int j = 0;
      if (bool) {
        j = 1;
      }
      byte b1 = (byte)j;
      if (!paramqal.a.hasRemaining()) {
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b1);
    }
    if (this.d != null)
    {
      int i = this.d.intValue();
      paramqal.c(32);
      paramqal.a(i);
    }
    if (this.e != null)
    {
      String str3 = this.e;
      paramqal.c(42);
      paramqal.a(str3);
    }
    if (this.f != null)
    {
      String str2 = this.f;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.g != null)
    {
      String str1 = this.g;
      paramqal.c(58);
      paramqal.a(str1);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mko
 * JD-Core Version:    0.7.0.1
 */