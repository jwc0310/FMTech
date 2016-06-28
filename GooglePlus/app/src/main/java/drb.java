import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class drb
  implements Parcelable
{
  public static final Parcelable.Creator<drb> CREATOR = new drc();
  gnb a;
  final String b;
  private int[] c;
  private ArrayList<jgs> d;
  
  drb(Parcel paramParcel)
  {
    this.a = ((gnb)paramParcel.readParcelable(gnb.class.getClassLoader()));
    this.b = paramParcel.readString();
    paramParcel.readIntArray(this.c);
    this.d = paramParcel.readArrayList(jgs.class.getClassLoader());
  }
  
  public drb(gnb paramgnb, String paramString, int[] paramArrayOfInt, ArrayList<jgs> paramArrayList)
  {
    this.a = paramgnb;
    this.b = paramString;
    this.c = paramArrayOfInt;
    this.d = paramArrayList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeString(this.b);
    paramParcel.writeIntArray(this.c);
    paramParcel.writeList(this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     drb
 * JD-Core Version:    0.7.0.1
 */