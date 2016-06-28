import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

public final class fmo
  implements Parcelable.Creator<ParcelableLoadImageOptions>
{
  public static ParcelableLoadImageOptions a(Parcel paramParcel)
  {
    boolean bool = false;
    int i = efj.a(paramParcel);
    int j = 0;
    int k = 0;
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
        k = paramParcel.readInt();
        break;
      case 1000: 
        efj.a(paramParcel, n, 4);
        m = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, n, 4);
        j = paramParcel.readInt();
        break;
      case 3: 
        bool = efj.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new ParcelableLoadImageOptions(m, k, j, bool);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmo
 * JD-Core Version:    0.7.0.1
 */