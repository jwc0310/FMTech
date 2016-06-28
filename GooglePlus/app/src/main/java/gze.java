import android.content.Context;

public final class gze
{
  public static final String a = mbr.class.getName();
  public static final String b = gzy.class.getName();
  public static final String c = gzh.class.getName();
  public static final String d = mce.class.getName();
  public static final String e = mcn.class.getName();
  private static gzd f;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (f == null) {
      f = new gzd();
    }
    parammbb.a(gzy.class, new gzy(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (f == null) {
      f = new gzd();
    }
    mbr[] arrayOfmbr = new mbr[1];
    arrayOfmbr[0] = new gzl();
    parammbb.a(mbr.class, arrayOfmbr);
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (f == null) {
      f = new gzd();
    }
    parammbb.a(gzh.class, new gzs(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (f == null) {
      f = new gzd();
    }
    mce[] arrayOfmce = new mce[1];
    arrayOfmce[0] = new gzl();
    parammbb.a(mce.class, arrayOfmce);
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (f == null) {
      f = new gzd();
    }
    parammbb.a(mcn.class, new mcn[0]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gze
 * JD-Core Version:    0.7.0.1
 */