import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ivr
  implements Parcelable
{
  public static final Parcelable.Creator<ivr> CREATOR = new ivs();
  public int a;
  public ivp b;
  public int c;
  public ivp d;
  public int e;
  public long f;
  
  public ivr() {}
  
  ivr(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = ((ivp)paramParcel.readParcelable(ivp.class.getClassLoader()));
    this.c = paramParcel.readInt();
    this.d = ((ivp)paramParcel.readParcelable(ivp.class.getClassLoader()));
    this.e = paramParcel.readInt();
    this.f = paramParcel.readLong();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeParcelable(this.b, 0);
    paramParcel.writeInt(this.c);
    paramParcel.writeParcelable(this.d, 0);
    paramParcel.writeInt(this.e);
    paramParcel.writeLong(this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivr
 * JD-Core Version:    0.7.0.1
 */