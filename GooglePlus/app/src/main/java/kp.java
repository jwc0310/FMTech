public final class kp<E>
  implements Cloneable
{
  public static final Object a = new Object();
  public boolean b = false;
  public long[] c;
  public Object[] d;
  public int e;
  
  public kp()
  {
    this(10);
  }
  
  private kp(int paramInt)
  {
    int i = kn.b(10);
    this.c = new long[i];
    this.d = new Object[i];
    this.e = 0;
  }
  
  private kp<E> d()
  {
    try
    {
      kp localkp = (kp)super.clone();
      return localkp;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        localkp.c = ((long[])this.c.clone());
        localkp.d = ((Object[])this.d.clone());
        return localkp;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public final long a(int paramInt)
  {
    if (this.b) {
      a();
    }
    return this.c[paramInt];
  }
  
  public final E a(long paramLong)
  {
    int i = kn.a(this.c, this.e, paramLong);
    if ((i < 0) || (this.d[i] == a)) {
      return null;
    }
    return this.d[i];
  }
  
  public final void a()
  {
    int i = this.e;
    long[] arrayOfLong = this.c;
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
          arrayOfLong[k] = arrayOfLong[j];
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
  
  public final void a(long paramLong, E paramE)
  {
    int i = kn.a(this.c, this.e, paramLong);
    if (i >= 0)
    {
      this.d[i] = paramE;
      return;
    }
    int j = i ^ 0xFFFFFFFF;
    if ((j < this.e) && (this.d[j] == a))
    {
      this.c[j] = paramLong;
      this.d[j] = paramE;
      return;
    }
    if ((this.b) && (this.e >= this.c.length))
    {
      a();
      j = 0xFFFFFFFF ^ kn.a(this.c, this.e, paramLong);
    }
    if (this.e >= this.c.length)
    {
      int k = kn.c(1 + this.e << 3) / 8;
      long[] arrayOfLong = new long[k];
      Object[] arrayOfObject = new Object[k];
      System.arraycopy(this.c, 0, arrayOfLong, 0, this.c.length);
      System.arraycopy(this.d, 0, arrayOfObject, 0, this.d.length);
      this.c = arrayOfLong;
      this.d = arrayOfObject;
    }
    if (this.e - j != 0)
    {
      System.arraycopy(this.c, j, this.c, j + 1, this.e - j);
      System.arraycopy(this.d, j, this.d, j + 1, this.e - j);
    }
    this.c[j] = paramLong;
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
  
  public final E b(int paramInt)
  {
    if (this.b) {
      a();
    }
    return this.d[paramInt];
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
      localStringBuilder.append(a(i));
      localStringBuilder.append('=');
      Object localObject = b(i);
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
 * Qualified Name:     kp
 * JD-Core Version:    0.7.0.1
 */