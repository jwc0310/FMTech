import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class lml
  extends mab
{
  public String a;
  public String b;
  public String c;
  public String d;
  public int e;
  private int f;
  
  private lml() {}
  
  private lml(opc paramopc)
  {
    if (paramopc == null) {
      return;
    }
    this.a = paramopc.a;
    this.b = paramopc.b;
    this.c = paramopc.d;
    this.d = paramopc.c;
    this.f = paramopc.e;
    this.e = paramopc.f;
  }
  
  public static lml a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    lml locallml = new lml();
    locallml.a = d(localByteBuffer);
    locallml.b = d(localByteBuffer);
    locallml.c = d(localByteBuffer);
    locallml.d = d(localByteBuffer);
    locallml.f = localByteBuffer.getInt();
    locallml.e = localByteBuffer.getInt();
    return locallml;
  }
  
  public static byte[] a(opc paramopc)
  {
    lml locallml = new lml(paramopc);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, locallml.a);
    a(localDataOutputStream, locallml.b);
    a(localDataOutputStream, locallml.c);
    a(localDataOutputStream, locallml.d);
    localDataOutputStream.writeInt(locallml.f);
    localDataOutputStream.writeInt(locallml.e);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lml
 * JD-Core Version:    0.7.0.1
 */