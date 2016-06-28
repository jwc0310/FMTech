final class ltd
  extends ltl
{
  private final long a;
  private final String b;
  private final long c;
  
  ltd(long paramLong1, String paramString, long paramLong2)
  {
    this.a = paramLong1;
    if (paramString == null) {
      throw new NullPointerException("Null content");
    }
    this.b = paramString;
    this.c = paramLong2;
  }
  
  final long a()
  {
    return this.a;
  }
  
  final String b()
  {
    return this.b;
  }
  
  final long c()
  {
    return this.c;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ltl localltl;
    do
    {
      return true;
      if (!(paramObject instanceof ltl)) {
        break;
      }
      localltl = (ltl)paramObject;
    } while ((this.a == localltl.a()) && (this.b.equals(localltl.b())) && (this.c == localltl.c()));
    return false;
    return false;
  }
  
  public final int hashCode()
  {
    return (int)(1000003 * (1000003 * (int)(0xF4243 ^ this.a >>> 32 ^ this.a) ^ this.b.hashCode()) ^ this.c >>> 32 ^ this.c);
  }
  
  public final String toString()
  {
    String str1 = String.valueOf("Item{id=");
    long l1 = this.a;
    String str2 = this.b;
    long l2 = this.c;
    return 58 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + l1 + ", content=" + str2 + ", time=" + l2 + "}";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltd
 * JD-Core Version:    0.7.0.1
 */