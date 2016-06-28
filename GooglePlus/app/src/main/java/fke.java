import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public final class fke
  implements Parcelable.Creator<GroundOverlayOptions>
{
  public static GroundOverlayOptions a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    int j = 0;
    IBinder localIBinder = null;
    LatLng localLatLng = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    LatLngBounds localLatLngBounds = null;
    float f3 = 0.0F;
    float f4 = 0.0F;
    boolean bool = false;
    float f5 = 0.0F;
    float f6 = 0.0F;
    float f7 = 0.0F;
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
        localIBinder = efj.f(paramParcel, k);
        break;
      case 3: 
        localLatLng = (LatLng)efj.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 4: 
        efj.a(paramParcel, k, 4);
        f1 = paramParcel.readFloat();
        break;
      case 5: 
        efj.a(paramParcel, k, 4);
        f2 = paramParcel.readFloat();
        break;
      case 6: 
        localLatLngBounds = (LatLngBounds)efj.a(paramParcel, k, LatLngBounds.CREATOR);
        break;
      case 7: 
        efj.a(paramParcel, k, 4);
        f3 = paramParcel.readFloat();
        break;
      case 8: 
        efj.a(paramParcel, k, 4);
        f4 = paramParcel.readFloat();
        break;
      case 9: 
        bool = efj.c(paramParcel, k);
        break;
      case 10: 
        efj.a(paramParcel, k, 4);
        f5 = paramParcel.readFloat();
        break;
      case 11: 
        efj.a(paramParcel, k, 4);
        f6 = paramParcel.readFloat();
        break;
      case 12: 
        efj.a(paramParcel, k, 4);
        f7 = paramParcel.readFloat();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new GroundOverlayOptions(j, localIBinder, localLatLng, f1, f2, localLatLngBounds, f3, f4, bool, f5, f6, f7);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fke
 * JD-Core Version:    0.7.0.1
 */