import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class fkh
  implements Parcelable.Creator<MarkerOptions>
{
  public static MarkerOptions a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    int j = 0;
    LatLng localLatLng = null;
    String str1 = null;
    String str2 = null;
    IBinder localIBinder = null;
    float f1 = 0.0F;
    float f2 = 0.0F;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    float f3 = 0.0F;
    float f4 = 0.5F;
    float f5 = 0.0F;
    float f6 = 1.0F;
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
        break;
      case 5: 
        localIBinder = efj.f(paramParcel, k);
        break;
      case 6: 
        efj.a(paramParcel, k, 4);
        f1 = paramParcel.readFloat();
        break;
      case 7: 
        efj.a(paramParcel, k, 4);
        f2 = paramParcel.readFloat();
        break;
      case 8: 
        bool1 = efj.c(paramParcel, k);
        break;
      case 9: 
        bool2 = efj.c(paramParcel, k);
        break;
      case 10: 
        bool3 = efj.c(paramParcel, k);
        break;
      case 11: 
        efj.a(paramParcel, k, 4);
        f3 = paramParcel.readFloat();
        break;
      case 12: 
        efj.a(paramParcel, k, 4);
        f4 = paramParcel.readFloat();
        break;
      case 13: 
        efj.a(paramParcel, k, 4);
        f5 = paramParcel.readFloat();
        break;
      case 14: 
        efj.a(paramParcel, k, 4);
        f6 = paramParcel.readFloat();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new MarkerOptions(j, localLatLng, str1, str2, localIBinder, f1, f2, bool1, bool2, bool3, f3, f4, f5, f6);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkh
 * JD-Core Version:    0.7.0.1
 */