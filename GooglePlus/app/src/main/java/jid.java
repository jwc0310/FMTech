import android.content.Context;
import android.util.Log;

public final class jid
{
  private static final mcq a = new mcq("enable_people_logging");
  
  public static void a(Context paramContext, String paramString, int paramInt, fsh paramfsh)
  {
    if (!paramfsh.aN_().a()) {
      new kqe(paramString, paramInt, paramfsh.aN_().b()).b(paramContext);
    }
  }
  
  public static void a(String paramString1, String paramString2) {}
  
  public static boolean a()
  {
    return Log.isLoggable("PeopleService", 3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jid
 * JD-Core Version:    0.7.0.1
 */