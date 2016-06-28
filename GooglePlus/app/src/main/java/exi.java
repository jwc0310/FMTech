import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public abstract class exi
  extends Binder
  implements exh
{
  public exi()
  {
    attachInterface(this, "com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
    Status localStatus;
    if (paramParcel1.readInt() != 0)
    {
      localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label110;
      }
    }
    label110:
    for (PredictedNetworkQuality localPredictedNetworkQuality = (PredictedNetworkQuality)PredictedNetworkQuality.CREATOR.createFromParcel(paramParcel1);; localPredictedNetworkQuality = null)
    {
      a(localStatus, localPredictedNetworkQuality);
      return true;
      localStatus = null;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exi
 * JD-Core Version:    0.7.0.1
 */