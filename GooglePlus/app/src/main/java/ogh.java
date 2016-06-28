import java.nio.ByteBuffer;

public final class ogh
  extends qan<ogh>
{
  public int a = -2147483648;
  public ofw b = null;
  private olm c = null;
  private ofy d = null;
  private Boolean e = null;
  
  public ogh()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  protected final int a()
  {
    int i = super.a();
    int i5;
    int i6;
    if (this.a != -2147483648)
    {
      int i4 = this.a;
      i5 = qal.d(8);
      if (i4 >= 0) {
        i6 = qal.d(i4);
      }
    }
    for (int j = i + (i6 + i5);; j = i)
    {
      if (this.b != null)
      {
        ofw localofw = this.b;
        int i2 = qal.d(16);
        int i3 = localofw.a();
        localofw.ak = i3;
        j += i2 + (i3 + qal.d(i3));
      }
      if (this.c != null)
      {
        olm localolm = this.c;
        int n = qal.d(24);
        int i1 = localolm.a();
        localolm.ak = i1;
        j += n + (i1 + qal.d(i1));
      }
      if (this.d != null)
      {
        ofy localofy = this.d;
        int k = qal.d(32);
        int m = localofy.a();
        localofy.ak = m;
        j += k + (m + qal.d(m));
      }
      if (this.e != null)
      {
        this.e.booleanValue();
        j += 1 + qal.d(40);
      }
      return j;
      i6 = 10;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    if (this.a != -2147483648)
    {
      int j = this.a;
      paramqal.c(8);
      paramqal.a(j);
    }
    if (this.b != null)
    {
      ofw localofw = this.b;
      paramqal.c(18);
      if (localofw.ak < 0) {
        localofw.ak = localofw.a();
      }
      paramqal.c(localofw.ak);
      localofw.a(paramqal);
    }
    if (this.c != null)
    {
      olm localolm = this.c;
      paramqal.c(26);
      if (localolm.ak < 0) {
        localolm.ak = localolm.a();
      }
      paramqal.c(localolm.ak);
      localolm.a(paramqal);
    }
    if (this.d != null)
    {
      ofy localofy = this.d;
      paramqal.c(34);
      if (localofy.ak < 0) {
        localofy.ak = localofy.a();
      }
      paramqal.c(localofy.ak);
      localofy.a(paramqal);
    }
    if (this.e != null)
    {
      boolean bool = this.e.booleanValue();
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
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ogh
 * JD-Core Version:    0.7.0.1
 */