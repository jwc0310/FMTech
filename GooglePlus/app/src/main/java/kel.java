import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class kel
  extends keu
{
  public static final Parcelable.Creator<kel> CREATOR = new kem();
  String a;
  
  public kel(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readString();
  }
  
  public kel(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kel
 * JD-Core Version:    0.7.0.1
 */