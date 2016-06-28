import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class fcw
  extends Binder
  implements fcv
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.internal.ISettingsCallbacks");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (LocationSettingsResult localLocationSettingsResult = (LocationSettingsResult)LocationSettingsResult.CREATOR.createFromParcel(paramParcel1);; localLocationSettingsResult = null)
    {
      a(localLocationSettingsResult);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcw
 * JD-Core Version:    0.7.0.1
 */