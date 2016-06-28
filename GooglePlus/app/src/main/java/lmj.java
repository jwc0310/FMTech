import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class lmj
  extends mab
  implements hew
{
  public String a;
  public int b;
  public boolean c;
  
  public lmj() {}
  
  public lmj(String paramString, int paramInt, boolean paramBoolean)
  {
    this.a = paramString;
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  public lmj(oks paramoks)
  {
    this(paramoks.a, efj.a(paramoks.e), efj.b(paramoks.c));
  }
  
  public static lmj a(byte[] paramArrayOfByte)
  {
    int i = 1;
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    String str = d(localByteBuffer);
    int k = localByteBuffer.getInt();
    if (localByteBuffer.get() == i) {}
    for (;;)
    {
      return new lmj(str, k, i);
      int j = 0;
    }
  }
  
  public static byte[] a(lmj paramlmj)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(32);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramlmj.a);
    localDataOutputStream.writeInt(paramlmj.b);
    if (paramlmj.c) {}
    for (int i = 1;; i = 0)
    {
      localDataOutputStream.write(i);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return arrayOfByte;
    }
  }
  
  public final int a()
  {
    return this.b;
  }
  
  public final void a(boolean paramBoolean)
  {
    int i;
    if (this.c != paramBoolean)
    {
      this.c = paramBoolean;
      i = this.b;
      if (!paramBoolean) {
        break label32;
      }
    }
    label32:
    for (int j = 1;; j = -1)
    {
      this.b = (j + i);
      return;
    }
  }
  
  public final boolean b()
  {
    return this.c;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmj
 * JD-Core Version:    0.7.0.1
 */