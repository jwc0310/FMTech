import android.content.Context;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class cuo
  implements kbv
{
  public static final mcs a = new mcs("debug.plus.log_dump_for_test", (byte)0);
  private final kca b;
  
  public final void a(Context paramContext, String paramString1, ByteBuffer paramByteBuffer, String paramString2)
  {
    kca localkca = this.b;
    if (paramString2 != null)
    {
      String str = String.valueOf(paramString1).concat("_response");
      localkca.a(paramContext, efj.a(paramByteBuffer), kca.a.incrementAndGet(), localkca.a(str), paramString1, "_response");
    }
  }
  
  public final void a(Context paramContext, String paramString1, kbx paramkbx, int paramInt, Exception paramException, String paramString2) {}
  
  public final void a(Context paramContext, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    kca localkca = this.b;
    if (paramString2 != null)
    {
      String str = String.valueOf(paramString1).concat("_request");
      localkca.a(paramContext, paramArrayOfByte, kca.a.incrementAndGet(), localkca.a(str), paramString1, "_request");
    }
  }
  
  public final boolean a(String paramString)
  {
    return true;
  }
  
  public final boolean b(String paramString)
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuo
 * JD-Core Version:    0.7.0.1
 */