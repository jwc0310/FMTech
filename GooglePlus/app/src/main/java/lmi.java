import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class lmi
  extends mab
  implements hev
{
  public String a;
  public String b;
  public String c;
  public boolean d;
  private String e;
  private String f;
  
  protected lmi() {}
  
  public lmi(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, String paramString5)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.e = paramString3;
    this.c = paramString4;
    this.d = paramBoolean;
    this.f = paramString5;
  }
  
  public static lmi a(ByteBuffer paramByteBuffer)
  {
    int i = 1;
    String str1 = d(paramByteBuffer);
    String str2 = d(paramByteBuffer);
    String str3 = d(paramByteBuffer);
    String str4 = d(paramByteBuffer);
    if (paramByteBuffer.getInt() == i) {}
    for (;;)
    {
      return new lmi(str1, str2, str3, str4, i, d(paramByteBuffer));
      int j = 0;
    }
  }
  
  public static void a(lmi paramlmi, DataOutputStream paramDataOutputStream)
  {
    a(paramDataOutputStream, paramlmi.a);
    a(paramDataOutputStream, paramlmi.b);
    a(paramDataOutputStream, paramlmi.e);
    a(paramDataOutputStream, paramlmi.c);
    if (paramlmi.d) {}
    for (int i = 1;; i = 0)
    {
      paramDataOutputStream.writeInt(i);
      a(paramDataOutputStream, paramlmi.f);
      return;
    }
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.f;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmi
 * JD-Core Version:    0.7.0.1
 */