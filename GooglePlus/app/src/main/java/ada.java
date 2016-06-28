final class ada
{
  int a;
  int b;
  Object c;
  int d;
  
  ada(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramInt3;
    this.c = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ada localada;
    do
    {
      do
      {
        do
        {
          return true;
          if ((paramObject == null) || (getClass() != paramObject.getClass())) {
            return false;
          }
          localada = (ada)paramObject;
          if (this.a != localada.a) {
            return false;
          }
        } while ((this.a == 3) && (Math.abs(this.d - this.b) == 1) && (this.d == localada.b) && (this.b == localada.d));
        if (this.d != localada.d) {
          return false;
        }
        if (this.b != localada.b) {
          return false;
        }
        if (this.c == null) {
          break;
        }
      } while (this.c.equals(localada.c));
      return false;
    } while (localada.c == null);
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * this.a + this.b) + this.d;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
    String str;
    switch (this.a)
    {
    default: 
      str = "??";
    }
    for (;;)
    {
      return str + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
      str = "add";
      continue;
      str = "rm";
      continue;
      str = "up";
      continue;
      str = "mv";
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ada
 * JD-Core Version:    0.7.0.1
 */