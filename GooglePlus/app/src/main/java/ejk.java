import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

public final class ejk
  implements Parcelable.Creator<FavaDiagnosticsEntity>
{
  public static FavaDiagnosticsEntity a(Parcel paramParcel)
  {
    int i = 0;
    int j = efj.a(paramParcel);
    String str = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
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
        str = efj.e(paramParcel, m);
        break;
      case 3: 
        efj.a(paramParcel, m, 4);
        i = paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new FavaDiagnosticsEntity(k, str, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejk
 * JD-Core Version:    0.7.0.1
 */