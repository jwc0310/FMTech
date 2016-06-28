import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public final class exj
  implements exh
{
  private IBinder a;
  
  public exj(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(Status paramStatus, PredictedNetworkQuality paramPredictedNetworkQuality)
  {
    Parcel localParcel = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
        if (paramStatus != null)
        {
          localParcel.writeInt(1);
          paramStatus.writeToParcel(localParcel, 0);
          if (paramPredictedNetworkQuality != null)
          {
            localParcel.writeInt(1);
            paramPredictedNetworkQuality.writeToParcel(localParcel, 0);
            this.a.transact(2, localParcel, null, 1);
          }
        }
        else
        {
          localParcel.writeInt(0);
          continue;
        }
        localParcel.writeInt(0);
      }
      finally
      {
        localParcel.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exj
 * JD-Core Version:    0.7.0.1
 */