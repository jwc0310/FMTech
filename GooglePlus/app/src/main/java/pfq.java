import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class pfq<E>
  extends pfp<E>
  implements List<E>, RandomAccess
{
  public static <E> pfq<E> a(E[] paramArrayOfE)
  {
    switch (paramArrayOfE.length)
    {
    default: 
      Object[] arrayOfObject = (Object[])paramArrayOfE.clone();
      return new pga(pfz.a(arrayOfObject, arrayOfObject.length));
    case 0: 
      return pga.a;
    }
    return new pgb(paramArrayOfE[0]);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  int a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = size();
    for (int j = 0; j < i; j++) {
      paramArrayOfObject[(j + 0)] = get(j);
    }
    return i + 0;
  }
  
  public pfq<E> a(int paramInt1, int paramInt2)
  {
    aau.a(paramInt1, paramInt2, size());
    int i = paramInt2 - paramInt1;
    if (i == size()) {
      return this;
    }
    switch (i)
    {
    default: 
      return b(paramInt1, paramInt2);
    case 0: 
      return pga.a;
    }
    return new pgb(get(paramInt1));
  }
  
  public pgc<E> a()
  {
    return (pgd)listIterator();
  }
  
  public pgd<E> a(int paramInt)
  {
    return new pfr(this, size(), paramInt);
  }
  
  @Deprecated
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException();
  }
  
  pfq<E> b(int paramInt1, int paramInt2)
  {
    return new pft(this, paramInt1, paramInt2 - paramInt1);
  }
  
  public boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == null) {
      throw new NullPointerException();
    }
    if (paramObject == this) {}
    List localList;
    for (;;)
    {
      return true;
      if (!(paramObject instanceof List)) {
        return false;
      }
      localList = (List)paramObject;
      int i = size();
      if (i != localList.size()) {
        return false;
      }
      if ((!(this instanceof RandomAccess)) || (!(localList instanceof RandomAccess))) {
        break;
      }
      for (int j = 0; j < i; j++) {
        if (!aau.a(get(j), localList.get(j))) {
          return false;
        }
      }
    }
    return pfu.a(iterator(), localList.iterator());
  }
  
  public int hashCode()
  {
    int i = 1;
    int j = size();
    for (int k = 0; k < j; k++) {
      i = 0xFFFFFFFF ^ 0xFFFFFFFF ^ i * 31 + get(k).hashCode();
    }
    return i;
  }
  
  public int indexOf(Object paramObject)
  {
    int i = -1;
    int k;
    int j;
    if (paramObject != null) {
      if ((this instanceof RandomAccess))
      {
        k = size();
        j = 0;
        if (paramObject == null) {
          if (j < k) {
            if (get(j) != null) {
              break label47;
            }
          }
        }
      }
    }
    for (;;)
    {
      i = j;
      label47:
      do
      {
        return i;
        j++;
        break;
        j++;
      } while (j >= k);
      if (paramObject.equals(get(j)))
      {
        continue;
        ListIterator localListIterator = listIterator();
        while (localListIterator.hasNext()) {
          if (aau.a(paramObject, localListIterator.next())) {
            return localListIterator.previousIndex();
          }
        }
        j = i;
      }
    }
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i = -1;
    int j;
    if (paramObject != null) {
      if ((this instanceof RandomAccess)) {
        if (paramObject == null)
        {
          j = -1 + size();
          if (j >= 0) {
            if (get(j) != null) {
              break label44;
            }
          }
        }
      }
    }
    for (;;)
    {
      i = j;
      label44:
      label81:
      for (;;)
      {
        return i;
        j--;
        break;
        for (j = -1 + size();; j--)
        {
          if (j < 0) {
            break label81;
          }
          if (paramObject.equals(get(j))) {
            break;
          }
        }
      }
      ListIterator localListIterator = listIterator(size());
      while (localListIterator.hasPrevious()) {
        if (aau.a(paramObject, localListIterator.previous())) {
          return localListIterator.nextIndex();
        }
      }
      j = i;
    }
  }
  
  @Deprecated
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException();
  }
  
  Object writeReplace()
  {
    return new pfs(toArray());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pfq
 * JD-Core Version:    0.7.0.1
 */