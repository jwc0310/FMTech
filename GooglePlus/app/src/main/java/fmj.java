import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

public abstract class fmj
  extends Binder
  implements fmi
{
  public fmj()
  {
    attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
  }
  
  public static fmi a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof fmi))) {
      return (fmi)localIInterface;
    }
    return new fmk(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
      int i2 = paramParcel1.readInt();
      Bundle localBundle6;
      if (paramParcel1.readInt() != 0)
      {
        localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label150;
        }
      }
      for (Bundle localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle7 = null)
      {
        a(i2, localBundle6, localBundle7);
        return true;
        localBundle6 = null;
        break;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
      int n = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle5 = null)
      {
        int i1 = paramParcel1.readInt();
        DataHolder localDataHolder = null;
        if (i1 != 0) {
          localDataHolder = ehk.a(paramParcel1);
        }
        a(n, localBundle5, localDataHolder);
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
      int m = paramParcel1.readInt();
      Bundle localBundle4;
      if (paramParcel1.readInt() != 0)
      {
        localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label303;
        }
      }
      for (ParcelFileDescriptor localParcelFileDescriptor2 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);; localParcelFileDescriptor2 = null)
      {
        a(m, localBundle4, localParcelFileDescriptor2);
        return true;
        localBundle4 = null;
        break;
      }
    case 4: 
      label150:
      label303:
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
      int j = paramParcel1.readInt();
      int k = paramParcel1.readInt();
      Bundle localBundle3 = null;
      if (k != 0) {
        localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(j, localBundle3, (DataHolder[])paramParcel1.createTypedArray(DataHolder.CREATOR));
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
    int i = paramParcel1.readInt();
    Bundle localBundle1;
    ParcelFileDescriptor localParcelFileDescriptor1;
    if (paramParcel1.readInt() != 0)
    {
      localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() == 0) {
        break label464;
      }
      localParcelFileDescriptor1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(paramParcel1);
      label423:
      if (paramParcel1.readInt() == 0) {
        break label470;
      }
    }
    label464:
    label470:
    for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
    {
      a(i, localBundle1, localParcelFileDescriptor1, localBundle2);
      return true;
      localBundle1 = null;
      break;
      localParcelFileDescriptor1 = null;
      break label423;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmj
 * JD-Core Version:    0.7.0.1
 */