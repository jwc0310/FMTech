import android.content.Context;

public final class gum
{
  public static final String a = mbr.class.getName();
  public static final String b = gvg.class.getName();
  public static final String c = mce.class.getName();
  private static gul d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new gul();
    }
    parammbb.a(gvg.class, new gvg(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new gul();
    }
    mbr[] arrayOfmbr = new mbr[4];
    arrayOfmbr[0] = new gvi();
    arrayOfmbr[1] = new gvb();
    arrayOfmbr[2] = new gup();
    arrayOfmbr[3] = new guj();
    parammbb.a(mbr.class, arrayOfmbr);
  }
  
  public static void b(mbb parammbb)
  {
    if (d == null) {
      d = new gul();
    }
    mce[] arrayOfmce = new mce[2];
    arrayOfmce[0] = new guk();
    arrayOfmce[1] = new gvc();
    parammbb.a(mce.class, arrayOfmce);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gum
 * JD-Core Version:    0.7.0.1
 */