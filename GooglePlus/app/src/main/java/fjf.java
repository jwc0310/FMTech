import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class fjf
  extends Binder
  implements fje
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      euz localeuz7 = a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localeuz7 != null) {}
      for (IBinder localIBinder7 = localeuz7.asBinder();; localIBinder7 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      euz localeuz6 = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder6 = null;
      if (localeuz6 != null) {
        localIBinder6 = localeuz6.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder6);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      euz localeuz5 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder5 = null;
      if (localeuz5 != null) {
        localIBinder5 = localeuz5.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder5);
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      euz localeuz4 = a();
      paramParcel2.writeNoException();
      IBinder localIBinder4 = null;
      if (localeuz4 != null) {
        localIBinder4 = localeuz4.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder4);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      euz localeuz3 = a(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      IBinder localIBinder3 = null;
      if (localeuz3 != null) {
        localIBinder3 = localeuz3.asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder3);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (Bitmap localBitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1);; localBitmap = null)
      {
        euz localeuz2 = a(localBitmap);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (localeuz2 != null) {
          localIBinder2 = localeuz2.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    euz localeuz1 = c(paramParcel1.readString());
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
 * Qualified Name:     fjf
 * JD-Core Version:    0.7.0.1
 */