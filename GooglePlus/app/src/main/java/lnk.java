public final class lnk
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  private String e;
  
  lnk(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this.b = paramString1;
    this.a = paramString2;
    this.e = paramString3;
    this.c = paramString4;
    this.d = paramString5;
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.a;
    arrayOfObject[2] = this.e;
    arrayOfObject[3] = this.c;
    arrayOfObject[4] = this.d;
    return String.format("DeepLinkInstall: authorName=%s, appName=%s, packageName=%s, launchSource=%s, data=%s", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnk
 * JD-Core Version:    0.7.0.1
 */