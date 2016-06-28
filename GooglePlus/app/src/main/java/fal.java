import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class fal
  implements faj
{
  private IBinder a;
  
  fal(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(fag paramfag, Uri paramUri, Bundle paramBundle, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken("com.google.android.gms.panorama.internal.IPanoramaService");
        IBinder localIBinder = null;
        if (paramfag != null) {
          localIBinder = paramfag.asBinder();
        }
        localParcel.writeStrongBinder(localIBinder);
        if (paramUri != null)
        {
          localParcel.writeInt(1);
          paramUri.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
            break label136;
            localParcel.writeInt(i);
            this.a.transact(1, localParcel, null, 1);
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
      label136:
      while (!paramBoolean)
      {
        i = 0;
        break;
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fal
 * JD-Core Version:    0.7.0.1
 */