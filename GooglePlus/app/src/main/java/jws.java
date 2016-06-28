import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jws
  implements Parcelable
{
  public static final Parcelable.Creator<jws> CREATOR = new jwt();
  final String a;
  final String b;
  final String c;
  
  public jws(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public jws(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
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
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jws
 * JD-Core Version:    0.7.0.1
 */