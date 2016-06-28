import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class buy
  implements Parcelable, jps
{
  public static final Parcelable.Creator<buy> CREATOR = new buz();
  public final String a;
  public final long b;
  public String c;
  
  buy(Parcel paramParcel)
  {
    this.c = paramParcel.readString();
    this.a = paramParcel.readString();
    this.b = paramParcel.readLong();
  }
  
  public buy(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 0L);
  }
  
  public buy(String paramString1, String paramString2, long paramLong)
  {
    this.c = paramString1;
    this.a = paramString2;
    this.b = paramLong;
  }
  
  public final long a()
  {
    return this.b;
  }
  
  public final boolean b()
  {
    return this.b != 0L;
  }
  
  public final boolean c()
  {
    throw new UnsupportedOperationException("not yet implemented");
  }
  
  public final String d()
  {
    throw new UnsupportedOperationException("not yet implemented");
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.a);
    paramParcel.writeLong(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     buy
 * JD-Core Version:    0.7.0.1
 */