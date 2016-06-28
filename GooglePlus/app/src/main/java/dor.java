import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class dor
  extends BroadcastReceiver
{
  dor(doq paramdoq) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {}
    while (!"com.google.android.libraries.social.autobackup.upload_all_progress".equals(paramIntent.getAction())) {
      return;
    }
    int i = paramIntent.getIntExtra("upload_all_progress", -1);
    int j = paramIntent.getIntExtra("upload_all_count", -1);
    int k = paramIntent.getIntExtra("upload_all_state", -1);
    this.a.ap.a(new dos(this, j, i, paramContext, k));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dor
 * JD-Core Version:    0.7.0.1
 */