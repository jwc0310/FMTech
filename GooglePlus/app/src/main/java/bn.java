import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class bn
  implements Parcelable
{
  public static final Parcelable.Creator<bn> CREATOR = new bo();
  final Bundle a;
  
  bn(Bundle paramBundle)
  {
    this.a = paramBundle;
  }
  
  bn(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    this.a = paramParcel.readBundle();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bn
 * JD-Core Version:    0.7.0.1
 */