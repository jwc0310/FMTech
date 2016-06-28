public final class ald
  extends ale
{
  int a;
  private final int b;
  private final int[] c;
  
  public ald(akx paramakx, int paramInt, int[] paramArrayOfInt)
  {
    super(paramakx);
    this.b = paramInt;
    this.c = paramArrayOfInt;
  }
  
  public final int a()
  {
    return this.c.length / 2;
  }
  
  public final Integer a(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public final Object[] a(Integer paramInteger)
  {
    if ((paramInteger == null) || (paramInteger.intValue() < 0) || (paramInteger.intValue() >= this.c.length / 2)) {
      return null;
    }
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(this.c[(paramInteger.intValue() << 1)]);
    arrayOfInteger[1] = Integer.valueOf(this.c[(1 + (paramInteger.intValue() << 1))]);
    return arrayOfInteger;
  }
  
  public final String b(Integer paramInteger)
  {
    return this.d.b(this.b, paramInteger);
  }
  
  public final boolean c(Integer paramInteger)
  {
    return paramInteger.equals(Integer.valueOf(this.a));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ald
 * JD-Core Version:    0.7.0.1
 */