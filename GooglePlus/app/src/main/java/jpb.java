import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jpb
  implements Parcelable
{
  public static final Parcelable.Creator<jpb> CREATOR = new jpc();
  public final int a;
  public final String[] b;
  public final int[] c;
  
  public jpb(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.a = paramInt;
    this.b = paramArrayOfString;
    this.c = paramArrayOfInt;
  }
  
  jpb(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.createStringArray();
    this.c = paramParcel.createIntArray();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeStringArray(this.b);
    paramParcel.writeIntArray(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpb
 * JD-Core Version:    0.7.0.1
 */