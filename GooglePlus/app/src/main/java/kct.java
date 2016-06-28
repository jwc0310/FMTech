import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

public class kct<RS extends qat>
  extends kbw
{
  private final String a;
  private final String b;
  public final RS w;
  public boolean x;
  
  protected kct(Context paramContext, kcg paramkcg, String paramString1, String paramString2, RS paramRS, String paramString3, String paramString4) {}
  
  public RS a(ByteBuffer paramByteBuffer)
  {
    if (this.w != null)
    {
      if (paramByteBuffer.hasArray()) {}
      byte[] arrayOfByte;
      for (qak localqak = new qak(paramByteBuffer.array(), paramByteBuffer.arrayOffset(), paramByteBuffer.limit());; localqak = new qak(arrayOfByte, 0, arrayOfByte.length))
      {
        this.w.a(localqak);
        this.x = true;
        return this.w;
        arrayOfByte = efj.a(paramByteBuffer);
      }
    }
    return null;
  }
  
  public final void a(ByteBuffer paramByteBuffer, String paramString)
  {
    a(paramByteBuffer);
    if (t()) {
      c(paramByteBuffer, efj.a(this.w));
    }
    a_(this.w);
  }
  
  public void a_(RS paramRS) {}
  
  public boolean a_(String paramString)
  {
    return this.m.b(paramString);
  }
  
  public void b(ByteBuffer paramByteBuffer, String paramString)
  {
    super.b(paramByteBuffer, paramString);
    if (Log.isLoggable("HttpOperation", 5))
    {
      String str = String.valueOf(new String(efj.a(paramByteBuffer), "UTF-8"));
      if (str.length() != 0) {
        "HttpOperation error: Response follows: \n".concat(str);
      }
    }
    else
    {
      return;
    }
    new String("HttpOperation error: Response follows: \n");
  }
  
  public String c()
  {
    return efj.a(this.j, this.b, u(), false, false, null);
  }
  
  public String d()
  {
    return "application/x-protobuf";
  }
  
  public final String k()
  {
    return this.a;
  }
  
  public String u()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kct
 * JD-Core Version:    0.7.0.1
 */