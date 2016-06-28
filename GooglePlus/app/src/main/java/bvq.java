import android.content.Context;

public final class bvq
{
  public static final String a = mbr.class.getName();
  public static final String b = bvo.class.getName();
  public static final String c = hyf.class.getName();
  private static bvp d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new bvp();
    }
    parammbb.a(bvo.class, new bvv(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new bvp();
    }
    mbr[] arrayOfmbr = new mbr[1];
    arrayOfmbr[0] = new bvt();
    parammbb.a(mbr.class, arrayOfmbr);
  }
  
  public static void b(mbb parammbb)
  {
    if (d == null) {
      d = new bvp();
    }
    hyf[] arrayOfhyf = new hyf[1];
    arrayOfhyf[0] = bvw.a;
    parammbb.a(hyf.class, arrayOfhyf);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvq
 * JD-Core Version:    0.7.0.1
 */