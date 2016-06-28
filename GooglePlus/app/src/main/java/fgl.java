import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class fgl
  extends Binder
  implements fgk
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      euz localeuz2 = a(fjr.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder2 = null;
      if (localeuz2 != null) {
        localIBinder2 = localeuz2.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    euz localeuz1 = b(fjr.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    IBinder localIBinder1 = null;
    if (localeuz1 != null) {
      localIBinder1 = localeuz1.asBinder();
    }
    paramParcel2.writeStrongBinder(localIBinder1);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fgl
 * JD-Core Version:    0.7.0.1
 */