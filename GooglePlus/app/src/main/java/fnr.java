import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.model.AvatarReference;

public final class fnr
  implements Parcelable.Creator<AvatarReference>
{
  public static AvatarReference a(Parcel paramParcel)
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
        i = paramParcel.readInt();
        break;
      case 1000: 
        efj.a(paramParcel, m, 4);
        k = paramParcel.readInt();
        break;
      case 2: 
        str = efj.e(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new bm("Overread allowed size end=" + j, paramParcel);
    }
    return new AvatarReference(k, i, str);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fnr
 * JD-Core Version:    0.7.0.1
 */