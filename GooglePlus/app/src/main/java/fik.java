import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public abstract class fik
  extends Binder
  implements fij
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    if (paramParcel1.readInt() != 0) {}
    for (StreetViewPanoramaOrientation localStreetViewPanoramaOrientation = fko.a(paramParcel1);; localStreetViewPanoramaOrientation = null)
    {
      a(localStreetViewPanoramaOrientation);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fik
 * JD-Core Version:    0.7.0.1
 */