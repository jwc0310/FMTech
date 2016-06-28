import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jmm
  implements Parcelable, hrt
{
  public static final Parcelable.Creator<jmm> CREATOR = new jmn();
  public jgw a;
  
  jmm(Parcel paramParcel)
  {
    this.a = ((jgw)paramParcel.readParcelable(jmm.class.getClassLoader()));
  }
  
  public jmm(jmo paramjmo)
  {
    this.a = paramjmo.a;
  }
  
  public static jmo a()
  {
    return new jmo();
  }
  
  public final String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return this.a.b();
  }
  
  public final int describeContents()
  {
    return this.a.describeContents();
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof jmm))
    {
      jmm localjmm = (jmm)paramObject;
      return this.a.equals(localjmm.a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmm
 * JD-Core Version:    0.7.0.1
 */