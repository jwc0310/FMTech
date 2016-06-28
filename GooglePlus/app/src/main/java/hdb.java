import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class hdb
  implements Parcelable
{
  public static final Parcelable.Creator<hdb> CREATOR = new hdc();
  private Uri a;
  
  public hdb(Parcel paramParcel)
  {
    this.a = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdb
 * JD-Core Version:    0.7.0.1
 */