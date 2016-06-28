import android.content.Context;
import java.nio.ByteBuffer;

public abstract interface kbv
{
  public abstract void a(Context paramContext, String paramString1, ByteBuffer paramByteBuffer, String paramString2);
  
  public abstract void a(Context paramContext, String paramString1, kbx paramkbx, int paramInt, Exception paramException, String paramString2);
  
  public abstract void a(Context paramContext, String paramString1, byte[] paramArrayOfByte, String paramString2);
  
  public abstract boolean a(String paramString);
  
  public abstract boolean b(String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kbv
 * JD-Core Version:    0.7.0.1
 */