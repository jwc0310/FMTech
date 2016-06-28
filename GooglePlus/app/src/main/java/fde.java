import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.ClientIdentity;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

public final class fde
  implements Parcelable.Creator<LocationRequestInternal>
{
  public static LocationRequestInternal a(Parcel paramParcel)
  {
    String str = null;
    boolean bool1 = true;
    boolean bool2 = false;
    int i = efj.a(paramParcel);
    Object localObject = LocationRequestInternal.a;
    boolean bool3 = bool1;
    boolean bool4 = false;
    LocationRequest localLocationRequest = null;
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
        localLocationRequest = (LocationRequest)efj.a(paramParcel, k, LocationRequest.CREATOR);
        break;
      case 1000: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        bool4 = efj.c(paramParcel, k);
        break;
      case 3: 
        bool3 = efj.c(paramParcel, k);
        break;
      case 4: 
        bool1 = efj.c(paramParcel, k);
        break;
      case 5: 
        localObject = efj.c(paramParcel, k, ClientIdentity.CREATOR);
        break;
      case 6: 
        str = efj.e(paramParcel, k);
        break;
      case 7: 
        bool2 = efj.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequestInternal(j, localLocationRequest, bool4, bool3, bool1, (List)localObject, str, bool2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fde
 * JD-Core Version:    0.7.0.1
 */