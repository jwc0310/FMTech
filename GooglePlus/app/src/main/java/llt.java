import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class llt
  extends mab
{
  public int a;
  public int b;
  public String c;
  public String d;
  public String e;
  public llx[] f;
  
  private llt() {}
  
  public llt(ArrayList<llx> paramArrayList)
  {
    this.a = paramArrayList.size();
    this.b = this.a;
    this.f = new llx[this.a];
    paramArrayList.toArray(this.f);
  }
  
  public llt(qdv paramqdv)
  {
    if (paramqdv.e == null) {}
    for (int j = 0;; j = paramqdv.e.length)
    {
      this.a = j;
      this.b = Math.max(this.a, efj.a(paramqdv.f));
      this.e = paramqdv.b;
      this.d = paramqdv.d;
      this.c = paramqdv.c;
      this.f = new llx[this.a];
      while (i < this.a)
      {
        this.f[i] = new llx((qdw)paramqdv.e[i].b(qdw.a));
        i++;
      }
    }
  }
  
  public static llt a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    llt localllt = new llt();
    localllt.a = localByteBuffer.getInt();
    localllt.b = localByteBuffer.getInt();
    localllt.d = d(localByteBuffer);
    localllt.c = d(localByteBuffer);
    localllt.e = d(localByteBuffer);
    localllt.f = new llx[localllt.a];
    for (int i = 0; i < localllt.a; i++)
    {
      localllt.f[i] = new llx();
      localllt.f[i].a(localByteBuffer);
    }
    return localllt;
  }
  
  public static byte[] a(llt paramllt)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeInt(paramllt.a);
    localDataOutputStream.writeInt(paramllt.b);
    a(localDataOutputStream, paramllt.d);
    a(localDataOutputStream, paramllt.c);
    a(localDataOutputStream, paramllt.e);
    for (int i = 0; i < paramllt.a; i++) {
      paramllt.f[i].a(localDataOutputStream);
    }
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public static byte[] a(qdv paramqdv)
  {
    return a(new llt(paramqdv));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llt
 * JD-Core Version:    0.7.0.1
 */