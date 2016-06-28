import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public abstract class fgi
  extends Binder
  implements fgh
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.ICreator");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a(eva.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      ffj localffj = b(eva.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (localffj != null) {
        localIBinder6 = localffj.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      euz localeuz2 = eva.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (GoogleMapOptions localGoogleMapOptions = fks.a(paramParcel1);; localGoogleMapOptions = null)
      {
        ffm localffm = a(localeuz2, localGoogleMapOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (localffm != null) {
          localIBinder5 = localffm.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      ffa localffa = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localffa != null) {
        localIBinder4 = localffa.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      fje localfje = b();
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localfje != null) {
        localIBinder3 = localfje.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      a(eva.a(paramParcel1.readStrongBinder()), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      euz localeuz1 = eva.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (StreetViewPanoramaOptions localStreetViewPanoramaOptions = fkt.a(paramParcel1);; localStreetViewPanoramaOptions = null)
      {
        ffy localffy = a(localeuz1, localStreetViewPanoramaOptions);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (localffy != null) {
          localIBinder2 = localffy.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
    ffv localffv = c(eva.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (localffv != null) {
      localIBinder1 = localffv.asBinder();
    }
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fgi
 * JD-Core Version:    0.7.0.1
 */