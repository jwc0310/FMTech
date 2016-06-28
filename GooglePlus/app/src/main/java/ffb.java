import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public abstract class ffb
  extends Binder
  implements ffa
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz11 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder11 = null;
      if (localeuz11 != null) {
        localIBinder11 = localeuz11.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder11);
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz10 = b();
      paramParcel2.writeNoException();
      IBinder localIBinder10 = null;
      if (localeuz10 != null) {
        localIBinder10 = localeuz10.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder10);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz9 = a(paramParcel1.readFloat(), paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder9 = null;
      if (localeuz9 != null) {
        localIBinder9 = localeuz9.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder9);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz8 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder8 = null;
      if (localeuz8 != null) {
        localIBinder8 = localeuz8.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder8);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz7 = b(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder7 = null;
      if (localeuz7 != null) {
        localIBinder7 = localeuz7.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder7);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      euz localeuz6 = a(paramParcel1.readFloat(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (localeuz6 != null) {
        localIBinder6 = localeuz6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (CameraPosition localCameraPosition = fkc.a(paramParcel1);; localCameraPosition = null)
      {
        euz localeuz5 = a(localCameraPosition);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (localeuz5 != null) {
          localIBinder5 = localeuz5.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng2 = fkg.a(paramParcel1);; localLatLng2 = null)
      {
        euz localeuz4 = a(localLatLng2);
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (localeuz4 != null) {
          localIBinder4 = localeuz4.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLng localLatLng1 = fkg.a(paramParcel1);; localLatLng1 = null)
      {
        euz localeuz3 = a(localLatLng1, paramParcel1.readFloat());
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (localeuz3 != null) {
          localIBinder3 = localeuz3.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (LatLngBounds localLatLngBounds2 = fkf.a(paramParcel1);; localLatLngBounds2 = null)
      {
        euz localeuz2 = a(localLatLngBounds2, paramParcel1.readInt());
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (localeuz2 != null) {
          localIBinder2 = localeuz2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    if (paramParcel1.readInt() != 0) {}
    for (LatLngBounds localLatLngBounds1 = fkf.a(paramParcel1);; localLatLngBounds1 = null)
    {
      euz localeuz1 = a(localLatLngBounds1, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localeuz1 != null) {
        localIBinder1 = localeuz1.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ffb
 * JD-Core Version:    0.7.0.1
 */