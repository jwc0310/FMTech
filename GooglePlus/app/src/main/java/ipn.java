import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@Deprecated
public final class ipn
  implements Parcelable
{
  public static final Parcelable.Creator<ipn> CREATOR = new ipo();
  public final long a;
  public final String b;
  
  ipn(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.a = paramParcel.readLong();
  }
  
  public ipn(String paramString, long paramLong)
  {
    this.b = paramString;
    this.a = paramLong;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ipn;
    boolean bool2 = false;
    if (bool1)
    {
      ipn localipn = (ipn)paramObject;
      boolean bool3 = this.a < localipn.a;
      bool2 = false;
      if (!bool3)
      {
        boolean bool4 = TextUtils.equals(this.b, localipn.b);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    int i = (int)(this.a ^ this.a >>> 32);
    if (this.b != null) {
      i ^= this.b.hashCode();
    }
    return i;
  }
  
  public final String toString()
  {
    String str = this.b;
    long l = this.a;
    return 26 + String.valueOf(str).length() + "g-" + str + ", p-" + l;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeLong(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ipn
 * JD-Core Version:    0.7.0.1
 */