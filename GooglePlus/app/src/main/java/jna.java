public final class jna
{
  public static final String a = hrh.class.getName();
  public static final String b = hyf.class.getName();
  public static final String c = gon.class.getName();
  private static jmw d;
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new jmw();
    }
    jmw localjmw = d;
    hrh[] arrayOfhrh = new hrh[3];
    arrayOfhrh[0] = new jmx(localjmw, "CirclesAndPeople", aaw.pC);
    arrayOfhrh[1] = new jmy(localjmw, "Circles", aaw.pD);
    arrayOfhrh[2] = new jmz(localjmw, "People", aaw.pF);
    parammbb.a(hrh.class, arrayOfhrh);
  }
  
  public static void b(mbb parammbb)
  {
    if (d == null) {
      d = new jmw();
    }
    hyf[] arrayOfhyf = new hyf[4];
    arrayOfhyf[0] = jmv.a;
    arrayOfhyf[1] = jmv.b;
    arrayOfhyf[2] = jmv.c;
    arrayOfhyf[3] = jmv.d;
    parammbb.a(hyf.class, arrayOfhyf);
  }
  
  public static void c(mbb parammbb)
  {
    if (d == null) {
      d = new jmw();
    }
    gon[] arrayOfgon = new gon[2];
    arrayOfgon[0] = new jnc();
    arrayOfgon[1] = new jmk();
    parammbb.a(gon.class, arrayOfgon);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jna
 * JD-Core Version:    0.7.0.1
 */