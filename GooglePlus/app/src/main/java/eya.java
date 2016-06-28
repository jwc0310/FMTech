import android.os.Binder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class eya
  extends Binder
  implements exz
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
    if (paramParcel1.readInt() != 0) {}
    for (Message localMessage = (Message)Message.CREATOR.createFromParcel(paramParcel1);; localMessage = null)
    {
      a(localMessage);
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eya
 * JD-Core Version:    0.7.0.1
 */