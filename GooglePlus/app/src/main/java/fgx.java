import android.location.Location;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class fgx
  extends Binder
  implements fgw
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      a(eva.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
    if (paramParcel1.readInt() != 0) {}
    for (Location localLocation = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation = null)
    {
      a(localLocation);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fgx
 * JD-Core Version:    0.7.0.1
 */