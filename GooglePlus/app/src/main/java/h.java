import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class h
  extends Binder
  implements g
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      boolean bool3 = a(paramParcel1.readLong());
      paramParcel2.writeNoException();
      if (bool3) {}
      for (int k = 1;; k = 0)
      {
        paramParcel2.writeInt(k);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      boolean bool2 = a(e.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      int j = 0;
      if (bool2) {
        j = 1;
      }
      paramParcel2.writeInt(j);
      return true;
    case 4: 
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      d locald = e.a(paramParcel1.readStrongBinder());
      Uri localUri;
      if (paramParcel1.readInt() != 0)
      {
        localUri = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label259;
        }
      }
      label259:
      for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle3 = null)
      {
        boolean bool1 = a(locald, localUri, localBundle3, paramParcel1.createTypedArrayList(Bundle.CREATOR));
        paramParcel2.writeNoException();
        int i = 0;
        if (bool1) {
          i = 1;
        }
        paramParcel2.writeInt(i);
        return true;
        localUri = null;
        break;
      }
    }
    paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
    String str = paramParcel1.readString();
    if (paramParcel1.readInt() != 0) {}
    for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
    {
      Bundle localBundle2 = a(str, localBundle1);
      paramParcel2.writeNoException();
      if (localBundle2 == null) {
        break;
      }
      paramParcel2.writeInt(1);
      localBundle2.writeToParcel(paramParcel2, 1);
      return true;
    }
    paramParcel2.writeInt(0);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     h
 * JD-Core Version:    0.7.0.1
 */