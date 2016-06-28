import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class iim
  implements Parcelable, Comparable<iim>
{
  public static final Parcelable.Creator<iim> CREATOR = new iin();
  public final String a;
  public final String b;
  
  iim(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }
  
  public iim(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iim
 * JD-Core Version:    0.7.0.1
 */