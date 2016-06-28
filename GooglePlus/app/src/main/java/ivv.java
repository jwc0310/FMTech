import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ivv
  implements Parcelable
{
  public static final Parcelable.Creator<ivv> CREATOR = new ivw();
  public List<ivp> a;
  public List<ivp> b;
  public List<ivp> c;
  public long d;
  public ivx e;
  
  public ivv() {}
  
  ivv(Parcel paramParcel)
  {
    this.a = paramParcel.readArrayList(ivp.class.getClassLoader());
    this.b = paramParcel.readArrayList(ivp.class.getClassLoader());
    this.c = paramParcel.readArrayList(ivp.class.getClassLoader());
    this.d = paramParcel.readLong();
    this.e = ((ivx)paramParcel.readParcelable(ivx.class.getClassLoader()));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeList(this.a);
    paramParcel.writeList(this.b);
    paramParcel.writeList(this.c);
    paramParcel.writeLong(this.d);
    paramParcel.writeParcelable(this.e, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivv
 * JD-Core Version:    0.7.0.1
 */