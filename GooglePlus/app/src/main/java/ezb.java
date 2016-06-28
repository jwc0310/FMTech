import java.util.Map;

final class ezb
  extends ezd<K, V>
{
  ezb(eza parameza) {}
  
  protected final int a()
  {
    return this.d.c;
  }
  
  protected final int a(Object paramObject)
  {
    if (paramObject == null) {
      return this.d.a();
    }
    return this.d.a(paramObject, paramObject.hashCode());
  }
  
  protected final Object a(int paramInt1, int paramInt2)
  {
    return this.d.b[(paramInt2 + (paramInt1 << 1))];
  }
  
  protected final V a(int paramInt, V paramV)
  {
    eza localeza = this.d;
    int i = 1 + (paramInt << 1);
    Object localObject = localeza.b[i];
    localeza.b[i] = paramV;
    return localObject;
  }
  
  protected final void a(int paramInt)
  {
    this.d.b(paramInt);
  }
  
  protected final void a(K paramK, V paramV)
  {
    this.d.put(paramK, paramV);
  }
  
  protected final int b(Object paramObject)
  {
    return this.d.a(paramObject);
  }
  
  protected final Map<K, V> b()
  {
    return this.d;
  }
  
  protected final void c()
  {
    this.d.clear();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezb
 * JD-Core Version:    0.7.0.1
 */