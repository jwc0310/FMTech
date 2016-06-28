import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

public final class fkj
  implements Parcelable.Creator<PolygonOptions>
{
  public final PolygonOptions a(Parcel paramParcel)
  {
    float f1 = 0.0F;
    boolean bool1 = false;
    int i = efj.a(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = new ArrayList();
    boolean bool2 = false;
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
        localArrayList1 = efj.c(paramParcel, n, LatLng.CREATOR);
        break;
      case 3: 
        ClassLoader localClassLoader = getClass().getClassLoader();
        int i1 = efj.a(paramParcel, n);
        int i2 = paramParcel.dataPosition();
        if (i1 != 0)
        {
          paramParcel.readList(localArrayList2, localClassLoader);
          paramParcel.setDataPosition(i1 + i2);
        }
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
        bool2 = efj.c(paramParcel, n);
        break;
      case 9: 
        bool1 = efj.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new PolygonOptions(m, localArrayList1, localArrayList2, f2, k, j, f1, bool2, bool1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkj
 * JD-Core Version:    0.7.0.1
 */