import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public abstract class feb
  extends Binder
  implements fea
{
  public feb()
  {
    attachInterface(this, "com.google.android.gms.location.ILocationCallback");
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
      paramParcel2.writeString("com.google.android.gms.location.ILocationCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
      int j = paramParcel1.readInt();
      LocationResult localLocationResult = null;
      if (j != 0) {
        localLocationResult = (LocationResult)LocationResult.CREATOR.createFromParcel(paramParcel1);
      }
      a(localLocationResult);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
    int i = paramParcel1.readInt();
    LocationAvailability localLocationAvailability = null;
    if (i != 0) {
      localLocationAvailability = fca.a(paramParcel1);
    }
    a(localLocationAvailability);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     feb
 * JD-Core Version:    0.7.0.1
 */