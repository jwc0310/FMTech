import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class eza<K, V>
  extends ezj<K, V>
  implements Map<K, V>
{
  private ezd<K, V> d;
  
  private final ezd<K, V> b()
  {
    if (this.d == null) {
      this.d = new ezb(this);
    }
    return this.d;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    ezd localezd = b();
    if (localezd.a == null) {
      localezd.a = new ezf(localezd);
    }
    return localezd.a;
  }
  
  public Set<K> keySet()
  {
    ezd localezd = b();
    if (localezd.b == null) {
      localezd.b = new ezg(localezd);
    }
    return localezd.b;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.c + paramMap.size();
    if (this.a.length < i)
    {
      int[] arrayOfInt = this.a;
      Object[] arrayOfObject = this.b;
      super.a(i);
      if (this.c > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.a, 0, this.c);
        System.arraycopy(arrayOfObject, 0, this.b, 0, this.c << 1);
      }
      ezj.a(arrayOfInt, arrayOfObject, this.c);
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Collection<V> values()
  {
    ezd localezd = b();
    if (localezd.c == null) {
      localezd.c = new ezi(localezd);
    }
    return localezd.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eza
 * JD-Core Version:    0.7.0.1
 */