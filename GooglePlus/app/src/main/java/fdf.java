import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class fdf
  implements Parcelable.Creator<LocationRequestUpdateData>
{
  public static LocationRequestUpdateData a(Parcel paramParcel)
  {
    IBinder localIBinder1 = null;
    int i = efj.a(paramParcel);
    int j = 0;
    int k = 1;
    PendingIntent localPendingIntent = null;
    IBinder localIBinder2 = null;
    LocationRequestInternal localLocationRequestInternal = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        efj.b(paramParcel, m);
        break;
      case 1: 
        efj.a(paramParcel, m, 4);
        k = paramParcel.readInt();
        break;
      case 1000: 
        efj.a(paramParcel, m, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        localLocationRequestInternal = (LocationRequestInternal)efj.a(paramParcel, m, LocationRequestInternal.CREATOR);
        break;
      case 3: 
        localIBinder2 = efj.f(paramParcel, m);
        break;
      case 4: 
        localPendingIntent = (PendingIntent)efj.a(paramParcel, m, PendingIntent.CREATOR);
        break;
      case 5: 
        localIBinder1 = efj.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new LocationRequestUpdateData(j, k, localLocationRequestInternal, localIBinder2, localPendingIntent, localIBinder1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdf
 * JD-Core Version:    0.7.0.1
 */