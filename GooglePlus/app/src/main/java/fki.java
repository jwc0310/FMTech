import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;

public final class fki
  implements Parcelable.Creator<PointOfInterest>
{
  public static PointOfInterest a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    String str1 = null;
    LatLng localLatLng = null;
    int j = 0;
    String str2 = null;
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
        localLatLng = (LatLng)efj.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3: 
        str1 = efj.e(paramParcel, k);
        break;
      case 4: 
        str2 = efj.e(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new PointOfInterest(j, localLatLng, str1, str2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fki
 * JD-Core Version:    0.7.0.1
 */