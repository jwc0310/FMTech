import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.identity.internal.AccountToken;

public final class flx
  implements Parcelable.Creator<AccountToken>
{
  public static AccountToken a(Parcel paramParcel)
  {
    String str1 = null;
    int i = efj.a(paramParcel);
    int j = 0;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        efj.b(paramParcel, k);
        break;
      case 1: 
        str2 = efj.e(paramParcel, k);
        break;
      case 1000: 
        efj.a(paramParcel, k, 4);
        j = paramParcel.readInt();
        break;
      case 2: 
        str1 = efj.e(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new AccountToken(j, str2, str1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     flx
 * JD-Core Version:    0.7.0.1
 */