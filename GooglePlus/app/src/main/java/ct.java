import android.app.Notification;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class ct
  extends Binder
  implements cs
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("android.support.v4.app.INotificationSideChannel");
      return true;
    case 1: 
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      String str1 = paramParcel1.readString();
      int i = paramParcel1.readInt();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Notification localNotification = (Notification)Notification.CREATOR.createFromParcel(paramParcel1);; localNotification = null)
      {
        a(str1, i, str2, localNotification);
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      a(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      return true;
    }
    paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
    a(paramParcel1.readString());
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ct
 * JD-Core Version:    0.7.0.1
 */