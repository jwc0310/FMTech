import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.reporting.UploadRequest;

public final class fdw
  implements Parcelable.Creator<UploadRequest>
{
  public static UploadRequest a(Parcel paramParcel)
  {
    long l1 = 0L;
    String str1 = null;
    int i = efj.a(paramParcel);
    int j = 0;
    long l2 = l1;
    long l3 = l1;
    String str2 = null;
    Account localAccount = null;
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
        localAccount = (Account)efj.a(paramParcel, k, Account.CREATOR);
        break;
      case 3: 
        str2 = efj.e(paramParcel, k);
        break;
      case 4: 
        efj.a(paramParcel, k, 8);
        l3 = paramParcel.readLong();
        break;
      case 5: 
        efj.a(paramParcel, k, 8);
        l2 = paramParcel.readLong();
        break;
      case 6: 
        efj.a(paramParcel, k, 8);
        l1 = paramParcel.readLong();
        break;
      case 7: 
        str1 = efj.e(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new bm("Overread allowed size end=" + i, paramParcel);
    }
    return new UploadRequest(j, localAccount, str2, l3, l2, l1, str1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fdw
 * JD-Core Version:    0.7.0.1
 */