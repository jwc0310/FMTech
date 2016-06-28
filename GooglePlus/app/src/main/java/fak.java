import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class fak
  extends Binder
  implements faj
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.panorama.internal.IPanoramaService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.panorama.internal.IPanoramaService");
    IBinder localIBinder = paramParcel1.readStrongBinder();
    Object localObject;
    Uri localUri;
    label87:
    Bundle localBundle;
    if (localIBinder == null)
    {
      localObject = null;
      if (paramParcel1.readInt() == 0) {
        break label180;
      }
      localUri = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label186;
      }
      localBundle = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      label108:
      if (paramParcel1.readInt() == 0) {
        break label192;
      }
    }
    label180:
    label186:
    label192:
    for (boolean bool = true;; bool = false)
    {
      a((fag)localObject, localUri, localBundle, bool);
      return true;
      IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.panorama.internal.IPanoramaCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof fag)))
      {
        localObject = (fag)localIInterface;
        break;
      }
      localObject = new fai(localIBinder);
      break;
      localUri = null;
      break label87;
      localBundle = null;
      break label108;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fak
 * JD-Core Version:    0.7.0.1
 */