import java.nio.ByteBuffer;

public final class mop
  extends qan<mop>
{
  public String a = null;
  public moo b = null;
  public int c = -2147483648;
  private Boolean d = null;
  private moq e = null;
  
  public mop()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
    {
      String str = this.a;
      int i4 = qal.d(8);
      int i5 = qal.a(str);
      i += i4 + (i5 + qal.d(i5));
    }
    if (this.b != null)
    {
      moo localmoo = this.b;
      int i2 = qal.d(16);
      int i3 = localmoo.a();
      localmoo.ak = i3;
      i += i2 + (i3 + qal.d(i3));
    }
    int m;
    int n;
    if (this.c != -2147483648)
    {
      m = this.c;
      n = qal.d(24);
      if (m < 0) {
        break label206;
      }
    }
    label206:
    for (int i1 = qal.d(m);; i1 = 10)
    {
      i += i1 + n;
      if (this.d != null)
      {
        this.d.booleanValue();
        i += 1 + qal.d(32);
      }
      if (this.e != null)
      {
        moq localmoq = this.e;
        int j = qal.d(40);
        int k = localmoq.a();
        localmoq.ak = k;
        i += j + (k + qal.d(k));
      }
      return i;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != null)
    {
      String str = this.a;
      paramqal.c(10);
      paramqal.a(str);
    }
    if (this.b != null)
    {
      moo localmoo = this.b;
      paramqal.c(18);
      if (localmoo.ak < 0) {
        localmoo.ak = localmoo.a();
      }
      paramqal.c(localmoo.ak);
      localmoo.a(paramqal);
    }
    if (this.c != -2147483648)
    {
      int j = this.c;
      paramqal.c(24);
      paramqal.a(j);
    }
    if (this.d != null)
    {
      boolean bool = this.d.booleanValue();
      paramqal.c(32);
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
    if (this.e != null)
    {
      moq localmoq = this.e;
      paramqal.c(42);
      if (localmoq.ak < 0) {
        localmoq.ak = localmoq.a();
      }
      paramqal.c(localmoq.ak);
      localmoq.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mop
 * JD-Core Version:    0.7.0.1
 */