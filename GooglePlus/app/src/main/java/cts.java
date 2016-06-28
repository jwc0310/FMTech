import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cts
  implements Parcelable
{
  public static final Parcelable.Creator<cts> CREATOR = new ctt();
  final int a;
  
  public cts(int paramInt)
  {
    this.a = paramInt;
  }
  
  cts(Parcel paramParcel)
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
 * Qualified Name:     cts
 * JD-Core Version:    0.7.0.1
 */