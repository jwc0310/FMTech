import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public final class fkd
  implements Parcelable.Creator<CircleOptions>
{
  public static CircleOptions a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool = false;
    int i = efj.a(paramParcel);
    LatLng localLatLng = null;
    double d = 0.0D;
    int j = 0;
    int k = 0;
    float f2 = 0.0F;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default: 
        efj.b(paramParcel, n);
        break;
      case 1: 
        efj.a(paramParcel, n, 4);
        m = paramParcel.readInt();
        break;
      case 2: 
        localLatLng = (LatLng)efj.a(paramParcel, n, LatLng.CREATOR);
        break;
      case 3: 
        efj.a(paramParcel, n, 8);
        d = paramParcel.readDouble();
        break;
      case 4: 
        efj.a(paramParcel, n, 4);
        f2 = paramParcel.readFloat();
        break;
      case 5: 
        efj.a(paramParcel, n, 4);
        k = paramParcel.readInt();
        break;
      case 6: 
        efj.a(paramParcel, n, 4);
        j = paramParcel.readInt();
        break;
      case 7: 
        efj.a(paramParcel, n, 4);
        f1 = paramParcel.readFloat();
        break;
      case 8: 
        bool = efj.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new CircleOptions(m, localLatLng, d, f2, k, j, f1, bool);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkd
 * JD-Core Version:    0.7.0.1
 */