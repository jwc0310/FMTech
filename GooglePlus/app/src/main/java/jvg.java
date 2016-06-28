import android.content.Context;

public final class jvg
{
  public static final String a = mbr.class.getName();
  public static final String b = kil.class.getName();
  public static final String c = jtm.class.getName();
  public static final String d = jtp.class.getName();
  public static final String e = hyf.class.getName();
  public static final String f = gjg.class.getName();
  public static final String g = mce.class.getName();
  public static final String h = llg.class.getName();
  private static jve i;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    parammbb.a(jtm.class, new jva(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    mbr[] arrayOfmbr = new mbr[4];
    arrayOfmbr[0] = new jvx();
    arrayOfmbr[1] = new jwo();
    arrayOfmbr[2] = new jwl();
    arrayOfmbr[3] = new jvv();
    parammbb.a(mbr.class, arrayOfmbr);
  }
  
  public static void b(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    jve localjve = i;
    kil[] arrayOfkil = new kil[1];
    arrayOfkil[0] = new jvf(localjve);
    parammbb.a(kil.class, arrayOfkil);
  }
  
  public static void c(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    parammbb.a(jtp.class, new jvr());
  }
  
  public static void d(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    hyf[] arrayOfhyf = new hyf[3];
    arrayOfhyf[0] = jwq.a;
    arrayOfhyf[1] = jwq.b;
    arrayOfhyf[2] = jwq.b;
    parammbb.a(hyf.class, arrayOfhyf);
  }
  
  public static void e(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    gjg[] arrayOfgjg = new gjg[1];
    arrayOfgjg[0] = new jug();
    parammbb.a(gjg.class, arrayOfgjg);
  }
  
  public static void f(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    mce[] arrayOfmce = new mce[4];
    arrayOfmce[0] = new jvx();
    arrayOfmce[1] = new jwo();
    arrayOfmce[2] = new jwl();
    arrayOfmce[3] = new jvv();
    parammbb.a(mce.class, arrayOfmce);
  }
  
  public static void g(mbb parammbb)
  {
    if (i == null) {
      i = new jve();
    }
    llg[] arrayOfllg = new llg[1];
    arrayOfllg[0] = new jvh();
    parammbb.a(llg.class, arrayOfllg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvg
 * JD-Core Version:    0.7.0.1
 */