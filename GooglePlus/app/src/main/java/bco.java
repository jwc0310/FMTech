import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class bco
{
  private static final long a = TimeUnit.MINUTES.toMillis(5L);
  
  private static long b(String paramString)
  {
    String str1 = efj.d(paramString, "expire");
    String str2;
    try
    {
      long l1 = TimeUnit.SECONDS.toMillis(Long.parseLong(str1));
      long l2 = System.currentTimeMillis();
      return l1 - l2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      str2 = String.valueOf(str1);
      if (str2.length() == 0) {
        break label54;
      }
    }
    "Couldn't parse expire param: ".concat(str2);
    for (;;)
    {
      return 9223372036854775807L;
      label54:
      new String("Couldn't parse expire param: ");
    }
  }
  
  public final boolean a(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (b(paramString) < a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bco
 * JD-Core Version:    0.7.0.1
 */