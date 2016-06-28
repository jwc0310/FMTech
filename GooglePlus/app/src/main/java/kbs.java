import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;

public final class kbs
  implements kbv
{
  public static final mcq a = new mcq("debug.social.rpc.debug_log");
  
  private static boolean a(String paramString, int paramInt)
  {
    return (Log.isLoggable("HttpOperation", paramInt)) || (Log.isLoggable(efj.B(paramString), paramInt));
  }
  
  public final void a(Context paramContext, String paramString1, ByteBuffer paramByteBuffer, String paramString2)
  {
    if (paramString2 != null) {
      efj.b(2, "HttpOperation", paramString2);
    }
  }
  
  public final void a(Context paramContext, String paramString1, kbx paramkbx, int paramInt, Exception paramException, String paramString2) {}
  
  public final void a(Context paramContext, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    if (paramString2 != null) {
      efj.b(3, "HttpOperation", paramString2);
    }
  }
  
  public final boolean a(String paramString)
  {
    return a(paramString, 3);
  }
  
  public final boolean b(String paramString)
  {
    return a(paramString, 2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbs
 * JD-Core Version:    0.7.0.1
 */