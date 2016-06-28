public final class ify
{
  final int a;
  final int b;
  final long c;
  private final ifz d;
  
  ify(int paramInt1, int paramInt2, long paramLong, ifz paramifz)
  {
    this.b = paramInt1;
    this.a = paramInt2;
    this.c = paramLong;
    this.d = paramifz;
  }
  
  ify(int paramInt1, int paramInt2, ifz paramifz)
  {
    this(paramInt1, paramInt2, paramInt1 * paramInt2 << 2, paramifz);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof ify))
    {
      ify localify = (ify)paramObject;
      return this.d.a(this, localify);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.d.a(this);
  }
  
  public final String toString()
  {
    int i = this.b;
    int j = this.a;
    return 35 + "BitmapKey(" + i + ", " + j + ")";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ify
 * JD-Core Version:    0.7.0.1
 */