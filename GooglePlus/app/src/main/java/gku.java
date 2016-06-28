import android.content.Context;

public final class gku
{
  public static final String a = gkr.class.getName();
  public static final String b = mcn.class.getName();
  private static gkt c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new gkt();
    }
    parammbb.a(gkr.class, new gks(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (c == null) {
      c = new gkt();
    }
    parammbb.a(mcn.class, new mcn[0]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gku
 * JD-Core Version:    0.7.0.1
 */