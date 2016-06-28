import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jub
  implements Parcelable
{
  public static final Parcelable.Creator<jub> CREATOR = new juc();
  final String a;
  final String b;
  
  jub(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }
  
  public jub(Long paramLong, String paramString)
  {
    this(Long.toString(paramLong.longValue()), paramString);
  }
  
  public jub(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jub
 * JD-Core Version:    0.7.0.1
 */