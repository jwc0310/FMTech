import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.albumupload.impl.UploadSchedulerService;

public final class gwt
  extends BroadcastReceiver
{
  public gwt(UploadSchedulerService paramUploadSchedulerService) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (efj.J(this.a.getApplicationContext()))
    {
      paramContext.startService(new Intent(paramContext, UploadSchedulerService.class));
      paramContext.unregisterReceiver(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gwt
 * JD-Core Version:    0.7.0.1
 */