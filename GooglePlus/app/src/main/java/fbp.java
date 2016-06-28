import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public abstract class fbp
  extends Binder
  implements fbo
{
  public fbp()
  {
    attachInterface(this, "com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
  }
  
  public static fbo a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof fbo))) {
      return (fbo)localIInterface;
    }
    return new fbq(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      int i1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        a(i1, bool, paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      int n = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (PendingIntent localPendingIntent = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; localPendingIntent = null)
      {
        a(n, localPendingIntent);
        paramParcel2.writeNoException();
        return true;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      a(paramParcel1.readInt(), paramParcel1.createTypedArrayList(AutoBackupSettings.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      b(paramParcel1.readInt(), paramParcel1.createTypedArrayList(LocalFolder.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      Status localStatus;
      if (paramParcel1.readInt() != 0)
      {
        localStatus = (Status)Status.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label363;
        }
      }
      for (LocalFolder localLocalFolder = (LocalFolder)LocalFolder.CREATOR.createFromParcel(paramParcel1);; localLocalFolder = null)
      {
        a(localStatus, localLocalFolder);
        paramParcel2.writeNoException();
        return true;
        localStatus = null;
        break;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      int m = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (AutoBackupStatus localAutoBackupStatus = (AutoBackupStatus)AutoBackupStatus.CREATOR.createFromParcel(paramParcel1);; localAutoBackupStatus = null)
      {
        a(m, localAutoBackupStatus);
        paramParcel2.writeNoException();
        return true;
      }
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      a(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      c(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      b(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      int k = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (SyncSettings localSyncSettings = (SyncSettings)SyncSettings.CREATOR.createFromParcel(paramParcel1);; localSyncSettings = null)
      {
        a(k, localSyncSettings);
        paramParcel2.writeNoException();
        return true;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      d(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      label363:
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
      int j = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (MigrationStatus localMigrationStatus = (MigrationStatus)MigrationStatus.CREATOR.createFromParcel(paramParcel1);; localMigrationStatus = null)
      {
        a(j, localMigrationStatus);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
    int i = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {}
    for (MediaState localMediaState = (MediaState)MediaState.CREATOR.createFromParcel(paramParcel1);; localMediaState = null)
    {
      a(i, localMediaState);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbp
 * JD-Core Version:    0.7.0.1
 */