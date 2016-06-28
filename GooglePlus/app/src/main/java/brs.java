import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.Arrays;
import java.util.List;

public final class brs
  implements Parcelable
{
  public static final Parcelable.Creator<brs> CREATOR = new brt();
  public List<orx> a;
  public List<osg> b;
  public List<oro> c;
  
  brs() {}
  
  brs(Parcel paramParcel)
  {
    try
    {
      this.a = Arrays.asList((orx[])efj.a(paramParcel.createByteArray(), orx.class));
      this.b = Arrays.asList((osg[])efj.a(paramParcel.createByteArray(), osg.class));
      this.c = Arrays.asList((oro[])efj.a(paramParcel.createByteArray(), oro.class));
      return;
    }
    catch (Exception localException)
    {
      String str = String.valueOf(localException);
      Log.e("EsPeopleData", 33 + String.valueOf(str).length() + "Error deserializing ContactInfo: " + str);
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(efj.f(this.a));
    paramParcel.writeByteArray(efj.f(this.b));
    paramParcel.writeByteArray(efj.f(this.c));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brs
 * JD-Core Version:    0.7.0.1
 */