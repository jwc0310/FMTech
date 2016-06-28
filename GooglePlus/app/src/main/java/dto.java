import android.content.Context;

public final class dto
{
  public static final String a = dsr.class.getName();
  public static final String b = lgl.class.getName();
  public static final String c = kyp.class.getName();
  public static final String d = kyi.class.getName();
  public static final String e = gqv.class.getName();
  public static final String f = kyh.class.getName();
  private static dtn g;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    parammbb.a(dsr.class, new dtp(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    lgl[] arrayOflgl = new lgl[2];
    arrayOflgl[0] = new lgf();
    arrayOflgl[1] = new dst();
    parammbb.a(lgl.class, arrayOflgl);
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    parammbb.a(kyp.class, new dte(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    parammbb.a(kyi.class, new dth());
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    gqv[] arrayOfgqv = new gqv[1];
    arrayOfgqv[0] = new dss(paramContext);
    parammbb.a(gqv.class, arrayOfgqv);
  }
  
  public static void d(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new dtn();
    }
    parammbb.a(kyh.class, new dtd(paramContext));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dto
 * JD-Core Version:    0.7.0.1
 */