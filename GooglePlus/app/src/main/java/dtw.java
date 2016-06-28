import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class dtw
  implements lpo
{
  private Context a;
  
  public dtw(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final ArrayList<Integer> a()
  {
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(380);
    return new ArrayList(Arrays.asList(arrayOfInteger));
  }
  
  public final kx<byte[], Long> a(qbe paramqbe)
  {
    qef localqef = (qef)paramqbe.b(qef.a);
    if (localqef != null)
    {
      dtq localdtq = new dtq(this.a, localqef, paramqbe.b);
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
      DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
      dtq.a(localDataOutputStream, localdtq.a);
      dtq.a(localDataOutputStream, localdtq.b);
      dtq.a(localDataOutputStream, localdtq.c);
      dtq.a(localDataOutputStream, localdtq.d);
      dtq.a(localDataOutputStream, localdtq.e);
      localDataOutputStream.writeInt(localdtq.f);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return new kx(arrayOfByte, Long.valueOf(1048576L));
    }
    return null;
  }
  
  public final lpi a(Context paramContext)
  {
    return new dtu(paramContext);
  }
  
  public final boolean a(long paramLong)
  {
    return (0x100000 & paramLong) != 0L;
  }
  
  public final ArrayList<Integer> b(int paramInt)
  {
    return new ArrayList();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtw
 * JD-Core Version:    0.7.0.1
 */