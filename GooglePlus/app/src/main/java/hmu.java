import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class hmu
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<hmu> CREATOR = new hmv();
  public int a;
  public int b;
  public int c;
  
  private hmu() {}
  
  public hmu(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
  }
  
  public hmu(ndo paramndo)
  {
    this.a = paramndo.a;
    this.b = paramndo.b;
    this.c = paramndo.c;
  }
  
  public static hmu a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    hmu localhmu = new hmu();
    localhmu.a = localByteBuffer.getInt();
    localhmu.b = localByteBuffer.getInt();
    localhmu.c = localByteBuffer.getInt();
    return localhmu;
  }
  
  public static byte[] a(hmu paramhmu)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    localDataOutputStream.writeInt(paramhmu.a);
    localDataOutputStream.writeInt(paramhmu.b);
    localDataOutputStream.writeInt(paramhmu.c);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    hmu localhmu;
    do
    {
      return true;
      if (!(paramObject instanceof hmu)) {
        return false;
      }
      localhmu = (hmu)paramObject;
    } while ((this.a == localhmu.a) && (this.c == localhmu.c) && (this.b == localhmu.b));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * this.a + this.b) + this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmu
 * JD-Core Version:    0.7.0.1
 */