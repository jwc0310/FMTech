import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public abstract class fft
  extends Binder
  implements ffs
{
  public static ffs a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof ffs))) {
      return (ffs)localIInterface;
    }
    return new ffu(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i5 = paramParcel1.readInt();
      boolean bool8 = false;
      if (i5 != 0) {
        bool8 = true;
      }
      a(bool8);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i4 = paramParcel1.readInt();
      boolean bool7 = false;
      if (i4 != 0) {
        bool7 = true;
      }
      b(bool7);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i3 = paramParcel1.readInt();
      boolean bool6 = false;
      if (i3 != 0) {
        bool6 = true;
      }
      c(bool6);
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i2 = paramParcel1.readInt();
      boolean bool5 = false;
      if (i2 != 0) {
        bool5 = true;
      }
      d(bool5);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool4 = a();
      paramParcel2.writeNoException();
      int i1 = 0;
      if (bool4) {
        i1 = 1;
      }
      paramParcel2.writeInt(i1);
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool3 = b();
      paramParcel2.writeNoException();
      int n = 0;
      if (bool3) {
        n = 1;
      }
      paramParcel2.writeInt(n);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool2 = c();
      paramParcel2.writeNoException();
      int m = 0;
      if (bool2) {
        m = 1;
      }
      paramParcel2.writeInt(m);
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      boolean bool1 = d();
      paramParcel2.writeNoException();
      int k = 0;
      if (bool1) {
        k = 1;
      }
      paramParcel2.writeInt(k);
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (StreetViewPanoramaCamera localStreetViewPanoramaCamera2 = fkl.a(paramParcel1);; localStreetViewPanoramaCamera2 = null)
      {
        a(localStreetViewPanoramaCamera2, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaCamera localStreetViewPanoramaCamera1 = e();
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaCamera1 != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaCamera1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      a(paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int j = paramParcel1.readInt();
      LatLng localLatLng2 = null;
      if (j != 0) {
        localLatLng2 = fkg.a(paramParcel1);
      }
      a(localLatLng2);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i = paramParcel1.readInt();
      LatLng localLatLng1 = null;
      if (i != 0) {
        localLatLng1 = fkg.a(paramParcel1);
      }
      a(localLatLng1, paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaLocation localStreetViewPanoramaLocation = f();
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaLocation != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaLocation.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      IBinder localIBinder5 = paramParcel1.readStrongBinder();
      Object localObject4 = null;
      if (localIBinder5 == null) {}
      for (;;)
      {
        a((fid)localObject4);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface4 = localIBinder5.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
        if ((localIInterface4 != null) && ((localIInterface4 instanceof fid))) {
          localObject4 = (fid)localIInterface4;
        } else {
          localObject4 = new fif(localIBinder5);
        }
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      IBinder localIBinder4 = paramParcel1.readStrongBinder();
      Object localObject3 = null;
      if (localIBinder4 == null) {}
      for (;;)
      {
        a((fia)localObject3);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface3 = localIBinder4.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaCameraChangeListener");
        if ((localIInterface3 != null) && ((localIInterface3 instanceof fia))) {
          localObject3 = (fia)localIInterface3;
        } else {
          localObject3 = new fic(localIBinder4);
        }
      }
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      IBinder localIBinder3 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder3 == null) {}
      for (;;)
      {
        a((fig)localObject2);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface2 = localIBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
        if ((localIInterface2 != null) && ((localIInterface2 instanceof fig))) {
          localObject2 = (fig)localIInterface2;
        } else {
          localObject2 = new fii(localIBinder3);
        }
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      StreetViewPanoramaOrientation localStreetViewPanoramaOrientation2 = a(eva.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      if (localStreetViewPanoramaOrientation2 != null)
      {
        paramParcel2.writeInt(1);
        localStreetViewPanoramaOrientation2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      if (paramParcel1.readInt() != 0) {}
      for (StreetViewPanoramaOrientation localStreetViewPanoramaOrientation1 = fko.a(paramParcel1);; localStreetViewPanoramaOrientation1 = null)
      {
        euz localeuz = a(localStreetViewPanoramaOrientation1);
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (localeuz != null) {
          localIBinder2 = localeuz.asBinder();
        }
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    IBinder localIBinder1 = paramParcel1.readStrongBinder();
    Object localObject1 = null;
    if (localIBinder1 == null) {}
    for (;;)
    {
      a((fij)localObject1);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
      if ((localIInterface1 != null) && ((localIInterface1 instanceof fij))) {
        localObject1 = (fij)localIInterface1;
      } else {
        localObject1 = new fil(localIBinder1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fft
 * JD-Core Version:    0.7.0.1
 */