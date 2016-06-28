import java.util.Map;

final class fpj
  extends fpl<E, E>
{
  fpj(fpi paramfpi) {}
  
  protected final int a()
  {
    return this.b.b;
  }
  
  protected final int a(Object paramObject)
  {
    if (paramObject == null) {
      return this.b.a();
    }
    return this.b.a(paramObject, paramObject.hashCode());
  }
  
  protected final Object a(int paramInt)
  {
    return this.b.a[paramInt];
  }
  
  protected final Map<E, E> b()
  {
    throw new UnsupportedOperationException("not a map");
  }
  
  protected final void b(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  protected final void c()
  {
    this.b.clear();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpj
 * JD-Core Version:    0.7.0.1
 */