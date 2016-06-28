import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public abstract class fos
  extends Binder
  implements for
{
  public static for a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
    if ((localIInterface != null) && ((localIInterface instanceof for))) {
      return (for)localIInterface;
    }
    return new fot(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.signin.internal.ISignInService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {}
      for (AuthAccountRequest localAuthAccountRequest = (AuthAccountRequest)AuthAccountRequest.CREATOR.createFromParcel(paramParcel1);; localAuthAccountRequest = null)
      {
        a(localAuthAccountRequest, fop.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {}
      for (CheckServerAuthResult localCheckServerAuthResult = (CheckServerAuthResult)CheckServerAuthResult.CREATOR.createFromParcel(paramParcel1);; localCheckServerAuthResult = null)
      {
        a(localCheckServerAuthResult);
        paramParcel2.writeNoException();
        return true;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int m = paramParcel1.readInt();
      boolean bool2 = false;
      if (m != 0) {
        bool2 = true;
      }
      a(bool2);
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      ResolveAccountRequest localResolveAccountRequest;
      IBinder localIBinder;
      Object localObject;
      if (paramParcel1.readInt() != 0)
      {
        localResolveAccountRequest = (ResolveAccountRequest)ResolveAccountRequest.CREATOR.createFromParcel(paramParcel1);
        localIBinder = paramParcel1.readStrongBinder();
        localObject = null;
        if (localIBinder != null) {
          break label303;
        }
      }
      for (;;)
      {
        a(localResolveAccountRequest, (ejc)localObject);
        paramParcel2.writeNoException();
        return true;
        localResolveAccountRequest = null;
        break;
        IInterface localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        if ((localIInterface != null) && ((localIInterface instanceof ejc))) {
          localObject = (ejc)localIInterface;
        } else {
          localObject = new eje(localIBinder);
        }
      }
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      int k = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Account localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localAccount = null)
      {
        a(k, localAccount, fop.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      ehs localehs = eht.a(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      int j = paramParcel1.readInt();
      boolean bool1 = false;
      if (j != 0) {
        bool1 = true;
      }
      a(localehs, i, bool1);
      paramParcel2.writeNoException();
      return true;
    case 10: 
      label303:
      paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
      if (paramParcel1.readInt() != 0) {}
      for (RecordConsentRequest localRecordConsentRequest = (RecordConsentRequest)RecordConsentRequest.CREATOR.createFromParcel(paramParcel1);; localRecordConsentRequest = null)
      {
        a(localRecordConsentRequest, fop.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
    a(fop.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fos
 * JD-Core Version:    0.7.0.1
 */