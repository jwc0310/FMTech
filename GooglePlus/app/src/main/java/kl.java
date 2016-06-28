import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class kl<K, V>
  extends la<K, V>
  implements Map<K, V>
{
  private kr<K, V> d;
  
  public kl() {}
  
  public kl(int paramInt)
  {
    super(paramInt);
  }
  
  private final kr<K, V> a()
  {
    if (this.d == null) {
      this.d = new km(this);
    }
    return this.d;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    kr localkr = a();
    if (localkr.a == null) {
      localkr.a = new kt(localkr);
    }
    return localkr.a;
  }
  
  public Set<K> keySet()
  {
    kr localkr = a();
    if (localkr.b == null) {
      localkr.b = new ku(localkr);
    }
    return localkr.b;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    a(this.c + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    kr localkr = a();
    if (localkr.c == null) {
      localkr.c = new kw(localkr);
    }
    return localkr.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kl
 * JD-Core Version:    0.7.0.1
 */