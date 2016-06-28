public final class hpd
{
  public final String a;
  final String b;
  final int c;
  final int d;
  final boolean e;
  
  public hpd(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this(paramInt1, paramString1, paramString2, paramInt2, false);
  }
  
  public hpd(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.c = paramInt1;
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramInt2;
    this.e = paramBoolean;
  }
  
  public final String toString()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpd
 * JD-Core Version:    0.7.0.1
 */