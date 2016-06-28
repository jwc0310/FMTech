import android.os.Binder;
import android.os.Parcel;

public abstract class fhs
  extends Binder
  implements fhr
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    boolean bool = a();
    paramParcel2.writeNoException();
    if (bool) {}
    for (int i = 1;; i = 0)
    {
      paramParcel2.writeInt(i);
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fhs
 * JD-Core Version:    0.7.0.1
 */