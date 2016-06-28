import android.accounts.AccountManager;
import android.content.Context;
import android.util.Pair;
import java.util.Collections;
import java.util.Map;

public final class kcz
{
  private static final Map<Pair<String, String>, String> a = Collections.synchronizedMap(new kl());
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    Pair localPair = new Pair(paramString1, paramString2);
    String str = (String)a.get(localPair);
    if (str == null)
    {
      str = efj.b(paramContext, paramString1, paramString2);
      a.put(localPair, str);
    }
    return str;
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2)
  {
    Pair localPair = new Pair(paramString1, paramString2);
    String str = (String)a.remove(localPair);
    if (str == null) {
      str = efj.b(paramContext, paramString1, paramString2);
    }
    AccountManager.get(paramContext).invalidateAuthToken("com.google", str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcz
 * JD-Core Version:    0.7.0.1
 */