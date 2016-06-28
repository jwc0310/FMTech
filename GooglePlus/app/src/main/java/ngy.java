import java.nio.ByteBuffer;

public final class ngy
  extends qan<ngy>
{
  public ngj a = null;
  public String b = null;
  public String c = null;
  public ngs[] d = ngs.b();
  public String e = null;
  public qbd f = null;
  private Boolean g = null;
  private int h = -2147483648;
  private String i = null;
  
  public ngy()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int j = super.a();
    if (this.a != null)
    {
      ngj localngj = this.a;
      int i15 = qal.d(8);
      int i16 = localngj.a();
      localngj.ak = i16;
      j += i15 + (i16 + qal.d(i16));
    }
    if (this.b != null)
    {
      String str4 = this.b;
      int i13 = qal.d(16);
      int i14 = qal.a(str4);
      j += i13 + (i14 + qal.d(i14));
    }
    if (this.c != null)
    {
      String str3 = this.c;
      int i11 = qal.d(24);
      int i12 = qal.a(str3);
      j += i11 + (i12 + qal.d(i12));
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int i7 = j;
      for (int i8 = 0; i8 < this.d.length; i8++)
      {
        ngs localngs = this.d[i8];
        if (localngs != null)
        {
          int i9 = qal.d(32);
          int i10 = localngs.a();
          localngs.ak = i10;
          i7 += i9 + (i10 + qal.d(i10));
        }
      }
      j = i7;
    }
    int i4;
    int i5;
    if (this.h != -2147483648)
    {
      i4 = this.h;
      i5 = qal.d(40);
      if (i4 < 0) {
        break label420;
      }
    }
    label420:
    for (int i6 = qal.d(i4);; i6 = 10)
    {
      j += i6 + i5;
      if (this.e != null)
      {
        String str2 = this.e;
        int i2 = qal.d(48);
        int i3 = qal.a(str2);
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.i != null)
      {
        String str1 = this.i;
        int n = qal.d(56);
        int i1 = qal.a(str1);
        j += n + (i1 + qal.d(i1));
      }
      if (this.g != null)
      {
        this.g.booleanValue();
        j += 1 + qal.d(64);
      }
      if (this.f != null)
      {
        qbd localqbd = this.f;
        int k = qal.d(72);
        int m = localqbd.a();
        localqbd.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      ngj localngj = this.a;
      paramqal.c(10);
      if (localngj.ak < 0) {
        localngj.ak = localngj.a();
      }
      paramqal.c(localngj.ak);
      localngj.a(paramqal);
    }
    if (this.b != null)
    {
      String str4 = this.b;
      paramqal.c(18);
      paramqal.a(str4);
    }
    if (this.c != null)
    {
      String str3 = this.c;
      paramqal.c(26);
      paramqal.a(str3);
    }
    if ((this.d != null) && (this.d.length > 0)) {
      for (int m = 0; m < this.d.length; m++)
      {
        ngs localngs = this.d[m];
        if (localngs != null)
        {
          paramqal.c(34);
          if (localngs.ak < 0) {
            localngs.ak = localngs.a();
          }
          paramqal.c(localngs.ak);
          localngs.a(paramqal);
        }
      }
    }
    if (this.h != -2147483648)
    {
      int k = this.h;
      paramqal.c(40);
      paramqal.a(k);
    }
    if (this.e != null)
    {
      String str2 = this.e;
      paramqal.c(50);
      paramqal.a(str2);
    }
    if (this.i != null)
    {
      String str1 = this.i;
      paramqal.c(58);
      paramqal.a(str1);
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
      paramqal.c(64);
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
    if (this.f != null)
    {
      qbd localqbd = this.f;
      paramqal.c(74);
      if (localqbd.ak < 0) {
        localqbd.ak = localqbd.a();
      }
      paramqal.c(localqbd.ak);
      localqbd.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ngy
 * JD-Core Version:    0.7.0.1
 */