import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class ika
  implements Comparator<nve>
{
  public final Map<String, Integer> a = new HashMap();
  
  private final int a(nve paramnve)
  {
    Integer localInteger = (Integer)this.a.get(paramnve.a);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    return 2147483647;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ika
 * JD-Core Version:    0.7.0.1
 */