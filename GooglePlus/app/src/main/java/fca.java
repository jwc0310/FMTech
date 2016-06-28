import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;

public final class fca
  implements Parcelable.Creator<LocationAvailability>
{
  public static LocationAvailability a(Parcel paramParcel)
  {
    int i = 1;
    int j = efj.a(paramParcel);
    int k = 0;
    int m = 1000;
    long l = 0L;
    int n = i;
    while (paramParcel.dataPosition() < j)
    {
      int i1 = paramParcel.readInt();
      switch (0xFFFF & i1)
      {
      default: 
        efj.b(paramParcel, i1);
        break;
      case 1: 
        efj.a(paramParcel, i1, 4);
        n = paramParcel.readInt();
        break;
      case 1000: 
        efj.a(paramParcel, i1, 4);
        k = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, i1, 4);
        i = paramParcel.readInt();
        break;
      case 3: 
        efj.a(paramParcel, i1, 8);
        l = paramParcel.readLong();
        break;
      case 4: 
        efj.a(paramParcel, i1, 4);
        m = paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new LocationAvailability(k, m, n, i, l);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fca
 * JD-Core Version:    0.7.0.1
 */