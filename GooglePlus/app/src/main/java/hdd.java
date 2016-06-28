import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class hdd
  implements Parcelable
{
  public static final Parcelable.Creator<hdd> CREATOR = new hde();
  public Uri a;
  public long b;
  
  public hdd(Uri paramUri, long paramLong)
  {
    this.a = paramUri;
    this.b = paramLong;
  }
  
  public hdd(Parcel paramParcel)
  {
    this.a = ((Uri)paramParcel.readParcelable(hdb.class.getClassLoader()));
    this.b = paramParcel.readLong();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeLong(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hdd
 * JD-Core Version:    0.7.0.1
 */