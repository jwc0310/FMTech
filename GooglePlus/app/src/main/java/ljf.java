public final class ljf
{
  public final String a;
  public final long b;
  public final int c;
  private final String d;
  
  public ljf(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    this.d = paramString1;
    this.c = paramInt;
    this.b = paramLong;
    this.a = paramString2;
  }
  
  public final String toString()
  {
    String str1 = this.d;
    int i = this.c;
    long l = this.b;
    String str2 = this.a;
    return 104 + String.valueOf(str1).length() + String.valueOf(str2).length() + "StreamViewInfo [streamId: `" + str1 + "`; streamViewId: `" + i + "`; timestamp: `" + l + "`; token: `" + str2 + "`]";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljf
 * JD-Core Version:    0.7.0.1
 */