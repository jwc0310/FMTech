import java.io.Serializable;

final class cpj
  implements Serializable
{
  String a;
  int b;
  String c;
  
  public cpj(String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.c = paramString2;
    this.b = paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cpj
 * JD-Core Version:    0.7.0.1
 */