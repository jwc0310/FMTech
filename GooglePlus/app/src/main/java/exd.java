import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.herrevad.NetworkQualityReport;

public abstract class exd
  extends Binder
  implements exc
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
      int j = paramParcel1.readInt();
      NetworkQualityReport localNetworkQualityReport2 = null;
      if (j != 0) {
        localNetworkQualityReport2 = (NetworkQualityReport)NetworkQualityReport.CREATOR.createFromParcel(paramParcel1);
      }
      a(localNetworkQualityReport2);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
      IBinder localIBinder = paramParcel1.readStrongBinder();
      Object localObject = null;
      if (localIBinder == null) {}
      for (;;)
      {
        a((ewz)localObject);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityCallbacks");
        if ((localIInterface != null) && ((localIInterface instanceof ewz))) {
          localObject = (ewz)localIInterface;
        } else {
          localObject = new exb(localIBinder);
        }
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    int i = paramParcel1.readInt();
    NetworkQualityReport localNetworkQualityReport1 = null;
    if (i != 0) {
      localNetworkQualityReport1 = (NetworkQualityReport)NetworkQualityReport.CREATOR.createFromParcel(paramParcel1);
    }
    String str1 = paramParcel1.readString();
    String str2 = paramParcel1.readString();
    if (paramParcel1.readInt() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(localNetworkQualityReport1, str1, str2, bool);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exd
 * JD-Core Version:    0.7.0.1
 */