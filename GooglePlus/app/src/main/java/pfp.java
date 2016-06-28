import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class pfp<E>
  extends AbstractCollection<E>
  implements Serializable
{
  int a(Object[] paramArrayOfObject, int paramInt)
  {
    pgc localpgc = (pgc)iterator();
    while (localpgc.hasNext())
    {
      Object localObject = localpgc.next();
      int i = paramInt + 1;
      paramArrayOfObject[paramInt] = localObject;
      paramInt = i;
    }
    return paramInt;
  }
  
  public abstract pgc<E> a();
  
  @Deprecated
  public final boolean add(E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean removeAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean retainAll(Collection<?> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object[] toArray()
  {
    int i = size();
    if (i == 0) {
      return pfz.a;
    }
    Object[] arrayOfObject = new Object[i];
    a(arrayOfObject, 0);
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT == null) {
      throw new NullPointerException();
    }
    int i = size();
    if (paramArrayOfT.length < i) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
    }
    for (;;)
    {
      a(paramArrayOfT, 0);
      return paramArrayOfT;
      if (paramArrayOfT.length > i) {
        paramArrayOfT[i] = null;
      }
    }
  }
  
  Object writeReplace()
  {
    return new pfs(toArray());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pfp
 * JD-Core Version:    0.7.0.1
 */