import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class fpi<E>
  implements Collection<E>, Set<E>
{
  private static Object[] c;
  private static int d;
  private static Object[] e;
  private static int f;
  Object[] a;
  int b;
  private int[] g;
  private fpl<E, E> h;
  
  public fpi()
  {
    this.g = fpk.a;
    this.a = fpk.b;
    this.b = 0;
  }
  
  public fpi(int paramInt)
  {
    if (paramInt == 0)
    {
      this.g = fpk.a;
      this.a = fpk.b;
    }
    for (;;)
    {
      this.b = 0;
      return;
      b(paramInt);
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (f < 10)
        {
          paramArrayOfObject[0] = e;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int j = paramInt - 1; j >= 2; j--) {
            paramArrayOfObject[j] = null;
          }
          e = paramArrayOfObject;
          f = 1 + f;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int i = paramInt - 1; i >= 2; i--) {
            paramArrayOfObject[i] = null;
          }
          c = paramArrayOfObject;
          d = 1 + d;
        }
        return;
      }
      finally {}
    }
  }
  
  private final void b(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (e != null)
        {
          Object[] arrayOfObject2 = e;
          this.a = arrayOfObject2;
          e = (Object[])arrayOfObject2[0];
          this.g = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          f = -1 + f;
          return;
        }
        this.g = new int[paramInt];
        this.a = new Object[paramInt];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (c != null)
          {
            Object[] arrayOfObject1 = c;
            this.a = arrayOfObject1;
            c = (Object[])arrayOfObject1[0];
            this.g = ((int[])arrayOfObject1[1]);
            arrayOfObject1[1] = null;
            arrayOfObject1[0] = null;
            d = -1 + d;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  final int a()
  {
    int i = this.b;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = fpk.a(this.g, i, 0);
    } while ((j < 0) || (this.a[j] == null));
    for (int k = j + 1; (k < i) && (this.g[k] == 0); k++) {
      if (this.a[k] == null) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.g[j] != 0)) {
        break label102;
      }
      if (this.a[j] == null) {
        break;
      }
      j--;
    }
    label102:
    return k ^ 0xFFFFFFFF;
  }
  
  final int a(Object paramObject, int paramInt)
  {
    int i = this.b;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = fpk.a(this.g, i, paramInt);
    } while ((j < 0) || (paramObject.equals(this.a[j])));
    for (int k = j + 1; (k < i) && (this.g[k] == paramInt); k++) {
      if (paramObject.equals(this.a[k])) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.g[j] != paramInt)) {
        break label130;
      }
      if (paramObject.equals(this.a[j])) {
        break;
      }
      j--;
    }
    label130:
    return k ^ 0xFFFFFFFF;
  }
  
  public final E a(int paramInt)
  {
    int i = 8;
    Object localObject = this.a[paramInt];
    if (this.b <= 1)
    {
      a(this.g, this.a, this.b);
      this.g = fpk.a;
      this.a = fpk.b;
      this.b = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return localObject;
      if ((this.g.length <= i) || (this.b >= this.g.length / 3)) {
        break;
      }
      if (this.b > i) {
        i = this.b + (this.b >> 1);
      }
      arrayOfInt = this.g;
      arrayOfObject = this.a;
      b(i);
      this.b = (-1 + this.b);
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.a, 0, paramInt);
      }
    } while (paramInt >= this.b);
    System.arraycopy(arrayOfInt, paramInt + 1, this.g, paramInt, this.b - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1, this.a, paramInt, this.b - paramInt);
    return localObject;
    this.b = (-1 + this.b);
    if (paramInt < this.b)
    {
      System.arraycopy(this.g, paramInt + 1, this.g, paramInt, this.b - paramInt);
      System.arraycopy(this.a, paramInt + 1, this.a, paramInt, this.b - paramInt);
    }
    this.a[this.b] = null;
    return localObject;
  }
  
  public final boolean add(E paramE)
  {
    int i = 8;
    int k;
    int j;
    if (paramE == null)
    {
      k = a();
      j = 0;
    }
    while (k >= 0)
    {
      return false;
      j = paramE.hashCode();
      k = a(paramE, j);
    }
    int m = k ^ 0xFFFFFFFF;
    if (this.b >= this.g.length)
    {
      if (this.b < i) {
        break label225;
      }
      i = this.b + (this.b >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.a;
      b(i);
      if (this.g.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.a, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.b);
      if (m < this.b)
      {
        System.arraycopy(this.g, m, this.g, m + 1, this.b - m);
        System.arraycopy(this.a, m, this.a, m + 1, this.b - m);
      }
      this.g[m] = j;
      this.a[m] = paramE;
      this.b = (1 + this.b);
      return true;
      label225:
      if (this.b < 4) {
        i = 4;
      }
    }
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    boolean bool = false;
    int i = this.b + paramCollection.size();
    if (this.g.length < i)
    {
      int[] arrayOfInt = this.g;
      Object[] arrayOfObject = this.a;
      b(i);
      if (this.b > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.g, 0, this.b);
        System.arraycopy(arrayOfObject, 0, this.a, 0, this.b);
      }
      a(arrayOfInt, arrayOfObject, this.b);
    }
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      bool |= add(localIterator.next());
    }
    return bool;
  }
  
  public final void clear()
  {
    if (this.b != 0)
    {
      a(this.g, this.a, this.b);
      this.g = fpk.a;
      this.a = fpk.b;
      this.b = 0;
    }
  }
  
  public final boolean contains(Object paramObject)
  {
    if (paramObject == null) {
      if (a() < 0) {}
    }
    while (a(paramObject, paramObject.hashCode()) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      if (!contains(localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        Set localSet = (Set)paramObject;
        if (size() != localSet.size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.b)
          {
            boolean bool = localSet.contains(this.a[i]);
            if (!bool) {
              return false;
            }
            i++;
          }
          return false;
        }
        catch (NullPointerException localNullPointerException)
        {
          return false;
        }
        catch (ClassCastException localClassCastException)
        {
          return false;
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = 0;
    int[] arrayOfInt = this.g;
    int j = this.b;
    int k = 0;
    while (i < j)
    {
      k += arrayOfInt[i];
      i++;
    }
    return k;
  }
  
  public final boolean isEmpty()
  {
    return this.b <= 0;
  }
  
  public final Iterator<E> iterator()
  {
    if (this.h == null) {
      this.h = new fpj(this);
    }
    fpl localfpl = this.h;
    if (localfpl.a == null) {
      localfpl.a = new fpn(localfpl);
    }
    return localfpl.a.iterator();
  }
  
  public final boolean remove(Object paramObject)
  {
    if (paramObject == null) {}
    for (int i = a(); i >= 0; i = a(paramObject, paramObject.hashCode()))
    {
      a(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    boolean bool = false;
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      bool |= remove(localIterator.next());
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    int i = -1 + this.b;
    boolean bool = false;
    for (int j = i; j >= 0; j--) {
      if (!paramCollection.contains(this.a[j]))
      {
        a(j);
        bool = true;
      }
    }
    return bool;
  }
  
  public final int size()
  {
    return this.b;
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject = new Object[this.b];
    System.arraycopy(this.a, 0, arrayOfObject, 0, this.b);
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT.length < this.b) {}
    for (Object localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), this.b);; localObject = paramArrayOfT)
    {
      System.arraycopy(this.a, 0, localObject, 0, this.b);
      if (localObject.length > this.b) {
        localObject[this.b] = null;
      }
      return localObject;
    }
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(14 * this.b);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.b)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = this.a[i];
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fpi
 * JD-Core Version:    0.7.0.1
 */