import android.content.Context;

public final class gwm
{
  public static final String a = gwc.class.getName();
  public static final String b = gwp.class.getName();
  public static final String c = gwa.class.getName();
  public static final String d = gwi.class.getName();
  public static final String e = gwg.class.getName();
  public static final String f = hsa.class.getName();
  private static gwl g;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    parammbb.a(gwc.class, new gwc(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    hsa[] arrayOfhsa = new hsa[1];
    arrayOfhsa[0] = new gwk();
    parammbb.a(hsa.class, arrayOfhsa);
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    parammbb.a(gwp.class, new gwp(paramContext));
  }
  
  public static void c(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    parammbb.a(gwa.class, new gwu(paramContext));
  }
  
  public static void d(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    parammbb.a(gwi.class, new gwi(paramContext));
  }
  
  public static void e(Context paramContext, mbb parammbb)
  {
    if (g == null) {
      g = new gwl();
    }
    parammbb.a(gwg.class, new gwg(paramContext));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwm
 * JD-Core Version:    0.7.0.1
 */