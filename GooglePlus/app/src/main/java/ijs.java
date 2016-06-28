import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ijs
  implements Parcelable
{
  public static final Parcelable.Creator<ijs> CREATOR = new ijt();
  public final Location a;
  public final String b;
  public final String c;
  
  public ijs(Location paramLocation, String paramString)
  {
    if (paramLocation == null) {
      throw new NullPointerException("Location is null");
    }
    this.a = paramLocation;
    this.b = paramString;
    this.c = b();
  }
  
  ijs(Parcel paramParcel)
  {
    this.a = ((Location)paramParcel.readParcelable(ijs.class.getClassLoader()));
    this.b = paramParcel.readString();
    this.c = b();
  }
  
  private final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a.getLatitude()).append('|');
    localStringBuilder.append(this.a.getLongitude()).append('|');
    localStringBuilder.append(this.a.getAccuracy()).append('|');
    if (a()) {
      localStringBuilder.append(this.b);
    }
    return localStringBuilder.toString();
  }
  
  public final boolean a()
  {
    return (this.b != null) && (this.b.length() > 0);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while (!(paramObject instanceof ijs)) {
      return false;
    }
    return this.c.equals(((ijs)paramObject).c);
  }
  
  public final int hashCode()
  {
    return this.c.hashCode();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeString(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ijs
 * JD-Core Version:    0.7.0.1
 */