import android.content.Context;
import java.nio.ByteBuffer;

public final class lti
  implements kbv
{
  public final void a(Context paramContext, String paramString1, ByteBuffer paramByteBuffer, String paramString2) {}
  
  public final void a(Context paramContext, String paramString1, kbx paramkbx, int paramInt, Exception paramException, String paramString2)
  {
    int i = ((giz)mbb.a(paramContext, giz.class)).a(paramString1);
    lta locallta = (lta)mbb.a(paramContext, lta.class);
    String str1 = String.valueOf("Rpc[start]: ");
    String str2 = String.valueOf(paramkbx.b());
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      locallta.a(i, 1L, 1L, str3, paramkbx.b);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramkbx.b();
      arrayOfObject[1] = Long.valueOf(paramkbx.g());
      arrayOfObject[2] = Long.valueOf(paramkbx.f());
      locallta.a(i, 1L, 1L, String.format("Rpc[end] - %s, bytes sent: %d, bytes received: %d", arrayOfObject), paramkbx.e);
      return;
    }
  }
  
  public final void a(Context paramContext, String paramString1, byte[] paramArrayOfByte, String paramString2) {}
  
  public final boolean a(String paramString)
  {
    return false;
  }
  
  public final boolean b(String paramString)
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lti
 * JD-Core Version:    0.7.0.1
 */