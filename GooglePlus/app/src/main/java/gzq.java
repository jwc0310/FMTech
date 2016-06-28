import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class gzq
  implements Parcelable
{
  public static final Parcelable.Creator<gzq> CREATOR = new gzr();
  public final int a;
  public final String b;
  public final hae c;
  
  public gzq(int paramInt, String paramString, hae paramhae)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramhae;
  }
  
  gzq(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = paramParcel.readString();
    int i = paramParcel.readInt();
    Exception localException = (Exception)paramParcel.readSerializable();
    String str = paramParcel.readString();
    long l = paramParcel.readLong();
    this.c = new hae(i, localException, str, paramParcel.createByteArray(), l);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c.b);
    paramParcel.writeSerializable(this.c.c);
    paramParcel.writeString(this.c.d);
    paramParcel.writeLong(this.c.e);
    hae localhae = this.c;
    localhae.b();
    paramParcel.writeByteArray(localhae.g);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gzq
 * JD-Core Version:    0.7.0.1
 */