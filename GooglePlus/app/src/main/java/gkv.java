import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class gkv
  implements Parcelable
{
  public static final Parcelable.Creator<gkv> CREATOR = new gkw();
  public final int a;
  public final int b;
  public final int c;
  
  public gkv(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  gkv(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkv
 * JD-Core Version:    0.7.0.1
 */