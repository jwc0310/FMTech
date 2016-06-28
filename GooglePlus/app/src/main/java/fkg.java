import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;

public final class fkg
  implements Parcelable.Creator<LatLng>
{
  public static LatLng a(Parcel paramParcel)
  {
    double d1 = 0.0D;
    int i = efj.a(paramParcel);
    int j = 0;
    double d2 = d1;
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
        efj.a(paramParcel, k, 8);
        d2 = paramParcel.readDouble();
        break;
      case 3: 
        efj.a(paramParcel, k, 8);
        d1 = paramParcel.readDouble();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LatLng(j, d2, d1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkg
 * JD-Core Version:    0.7.0.1
 */