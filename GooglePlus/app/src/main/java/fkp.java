import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.Tile;

public final class fkp
  implements Parcelable.Creator<Tile>
{
  public static Tile a(Parcel paramParcel)
  {
    int i = 0;
    int j = efj.a(paramParcel);
    byte[] arrayOfByte = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
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
        efj.a(paramParcel, n, 4);
        k = paramParcel.readInt();
        break;
      case 3: 
        efj.a(paramParcel, n, 4);
        i = paramParcel.readInt();
        break;
      case 4: 
        arrayOfByte = efj.h(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new Tile(m, k, i, arrayOfByte);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fkp
 * JD-Core Version:    0.7.0.1
 */