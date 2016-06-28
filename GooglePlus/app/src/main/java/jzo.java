import android.content.Context;

public final class jzo
{
  public static final String a = jza.class.getName();
  public static final String b = jyw.class.getName();
  private static jzn c;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new jzn();
    }
    parammbb.a(jza.class, new jzq(paramContext));
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (c == null) {
      c = new jzn();
    }
    parammbb.a(jyw.class, new jzk(paramContext));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jzo
 * JD-Core Version:    0.7.0.1
 */