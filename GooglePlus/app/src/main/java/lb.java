public final class lb<E>
  implements Cloneable
{
  public static final Object a = new Object();
  public boolean b = false;
  public int[] c;
  public Object[] d;
  public int e;
  
  public lb()
  {
    this(10);
  }
  
  public lb(int paramInt)
  {
    if (paramInt == 0) {
      this.c = kn.a;
    }
    int i;
    for (this.d = kn.c;; this.d = new Object[i])
    {
      this.e = 0;
      return;
      i = kn.a(paramInt);
      this.c = new int[i];
    }
  }
  
  private lb<E> d()
  {
    try
    {
      lb locallb = (lb)super.clone();
      return locallb;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        locallb.c = ((int[])this.c.clone());
        locallb.d = ((Object[])this.d.clone());
        return locallb;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public final E a(int paramInt)
  {
    int i = kn.a(this.c, this.e, paramInt);
    if ((i < 0) || (this.d[i] == a)) {
      return null;
    }
    return this.d[i];
  }
  
  public final void a()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (localObject != a)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    int i = Math.min(this.e, paramInt1 + paramInt2);
    while (paramInt1 < i)
    {
      c(paramInt1);
      paramInt1++;
    }
  }
  
  public final void a(int paramInt, E paramE)
  {
    int i = kn.a(this.c, this.e, paramInt);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramInt;
      this.d[j] = paramE;
      return;
    }
    if ((this.b) && (this.e >= this.c.length))
    {
      a();
      j = 0xFFFFFFFF ^ kn.a(this.c, this.e, paramInt);
    }
    if (this.e >= this.c.length)
    {
      int k = kn.c(1 + this.e << 2) / 4;
      int[] arrayOfInt = new int[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfInt, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfInt;
      this.d = arrayOfObject;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramInt;
    this.d[j] = paramE;
    this.e = (1 + this.e);
  }
  
  public final int b()
  {
    if (this.b) {
      a();
    }
    return this.e;
  }
  
  public final void b(int paramInt)
  {
    int i = kn.a(this.c, this.e, paramInt);
    if ((i >= 0) && (this.d[i] != a))
    {
      this.d[i] = a;
      this.b = true;
    }
  }
  
  public final void c()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = null;
    }
    this.e = 0;
    this.b = false;
  }
  
  public final void c(int paramInt)
  {
    if (this.d[paramInt] != a)
    {
      this.d[paramInt] = a;
      this.b = true;
    }
  }
  
  public final int d(int paramInt)
  {
    if (this.b) {
      a();
    }
    return this.c[paramInt];
  }
  
  public final E e(int paramInt)
  {
    if (this.b) {
      a();
    }
    return this.d[paramInt];
  }
  
  public final int f(int paramInt)
  {
    if (this.b) {
      a();
    }
    return kn.a(this.c, this.e, paramInt);
  }
  
  public final String toString()
  {
    if (this.b) {
      a();
    }
    if (this.e <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(28 * this.e);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.e)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(d(i));
      localStringBuilder.append('=');
      Object localObject = e(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      }
      for (;;)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lb
 * JD-Core Version:    0.7.0.1
 */