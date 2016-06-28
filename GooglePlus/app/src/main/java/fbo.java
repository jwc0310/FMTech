import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MediaState;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;
import java.util.List;

public abstract interface fbo
  extends IInterface
{
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, PendingIntent paramPendingIntent);
  
  public abstract void a(int paramInt, AutoBackupStatus paramAutoBackupStatus);
  
  public abstract void a(int paramInt, MediaState paramMediaState);
  
  public abstract void a(int paramInt, MigrationStatus paramMigrationStatus);
  
  public abstract void a(int paramInt, SyncSettings paramSyncSettings);
  
  public abstract void a(int paramInt, List<AutoBackupSettings> paramList);
  
  public abstract void a(int paramInt, boolean paramBoolean, String paramString);
  
  public abstract void a(Status paramStatus, LocalFolder paramLocalFolder);
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt, List<LocalFolder> paramList);
  
  public abstract void c(int paramInt);
  
  public abstract void d(int paramInt);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbo
 * JD-Core Version:    0.7.0.1
 */