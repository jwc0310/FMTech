import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ivt
  implements Parcelable
{
  public static final Parcelable.Creator<ivt> CREATOR = new ivu();
  public String a;
  public String b;
  public String c;
  
  public ivt() {}
  
  ivt(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
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
 * Qualified Name:     ivt
 * JD-Core Version:    0.7.0.1
 */