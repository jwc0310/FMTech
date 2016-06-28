import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

public abstract class ewd
  extends Binder
  implements ewc
{
  public ewd()
  {
    attachInterface(this, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
  }
  
  public static ewc a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof ewc))) {
      return (ewc)localIInterface;
    }
    return new ewe(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      int j = paramParcel1.readInt();
      GoogleHelp localGoogleHelp = null;
      if (j != 0) {
        localGoogleHelp = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(paramParcel1);
      }
      a(localGoogleHelp);
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      int i = paramParcel1.readInt();
      TogglingData localTogglingData = null;
      if (i != 0) {
        localTogglingData = (TogglingData)TogglingData.CREATOR.createFromParcel(paramParcel1);
      }
      a(localTogglingData);
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      a();
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      b();
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
      c();
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    d();
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ewd
 * JD-Core Version:    0.7.0.1
 */