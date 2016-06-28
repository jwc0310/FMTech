import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ivp
  implements Parcelable
{
  public static final Parcelable.Creator<ivp> CREATOR = new ivq();
  public int a;
  public String b;
  public long c;
  public long d;
  public int e;
  
  public ivp() {}
  
  ivp(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    this.c = paramParcel.readLong();
    this.d = paramParcel.readLong();
    this.e = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeLong(this.c);
    paramParcel.writeLong(this.d);
    paramParcel.writeInt(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivp
 * JD-Core Version:    0.7.0.1
 */