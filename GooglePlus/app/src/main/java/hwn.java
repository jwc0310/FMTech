import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class hwn
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<hwn> CREATOR = new hwo();
  private String a;
  private String b;
  private String c;
  private String d;
  private int e = -2147483648;
  
  private hwn() {}
  
  hwn(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
  }
  
  public hwn(qdb paramqdb)
  {
    this.a = paramqdb.b;
    this.e = paramqdb.f;
    this.c = paramqdb.c;
    this.d = paramqdb.d;
    if (paramqdb.e != null) {
      this.b = paramqdb.e.a;
    }
  }
  
  public static byte[] a(hwn paramhwn)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramhwn.a);
    if (paramhwn.b != null) {}
    for (String str = paramhwn.b;; str = paramhwn.a)
    {
      a(localDataOutputStream, str);
      a(localDataOutputStream, paramhwn.c);
      a(localDataOutputStream, paramhwn.d);
      localDataOutputStream.writeInt(paramhwn.e);
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      localDataOutputStream.close();
      return arrayOfByte;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwn
 * JD-Core Version:    0.7.0.1
 */