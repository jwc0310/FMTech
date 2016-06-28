import android.content.Context;

public final class hvt
{
  public static final String a = hvu.class.getName();
  public static final String b = ibz.class.getName();
  private static hvs c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new hvs();
    }
    parammbb.a(hvu.class, new hvu(paramContext));
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new hvs();
    }
    ibz[] arrayOfibz = new ibz[1];
    arrayOfibz[0] = new hwf(paramContext);
    parammbb.a(ibz.class, arrayOfibz);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvt
 * JD-Core Version:    0.7.0.1
 */