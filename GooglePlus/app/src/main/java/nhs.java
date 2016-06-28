import java.nio.ByteBuffer;

public final class nhs
  extends qan<nhs>
{
  private nhp[] a = nhp.b();
  private nhp[] b = nhp.b();
  private String c = null;
  private String d = null;
  private nht[] e = nht.b();
  private nhr f = null;
  private nhq g = null;
  private Boolean h = null;
  
  public nhs()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if ((this.a != null) && (this.a.length > 0))
    {
      int i13 = i;
      for (int i14 = 0; i14 < this.a.length; i14++)
      {
        nhp localnhp2 = this.a[i14];
        if (localnhp2 != null)
        {
          int i15 = qal.d(8);
          int i16 = localnhp2.a();
          localnhp2.ak = i16;
          i13 += i15 + (i16 + qal.d(i16));
        }
      }
      i = i13;
    }
    if ((this.b != null) && (this.b.length > 0))
    {
      int i9 = i;
      for (int i10 = 0; i10 < this.b.length; i10++)
      {
        nhp localnhp1 = this.b[i10];
        if (localnhp1 != null)
        {
          int i11 = qal.d(16);
          int i12 = localnhp1.a();
          localnhp1.ak = i12;
          i9 += i11 + (i12 + qal.d(i12));
        }
      }
      i = i9;
    }
    if (this.c != null)
    {
      String str2 = this.c;
      int i7 = qal.d(24);
      int i8 = qal.a(str2);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.d != null)
    {
      String str1 = this.d;
      int i5 = qal.d(32);
      int i6 = qal.a(str1);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.e != null)
    {
      int i1 = this.e.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.e.length)
        {
          nht localnht = this.e[i2];
          if (localnht != null)
          {
            int i3 = qal.d(40);
            int i4 = localnht.a();
            localnht.ak = i4;
            i += i3 + (i4 + qal.d(i4));
          }
          i2++;
        }
      }
    }
    if (this.f != null)
    {
      nhr localnhr = this.f;
      int m = qal.d(48);
      int n = localnhr.a();
      localnhr.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.g != null)
    {
      nhq localnhq = this.g;
      int j = qal.d(56);
      int k = localnhq.a();
      localnhq.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.h != null)
    {
      this.h.booleanValue();
      i += 1 + qal.d(64);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if ((this.a != null) && (this.a.length > 0)) {
      for (int m = 0; m < this.a.length; m++)
      {
        nhp localnhp2 = this.a[m];
        if (localnhp2 != null)
        {
          paramqal.c(10);
          if (localnhp2.ak < 0) {
            localnhp2.ak = localnhp2.a();
          }
          paramqal.c(localnhp2.ak);
          localnhp2.a(paramqal);
        }
      }
    }
    if ((this.b != null) && (this.b.length > 0)) {
      for (int k = 0; k < this.b.length; k++)
      {
        nhp localnhp1 = this.b[k];
        if (localnhp1 != null)
        {
          paramqal.c(18);
          if (localnhp1.ak < 0) {
            localnhp1.ak = localnhp1.a();
          }
          paramqal.c(localnhp1.ak);
          localnhp1.a(paramqal);
        }
      }
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
    if ((this.e != null) && (this.e.length > 0)) {
      for (int j = 0; j < this.e.length; j++)
      {
        nht localnht = this.e[j];
        if (localnht != null)
        {
          paramqal.c(42);
          if (localnht.ak < 0) {
            localnht.ak = localnht.a();
          }
          paramqal.c(localnht.ak);
          localnht.a(paramqal);
        }
      }
    }
    if (this.f != null)
    {
      nhr localnhr = this.f;
      paramqal.c(50);
      if (localnhr.ak < 0) {
        localnhr.ak = localnhr.a();
      }
      paramqal.c(localnhr.ak);
      localnhr.a(paramqal);
    }
    if (this.g != null)
    {
      nhq localnhq = this.g;
      paramqal.c(58);
      if (localnhq.ak < 0) {
        localnhq.ak = localnhq.a();
      }
      paramqal.c(localnhq.ak);
      localnhq.a(paramqal);
    }
    if (this.h != null)
    {
      boolean bool = this.h.booleanValue();
      paramqal.c(64);
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
 * Qualified Name:     nhs
 * JD-Core Version:    0.7.0.1
 */