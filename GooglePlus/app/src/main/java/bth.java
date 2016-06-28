public final class bth
{
  final int a;
  final String b;
  final int c;
  final String d;
  final long e;
  
  public bth(int paramInt1, String paramString1, int paramInt2, String paramString2, long paramLong)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramString2;
    this.e = paramLong;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(btl.a(this.c));
    long l = this.e;
    String str2 = this.b;
    return 26 + String.valueOf(str1).length() + String.valueOf(str2).length() + "[" + str1 + ", " + l + ", " + str2 + "]";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bth
 * JD-Core Version:    0.7.0.1
 */