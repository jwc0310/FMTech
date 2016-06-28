import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class dac
  implements ikp
{
  public static final Parcelable.Creator<dac> CREATOR = new dad();
  private final String a;
  
  dac(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
  }
  
  dac(String paramString)
  {
    this.a = paramString;
  }
  
  public final int a(giz paramgiz)
  {
    if (this.a != null) {
      return paramgiz.b(this.a);
    }
    return -1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dac
 * JD-Core Version:    0.7.0.1
 */