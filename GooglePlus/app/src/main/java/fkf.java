import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class fkf
  implements Parcelable.Creator<LatLngBounds>
{
  public static LatLngBounds a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    LatLng localLatLng1 = null;
    int j = 0;
    LatLng localLatLng2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        efj.b(paramParcel, k);
        break;
      case 1: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        localLatLng1 = (LatLng)efj.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        localLatLng2 = (LatLng)efj.a(paramParcel, k, LatLng.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LatLngBounds(j, localLatLng1, localLatLng2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkf
 * JD-Core Version:    0.7.0.1
 */