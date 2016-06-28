import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class jvp
  implements Parcelable
{
  public static final Parcelable.Creator<jvp> CREATOR = new jvq();
  final String a;
  final float b;
  final long c;
  ArrayList<jws> d;
  
  jvp(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readFloat();
    this.c = paramParcel.readLong();
    this.d = paramParcel.readArrayList(jws.class.getClassLoader());
  }
  
  public jvp(String paramString, float paramFloat, long paramLong)
  {
    this.a = paramString;
    this.b = paramFloat;
    this.c = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeFloat(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeList(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jvp
 * JD-Core Version:    0.7.0.1
 */