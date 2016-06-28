import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;

public final class fkk
  implements Parcelable.Creator<PolylineOptions>
{
  public static PolylineOptions a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool1 = false;
    int i = efj.a(paramParcel);
    ArrayList localArrayList = null;
    boolean bool2 = false;
    int j = 0;
    float f2 = 0.0F;
    int k = 0;
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
      case 2: 
        localArrayList = efj.c(paramParcel, m, LatLng.CREATOR);
        break;
      case 3: 
        efj.a(paramParcel, m, 4);
        f2 = paramParcel.readFloat();
        break;
      case 4: 
        efj.a(paramParcel, m, 4);
        j = paramParcel.readInt();
        break;
      case 5: 
        efj.a(paramParcel, m, 4);
        f1 = paramParcel.readFloat();
        break;
      case 6: 
        bool2 = efj.c(paramParcel, m);
        break;
      case 7: 
        bool1 = efj.c(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new PolylineOptions(k, localArrayList, f2, j, f1, bool2, bool1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkk
 * JD-Core Version:    0.7.0.1
 */