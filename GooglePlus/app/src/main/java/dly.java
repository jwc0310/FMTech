import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class dly<K, V>
  extends LinkedHashMap<K, V>
{
  private static final long serialVersionUID = -6900062515533251306L;
  
  protected final boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    return size() > 32;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dly
 * JD-Core Version:    0.7.0.1
 */