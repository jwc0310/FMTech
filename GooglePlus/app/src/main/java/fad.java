import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class fad
  extends Binder
  implements fac
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.mdm.internal.INetworkQualityService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
      String str = paramParcel1.readString();
      Bundle localBundle1;
      if (paramParcel1.readInt() != 0)
      {
        localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label138;
        }
      }
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(str, localBundle1, localBundle2);
        paramParcel2.writeNoException();
        return true;
        localBundle1 = null;
        break;
      }
    case 2: 
      label138:
      paramParcel1.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
      IBinder localIBinder2 = paramParcel1.readStrongBinder();
      Object localObject2 = null;
      if (localIBinder2 == null) {}
      for (;;)
      {
        a((exh)localObject2);
        paramParcel2.writeNoException();
        return true;
        IInterface localIInterface2 = localIBinder2.queryLocalInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
        if ((localIInterface2 != null) && ((localIInterface2 instanceof exh))) {
          localObject2 = (exh)localIInterface2;
        } else {
          localObject2 = new exj(localIBinder2);
        }
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
    IBinder localIBinder1 = paramParcel1.readStrongBinder();
    Object localObject1 = null;
    if (localIBinder1 == null) {}
    for (;;)
    {
      a((exk)localObject1);
      paramParcel2.writeNoException();
      return true;
      IInterface localIInterface1 = localIBinder1.queryLocalInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
      if ((localIInterface1 != null) && ((localIInterface1 instanceof exk))) {
        localObject1 = (exk)localIInterface1;
      } else {
        localObject1 = new exm(localIBinder1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fad
 * JD-Core Version:    0.7.0.1
 */