import java.nio.ByteBuffer;

public final class oai
  extends qan<oai>
{
  private static volatile oai[] a;
  private int b = -2147483648;
  private omk c = null;
  private omk d = null;
  private Boolean e = null;
  private ome f = null;
  
  public oai()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static oai[] b()
  {
    if (a == null) {}
    synchronized (qar.a)
    {
      if (a == null) {
        a = new oai[0];
      }
      return a;
    }
  }
  
  protected final int a()
  {
    int i = super.a();
    int i5;
    int i6;
    if (this.b != -2147483648)
    {
      int i4 = this.b;
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int j = i + (i6 + i5);; j = i)
    {
      if (this.c != null)
      {
        omk localomk2 = this.c;
        int i2 = qal.d(16);
        int i3 = localomk2.a();
        localomk2.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.d != null)
      {
        omk localomk1 = this.d;
        int n = qal.d(24);
        int i1 = localomk1.a();
        localomk1.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        j += 1 + qal.d(32);
      }
      if (this.f != null)
      {
        ome localome = this.f;
        int k = qal.d(40);
        int m = localome.a();
        localome.ak = m;
        j += k + (m + qal.d(m));
      }
      return j;
      i6 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.b != -2147483648)
    {
      int j = this.b;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.c != null)
    {
      omk localomk2 = this.c;
      paramqal.c(18);
      if (localomk2.ak < 0) {
        localomk2.ak = localomk2.a();
      }
      paramqal.c(localomk2.ak);
      localomk2.a(paramqal);
    }
    if (this.d != null)
    {
      omk localomk1 = this.d;
      paramqal.c(26);
      if (localomk1.ak < 0) {
        localomk1.ak = localomk1.a();
      }
      paramqal.c(localomk1.ak);
      localomk1.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
    if (this.f != null)
    {
      ome localome = this.f;
      paramqal.c(42);
      if (localome.ak < 0) {
        localome.ak = localome.a();
      }
      paramqal.c(localome.ak);
      localome.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     oai
 * JD-Core Version:    0.7.0.1
 */