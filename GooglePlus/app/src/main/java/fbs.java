import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public abstract class fbs
  extends Binder
  implements fbr
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      a(fbp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      b(fbp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      a(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      c(fbp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      b(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      fbo localfbo3 = fbp.a(paramParcel1.readStrongBinder());
      String str2 = paramParcel1.readString();
      int k = paramParcel1.readInt();
      LocalFolder localLocalFolder = null;
      if (k != 0) {
        localLocalFolder = (LocalFolder)LocalFolder.CREATOR.createFromParcel(paramParcel1);
      }
      a(localfbo3, str2, localLocalFolder);
      paramParcel2.writeNoException();
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      c(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      d(fbp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      fbo localfbo2 = fbp.a(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      AutoBackupSettings localAutoBackupSettings = null;
      if (j != 0) {
        localAutoBackupSettings = (AutoBackupSettings)AutoBackupSettings.CREATOR.createFromParcel(paramParcel1);
      }
      a(localfbo2, localAutoBackupSettings);
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      d(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      e(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      fbo localfbo1 = fbp.a(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      int i = paramParcel1.readInt();
      SyncSettings localSyncSettings = null;
      if (i != 0) {
        localSyncSettings = (SyncSettings)SyncSettings.CREATOR.createFromParcel(paramParcel1);
      }
      a(localfbo1, str1, localSyncSettings);
      paramParcel2.writeNoException();
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
      e(fbp.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
    a(fbp.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.createStringArray());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbs
 * JD-Core Version:    0.7.0.1
 */