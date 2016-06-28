import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class e
  extends Binder
  implements d
{
  public e()
  {
    attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
  }
  
  public static d a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
    if ((localIInterface != null) && ((localIInterface instanceof d))) {
      return (d)localIInterface;
    }
    return new f(paramIBinder);
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
      paramParcel2.writeString("android.support.customtabs.ICustomTabsCallback");
      return true;
    case 2: 
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
      int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      Bundle localBundle2 = null;
      if (k != 0) {
        localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(j, localBundle2);
      return true;
    }
    paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
    String str = paramParcel1.readString();
    int i = paramParcel1.readInt();
    Bundle localBundle1 = null;
    if (i != 0) {
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    }
    a(str, localBundle1);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     e
 * JD-Core Version:    0.7.0.1
 */