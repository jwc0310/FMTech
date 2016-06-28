import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class llu
  extends mab
{
  public ArrayList<String> a;
  public String b;
  public String c;
  public String d;
  public String e;
  private long f;
  
  protected llu() {}
  
  public llu(qbo paramqbo, String paramString1, String paramString2)
  {
    this.a = new ArrayList();
    if (paramqbo.c != null) {
      for (qbt localqbt : paramqbo.c) {
        if ((!TextUtils.isEmpty(localqbt.b)) && (localqbt.a == 1)) {
          this.a.add(localqbt.b);
        }
      }
    }
    this.b = paramqbo.b;
    this.c = paramqbo.d;
    this.d = paramString1;
    this.e = paramString2;
    this.f = efj.a(paramqbo.a);
  }
  
  public static llu a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    llu localllu = new llu();
    localllu.a = ((ArrayList)c(localByteBuffer));
    localllu.b = d(localByteBuffer);
    localllu.d = d(localByteBuffer);
    localllu.c = d(localByteBuffer);
    localllu.e = d(localByteBuffer);
    localllu.f = localByteBuffer.getLong();
    return localllu;
  }
  
  public static byte[] a(qbo paramqbo, String paramString1, String paramString2)
  {
    llu localllu = new llu(paramqbo, paramString1, paramString2);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, localllu.a);
    a(localDataOutputStream, localllu.b);
    a(localDataOutputStream, localllu.d);
    a(localDataOutputStream, localllu.c);
    a(localDataOutputStream, localllu.e);
    localDataOutputStream.writeLong(localllu.f);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final String a(Context paramContext)
  {
    if (TextUtils.isEmpty(this.d)) {
      return paramContext.getString(do.Z);
    }
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llu
 * JD-Core Version:    0.7.0.1
 */