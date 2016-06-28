import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ivi
  implements Parcelable
{
  public static final Parcelable.Creator<ivi> CREATOR = new ivj();
  private Uri a;
  private ivk b;
  
  public ivi(Uri paramUri, ivk paramivk)
  {
    if (paramUri == null) {
      throw new IllegalArgumentException("uri cannot be null");
    }
    if (paramivk == null) {
      throw new IllegalArgumentException("type cannot be null");
    }
    this.a = paramUri;
    this.b = paramivk;
  }
  
  public ivi(Parcel paramParcel)
  {
    this.a = ((Uri)paramParcel.readParcelable(ivi.class.getClassLoader()));
    this.b = ivk.valueOf(paramParcel.readString());
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ivi localivi;
    do
    {
      return true;
      if (!(paramObject instanceof ivi)) {
        return false;
      }
      localivi = (ivi)paramObject;
    } while ((this.b == localivi.b) && (this.a.equals(localivi.a)));
    return false;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode() + this.a.hashCode();
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.b);
    String str2 = String.valueOf(this.a);
    return 11 + String.valueOf(str1).length() + String.valueOf(str2).length() + "MediaUri(" + str1 + "," + str2 + ")";
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, 0);
    paramParcel.writeString(this.b.name());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ivi
 * JD-Core Version:    0.7.0.1
 */