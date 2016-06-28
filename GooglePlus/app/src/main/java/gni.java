import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
final class gni
  implements jgw
{
  public static final Parcelable.Creator<gni> CREATOR = new gnj();
  private final jgs a;
  
  gni(Parcel paramParcel)
  {
    this.a = ((jgs)paramParcel.readParcelable(gni.class.getClassLoader()));
  }
  
  gni(jgs paramjgs)
  {
    this.a = paramjgs;
  }
  
  public final long a()
  {
    return hashCode();
  }
  
  public final String b()
  {
    return this.a.a;
  }
  
  public final String c()
  {
    return this.a.b;
  }
  
  public final String d()
  {
    return "";
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int e()
  {
    return this.a.c;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof jgw)) {
      return false;
    }
    jgw localjgw = (jgw)paramObject;
    if (localjgw == this) {
      return true;
    }
    return this.a.a.equals(localjgw.b());
  }
  
  public final int f()
  {
    return this.a.d;
  }
  
  public final int g()
  {
    return 0;
  }
  
  public final boolean h()
  {
    return true;
  }
  
  public final int hashCode()
  {
    return this.a.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gni
 * JD-Core Version:    0.7.0.1
 */