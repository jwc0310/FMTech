import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class aio
{
  public static String a(String paramString, Map<String, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString).append("?");
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = (String)paramMap.get(str1);
      localStringBuilder.append(str1).append("=").append(str2).append("&");
    }
    if (localStringBuilder.charAt(-1 + localStringBuilder.length()) == '&') {
      localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aio
 * JD-Core Version:    0.7.0.1
 */