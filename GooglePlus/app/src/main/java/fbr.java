import android.os.IInterface;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.SyncSettings;

public abstract interface fbr
  extends IInterface
{
  public abstract void a(fbo paramfbo);
  
  public abstract void a(fbo paramfbo, AutoBackupSettings paramAutoBackupSettings);
  
  public abstract void a(fbo paramfbo, String paramString);
  
  public abstract void a(fbo paramfbo, String paramString, LocalFolder paramLocalFolder);
  
  public abstract void a(fbo paramfbo, String paramString, SyncSettings paramSyncSettings);
  
  public abstract void a(fbo paramfbo, String paramString, String[] paramArrayOfString);
  
  public abstract void b(fbo paramfbo);
  
  public abstract void b(fbo paramfbo, String paramString);
  
  public abstract void c(fbo paramfbo);
  
  public abstract void c(fbo paramfbo, String paramString);
  
  public abstract void d(fbo paramfbo);
  
  public abstract void d(fbo paramfbo, String paramString);
  
  public abstract void e(fbo paramfbo);
  
  public abstract void e(fbo paramfbo, String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fbr
 * JD-Core Version:    0.7.0.1
 */