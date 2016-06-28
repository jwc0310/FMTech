import java.util.Iterator;
import java.util.Map.Entry;

final class kv
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  private int a;
  private int b;
  private boolean c = false;
  
  kv(kr paramkr)
  {
    this.a = (-1 + paramkr.a());
    this.b = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    if (!(paramObject instanceof Map.Entry)) {}
    Map.Entry localEntry;
    do
    {
      return false;
      localEntry = (Map.Entry)paramObject;
    } while ((!kn.a(localEntry.getKey(), this.d.a(this.b, 0))) || (!kn.a(localEntry.getValue(), this.d.a(this.b, 1))));
    return true;
  }
  
  public final K getKey()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 0);
  }
  
  public final V getValue()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, 1);
  }
  
  public final boolean hasNext()
  {
    return this.b < this.a;
  }
  
  public final int hashCode()
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    int j;
    if (localObject1 == null)
    {
      i = 0;
      j = 0;
      if (localObject2 != null) {
        break label69;
      }
    }
    for (;;)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69:
      j = localObject2.hashCode();
    }
  }
  
  public final void remove()
  {
    if (!this.c) {
      throw new IllegalStateException();
    }
    this.d.a(this.b);
    this.b = (-1 + this.b);
    this.a = (-1 + this.a);
    this.c = false;
  }
  
  public final V setValue(V paramV)
  {
    if (!this.c) {
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    return this.d.a(this.b, paramV);
  }
  
  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kv
 * JD-Core Version:    0.7.0.1
 */