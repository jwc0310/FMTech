import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public final class fkt
  implements Parcelable.Creator<StreetViewPanoramaOptions>
{
  public static StreetViewPanoramaOptions a(Parcel paramParcel)
  {
    Integer localInteger = null;
    byte b1 = 0;
    int i = efj.a(paramParcel);
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    byte b5 = 0;
    LatLng localLatLng = null;
    String str = null;
    StreetViewPanoramaCamera localStreetViewPanoramaCamera = null;
    int j = 0;
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
        localStreetViewPanoramaCamera = (StreetViewPanoramaCamera)efj.a(paramParcel, k, StreetViewPanoramaCamera.CREATOR);
        break;
      case 3: 
        str = efj.e(paramParcel, k);
        break;
      case 4: 
        localLatLng = (LatLng)efj.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 5: 
        localInteger = efj.d(paramParcel, k);
        break;
      case 6: 
        efj.a(paramParcel, k, 4);
        b5 = (byte)paramParcel.readInt();
        break;
      case 7: 
        efj.a(paramParcel, k, 4);
        b4 = (byte)paramParcel.readInt();
        break;
      case 8: 
        efj.a(paramParcel, k, 4);
        b3 = (byte)paramParcel.readInt();
        break;
      case 9: 
        efj.a(paramParcel, k, 4);
        b2 = (byte)paramParcel.readInt();
        break;
      case 10: 
        efj.a(paramParcel, k, 4);
        b1 = (byte)paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new StreetViewPanoramaOptions(j, localStreetViewPanoramaCamera, str, localLatLng, localInteger, b5, b4, b3, b2, b1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkt
 * JD-Core Version:    0.7.0.1
 */