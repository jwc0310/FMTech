import android.content.Context;

public final class cui
{
  public static final String a = hrp.class.getName();
  public static final String b = ctu.class.getName();
  public static final String c = glh.class.getName();
  public static final String d = gmc.class.getName();
  public static final String e = gmg.class.getName();
  public static final String f = iwv.class.getName();
  private static cuf g;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    parammbb.a(gmc.class, new ctm(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    cuf localcuf = g;
    hrp[] arrayOfhrp = new hrp[2];
    arrayOfhrp[0] = new cuj("GPlusTopNavigationItems", new cug(localcuf));
    arrayOfhrp[1] = new cuj("GPlusBottomNavigationItems", new cuh(localcuf));
    parammbb.a(hrp.class, arrayOfhrp);
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    parammbb.a(gmg.class, new ctp(paramContext));
  }
  
  public static void b(mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    parammbb.a(ctu.class, new ctu());
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    parammbb.a(iwv.class, new cuc(paramContext));
  }
  
  public static void c(mbb parammbb)
  {
    if (g == null) {
      g = new cuf();
    }
    parammbb.a(glh.class, new iwg());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cui
 * JD-Core Version:    0.7.0.1
 */