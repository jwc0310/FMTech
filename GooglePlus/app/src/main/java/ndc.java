import java.nio.ByteBuffer;

public final class ndc
  extends qan<ndc>
{
  private String a = null;
  private String b = null;
  private String c = null;
  private ndb d = null;
  private mis e = null;
  private ndd f = null;
  private Boolean g = null;
  
  public ndc()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str3 = this.a;
      int i7 = qal.d(8);
      int i8 = qal.a(str3);
      i += i7 + (i8 + qal.d(i8));
    }
    if (this.b != null)
    {
      String str2 = this.b;
      int i5 = qal.d(16);
      int i6 = qal.a(str2);
      i += i5 + (i6 + qal.d(i6));
    }
    if (this.c != null)
    {
      String str1 = this.c;
      int i3 = qal.d(24);
      int i4 = qal.a(str1);
      i += i3 + (i4 + qal.d(i4));
    }
    if (this.d != null)
    {
      ndb localndb = this.d;
      int i1 = qal.d(32);
      int i2 = localndb.a();
      localndb.ak = i2;
      i += i1 + (i2 + qal.d(i2));
    }
    if (this.e != null)
    {
      mis localmis = this.e;
      int m = qal.d(40);
      int n = localmis.a();
      localmis.ak = n;
      i += m + (n + qal.d(n));
    }
    if (this.f != null)
    {
      ndd localndd = this.f;
      int j = qal.d(48);
      int k = localndd.a();
      localndd.ak = k;
      i += j + (k + qal.d(k));
    }
    if (this.g != null)
    {
      this.g.booleanValue();
      i += 1 + qal.d(56);
    }
    return i;
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str3 = this.a;
      paramqal.c(10);
      paramqal.a(str3);
    }
    if (this.b != null)
    {
      String str2 = this.b;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.c != null)
    {
      String str1 = this.c;
      paramqal.c(26);
      paramqal.a(str1);
    }
    if (this.d != null)
    {
      ndb localndb = this.d;
      paramqal.c(34);
      if (localndb.ak < 0) {
        localndb.ak = localndb.a();
      }
      paramqal.c(localndb.ak);
      localndb.a(paramqal);
    }
    if (this.e != null)
    {
      mis localmis = this.e;
      paramqal.c(42);
      if (localmis.ak < 0) {
        localmis.ak = localmis.a();
      }
      paramqal.c(localmis.ak);
      localmis.a(paramqal);
    }
    if (this.f != null)
    {
      ndd localndd = this.f;
      paramqal.c(50);
      if (localndd.ak < 0) {
        localndd.ak = localndd.a();
      }
      paramqal.c(localndd.ak);
      localndd.a(paramqal);
    }
    if (this.g != null)
    {
      boolean bool = this.g.booleanValue();
      paramqal.c(56);
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
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ndc
 * JD-Core Version:    0.7.0.1
 */