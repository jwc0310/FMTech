public final class gwb
{
  public final String a;
  private final long b;
  private final long c;
  
  public gwb(long paramLong1, String paramString, long paramLong2)
  {
    this.b = paramLong1;
    this.a = paramString;
    this.c = paramLong2;
  }
  
  public final String toString()
  {
    long l1 = this.b;
    String str = this.a;
    long l2 = this.c;
    return 78 + String.valueOf(str).length() + "Batch {id: " + l1 + ", albumId: " + str + ", createdTime: " + l2 + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwb
 * JD-Core Version:    0.7.0.1
 */