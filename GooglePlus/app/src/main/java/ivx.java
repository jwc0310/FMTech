import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ivx
  implements Parcelable
{
  public static final Parcelable.Creator<ivx> CREATOR = new ivy();
  public long a;
  public long b;
  public int c;
  public List<ivp> d;
  public List<ivp> e;
  
  public ivx() {}
  
  ivx(Parcel paramParcel)
  {
    this.a = paramParcel.readLong();
    this.b = paramParcel.readLong();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readArrayList(ivp.class.getClassLoader());
    this.e = paramParcel.readArrayList(ivp.class.getClassLoader());
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a);
    paramParcel.writeLong(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeList(this.d);
    paramParcel.writeList(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivx
 * JD-Core Version:    0.7.0.1
 */