import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

public final class fcd
  implements Parcelable.Creator<LocationRequest>
{
  public static LocationRequest a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    int j = 0;
    int k = 102;
    long l1 = 3600000L;
    long l2 = 600000L;
    boolean bool = false;
    long l3 = 9223372036854775807L;
    int m = 2147483647;
    float f = 0.0F;
    long l4 = 0L;
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
        k = paramParcel.readInt();
        break;
      case 1000: 
        efj.a(paramParcel, n, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, n, 8);
        l1 = paramParcel.readLong();
        break;
      case 3: 
        efj.a(paramParcel, n, 8);
        l2 = paramParcel.readLong();
        break;
      case 4: 
        bool = efj.c(paramParcel, n);
        break;
      case 5: 
        efj.a(paramParcel, n, 8);
        l3 = paramParcel.readLong();
        break;
      case 6: 
        efj.a(paramParcel, n, 4);
        m = paramParcel.readInt();
        break;
      case 7: 
        efj.a(paramParcel, n, 4);
        f = paramParcel.readFloat();
        break;
      case 8: 
        efj.a(paramParcel, n, 8);
        l4 = paramParcel.readLong();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequest(j, k, l1, l2, bool, l3, m, f, l4);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fcd
 * JD-Core Version:    0.7.0.1
 */