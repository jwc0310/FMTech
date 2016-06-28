import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class cg
  implements Parcelable
{
  public static final Parcelable.Creator<cg> CREATOR = new ch();
  cj[] a;
  int[] b;
  bf[] c;
  
  public cg() {}
  
  public cg(Parcel paramParcel)
  {
    this.a = ((cj[])paramParcel.createTypedArray(cj.CREATOR));
    this.b = paramParcel.createIntArray();
    this.c = ((bf[])paramParcel.createTypedArray(bf.CREATOR));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeTypedArray(this.a, paramInt);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeTypedArray(this.c, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cg
 * JD-Core Version:    0.7.0.1
 */