public final class hyf
{
  public final String a;
  public final String b;
  public final int c;
  public final String d;
  public final mfl e;
  
  public hyf(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    if (paramString1.length() > 31) {
      throw new IllegalArgumentException(25 + String.valueOf(paramString1).length() + "\"" + paramString1 + "\".length() > 31");
    }
    this.a = paramString1;
    this.b = paramString2;
    this.d = paramString3;
    this.c = paramInt;
    this.e = new mfl(paramString1, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hyf
 * JD-Core Version:    0.7.0.1
 */