import java.nio.ByteBuffer;

public final class ocr
  extends qan<ocr>
{
  private static volatile ocr[] g;
  public int a = -2147483648;
  public Integer b = null;
  public ori c = null;
  public Boolean d = null;
  public ocq e = null;
  public ocs f = null;
  private Boolean h = null;
  private oct i = null;
  private ocp j = null;
  private ocv k = null;
  
  public ocr()
  {
    this.aj = null;
    this.ak = -1;
  }
  
  public static ocr[] b()
  {
    if (g == null) {}
    synchronized (qar.a)
    {
      if (g == null) {
        g = new ocr[0];
      }
      return g;
    }
  }
  
  protected final int a()
  {
    int m = 10;
    int n = super.a();
    int i17;
    int i18;
    if (this.a != -2147483648)
    {
      int i16 = this.a;
      i17 = qal.d(8);
      if (i16 >= 0) {
        i18 = qal.d(i16);
      }
    }
    for (int i1 = n + (i18 + i17);; i1 = n)
    {
      if (this.b != null)
      {
        int i14 = this.b.intValue();
        int i15 = qal.d(16);
        if (i14 >= 0) {
          m = qal.d(i14);
        }
        i1 += m + i15;
      }
      if (this.c != null)
      {
        ori localori = this.c;
        int i12 = qal.d(24);
        int i13 = localori.a();
        localori.ak = i13;
        i1 += i12 + (i13 + qal.d(i13));
      }
      if (this.d != null)
      {
        this.d.booleanValue();
        i1 += 1 + qal.d(32);
      }
      if (this.h != null)
      {
        this.h.booleanValue();
        i1 += 1 + qal.d(40);
      }
      if (this.i != null)
      {
        oct localoct = this.i;
        int i10 = qal.d(64);
        int i11 = localoct.a();
        localoct.ak = i11;
        i1 += i10 + (i11 + qal.d(i11));
      }
      if (this.e != null)
      {
        ocq localocq = this.e;
        int i8 = qal.d(72);
        int i9 = localocq.a();
        localocq.ak = i9;
        i1 += i8 + (i9 + qal.d(i9));
      }
      if (this.j != null)
      {
        ocp localocp = this.j;
        int i6 = qal.d(80);
        int i7 = localocp.a();
        localocp.ak = i7;
        i1 += i6 + (i7 + qal.d(i7));
      }
      if (this.f != null)
      {
        ocs localocs = this.f;
        int i4 = qal.d(96);
        int i5 = localocs.a();
        localocs.ak = i5;
        i1 += i4 + (i5 + qal.d(i5));
      }
      if (this.k != null)
      {
        ocv localocv = this.k;
        int i2 = qal.d(104);
        int i3 = localocv.a();
        localocv.ak = i3;
        i1 += i2 + (i3 + qal.d(i3));
      }
      return i1;
      i18 = m;
      break;
    }
  }
  
  public final void a(qal paramqal)
  {
    int m = 1;
    if (this.a != -2147483648)
    {
      int i2 = this.a;
      paramqal.c(8);
      paramqal.a(i2);
    }
    if (this.b != null)
    {
      int i1 = this.b.intValue();
      paramqal.c(16);
      paramqal.a(i1);
    }
    if (this.c != null)
    {
      ori localori = this.c;
      paramqal.c(26);
      if (localori.ak < 0) {
        localori.ak = localori.a();
      }
      paramqal.c(localori.ak);
      localori.a(paramqal);
    }
    if (this.d != null)
    {
      boolean bool2 = this.d.booleanValue();
      paramqal.c(32);
      if (bool2) {}
      byte b2;
      for (int n = m;; n = 0)
      {
        b2 = (byte)n;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
      }
      paramqal.a.put(b2);
    }
    if (this.h != null)
    {
      boolean bool1 = this.h.booleanValue();
      paramqal.c(40);
      if (bool1) {}
      byte b1;
      for (;;)
      {
        b1 = (byte)m;
        if (paramqal.a.hasRemaining()) {
          break;
        }
        throw new qam(paramqal.a.position(), paramqal.a.limit());
        m = 0;
      }
      paramqal.a.put(b1);
    }
    if (this.i != null)
    {
      oct localoct = this.i;
      paramqal.c(66);
      if (localoct.ak < 0) {
        localoct.ak = localoct.a();
      }
      paramqal.c(localoct.ak);
      localoct.a(paramqal);
    }
    if (this.e != null)
    {
      ocq localocq = this.e;
      paramqal.c(74);
      if (localocq.ak < 0) {
        localocq.ak = localocq.a();
      }
      paramqal.c(localocq.ak);
      localocq.a(paramqal);
    }
    if (this.j != null)
    {
      ocp localocp = this.j;
      paramqal.c(82);
      if (localocp.ak < 0) {
        localocp.ak = localocp.a();
      }
      paramqal.c(localocp.ak);
      localocp.a(paramqal);
    }
    if (this.f != null)
    {
      ocs localocs = this.f;
      paramqal.c(98);
      if (localocs.ak < 0) {
        localocs.ak = localocs.a();
      }
      paramqal.c(localocs.ak);
      localocs.a(paramqal);
    }
    if (this.k != null)
    {
      ocv localocv = this.k;
      paramqal.c(106);
      if (localocv.ak < 0) {
        localocv.ak = localocv.a();
      }
      paramqal.c(localocv.ak);
      localocv.a(paramqal);
    }
    super.a(paramqal);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ocr
 * JD-Core Version:    0.7.0.1
 */