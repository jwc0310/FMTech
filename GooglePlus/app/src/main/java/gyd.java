import android.content.Context;

public final class gyd
{
  public static final String a = kbz.class.getName();
  public static final String b = gxx.class.getName();
  public static final String c = hsa.class.getName();
  private static gyc d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new gyc();
    }
    parammbb.a(gxx.class, new gye(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new gyc();
    }
    kbz[] arrayOfkbz = new kbz[1];
    arrayOfkbz[0] = new gyg();
    parammbb.a(kbz.class, arrayOfkbz);
  }
  
  public static void b(mbb parammbb)
  {
    if (d == null) {
      d = new gyc();
    }
    hsa[] arrayOfhsa = new hsa[1];
    arrayOfhsa[0] = new gyb();
    parammbb.a(hsa.class, arrayOfhsa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyd
 * JD-Core Version:    0.7.0.1
 */