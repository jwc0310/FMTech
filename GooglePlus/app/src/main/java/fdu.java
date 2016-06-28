import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.reporting.ReportingState;

public final class fdu
  implements Parcelable.Creator<ReportingState>
{
  public static ReportingState a(Parcel paramParcel)
  {
    int i = 0;
    int j = efj.a(paramParcel);
    Integer localInteger = null;
    int k = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    int m = 0;
    int n = 0;
    int i1 = 0;
    while (paramParcel.dataPosition() < j)
    {
      int i2 = paramParcel.readInt();
      switch (0xFFFF & i2)
      {
      case 6: 
      default: 
        efj.b(paramParcel, i2);
        break;
      case 1: 
        efj.a(paramParcel, i2, 4);
        i1 = paramParcel.readInt();
        break;
      case 2: 
        efj.a(paramParcel, i2, 4);
        n = paramParcel.readInt();
        break;
      case 3: 
        efj.a(paramParcel, i2, 4);
        m = paramParcel.readInt();
        break;
      case 4: 
        bool2 = efj.c(paramParcel, i2);
        break;
      case 5: 
        bool1 = efj.c(paramParcel, i2);
        break;
      case 7: 
        efj.a(paramParcel, i2, 4);
        k = paramParcel.readInt();
        break;
      case 8: 
        localInteger = efj.d(paramParcel, i2);
        break;
      case 9: 
        efj.a(paramParcel, i2, 4);
        i = paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new ReportingState(i1, n, m, bool2, bool1, k, i, localInteger);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdu
 * JD-Core Version:    0.7.0.1
 */