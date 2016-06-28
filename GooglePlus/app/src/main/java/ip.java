import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ip
  implements Parcelable
{
  public static final Parcelable.Creator<ip> CREATOR = new iq();
  public int a;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public ip(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.b = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ip
 * JD-Core Version:    0.7.0.1
 */