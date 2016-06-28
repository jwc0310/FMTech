import android.content.Context;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class iyg
  implements iyf
{
  private static final Pattern a = Pattern.compile("([a-z0-9-]+)\\.[a-z0-9-]+\\.com");
  private static final Pattern[] b;
  private static final mcq c = new mcq("debug.plus.image_metrics");
  private final Context d;
  private ixr e;
  
  static
  {
    Pattern[] arrayOfPattern = new Pattern[5];
    arrayOfPattern[0] = Pattern.compile(".*/(.+)?/.+\\..{3,4}+");
    arrayOfPattern[1] = Pattern.compile("/[^=\\?]*=(.*)");
    arrayOfPattern[2] = Pattern.compile("/gadgets/proxy\\?(.+)\\&url=.+");
    arrayOfPattern[3] = Pattern.compile("/gadgets/proxy\\?(.+[^\\&url=])");
    arrayOfPattern[4] = Pattern.compile("/-[^/]+/[^/]+/[^/]+/[^/]+/([a-z0-9-^/]+)/[^/]+?$");
    b = arrayOfPattern;
  }
  
  iyg(Context paramContext)
  {
    this.d = paramContext;
  }
  
  private static String a(String paramString1, String paramString2)
  {
    localObject1 = "";
    for (;;)
    {
      try
      {
        URL localURL = new URL(paramString1);
        Matcher localMatcher1 = a.matcher(localURL.getHost());
        if (localMatcher1.matches())
        {
          localObject1 = String.valueOf(localMatcher1.group(1)).concat("/");
          j = 0;
          if (j < b.length)
          {
            Matcher localMatcher2 = b[j].matcher(localURL.getFile());
            if (!localMatcher2.matches()) {
              continue;
            }
            String str8 = String.valueOf(localObject1);
            String str9 = String.valueOf(localMatcher2.group(1));
            String str10 = 1 + String.valueOf(str8).length() + String.valueOf(str9).length() + str8 + str9 + "/";
            localObject1 = str10;
          }
        }
      }
      catch (MalformedURLException localMalformedURLException)
      {
        int j;
        int i;
        String str4;
        String str5;
        Object localObject2 = localObject1;
        if (!Log.isLoggable("NetworkLoggerImpl", 6)) {
          continue;
        }
        String str6 = String.valueOf(paramString1);
        if (str6.length() == 0) {
          continue;
        }
        String str7 = "Couldn't parse url:".concat(str6);
        Log.e("NetworkLoggerImpl", str7);
        localObject1 = localObject2;
        continue;
        str7 = new String("Couldn't parse url:");
        continue;
        String str3 = new String(str4);
        continue;
        String str1 = String.valueOf(localObject1);
        String str2 = String.valueOf(paramString2);
        if (str2.length() == 0) {
          continue;
        }
        str3 = str1.concat(str2);
        continue;
        str3 = new String(str1);
        continue;
      }
      i = paramString2.indexOf(';');
      if (i <= 0) {
        continue;
      }
      str4 = String.valueOf(localObject1);
      str5 = String.valueOf(paramString2.substring(0, i));
      if (str5.length() == 0) {
        continue;
      }
      str3 = str4.concat(str5);
      if (Log.isLoggable("NetworkLoggerImpl", 3)) {
        new StringBuilder(14 + String.valueOf(paramString1).length() + String.valueOf(str3).length()).append("Sanitized:").append(paramString1).append(" to:").append(str3);
      }
      return str3;
      j++;
    }
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, long paramLong4, int paramInt2, String paramString3)
  {
    List localList = ((giz)mbb.a(this.d, giz.class)).a(new String[] { "logged_in" });
    boolean bool = localList.isEmpty();
    String str = null;
    if (!bool)
    {
      if (paramInt1 == -1) {
        paramInt1 = ((Integer)localList.get(0)).intValue();
      }
      str = ((giz)mbb.a(this.d, giz.class)).a(paramInt1).b("account_name");
    }
    this.e = ((ixr)mbb.b(this.d, ixr.class));
    if (this.e != null)
    {
      ixr localixr = this.e;
      String[] arrayOfString = new String[1];
      arrayOfString[0] = a(paramString1, paramString2);
      localixr.a(new ixt(1, arrayOfString, str, paramLong1, paramLong2, paramLong3, 0L, paramLong4, paramInt2, paramString3));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iyg
 * JD-Core Version:    0.7.0.1
 */