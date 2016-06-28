import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

public final class fkc
  implements Parcelable.Creator<CameraPosition>
{
  public static CameraPosition a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    int i = efj.a(paramParcel);
    int j = 0;
    LatLng localLatLng = null;
    float f2 = 0.0F;
    float f3 = 0.0F;
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
        efj.a(paramParcel, k, 4);
        f3 = paramParcel.readFloat();
        break;
      case 4: 
        efj.a(paramParcel, k, 4);
        f2 = paramParcel.readFloat();
        break;
      case 5: 
        efj.a(paramParcel, k, 4);
        f1 = paramParcel.readFloat();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new CameraPosition(j, localLatLng, f3, f2, f1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkc
 * JD-Core Version:    0.7.0.1
 */