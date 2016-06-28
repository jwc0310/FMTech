import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.GestureRequest;
import java.util.ArrayList;

public final class fdz
  implements Parcelable.Creator<GestureRequest>
{
  public static GestureRequest a(Parcel paramParcel)
  {
    int i = efj.a(paramParcel);
    int j = 0;
    ArrayList localArrayList = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        efj.b(paramParcel, k);
        break;
      case 1: 
        localArrayList = efj.k(paramParcel, k);
        break;
      case 1000: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new GestureRequest(j, localArrayList);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdz
 * JD-Core Version:    0.7.0.1
 */