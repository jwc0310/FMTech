import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class gms
  implements Parcelable
{
  public static final Parcelable.Creator<gms> CREATOR = new gmt();
  public final int a;
  
  public gms(int paramInt)
  {
    this.a = paramInt;
  }
  
  gms(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gms
 * JD-Core Version:    0.7.0.1
 */