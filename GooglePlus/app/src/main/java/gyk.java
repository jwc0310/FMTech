import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class gyk
  implements Parcelable
{
  public static final Parcelable.Creator<gyk> CREATOR = new gyl();
  final long a;
  final njh b;
  
  gyk(long paramLong, njh paramnjh)
  {
    if (paramnjh == null) {
      throw new IllegalArgumentException("event can never be null");
    }
    this.a = paramLong;
    this.b = paramnjh;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    byte[] arrayOfByte = qat.a(this.b);
    paramParcel.writeInt(arrayOfByte.length);
    if (arrayOfByte.length > 0) {
      paramParcel.writeByteArray(arrayOfByte);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyk
 * JD-Core Version:    0.7.0.1
 */