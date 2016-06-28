import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class in
  implements Parcelable
{
  public static final Parcelable.Creator<in> CREATOR = new io();
  final Object a;
  
  in(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramParcel.writeParcelable((Parcelable)this.a, paramInt);
      return;
    }
    paramParcel.writeStrongBinder((IBinder)this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     in
 * JD-Core Version:    0.7.0.1
 */