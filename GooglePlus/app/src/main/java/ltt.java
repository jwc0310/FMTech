import android.content.Context;

public final class ltt
{
  public static final String a = ltc.class.getName();
  public static final String b = lsz.class.getName();
  public static final String c = lta.class.getName();
  public static final String d = kbv.class.getName();
  public static final String e = hsa.class.getName();
  private static lts f;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (f == null) {
      f = new lts();
    }
    lsz[] arrayOflsz = new lsz[2];
    arrayOflsz[0] = new ltn(paramContext);
    arrayOflsz[1] = new ltm(paramContext);
    parammbb.a(lsz.class, arrayOflsz);
  }
  
  public static void a(mbb parammbb)
  {
    if (f == null) {
      f = new lts();
    }
    parammbb.a(ltc.class, new ltr());
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (f == null) {
      f = new lts();
    }
    parammbb.a(lta.class, new ltq(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (f == null) {
      f = new lts();
    }
    kbv[] arrayOfkbv = new kbv[1];
    arrayOfkbv[0] = new lti();
    parammbb.a(kbv.class, arrayOfkbv);
  }
  
  public static void c(mbb parammbb)
  {
    if (f == null) {
      f = new lts();
    }
    hsa[] arrayOfhsa = new hsa[1];
    arrayOfhsa[0] = new lto();
    parammbb.a(hsa.class, arrayOfhsa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltt
 * JD-Core Version:    0.7.0.1
 */