import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;

public abstract class fhy
  extends Binder
  implements fhx
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnPoiClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
    if (paramParcel1.readInt() != 0) {}
    for (PointOfInterest localPointOfInterest = fki.a(paramParcel1);; localPointOfInterest = null)
    {
      a(localPointOfInterest);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fhy
 * JD-Core Version:    0.7.0.1
 */