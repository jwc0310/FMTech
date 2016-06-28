import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ivn
  implements Parcelable
{
  public static final Parcelable.Creator<ivn> CREATOR = new ivo();
  public ivt a;
  public ivv b;
  public List<ivr> c;
  public int d;
  public int e;
  
  public ivn() {}
  
  ivn(Parcel paramParcel)
  {
    this.a = ((ivt)paramParcel.readParcelable(ivt.class.getClassLoader()));
    this.b = ((ivv)paramParcel.readParcelable(ivv.class.getClassLoader()));
    this.c = paramParcel.readArrayList(ivr.class.getClassLoader());
    this.d = paramParcel.readInt();
    this.e = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
    paramParcel.writeParcelable(this.b, 0);
    paramParcel.writeList(this.c);
    paramParcel.writeInt(this.d);
    paramParcel.writeInt(this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivn
 * JD-Core Version:    0.7.0.1
 */