import android.app.Application;
import android.content.Context;

public final class hqb
{
  public static final String a = hpy.class.getName();
  private static hqa b;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (b == null) {
      b = new hqa();
    }
    if (!(paramContext instanceof Application)) {
      throw new IllegalArgumentException("ConsistencyTokenManager should always be instantiated from the application context");
    }
    parammbb.a(hpy.class, new hpy());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqb
 * JD-Core Version:    0.7.0.1
 */