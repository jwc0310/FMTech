import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class doe
  extends keu
{
  public static final Parcelable.Creator<doe> CREATOR = new dof();
  String a;
  
  public doe(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readString();
  }
  
  public doe(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doe
 * JD-Core Version:    0.7.0.1
 */