import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public abstract class eyt
  extends Binder
  implements eys
{
  public static eys a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
    if ((localIInterface != null) && ((localIInterface instanceof eys))) {
      return (eys)localIInterface;
    }
    return new eyu(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.auth.IAuthManagerService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      String str3 = paramParcel1.readString();
      String str4 = paramParcel1.readString();
      Bundle localBundle7;
      if (paramParcel1.readInt() != 0)
      {
        localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        Bundle localBundle8 = a(str3, str4, localBundle7);
        paramParcel2.writeNoException();
        if (localBundle8 == null) {
          break label158;
        }
        paramParcel2.writeInt(1);
        localBundle8.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localBundle7 = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      String str2 = paramParcel1.readString();
      Bundle localBundle5;
      if (paramParcel1.readInt() != 0)
      {
        localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        Bundle localBundle6 = a(str2, localBundle5);
        paramParcel2.writeNoException();
        if (localBundle6 == null) {
          break label238;
        }
        paramParcel2.writeInt(1);
        localBundle6.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localBundle5 = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      AccountChangeEventsRequest localAccountChangeEventsRequest;
      if (paramParcel1.readInt() != 0)
      {
        localAccountChangeEventsRequest = (AccountChangeEventsRequest)AccountChangeEventsRequest.CREATOR.createFromParcel(paramParcel1);
        AccountChangeEventsResponse localAccountChangeEventsResponse = a(localAccountChangeEventsRequest);
        paramParcel2.writeNoException();
        if (localAccountChangeEventsResponse == null) {
          break label310;
        }
        paramParcel2.writeInt(1);
        localAccountChangeEventsResponse.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localAccountChangeEventsRequest = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 5: 
      label158:
      label238:
      paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
      label310:
      Account localAccount;
      Bundle localBundle3;
      if (paramParcel1.readInt() != 0)
      {
        localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);
        String str1 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label413;
        }
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        label372:
        Bundle localBundle4 = a(localAccount, str1, localBundle3);
        paramParcel2.writeNoException();
        if (localBundle4 == null) {
          break label419;
        }
        paramParcel2.writeInt(1);
        localBundle4.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localAccount = null;
        break;
        label413:
        localBundle3 = null;
        break label372;
        label419:
        paramParcel2.writeInt(0);
      }
    }
    paramParcel1.enforceInterface("com.google.android.auth.IAuthManagerService");
    Bundle localBundle1;
    if (paramParcel1.readInt() != 0)
    {
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      Bundle localBundle2 = a(localBundle1);
      paramParcel2.writeNoException();
      if (localBundle2 == null) {
        break label491;
      }
      paramParcel2.writeInt(1);
      localBundle2.writeToParcel(paramParcel2, 1);
    }
    for (;;)
    {
      return true;
      localBundle1 = null;
      break;
      label491:
      paramParcel2.writeInt(0);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyt
 * JD-Core Version:    0.7.0.1
 */