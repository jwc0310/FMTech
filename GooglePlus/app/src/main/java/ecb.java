import java.util.HashMap;
import java.util.Map;

final class ecb
{
  final Map<String, String> a = new HashMap();
  final Map<String, String> b = new HashMap();
  private final Map<String, Integer> c = new HashMap();
  
  public final int a(String paramString)
  {
    Integer localInteger = (Integer)this.c.get(paramString);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    return 0;
  }
  
  public final ecb a(String paramString1, String paramString2, int paramInt)
  {
    this.a.put(paramString1, paramString2);
    this.b.put(paramString2, paramString1);
    this.c.put(paramString1, Integer.valueOf(paramInt));
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecb
 * JD-Core Version:    0.7.0.1
 */