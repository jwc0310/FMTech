import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public abstract class ffq
  extends Binder
  implements ffp
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      LatLng localLatLng2 = a(eva.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localLatLng2 != null)
      {
        paramParcel2.writeInt(1);
        localLatLng2.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng1 = fkg.a(paramParcel1);; localLatLng1 = null)
      {
        euz localeuz = a(localLatLng1);
        paramParcel2.writeNoException();
        IBinder localIBinder = null;
        if (localeuz != null) {
          localIBinder = localeuz.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
    VisibleRegion localVisibleRegion = a();
    paramParcel2.writeNoException();
    if (localVisibleRegion != null)
    {
      paramParcel2.writeInt(1);
      localVisibleRegion.writeToParcel(paramParcel2, 1);
    }
    for (;;)
    {
      return true;
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ffq
 * JD-Core Version:    0.7.0.1
 */