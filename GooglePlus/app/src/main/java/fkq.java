import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class fkq
  implements Parcelable.Creator<TileOverlayOptions>
{
  public static TileOverlayOptions a(Parcel paramParcel)
  {
    boolean bool1 = false;
    int i = efj.a(paramParcel);
    IBinder localIBinder = null;
    float f = 0.0F;
    boolean bool2 = true;
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
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        localIBinder = efj.f(paramParcel, k);
        break;
      case 3: 
        bool1 = efj.c(paramParcel, k);
        break;
      case 4: 
        efj.a(paramParcel, k, 4);
        f = paramParcel.readFloat();
        break;
      case 5: 
        bool2 = efj.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new TileOverlayOptions(j, localIBinder, bool1, f, bool2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkq
 * JD-Core Version:    0.7.0.1
 */