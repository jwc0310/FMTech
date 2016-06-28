import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class iti
{
  private final Map<String, List<String>> a;
  
  public iti(Map<String, List<String>> paramMap)
  {
    this.a = Collections.unmodifiableMap(a(paramMap));
  }
  
  private static Map<String, List<String>> a(Map<String, List<String>> paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      if (str1 == null) {}
      for (String str2 = str1;; str2 = str1.toLowerCase(Locale.US))
      {
        localHashMap.put(str2, paramMap.get(str1));
        break;
      }
    }
    return localHashMap;
  }
  
  public final List<String> a(String paramString)
  {
    Map localMap = this.a;
    if (paramString == null) {}
    for (;;)
    {
      return (List)localMap.get(paramString);
      paramString = paramString.toLowerCase(Locale.US);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iti
 * JD-Core Version:    0.7.0.1
 */