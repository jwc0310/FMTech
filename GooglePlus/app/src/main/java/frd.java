import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;

final class frd
  implements fql
{
  public static final Parcelable.Creator<frd> CREATOR = new fre();
  final CastDevice a;
  
  public frd()
  {
    this.a = null;
  }
  
  public frd(Parcel paramParcel)
  {
    this.a = ((CastDevice)paramParcel.readParcelable(frd.class.getClassLoader()));
  }
  
  public frd(CastDevice paramCastDevice)
  {
    this.a = paramCastDevice;
  }
  
  public final String a()
  {
    return this.a.d;
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
 * Qualified Name:     frd
 * JD-Core Version:    0.7.0.1
 */