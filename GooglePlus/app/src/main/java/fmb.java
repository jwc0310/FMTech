import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;

public final class fmb
  implements Parcelable.Creator<ParcelableGetOptions>
{
  public static ParcelableGetOptions a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    boolean bool1 = false;
    int i = efj.a(paramParcel);
    String str = null;
    boolean bool2 = false;
    boolean bool3 = false;
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
        bool3 = efj.c(paramParcel, k);
        break;
      case 1000: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        bool2 = efj.c(paramParcel, k);
        break;
      case 3: 
        str = efj.e(paramParcel, k);
        break;
      case 4: 
        bool1 = efj.c(paramParcel, k);
        break;
      case 5: 
        localBundle = efj.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new ParcelableGetOptions(j, bool3, bool2, bool1, str, localBundle);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmb
 * JD-Core Version:    0.7.0.1
 */