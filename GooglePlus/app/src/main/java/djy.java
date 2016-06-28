import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class djy
  implements Parcelable
{
  public static final Parcelable.Creator<djy> CREATOR = new djz();
  public final String a;
  public final String b;
  public final int c;
  public final long d;
  public boolean e;
  
  djy(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readLong();
    if (paramParcel.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      return;
    }
  }
  
  public djy(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramInt;
    this.d = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeLong(this.d);
    if (this.e) {}
    for (int i = 1;; i = 0)
    {
      paramParcel.writeInt(i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     djy
 * JD-Core Version:    0.7.0.1
 */