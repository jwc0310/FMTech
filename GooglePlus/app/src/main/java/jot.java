import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class jot
  implements Parcelable
{
  public static final Parcelable.Creator<jot> CREATOR = new jou();
  final List<String> a;
  
  jot(Parcel paramParcel)
  {
    this.a = paramParcel.createStringArrayList();
  }
  
  public jot(List<String> paramList)
  {
    this.a = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jot
 * JD-Core Version:    0.7.0.1
 */