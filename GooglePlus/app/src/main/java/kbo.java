import java.io.Serializable;

public final class kbo
  implements Serializable
{
  private static final long serialVersionUID = 3145206267302890026L;
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final kbo f;
  
  public kbo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, null);
  }
  
  public kbo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, kbo paramkbo)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.f = paramkbo;
    this.e = paramString5;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbo
 * JD-Core Version:    0.7.0.1
 */