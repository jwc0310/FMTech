import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;

public abstract class fct
  extends Binder
  implements fcs
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ArrayList localArrayList = paramParcel1.createTypedArrayList(ParcelableGeofence.CREATOR);
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent12 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent12 = null)
      {
        a(localArrayList, localPendingIntent12, fcq.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 57: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      GeofencingRequest localGeofencingRequest;
      if (paramParcel1.readInt() != 0)
      {
        localGeofencingRequest = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label404;
        }
      }
      for (PendingIntent localPendingIntent11 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent11 = null)
      {
        a(localGeofencingRequest, localPendingIntent11, fcq.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localGeofencingRequest = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent10 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent10 = null)
      {
        a(localPendingIntent10, fcq.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(paramParcel1.createStringArray(), fcq.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(fcq.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      long l = paramParcel1.readLong();
      int i1 = paramParcel1.readInt();
      boolean bool2 = false;
      if (i1 != 0) {
        bool2 = true;
      }
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent9 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent9 = null)
      {
        a(l, bool2, localPendingIntent9);
        paramParcel2.writeNoException();
        return true;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent8 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent8 = null)
      {
        a(localPendingIntent8);
        paramParcel2.writeNoException();
        return true;
      }
    case 64: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      ActivityRecognitionResult localActivityRecognitionResult = a(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localActivityRecognitionResult != null)
      {
        paramParcel2.writeInt(1);
        localActivityRecognitionResult.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 65: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent7 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent7 = null)
      {
        Status localStatus4 = b(localPendingIntent7);
        paramParcel2.writeNoException();
        if (localStatus4 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        localStatus4.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 66: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent6 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent6 = null)
      {
        Status localStatus3 = c(localPendingIntent6);
        paramParcel2.writeNoException();
        if (localStatus3 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        localStatus3.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 60: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      GestureRequest localGestureRequest;
      if (paramParcel1.readInt() != 0)
      {
        localGestureRequest = fdz.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label912;
        }
      }
      for (PendingIntent localPendingIntent5 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent5 = null)
      {
        Status localStatus2 = a(localGestureRequest, localPendingIntent5);
        paramParcel2.writeNoException();
        if (localStatus2 == null) {
          break label918;
        }
        paramParcel2.writeInt(1);
        localStatus2.writeToParcel(paramParcel2, 1);
        return true;
        localGestureRequest = null;
        break;
      }
      paramParcel2.writeInt(0);
      return true;
    case 61: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent4 = null)
      {
        Status localStatus1 = d(localPendingIntent4);
        paramParcel2.writeNoException();
        if (localStatus1 == null) {
          break;
        }
        paramParcel2.writeInt(1);
        localStatus1.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation4 = a();
      paramParcel2.writeNoException();
      if (localLocation4 != null)
      {
        paramParcel2.writeInt(1);
        localLocation4.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int n = paramParcel1.readInt();
      LocationRequest localLocationRequest3 = null;
      if (n != 0) {
        localLocationRequest3 = fcd.a(paramParcel1);
      }
      a(localLocationRequest3, fee.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int m = paramParcel1.readInt();
      LocationRequest localLocationRequest2 = null;
      if (m != 0) {
        localLocationRequest2 = fcd.a(paramParcel1);
      }
      a(localLocationRequest2, fee.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LocationRequest localLocationRequest1;
      if (paramParcel1.readInt() != 0)
      {
        localLocationRequest1 = fcd.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1204;
        }
      }
      for (PendingIntent localPendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent3 = null)
      {
        a(localLocationRequest1, localPendingIntent3);
        paramParcel2.writeNoException();
        return true;
        localLocationRequest1 = null;
        break;
      }
    case 52: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int k = paramParcel1.readInt();
      LocationRequestInternal localLocationRequestInternal2 = null;
      if (k != 0) {
        localLocationRequestInternal2 = fde.a(paramParcel1);
      }
      a(localLocationRequestInternal2, fee.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 53: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LocationRequestInternal localLocationRequestInternal1;
      if (paramParcel1.readInt() != 0)
      {
        localLocationRequestInternal1 = fde.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1323;
        }
      }
      for (PendingIntent localPendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent2 = null)
      {
        a(localLocationRequestInternal1, localPendingIntent2);
        paramParcel2.writeNoException();
        return true;
        localLocationRequestInternal1 = null;
        break;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      a(fee.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent1 = null)
      {
        e(localPendingIntent1);
        paramParcel2.writeNoException();
        return true;
      }
    case 59: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int j = paramParcel1.readInt();
      LocationRequestUpdateData localLocationRequestUpdateData = null;
      if (j != 0) {
        localLocationRequestUpdateData = fdf.a(paramParcel1);
      }
      a(localLocationRequestUpdateData);
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      int i = paramParcel1.readInt();
      boolean bool1 = false;
      if (i != 0) {
        bool1 = true;
      }
      a(bool1);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (Location localLocation3 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation3 = null)
      {
        a(localLocation3);
        paramParcel2.writeNoException();
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      Location localLocation2 = b(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localLocation2 != null)
      {
        paramParcel2.writeInt(1);
        localLocation2.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if (paramParcel1.readInt() != 0) {}
      for (Location localLocation1 = (Location)Location.CREATOR.createFromParcel(paramParcel1);; localLocation1 = null)
      {
        a(localLocation1, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 34: 
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      LocationAvailability localLocationAvailability = c(paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localLocationAvailability != null)
      {
        paramParcel2.writeInt(1);
        localLocationAvailability.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    case 51: 
      label404:
      label918:
      label1204:
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      label912:
      label1323:
      IBinder localIBinder2 = b();
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(localIBinder2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
    LocationSettingsRequest localLocationSettingsRequest;
    IBinder localIBinder1;
    Object localObject;
    if (paramParcel1.readInt() != 0)
    {
      localLocationSettingsRequest = (LocationSettingsRequest)LocationSettingsRequest.CREATOR.createFromParcel(paramParcel1);
      localIBinder1 = paramParcel1.readStrongBinder();
      localObject = null;
      if (localIBinder1 != null) {
        break label1749;
      }
    }
    for (;;)
    {
      a(localLocationSettingsRequest, (fcv)localObject, paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
      localLocationSettingsRequest = null;
      break;
      label1749:
      IInterface localIInterface = localIBinder1.queryLocalInterface("com.google.android.gms.location.internal.ISettingsCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof fcv))) {
        localObject = (fcv)localIInterface;
      } else {
        localObject = new fcx(localIBinder1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fct
 * JD-Core Version:    0.7.0.1
 */