public final class bpu
  implements aip
{
  private final long a;
  
  public bpu(long paramLong)
  {
    this.a = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof bpu)) && (((bpu)paramObject).a == this.a);
  }
  
  public final int hashCode()
  {
    return 527 + (int)(this.a ^ this.a >>> 32);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpu
 * JD-Core Version:    0.7.0.1
 */