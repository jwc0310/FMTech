import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class llo
  extends mab
  implements Parcelable, lxc
{
  public static final Parcelable.Creator<llo> CREATOR = new llp();
  public String a;
  public String b;
  private Integer c;
  private String d;
  private boolean e;
  
  public llo(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = Integer.valueOf(paramParcel.readInt());
    this.d = paramParcel.readString();
  }
  
  public llo(String paramString1, String paramString2, Integer paramInteger, String paramString3)
  {
    this(paramString1, paramString2, paramInteger, paramString3, false);
  }
  
  private llo(String paramString1, String paramString2, Integer paramInteger, String paramString3, boolean paramBoolean)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInteger;
    this.d = paramString3;
    this.e = paramBoolean;
  }
  
  public static llo a(byte[] paramArrayOfByte)
  {
    int i = 1;
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    String str1 = d(localByteBuffer);
    String str2 = d(localByteBuffer);
    int k = localByteBuffer.getInt();
    String str3 = d(localByteBuffer);
    Integer localInteger;
    if (localByteBuffer.get() == i)
    {
      localInteger = null;
      if (k != -1) {
        break label74;
      }
    }
    for (;;)
    {
      return new llo(str1, str2, localInteger, str3, i);
      int j = 0;
      break;
      label74:
      localInteger = Integer.valueOf(k);
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    return (!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2));
  }
  
  public static byte[] a(llo paramllo)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramllo.a);
    a(localDataOutputStream, paramllo.b);
    int i;
    if (paramllo.c == null)
    {
      i = -1;
      localDataOutputStream.writeInt(i);
      a(localDataOutputStream, paramllo.d);
      if (!paramllo.e) {
        break label98;
      }
    }
    label98:
    for (int j = 1;; j = 0)
    {
      localDataOutputStream.writeByte(j);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return arrayOfByte;
      i = paramllo.c.intValue();
      break;
    }
  }
  
  public final boolean a()
  {
    return this.e;
  }
  
  public final String b()
  {
    return this.a;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c.intValue());
    paramParcel.writeString(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     llo
 * JD-Core Version:    0.7.0.1
 */