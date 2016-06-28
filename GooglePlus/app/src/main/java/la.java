import java.util.Map;

public class la<K, V>
{
  private static Object[] d;
  private static int e;
  private static Object[] f;
  private static int g;
  public int[] a;
  public Object[] b;
  public int c;
  
  public la()
  {
    this.a = kn.a;
    this.b = kn.c;
    this.c = 0;
  }
  
  public la(int paramInt)
  {
    if (paramInt == 0)
    {
      this.a = kn.a;
      this.b = kn.c;
    }
    for (;;)
    {
      this.c = 0;
      return;
      c(paramInt);
    }
  }
  
  private int a()
  {
    int i = this.c;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = kn.a(this.a, i, 0);
    } while ((j < 0) || (this.b[(j << 1)] == null));
    for (int k = j + 1; (k < i) && (this.a[k] == 0); k++) {
      if (this.b[(k << 1)] == null) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.a[j] != 0)) {
        break label108;
      }
      if (this.b[(j << 1)] == null) {
        break;
      }
      j--;
    }
    label108:
    return k ^ 0xFFFFFFFF;
  }
  
  private int a(Object paramObject, int paramInt)
  {
    int i = this.c;
    int j;
    if (i == 0) {
      j = -1;
    }
    do
    {
      return j;
      j = kn.a(this.a, i, paramInt);
    } while ((j < 0) || (paramObject.equals(this.b[(j << 1)])));
    for (int k = j + 1; (k < i) && (this.a[k] == paramInt); k++) {
      if (paramObject.equals(this.b[(k << 1)])) {
        return k;
      }
    }
    j--;
    for (;;)
    {
      if ((j < 0) || (this.a[j] != paramInt)) {
        break label136;
      }
      if (paramObject.equals(this.b[(j << 1)])) {
        break;
      }
      j--;
    }
    label136:
    return k ^ 0xFFFFFFFF;
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (g < 10)
        {
          paramArrayOfObject[0] = f;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int j = -1 + (paramInt << 1); j >= 2; j--) {
            paramArrayOfObject[j] = null;
          }
          f = paramArrayOfObject;
          g = 1 + g;
        }
        return;
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int i = -1 + (paramInt << 1); i >= 2; i--) {
            paramArrayOfObject[i] = null;
          }
          d = paramArrayOfObject;
          e = 1 + e;
        }
        return;
      }
      finally {}
    }
  }
  
  private final void c(int paramInt)
  {
    if (paramInt == 8) {}
    for (;;)
    {
      try
      {
        if (f != null)
        {
          Object[] arrayOfObject2 = f;
          this.b = arrayOfObject2;
          f = (Object[])arrayOfObject2[0];
          this.a = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          g = -1 + g;
          return;
        }
        this.a = new int[paramInt];
        this.b = new Object[paramInt << 1];
        return;
      }
      finally {}
      if (paramInt == 4) {
        try
        {
          if (d != null)
          {
            Object[] arrayOfObject1 = d;
            this.b = arrayOfObject1;
            d = (Object[])arrayOfObject1[0];
            this.a = ((int[])arrayOfObject1[1]);
            arrayOfObject1[1] = null;
            arrayOfObject1[0] = null;
            e = -1 + e;
            return;
          }
        }
        finally {}
      }
    }
  }
  
  public final int a(Object paramObject)
  {
    if (paramObject == null) {
      return a();
    }
    return a(paramObject, paramObject.hashCode());
  }
  
  public final V a(int paramInt, V paramV)
  {
    int i = 1 + (paramInt << 1);
    Object localObject = this.b[i];
    this.b[i] = paramV;
    return localObject;
  }
  
  public final void a(int paramInt)
  {
    if (this.a.length < paramInt)
    {
      int[] arrayOfInt = this.a;
      Object[] arrayOfObject = this.b;
      c(paramInt);
      if (this.c > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.a, 0, this.c);
        System.arraycopy(arrayOfObject, 0, this.b, 0, this.c << 1);
      }
      a(arrayOfInt, arrayOfObject, this.c);
    }
  }
  
  final int b(Object paramObject)
  {
    int i = 1;
    int j = this.c << 1;
    Object[] arrayOfObject = this.b;
    if (paramObject == null) {
      while (i < j)
      {
        if (arrayOfObject[i] == null) {
          return i >> 1;
        }
        i += 2;
      }
    }
    do
    {
      i += 2;
      if (i >= j) {
        break;
      }
    } while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }
  
  public final V b(int paramInt)
  {
    int i = 8;
    Object localObject = this.b[(1 + (paramInt << 1))];
    if (this.c <= 1)
    {
      a(this.a, this.b, this.c);
      this.a = kn.a;
      this.b = kn.c;
      this.c = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return localObject;
      if ((this.a.length <= i) || (this.c >= this.a.length / 3)) {
        break;
      }
      if (this.c > i) {
        i = this.c + (this.c >> 1);
      }
      arrayOfInt = this.a;
      arrayOfObject = this.b;
      c(i);
      this.c = (-1 + this.c);
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.a, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.b, 0, paramInt << 1);
      }
    } while (paramInt >= this.c);
    System.arraycopy(arrayOfInt, paramInt + 1, this.a, paramInt, this.c - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.b, paramInt << 1, this.c - paramInt << 1);
    return localObject;
    this.c = (-1 + this.c);
    if (paramInt < this.c)
    {
      System.arraycopy(this.a, paramInt + 1, this.a, paramInt, this.c - paramInt);
      System.arraycopy(this.b, paramInt + 1 << 1, this.b, paramInt << 1, this.c - paramInt << 1);
    }
    this.b[(this.c << 1)] = null;
    this.b[(1 + (this.c << 1))] = null;
    return localObject;
  }
  
  public void clear()
  {
    if (this.c != 0)
    {
      a(this.a, this.b, this.c);
      this.a = kn.a;
      this.b = kn.c;
      this.c = 0;
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    return a(paramObject) >= 0;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return b(paramObject) >= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Map))
      {
        Map localMap = (Map)paramObject;
        if (size() != localMap.size()) {
          return false;
        }
        int i = 0;
        try
        {
          while (i < this.c)
          {
            Object localObject1 = this.b[(i << 1)];
            Object localObject2 = this.b[(1 + (i << 1))];
            Object localObject3 = localMap.get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null) {
                break label132;
              }
              if (!localMap.containsKey(localObject1)) {
                break label132;
              }
            }
            else
            {
              boolean bool = localObject2.equals(localObject3);
              if (!bool) {
                return false;
              }
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
    label132:
    return false;
  }
  
  public V get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return this.b[(1 + (i << 1))];
    }
    return null;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.a;
    Object[] arrayOfObject = this.b;
    int i = this.c;
    int j = 1;
    int k = 0;
    int m = 0;
    if (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      if (localObject == null) {}
      for (int i1 = 0;; i1 = localObject.hashCode())
      {
        m += (i1 ^ n);
        k++;
        j += 2;
        break;
      }
    }
    return m;
  }
  
  public boolean isEmpty()
  {
    return this.c <= 0;
  }
  
  public V put(K paramK, V paramV)
  {
    int i = 8;
    int k;
    int j;
    if (paramK == null)
    {
      k = a();
      j = 0;
    }
    while (k >= 0)
    {
      int n = 1 + (k << 1);
      Object localObject = this.b[n];
      this.b[n] = paramV;
      return localObject;
      j = paramK.hashCode();
      k = a(paramK, j);
    }
    int m = k ^ 0xFFFFFFFF;
    if (this.c >= this.a.length)
    {
      if (this.c < i) {
        break label275;
      }
      i = this.c + (this.c >> 1);
    }
    for (;;)
    {
      int[] arrayOfInt = this.a;
      Object[] arrayOfObject = this.b;
      c(i);
      if (this.a.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.a, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.b, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.c);
      if (m < this.c)
      {
        System.arraycopy(this.a, m, this.a, m + 1, this.c - m);
        System.arraycopy(this.b, m << 1, this.b, m + 1 << 1, this.c - m << 1);
      }
      this.a[m] = j;
      this.b[(m << 1)] = paramK;
      this.b[(1 + (m << 1))] = paramV;
      this.c = (1 + this.c);
      return null;
      label275:
      if (this.c < 4) {
        i = 4;
      }
    }
  }
  
  public V remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return b(i);
    }
    return null;
  }
  
  public int size()
  {
    return this.c;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(28 * this.c);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.c)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject1 = this.b[(i << 1)];
      if (localObject1 != this)
      {
        localStringBuilder.append(localObject1);
        label76:
        localStringBuilder.append('=');
        Object localObject2 = this.b[(1 + (i << 1))];
        if (localObject2 == this) {
          break label124;
        }
        localStringBuilder.append(localObject2);
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
        break label76;
        label124:
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     la
 * JD-Core Version:    0.7.0.1
 */