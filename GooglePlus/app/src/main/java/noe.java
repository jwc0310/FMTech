import java.nio.ByteBuffer;

public final class noe
  extends qan<noe>
{
  public Integer a = null;
  public Integer b = null;
  public Boolean c = null;
  private String d = null;
  private String e = null;
  private Long f = null;
  
  public noe()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      int i4 = this.a.intValue();
      i += qal.d(8) + qal.d(i4);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      int i2 = qal.d(16);
      int i3 = qal.a(str2);
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.b != null)
    {
      m = this.b.intValue();
      n = qal.d(24);
      if (m < 0) {
        break label215;
      }
    }
    label215:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.e != null)
      {
        String str1 = this.e;
        int j = qal.d(32);
        int k = qal.a(str1);
        i += j + (k + qal.d(k));
      }
      if (this.c != null)
      {
        this.c.booleanValue();
        i += 1 + qal.d(40);
      }
      if (this.f != null)
      {
        long l = this.f.longValue();
        i += qal.d(48) + qal.b(l);
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      int k = this.a.intValue();
      paramqal.c(8);
      paramqal.c(k);
    }
    if (this.d != null)
    {
      String str2 = this.d;
      paramqal.c(18);
      paramqal.a(str2);
    }
    if (this.b != null)
    {
      int j = this.b.intValue();
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.e != null)
    {
      String str1 = this.e;
      paramqal.c(34);
      paramqal.a(str1);
    }
    if (this.c != null)
    {
      boolean bool = this.c.booleanValue();
      paramqal.c(40);
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
    if (this.f != null)
    {
      long l = this.f.longValue();
      paramqal.c(48);
      paramqal.a(l);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     noe
 * JD-Core Version:    0.7.0.1
 */