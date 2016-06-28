import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class iau
  extends LinkedHashMap<K, V>
{
  iau(iat paramiat, int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2)
  {
    super(16, 0.75F, true);
  }
  
  protected final boolean removeEldestEntry(Map.Entry<K, V> paramEntry)
  {
    return size() > this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iau
 * JD-Core Version:    0.7.0.1
 */