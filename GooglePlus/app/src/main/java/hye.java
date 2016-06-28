public final class hye
{
  public final long a;
  public final long b;
  
  public hye(long paramLong1, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public hye(hye paramhye)
  {
    this.a = paramhye.a;
    this.b = paramhye.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    hye localhye;
    do
    {
      do
      {
        return false;
        if (this == paramObject) {
          return true;
        }
      } while (!(paramObject instanceof hye));
      localhye = (hye)paramObject;
    } while ((this.a != localhye.a) || (this.b != localhye.b));
    return true;
  }
  
  public final int hashCode()
  {
    return 31 * (527 + (int)(this.a ^ this.a >>> 32)) + (int)(this.b ^ this.b >>> 32);
  }
  
  public final String toString()
  {
    long l1 = this.a;
    long l2 = this.b;
    return 41 + l1 + "/" + l2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hye
 * JD-Core Version:    0.7.0.1
 */