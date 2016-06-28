import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class eht
  extends Binder
  implements ehs
{
  public static ehs a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
    if ((localIInterface != null) && ((localIInterface instanceof ehs))) {
      return (ehs)localIInterface;
    }
    return new ehu(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
    Account localAccount = a();
    paramParcel2.writeNoException();
    if (localAccount != null)
    {
      paramParcel2.writeInt(1);
      localAccount.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eht
 * JD-Core Version:    0.7.0.1
 */