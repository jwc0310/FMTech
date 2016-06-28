import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.reporting.UploadRequestResult;

public final class fdx
  implements Parcelable.Creator<UploadRequestResult>
{
  public static UploadRequestResult a(Parcel paramParcel)
  {
    int i = 0;
    int j = efj.a(paramParcel);
    long l = 0L;
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
        efj.a(paramParcel, m, 4);
        i = paramParcel.readInt();
        break;
      case 3: 
        efj.a(paramParcel, m, 8);
        l = paramParcel.readLong();
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new UploadRequestResult(k, i, l);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdx
 * JD-Core Version:    0.7.0.1
 */