import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class kzc
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<kzc> CREATOR = new kzd();
  public final String a;
  public final String b;
  public final String c;
  
  kzc(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public kzc(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  public static byte[] a(kzc[] paramArrayOfkzc)
  {
    if (paramArrayOfkzc.length == 0) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(32);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeShort(paramArrayOfkzc.length);
      int i = paramArrayOfkzc.length;
      for (int j = 0; j < i; j++)
      {
        kzc localkzc = paramArrayOfkzc[j];
        a(localDataOutputStream, localkzc.a);
        a(localDataOutputStream, localkzc.b);
        a(localDataOutputStream, localkzc.c);
      }
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      return arrayOfByte;
    }
    finally
    {
      localDataOutputStream.close();
    }
  }
  
  public static kzc[] a(byte[] paramArrayOfByte)
  {
    kzc[] arrayOfkzc;
    if (paramArrayOfByte == null) {
      arrayOfkzc = null;
    }
    for (;;)
    {
      return arrayOfkzc;
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      int i = localByteBuffer.getShort();
      arrayOfkzc = new kzc[i];
      for (int j = 0; j < i; j = (short)(j + 1)) {
        arrayOfkzc[j] = new kzc(d(localByteBuffer), d(localByteBuffer), d(localByteBuffer));
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    String str3 = this.c;
    return 37 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + "{SquareStream id=" + str1 + " name=" + str2 + " description=" + str3 + "}";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzc
 * JD-Core Version:    0.7.0.1
 */