import android.content.Context;

public final class ixk
{
  public static final String a = ixs.class.getName();
  public static final String b = ixf.class.getName();
  public static final String c = ixm.class.getName();
  public static final String d = hyf.class.getName();
  private static ixj e;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (e == null) {
      e = new ixj();
    }
    parammbb.a(ixf.class, new ixi(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (e == null) {
      e = new ixj();
    }
    parammbb.a(ixs.class, new ixs[] { (ixm)parammbb.a(ixm.class) });
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (e == null) {
      e = new ixj();
    }
    parammbb.a(ixm.class, new ixm(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (e == null) {
      e = new ixj();
    }
    hyf[] arrayOfhyf = new hyf[2];
    arrayOfhyf[0] = ixh.a;
    arrayOfhyf[1] = ixh.b;
    parammbb.a(hyf.class, arrayOfhyf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixk
 * JD-Core Version:    0.7.0.1
 */